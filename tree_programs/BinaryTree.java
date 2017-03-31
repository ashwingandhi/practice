package tree_programs;
// Java program to construct a tree using inorder and preorder traversal
  
/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node1 
{
    char data;
    Node1 left, right;
  
    Node1(char item) 
    {
        data = item;
        left = right = null;
    }
}
  
public class BinaryTree 
{
    Node1 root;
    static int preIndex = 0;
  
    /* Recursive function to construct binary of size len from
       Inorder traversal in[] and Preorder traversal pre[].
       Initial values of inStrt and inEnd should be 0 and len -1.  
       The function doesn't do any error checking for cases where 
       inorder and preorder do not form a tree */
    Node1 buildTree(char in[], char pre[], int inStrt, int inEnd) 
    {
        if (inStrt > inEnd) 
            return null;
  
        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
        Node1 tNode = new Node1(pre[preIndex++]);
  
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return tNode;
  
        /* Else find the index of this node in Inorder traversal */
        int inIndex = search(in, inStrt, inEnd, tNode.data);
  
        /* Using index in Inorder traversal, construct left and
           right subtress */
        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
  
        return tNode;
    }
  
    /* UTILITY FUNCTIONS */
     
    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
    int search(char arr[], int strt, int end, char value) 
    {
        int i;
        for (i = strt; i <= end; i++) 
        {
            if (arr[i] == value)
                return i;
        }
        return i;
    }
  
    /* This funtcion is here just to test buildTree() */
    void printInorder(Node1 node) 
    {
        if (node == null)
            return;
  
        /* first recur on left child */
        printInorder(node.left);
  
        /* then print the data of node */
        System.out.print(node.data + " ");
  
        /* now recur on right child */
        printInorder(node.right);
    }
    
    void printPostorder(Node1 node) 
    {
        if (node == null)
            return;
  
        /* first recur on left child */
        printPostorder(node.left);
  
        /* now recur on right child */
        printPostorder(node.right);
        
        /* then print the data of node */
        System.out.print(node.data + " ");
  
        
    }
  
    // driver program to test above functions
    public static void main(String args[]) 
    {
        BinaryTree tree = new BinaryTree();
        char in[] = new char[]{'b', 'a', 'e', 'c', 'd'};
        char pre[] = new char[]{'a', 'b', 'd', 'c', 'e'};
        int len = in.length;
        Node1 root = tree.buildTree(in, pre, 0, len - 1);
  
        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printPostorder(root);
        System.out.println();
        //System.out.println(root.left.right.data);
        System.out.println(root.right.left.left.data);
    }
}