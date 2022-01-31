package com.nasir.services;

public class Main {
    public static void main(String[] args)
    {
        // Create new binary tree
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(100);
        tree.root.left = new TreeNode(20);
        tree.root.right = new TreeNode(130);
        tree.root.left.left = new TreeNode(10);
        tree.root.left.right= new TreeNode(50);
        tree.root.right.left= new TreeNode(110);
        tree.root.right.right = new TreeNode(140);
        tree.root.left.left.left = new TreeNode(5);
        tree.longestPaths();
    }
}

