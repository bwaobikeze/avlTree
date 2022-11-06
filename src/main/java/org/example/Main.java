package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand= new Random();
        avlTree testTree =new avlTree();

//
//
//
//        testTree.root= testTree.insertingNewNode(testTree.root,35);
//        testTree.root= testTree.insertingNewNode(testTree.root,60);
//        testTree.root=testTree.insertingNewNode(testTree.root,200);
//        testTree.root=testTree.insertingNewNode(testTree.root,130);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,49);
//        testTree.root= testTree.insertingNewNode(testTree.root,290);
//        testTree.root=testTree.insertingNewNode(testTree.root,280);
//        testTree.root=testTree.insertingNewNode(testTree.root,220);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,46);
//        testTree.root= testTree.insertingNewNode(testTree.root,30);
//
//
//        testTree.root= testTree.insertingNewNode(testTree.root,35);
//        testTree.root= testTree.insertingNewNode(testTree.root,68);
//        testTree.root=testTree.insertingNewNode(testTree.root,220);
//        testTree.root=testTree.insertingNewNode(testTree.root,230);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,49);
//        testTree.root= testTree.insertingNewNode(testTree.root,10);
//        testTree.root=testTree.insertingNewNode(testTree.root,90);
//        testTree.root=testTree.insertingNewNode(testTree.root,2);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,1);
//        testTree.root= testTree.insertingNewNode(testTree.root,0);
//
//
//        testTree.root= testTree.insertingNewNode(testTree.root,55);
//        testTree.root= testTree.insertingNewNode(testTree.root,90);
//        testTree.root=testTree.insertingNewNode(testTree.root,260);
//        testTree.root=testTree.insertingNewNode(testTree.root,280);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,3);
//        testTree.root= testTree.insertingNewNode(testTree.root,15);
//        testTree.root=testTree.insertingNewNode(testTree.root,4);
//        testTree.root=testTree.insertingNewNode(testTree.root,9);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,1);
//        testTree.root= testTree.insertingNewNode(testTree.root,0);
//
//
//
//        testTree.root= testTree.insertingNewNode(testTree.root,20);
//        testTree.root= testTree.insertingNewNode(testTree.root,50);
//        testTree.root=testTree.insertingNewNode(testTree.root,230);
//        testTree.root=testTree.insertingNewNode(testTree.root,260);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,69);
//        testTree.root= testTree.insertingNewNode(testTree.root,13);
//        testTree.root=testTree.insertingNewNode(testTree.root,9);
//        testTree.root=testTree.insertingNewNode(testTree.root,10);
//
//        testTree.root= testTree.insertingNewNode(testTree.root,111);
//        testTree.root= testTree.insertingNewNode(testTree.root,12);

        //testTree.viewPostorderTraverse(testTree.root);

      // long start=System.nanoTime();
        int NumberOfNums[]={100000/*,200,500,1000,1500,2000,2500,5000,8000,10000*/};
        for(int i=0; i<NumberOfNums.length;i++){
            System.out.println("Timings for Insertions and Deletions Large Number: "+NumberOfNums[i]);
            for(int j=0; j<NumberOfNums[i];j++){
                int randVar=rand.nextInt(290)+0;
                testTree.root=testTree.insertNode(testTree.root,randVar);
            }
            System.out.println("===========================================");

        }


    }

}