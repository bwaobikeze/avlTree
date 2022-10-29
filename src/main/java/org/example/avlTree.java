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
node FindMinVal(node val){
        node current=val;
        while(current.left!=null){
            current=current.left;
        }
        return current;
}
}
