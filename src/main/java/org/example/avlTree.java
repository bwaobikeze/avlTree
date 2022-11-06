package org.example;

public class avlTree {
    node root;
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



    int findingHeight(node PassedInNode) {
        if (PassedInNode == null)
            return 0;
        return PassedInNode.height;
    }

    int findMax(int firstOption, int secondOption) {
        return (firstOption > secondOption) ? firstOption : secondOption;
    }

    node rotateRight(node selectedNode) {
        node intialNode = selectedNode.left;
        node T2 = intialNode.right;
        intialNode.right = selectedNode;
        selectedNode.left = T2;
        selectedNode.height = findMax(findingHeight(selectedNode.left), findingHeight(selectedNode.right)) + 1;
        intialNode.height = findMax(findingHeight(intialNode.left), findingHeight(intialNode.right)) + 1;
        return intialNode;
    }

    node rotateLeft(node intialNode) {
        node SelectedNode = intialNode.right;
        node T2 = SelectedNode.left;
        SelectedNode.left = intialNode;
        intialNode.right = T2;
        intialNode.height = findMax(findingHeight(intialNode.left), findingHeight(intialNode.right)) + 1;
        SelectedNode.height = findMax(findingHeight(SelectedNode.left), findingHeight(SelectedNode.right)) + 1;
        return SelectedNode;
    }

    // Get balance factor of a node
    int restrieveBalnceFac(node retreivenodes) {
        if (retreivenodes == null)
            return 0;
        return findingHeight(retreivenodes.left) - findingHeight(retreivenodes.right);
    }

    // Insert a node
    node insertingNewNode(node Node, int Val) {
        int NumOfNodes=TotalNodes(Node);
        long startDel;

        if(NumOfNodes>50){
            node minVal= FindMinVal(Node);
            startDel=System.nanoTime();
            Node= deletingNode(Node,minVal.item);
            long endDel=System.nanoTime();
        long timeElasped2=(endDel-startDel);
        System.out.println("Time in Milliseconds Of Deletion: "+ timeElasped2);
        }
        long startInsert;
        startInsert=System.nanoTime();
        // Find the position and insert the node
        if (Node == null)
            return (new node(Val));
        if (Val < Node.item)
            Node.left = insertingNewNode(Node.left, Val);
        else if (Val > Node.item)
            Node.right = insertingNewNode(Node.right, Val);
        else
            return Node;

        // Update the balance factor of each node
        // And, balance the tree
        Node.height = 1 + findMax(findingHeight(Node.left), findingHeight(Node.right));
        int balanceFact = restrieveBalnceFac(Node);
        if (balanceFact > 1) {
            if (Val < Node.left.item) {
                return rotateRight(Node);
            } else if (Val > Node.left.item) {
                Node.left = rotateLeft(Node.left);
                return rotateRight(Node);
            }
        }
        if (balanceFact < -1) {
            if (Val > Node.right.item) {
                return rotateLeft(Node);
            } else if (Val < Node.right.item) {
                Node.right = rotateRight(Node.right);
                return rotateLeft(Node);
            }
        }
        long endInsert=System.nanoTime();
        long timeElaspInsert=(endInsert-startInsert);
        System.out.println("Time in Milliseconds Of Insertion: "+ timeElaspInsert);
        return Node;
    }

    node FindMinVal(node val) {
        node current = val;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node
    node deletingNode(node root, int Value) {

        // Find the node to be deleted and remove it
        if (root == null)
            return root;
        if (Value < root.item)
            root.left = deletingNode(root.left, Value);
        else if (Value > root.item)
            root.right = deletingNode(root.right, Value);
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
                node temp = FindMinVal(root.right);
                root.item = temp.item;
                root.right = deletingNode(root.right, temp.item);
            }
        }
        if (root == null)
            return root;

        // Update the balance factor of each node and balance the tree
        root.height = findMax(findingHeight(root.left), findingHeight(root.right)) + 1;
        int balanceFact = restrieveBalnceFac(root);
        if (balanceFact > 1) {
            if (restrieveBalnceFac(root.left) >= 0) {
                return rotateRight(root);
            } else {
                root.left = rotateLeft(root.left);
                return rotateRight(root);
            }
        }
        if (balanceFact < -1) {
            if (restrieveBalnceFac(root.right) <= 0) {
                return rotateLeft(root);
            } else {
                root.right = rotateRight(root.right);
                return rotateLeft(root);
            }
        }
        return root;
    }
    // Print the tree

    void preOrder(node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }



}
