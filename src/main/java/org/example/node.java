package org.example;

public class node {
    int item;
    int height;
    node left;
    node right;
    int addMatrix[][];
    node(int item){
        this.item =item;
        this.height=1;
        if (this.item %3==0){
            addMatrix=new int[1024][1024];
        }
        else if(this.item %3==1){
            addMatrix=new int[889][889];
        }
        else if(this.item %3==2){
            addMatrix=new int[627][627];
        }
        for(int i=0; i< addMatrix.length; i++){
            for(int j=0; j< addMatrix.length;j++){
                addMatrix[i][j]=1;
            }
        }
    }
}
