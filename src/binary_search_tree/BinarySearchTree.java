package binary_search_tree;
/**
 * Purpose  - To create Binary Search Tree
 * @author  - Utkarsh Mishra
 * @version - 16.0
 * @since   - 2021-09-27
 */

public class BinarySearchTree {
    public static void main(String[] args) {
        System.out.println("Welcome to the Program");
        BinaryTree<Integer> myTree = new BinaryTree<>();
        myTree.add(56);
        myTree.add(30);
        myTree.add(70);
        myTree.print(myTree.root);
    }
}