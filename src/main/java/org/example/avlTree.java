package org.example;

public class avlTree {
//    node root;
//    int findingHeight(node PassedInNode){
//        if(PassedInNode==null){
//            return 0;
//        }
//        return PassedInNode.height;
//    }
    int givehieht(node rootNode){
        if (rootNode == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth =givehieht(rootNode.left);
            int rDepth =givehieht(rootNode.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
    static int left_height(node Nd)
    {
        int ht = 0;
        while (Nd!=null) {
            ht++;
            Nd = Nd.left;
        }

        // Return the left height obtained
        return ht;
    }

    // Function to get the right height
// of the binary tree
    static int right_height(node node)
    {
        int ht = 0;
        while (node!=null) {
            ht++;
            node = node.right;
        }

        // Return the right height obtained
        return ht;
    }

    // Function to get the count of nodes
// in complete binary tree
    static int TotalNodes(node root)
    {

        // Base Case
        if (root == null)
            return 0;

        // Find the left height and the
        // right heights
        int lh = left_height(root);
        int rh = right_height(root);

        // If left and right heights are
        // equal return 2^height(1<<height) -1
        if (lh == rh)
            return (1 << lh) - 1;

        // Otherwise, recursive call
        return 1 + TotalNodes(root.left)
                + TotalNodes(root.right);
    }
//    int findMax(int firstOption,int secondOption){
//        return(firstOption>secondOption) ? firstOption : secondOption;
//    }
//    node rotateRight(node SelectedNode){
//        node intialNode=SelectedNode.left;
//        node temp2=SelectedNode.right;
//        intialNode.right=SelectedNode;
//        SelectedNode.left=temp2;
//        SelectedNode.height=findMax(findingHeight(SelectedNode.left),findingHeight(SelectedNode.right)+1);
//        intialNode.height=findMax(findingHeight(intialNode.left),findingHeight(intialNode.right)+1);
//        return intialNode;
//    }
//
//    node rotateLeft(node intialNode){
//        node SelectedNode=intialNode.right;
//        node temp2=SelectedNode.left;
//        SelectedNode.left=intialNode;
//        intialNode.right=temp2;
//        intialNode.height=findMax(findingHeight(intialNode.left),findingHeight(intialNode.right)+1);
//        SelectedNode.height=findMax(findingHeight(SelectedNode.left),findingHeight(SelectedNode.right)+1);
//        return SelectedNode;
//    }
//    int restrieveBalnceFact(node retreivenodes){
//        if(retreivenodes==null){
//            return 0;
//
//        }
//        return findingHeight(retreivenodes.left)-findingHeight(retreivenodes.right);
//    }
//
//    node insertingNewNode(node Node,int val){
//        if(Node==null){
//            return (new node(val));
//        }
//        if(val<Node.value){
//            Node.left=insertingNewNode(Node.left,val);
//        }
//        else if(val>Node.value){
//            Node.right=insertingNewNode(Node.right,val);
//        }
//        else{
//            return Node;
//        }
//        Node.height=1+findMax(findingHeight(Node.left),findingHeight(Node.right));
//        int balanceheight=restrieveBalnceFact(Node);
//        if(balanceheight>1){
//          if(val<Node.left.value){
//              return rotateRight(Node);
//          }
//          else if(val>Node.left.value){
//              Node.left=rotateLeft(Node.left);
//              return  rotateRight(Node);
//          }
//        }
//        if(balanceheight<-1){
//            if(val>Node.right.value){
//                return rotateLeft(Node);
//            }
//            else if(val<Node.right.value){
//                Node.right=rotateRight(Node.right);
//                return rotateLeft(Node);
//            }
//        }
//    return Node;
//    }
//    node deletingNode(node root, int value){
//        if (root==null){
//            return root;
//        }
//        if(value<root.value){
//            root.left=deletingNode(root.left,value);
//        }
//        else if(value> root.value){
//            root.right=deletingNode(root.right,value);
//        }
//        else{
//            if(root.left==null|| root.right==null){
//                node temp=null;
//                if(temp==root.left){
//                    temp=root.right;
//                }
//                else{
//                    temp=root.left;
//                    if(temp==null){
//                        temp=root;
//                        root=null;
//                    }
//                        else{
//                            root=temp;
//                        }
//                }
//            }
//            else{
//                node temp=FindMinVal(root.right);
//                root.value=temp.value;
//                root.right=deletingNode(root.right, temp.value);
//            }
//        }
//        //update balance
//        if(root==null){
//            return root;
//        }
//        root.height=findMax(findingHeight(root.left),findingHeight(root.right))+1;
//        int balanceFact=restrieveBalnceFact(root);
//        if(balanceFact>1){
//            if(restrieveBalnceFact(root.left)>=0){
//                return rotateRight(root);
//            }
//            else{
//                root.left=rotateLeft(root.left);
//                return rotateRight(root);
//            }
//        }
//        if(balanceFact<-1){
//            if(restrieveBalnceFact(root.right)<=0){
//                return rotateLeft(root);
//            }
//            else{
//                root.right=rotateRight(root.right);
//                return rotateLeft(root);
//            }
//        }
//        return root;
//    }
//    void viewPostorderTraverse(node NodeObj){
//        if (NodeObj != null){
//            int numCount=0;
//            System.out.print(/*numCount+": "+*/NodeObj.value+",");
//            numCount++;
//            viewPostorderTraverse(NodeObj.left);
//            viewPostorderTraverse(NodeObj.right);
//        }
//    }
//node FindMinVal(node val){
//        node current=val;
//        while(current.left!=null){
//            current=current.left;
//        }
//        return current;
//}
node root;

    int height(node N) {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    node rightRotate(node y) {
        node x = y.left;
        node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;
        return x;
    }

    node leftRotate(node x) {
        node y = x.right;
        node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    // Get balance factor of a node
    int getBalanceFactor(node N) {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    // Insert a node
    node insertNode(node Node, int item) {
        int NumOfNodes=TotalNodes(Node);
        long startDel;

        if(NumOfNodes>50){
            node minVal=nodeWithMimumValue(Node);
            startDel=System.nanoTime();
            Node=deleteNode(Node,minVal.item);
            long endDel=System.nanoTime();
        long timeElasped2=(endDel-startDel);
        System.out.println("Time in Milliseconds Of Deletion: "+ timeElasped2);
        }
        long startInsert;
        startInsert=System.nanoTime();
        // Find the position and insert the node
        if (Node == null)
            return (new node(item));
        if (item < Node.item)
            Node.left = insertNode(Node.left, item);
        else if (item > Node.item)
            Node.right = insertNode(Node.right, item);
        else
            return Node;

        // Update the balance factor of each node
        // And, balance the tree
        Node.height = 1 + max(height(Node.left), height(Node.right));
        int balanceFactor = getBalanceFactor(Node);
        if (balanceFactor > 1) {
            if (item < Node.left.item) {
                return rightRotate(Node);
            } else if (item > Node.left.item) {
                Node.left = leftRotate(Node.left);
                return rightRotate(Node);
            }
        }
        if (balanceFactor < -1) {
            if (item > Node.right.item) {
                return leftRotate(Node);
            } else if (item < Node.right.item) {
                Node.right = rightRotate(Node.right);
                return leftRotate(Node);
            }
        }
        long endInsert=System.nanoTime();
        long timeElaspInsert=(endInsert-startInsert);
        System.out.println("Time in Milliseconds Of Insertion: "+ timeElaspInsert);
        return Node;
    }

    node nodeWithMimumValue(node node) {
        node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node
    node deleteNode(node root, int item) {

        // Find the node to be deleted and remove it
        if (root == null)
            return root;
        if (item < root.item)
            root.left = deleteNode(root.left, item);
        else if (item > root.item)
            root.right = deleteNode(root.right, item);
        else {
            if ((root.left == null) || (root.right == null)) {
                node temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                node temp = nodeWithMimumValue(root.right);
                root.item = temp.item;
                root.right = deleteNode(root.right, temp.item);
            }
        }
        if (root == null)
            return root;

        // Update the balance factor of each node and balance the tree
        root.height = max(height(root.left), height(root.right)) + 1;
        int balanceFactor = getBalanceFactor(root);
        if (balanceFactor > 1) {
            if (getBalanceFactor(root.left) >= 0) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (balanceFactor < -1) {
            if (getBalanceFactor(root.right) <= 0) {
                return leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }
        return root;
    }

    void preOrder(node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Print the tree
    public void printTree(node currPtr, String indent, boolean last) {
        if (currPtr != null) {
            System.out.print(indent);
            if (last) {
                System.out.print("R----");
                indent += "   ";
            } else {
                System.out.print("L----");
                indent += "|  ";
            }
            System.out.println(currPtr.item);
            printTree(currPtr.left, indent, false);
            printTree(currPtr.right, indent, true);
        }
    }
}
