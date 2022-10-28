package org.example;

public class node {
    int value;
    int height;
    node left;
    node right;
    int addMatrix[][];
    node(int value){
        this.value=value;
        if (value%3==0){
            addMatrix=new int[1048576][1048576];
        }
        else if(value%3==1){
            addMatrix=new int[786432][786432];
        }
        else if(value%3==1){
            addMatrix=new int[393216][393216];
        }
    }
}
