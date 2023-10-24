public class bst {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            right=left=null;
        }
    }

    static public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } if(root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    static public boolean Search(Node root,int val){
        if(root==null){ 
            return false;
        }
        else  if(root.data==val){
            return true;
        }
        else if(root.data > val){
            Search(root.left, val);
        }
           return Search(root.right, val);
    
    }


    public static Node delete(Node root,int val){
        if(root.data > val){
                root.left=delete(root.left, val);
            }
            else if(root.data < val){
                root.right=delete(root.right, val);
            }
            else{
                //case 1
                if(root.left==null && root.right==null){
                    return null;
                }
                //case 2
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                //case 3
Node IS=inorderSuccesor(root.right);
root.data=IS.data;
root.right=delete(root.right, IS.data);
            
        }
        return root;
    }


public static Node inorderSuccesor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
}
    public static void main(String[] args) {
        int values[] = { 7, 2, 9, 12, 8, 11 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
       System.out.println(Search(root, 90));

       delete(root, 12);
    }
}
