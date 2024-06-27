package 백준.코테스터디.재귀;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon1991 {

    public static int N = 0;
    public static Map<Character, Node> nodes = new HashMap<>();
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static class Node {
        char root;
        Node left;
        Node right;

        public Node(char root) {
            this.root = root;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node node) throws IOException {
        if (node != null) {
            bw.write(node.root);
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void inorder(Node node) throws IOException {
        if (node != null) {
            inorder(node.left);
            bw.write(node.root);
            inorder(node.right);
        }
    }

    public static void postorder(Node node) throws IOException {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            bw.write(node.root);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if (!nodes.containsKey(root)) {
                nodes.put(root, new Node(root));
            }
            Node node = nodes.get(root);

            if (left != '.') {
                node.left = new Node(left);
                nodes.put(left, node.left);
            }
            if (right != '.') {
                node.right = new Node(right);
                nodes.put(right, node.right);
            }
        }

        // 최상위 노드 A
        Node root = nodes.get('A');

        // preorder
        preorder(root);
        bw.write("\n");
        // inorder
        inorder(root);
        bw.write("\n");
        // postorder
        postorder(root);
        bw.flush();
        bw.close();
        br.close();
    }
}
