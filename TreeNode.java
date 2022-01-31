package com.nasir.services;

import java.util.ArrayList;
// public class TreeNode {

// Binary Tree node
    class TreeNode
    {
        public int data;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int data)
        {
            // Set node value
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //public class BinaryTree
class BinaryTree
    {
        public TreeNode root;
        public BinaryTree()
        {
            // Set initial tree root to null
            this.root = null;
        }
        // Display given path
        public void printPath(ArrayList < Integer > path)
        {
            int i = 0;
            // print path
            while (i < path.size())
            {
                System.out.print(" " + path.get(i));
                i++;
            }
            System.out.print("\n");
        }
        // Find height of given binary tree
        public int treeHeight(TreeNode node)
        {
            if (node != null)
            {
                int a = treeHeight(node.left);
                int b = treeHeight(node.right);
                if (a > b)
                {
                    return a + 1;
                }
                else
                {
                    return b + 1;
                }
            }
            else
            {
                return 0;
            }
        }
        // Find all longest path using recursion
        public void findLongestPath(TreeNode node,
                                    ArrayList < Integer > path, int height)
        {
            if (node == null)
            {
                return;
            }
            // Add path element
            path.add(node.data);
            if (node.left == null && node.right == null)
            {
                if (height == 0)
                {
                    printPath(path);
                }
            }
            else
            {
                findLongestPath(node.left, path, height - 1);
                findLongestPath(node.right, path, height - 1);
            }
            // Remove last node in path
            path.remove(path.size() - 1);
        }
        // Handles the request of finding longest path in tree
        public void longestPaths()
        {
            // This is use to collect sort path
            ArrayList < Integer > path = new ArrayList < Integer > ();
            if (this.root == null)
            {
                // Empty Tree
                return;
            }
            else
            {
                findLongestPath(this.root, path, treeHeight(this.root)-1);
            }
        }
}
