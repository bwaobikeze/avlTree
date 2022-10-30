package org.example;

public class avlTree {
    node root;
    int findingHeight(node PassedInNode){
        if(PassedInNode==null){
            return 0;
        }
        return PassedInNode.height;
    }
    int findMax(int firstOption,int secondOption){
        return(firstOption>secondOption) ? firstOption : secondOption;
    }
    node rotateRight(node SelectedNode){
        node intialNode=SelectedNode.left;
        node temp2=SelectedNode.right;
        intialNode.right=SelectedNode;
        SelectedNode.left=temp2;
        SelectedNode.height=findMax(findingHeight(SelectedNode.left),findingHeight(SelectedNode.right)+1);
        intialNode.height=findMax(findingHeight(intialNode.left),findingHeight(intialNode.right)+1);
        return intialNode;
    }

    node rotateLeft(node intialNode){
        node SelectedNode=intialNode.left;
        node temp2=intialNode.right;
        SelectedNode.right=intialNode;
        intialNode.left=temp2;
        intialNode.height=findMax(findingHeight(intialNode.left),findingHeight(intialNode.right)+1);
        SelectedNode.height=findMax(findingHeight(SelectedNode.left),findingHeight(SelectedNode.right)+1);
        return SelectedNode;
    }
    int restrieveBalnceFact(node retreivenodes){
        if(retreivenodes==null){
            return 0;

        }
        return findingHeight(retreivenodes.left)-findingHeight(retreivenodes.right);
    }

    node insertingNewNode(node Node,int val){
        if(Node==null){
            return (new node(val));
        }
        if(val<Node.value){
            Node.left=insertingNewNode(Node.left,val);
        }
        else if(val>Node.value){
            Node.right=insertingNewNode(Node.right,val);
        }
        else{
            return Node;
        }
        Node.height=1+findMax(findingHeight(Node.left),findingHeight(Node.right));
        int balanceheight=restrieveBalnceFact(Node);
        if(balanceheight>1){
          if(val<Node.left.value){
              return rotateRight(Node);
          }
          else if(val>Node.left.value){
              Node.left=rotateLeft(Node.left);
              return  rotateRight(Node);
          }
        }
        if(balanceheight<-1){
            if(val>Node.right.value){
                return rotateLeft(Node);
            }
            else if(val<Node.right.value){
                Node.right=rotateRight(Node.right);
                return rotateLeft(Node);
            }
        }
    return Node;
    }
    node deletingNode(node root, int value){
        if (root==null){
            return root;
        }
        if(value<root.value){
            root.left=deletingNode(root.left,value);
        }
        else if(value> root.value){
            root.right=deletingNode(root.right,value);
        }
        else{
            if(root.left==null|| root.right==null){
                node temp=null;
                if(temp==root.left){
                    temp=root.right;
                }
                else{
                    temp=root.left;
                    if(temp==null){
                        temp=root;
                        root=null;
                    }
                        else{
                            root=temp;
                        }
                }
            }
            else{
                node temp=FindMinVal(root.right);
                root.value=temp.value;
                root.right=deletingNode(root.right, temp.value);
            }
        }
        //update balance
        if(root==null){
            return root;
        }
        root.height=findMax(findingHeight(root.left),findingHeight(root.right))+1;
        int balanceFact=restrieveBalnceFact(root);
        if(balanceFact>1){
            if(restrieveBalnceFact(root.left)>=0){
                return rotateRight(root);
            }
            else{
                root.left=rotateLeft(root.left);
                return rotateRight(root);
            }
        }
        if(balanceFact<-1){
            if(restrieveBalnceFact(root.right)<=0){
                return rotateLeft(root);
            }
            else{
                root.right=rotateRight(root.right);
                return rotateLeft(root);
            }
        }
        return root;
    }
node FindMinVal(node val){
        node current=val;
        while(current.left!=null){
            current=current.left;
        }
        return current;
}
}
