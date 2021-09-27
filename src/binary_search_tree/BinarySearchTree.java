package binary_search_tree;
/**
 * Purpose  - To create Binary Search Tree and add more values
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
        myTree.add(22);
        myTree.add(40);
        myTree.add(11);
        myTree.add(3);
        myTree.add(16);
        myTree.add(60);
        myTree.add(95);
        myTree.add(65);
        myTree.add(63);
        myTree.add(67);
        myTree.print(myTree.root);
    }
}