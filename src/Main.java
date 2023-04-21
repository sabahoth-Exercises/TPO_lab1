import task2.BinarySearchTree;

import static task1.ArcSinFunction.arcsin;

public class Main {
    public static void main(String[] args) {
        //System.out.println(arcsin(-0.8));
        //System.out.println(Math.asin(-0.8));

        BinarySearchTree tree = new BinarySearchTree();

// Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.println("\n\n");
        tree.inorder(tree.root);
        tree.delete(20);
        System.out.println("\n\n");
        tree.inorder(tree.root);
        System.out.println("\n\n"+ tree.find(20));

        //System.out.println(tree.root);
    }
}