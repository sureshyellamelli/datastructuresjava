package com.skywood.skywoodexamples.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

        Node root;

        public void addNode(int data) {
            Node newNode = new Node(data);

            if (root == null) {
                root = newNode;
            } else {
                Node focusNode = root;
                Node parent;

                while (true) {
                    parent = focusNode;

                    if (data < focusNode.data) {
                        focusNode = focusNode.left;
                        if (focusNode == null) {
                            parent.left = newNode;
                            return;
                        }
                    } else {
                        focusNode = focusNode.right;
                        if (focusNode == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
                }
            }
        }


    public int preOrderTraversal(Node root, int result) {
        if (root != null) {
            result++;
            System.out.print(root.data + " ");
            preOrderTraversal(root.left ,result);
            preOrderTraversal(root.right, result);
        }
        return result;
    }

    public void inOrderTraversal(Node root) {


        if (root != null) {

            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public void printLevelOrder(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

}
