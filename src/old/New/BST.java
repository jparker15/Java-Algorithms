package old.New;

import org.w3c.dom.Node;

public class BST {
    Node left,right;
    int data;
    BST (int data){
        this.data=data;
        left=right=null;
    }

    public static int getHeight(Node root){
        //Write your code here
        // if root.left and root.right are null
        // return 0

// find the heights of left and right nodes
        // if root.left is not null
        // increase height by 1
        // find height of root.left
        // else height of branch is 0

        // if root.right is not null
        // increase height by 1
        // find height of root.left
        // else height of branch is 0

// compare the heights and take the largest value
// return the largest found value

//        int left = 0;
//        int right = 0;
//        if(root.left == null && root.right == null){
//            return 0;
//        }
//        if(root.left != null){
//            left = getHeight(root.left);
//            left ++;
//        }
//        if(root.right != null){
//            right = getHeight(root.right);
//            right ++;
//        }
////        if(left > right){
////            return left;
////        } return right;
//        return Math.max(left,right);
        return 0;

    }
}
