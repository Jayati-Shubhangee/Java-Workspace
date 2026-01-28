import java.util.*;
public class binaryintro {
    public static class Node{
        int data;
        Node left;
        Node right;
      
       Node(int key){
data=key;
left=null;
right=null;
       }
    }
    public static Node buildtree(Scanner scn){
       System.out.print("Enter node value (-1 for no node): ");
        int x = scn.nextInt();

        // Base case
        if (x == -1) {
            return null;
        }

        // Create current node
        Node root = new Node(x);

        // Input left subtree
        System.out.println("Enter left child of " + x);
        root.left = buildtree(scn);

        // Input right subtree
        System.out.println("Enter right child of " + x);
        root.right = buildtree(scn);

        return root; 
    }
    public static void print(Node root) {
        if (root == null) return;

       /*  System.out.println("Node value: " + root.data);

        if (root.left != null)
            System.out.println("Left child: " + root.left.data);

        if (root.right != null)
            System.out.println("Right child: " + root.right.data);*/
        //o if (root == null) return;

        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       //int x = scn.nextInt();
       //creating root node 
       Node root=buildtree(scn);
       print(root);
    }
    
}
