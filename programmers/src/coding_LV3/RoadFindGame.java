package coding_LV3;

import java.util.*;

public class RoadFindGame {
    static class Node {
        int id;
        int x;
        int y;
        Node left;
        Node right;

        Node(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }

    public int[][] solution(int[][] nodeinfo) {
        int n = nodeinfo.length;
        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1]));
        }

        nodes.sort((a, b) -> {
            if (a.y == b.y) {
                return a.x - b.x;
            } else {
                return b.y - a.y;
            }
        });

        Node root = buildTree(nodes);

        List<Integer> preorderList = new ArrayList<>();
        List<Integer> postorderList = new ArrayList<>();

        preorderTraversal(root, preorderList);
        postorderTraversal(root, postorderList);

        int[][] answer = new int[2][n];
        for (int i = 0; i < n; i++) {
            answer[0][i] = preorderList.get(i);
            answer[1][i] = postorderList.get(i);
        }

        return answer;
    }

    private Node buildTree(List<Node> nodes) {
        if (nodes.isEmpty()) return null;

        Node root = nodes.get(0);
        List<Node> leftSubtree = new ArrayList<>();
        List<Node> rightSubtree = new ArrayList<>();

        for (int i = 1; i < nodes.size(); i++) {
            Node node = nodes.get(i);
            if (node.x < root.x) {
                leftSubtree.add(node);
            } else {
                rightSubtree.add(node);
            }
        }

        root.left = buildTree(leftSubtree);
        root.right = buildTree(rightSubtree);

        return root;
    }

    private void preorderTraversal(Node node, List<Integer> list) {
        if (node == null) return;
        list.add(node.id);
        preorderTraversal(node.left, list);
        preorderTraversal(node.right, list);
    }

    private void postorderTraversal(Node node, List<Integer> list) {
        if (node == null) return;
        postorderTraversal(node.left, list);
        postorderTraversal(node.right, list);
        list.add(node.id);
    }
}
