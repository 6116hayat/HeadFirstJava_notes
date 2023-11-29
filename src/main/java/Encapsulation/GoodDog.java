package Encapsulation;

import java.sql.SQLOutput;

class GoodDog {
     private int size; //Making an instance variable private

     // Making the Getter & Setter methods public
     public int getSize(){
             return size;
     }
     public void setSize (int s){
         size = s;
     }
     // making methods for the objects
     void bark (){
         if (size > 60){
             System.out.println("WOOF! WOOF!");
         }
         else if (size >14){
             System.out.println("RUFF! RUFF!");
         }
         else {
             System.out.println("YIP! YIP!");
         }
     } // main method end
} // class end
