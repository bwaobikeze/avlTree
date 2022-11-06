package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int numberSize=0;
        Random rand= new Random();
        avlTree testnode =new avlTree();
        int randoomVal= rand.nextInt(299-0)+0;
//       testnode.root= testnode.insertingNewNode(testnode.root,6);
//        testnode.root= testnode.insertingNewNode(testnode.root,6);
//        testnode.root=testnode.insertingNewNode(testnode.root,3);
//        testnode.root=testnode.insertingNewNode(testnode.root,2);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,8);
//        testnode.root= testnode.insertingNewNode(testnode.root,30);
//        testnode.root=testnode.insertingNewNode(testnode.root,50);
//        testnode.root=testnode.insertingNewNode(testnode.root,220);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,45);
//        testnode.root= testnode.insertingNewNode(testnode.root,30);
//
//
//
//        testnode.root= testnode.insertingNewNode(testnode.root,35);
//        testnode.root= testnode.insertingNewNode(testnode.root,60);
//        testnode.root=testnode.insertingNewNode(testnode.root,200);
//        testnode.root=testnode.insertingNewNode(testnode.root,130);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,49);
//        testnode.root= testnode.insertingNewNode(testnode.root,290);
//        testnode.root=testnode.insertingNewNode(testnode.root,280);
//        testnode.root=testnode.insertingNewNode(testnode.root,220);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,46);
//        testnode.root= testnode.insertingNewNode(testnode.root,30);
//
//
//        testnode.root= testnode.insertingNewNode(testnode.root,35);
//        testnode.root= testnode.insertingNewNode(testnode.root,68);
//        testnode.root=testnode.insertingNewNode(testnode.root,220);
//        testnode.root=testnode.insertingNewNode(testnode.root,230);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,49);
//        testnode.root= testnode.insertingNewNode(testnode.root,10);
//        testnode.root=testnode.insertingNewNode(testnode.root,90);
//        testnode.root=testnode.insertingNewNode(testnode.root,2);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,1);
//        testnode.root= testnode.insertingNewNode(testnode.root,0);
//
//
//        testnode.root= testnode.insertingNewNode(testnode.root,55);
//        testnode.root= testnode.insertingNewNode(testnode.root,90);
//        testnode.root=testnode.insertingNewNode(testnode.root,260);
//        testnode.root=testnode.insertingNewNode(testnode.root,280);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,3);
//        testnode.root= testnode.insertingNewNode(testnode.root,15);
//        testnode.root=testnode.insertingNewNode(testnode.root,4);
//        testnode.root=testnode.insertingNewNode(testnode.root,9);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,1);
//        testnode.root= testnode.insertingNewNode(testnode.root,0);
//
//
//
//        testnode.root= testnode.insertingNewNode(testnode.root,20);
//        testnode.root= testnode.insertingNewNode(testnode.root,50);
//        testnode.root=testnode.insertingNewNode(testnode.root,230);
//        testnode.root=testnode.insertingNewNode(testnode.root,260);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,69);
//        testnode.root= testnode.insertingNewNode(testnode.root,13);
//        testnode.root=testnode.insertingNewNode(testnode.root,9);
//        testnode.root=testnode.insertingNewNode(testnode.root,10);
//
//        testnode.root= testnode.insertingNewNode(testnode.root,111);
//        testnode.root= testnode.insertingNewNode(testnode.root,12);

        //testnode.viewPostorderTraverse(testnode.root);


       testnode.root=testnode.insertingNewNode(testnode.root,randoomVal);
int i=0;
      while(i<50){
          randoomVal=rand.nextInt(299-0)+0;
          testnode.insertingNewNode(testnode.root,randoomVal);
          i++;
      }



        System.out.println("From Tree list:");
            testnode.viewPostorderTraverse(testnode.root);
            System.out.println("height of Avl Tree: "+testnode.givehieht(testnode.root));

    }

}