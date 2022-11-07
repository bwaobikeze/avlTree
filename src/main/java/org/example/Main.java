package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand= new Random();
        avlTree testTree =new avlTree();


       long start=System.nanoTime();
        int NumberOfNums[]={1500/*,200,500,1000,1500,2000,2500,5000,8000,10000*/};
        for(int i=0; i<NumberOfNums.length;i++){
            System.out.println("Timings for Insertions and Deletions Large Number: "+NumberOfNums[i]);
            for(int j=0; j<NumberOfNums[i];j++){
                int randVar=rand.nextInt(290)+0;
                testTree.root=testTree.insertingNewNode(testTree.root,randVar);
            }
            long end=System.nanoTime();
            long timeElasped2=((end-start)/1000000);
            System.out.println("Time in Milliseconds for Large Num "+ NumberOfNums[i]+": "+ timeElasped2+" Ms");
            System.out.println("===========================================");

        }


    }

}