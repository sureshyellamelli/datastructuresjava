package com.skywood.skywoodexamples.trees;

public class BinaryTreeExample {

        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();

            tree.addNode(50);
            tree.addNode(25);
            tree.addNode(75);
            tree.addNode(12);
            tree.addNode(37);
            tree.addNode(43);
            tree.addNode(30);

            System.out.println("Pre-Order Traversal >>>");
           int result = tree.preOrderTraversal(tree.root,0);

            System.out.println("In-Order Traversal >>>");
            tree.inOrderTraversal(tree.root);
            System.out.println("post-Order Traversal >>>");
            tree.postOrderTraversal(tree.root);
            System.out.println("Level-Order Traversal >>>");
            tree.printLevelOrder(tree.root);


        }

}
