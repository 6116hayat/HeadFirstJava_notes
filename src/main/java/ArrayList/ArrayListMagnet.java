package ArrayList;

import java.util.*; //1


public class ArrayListMagnet {   //2
    /*
    * Output :
    * java ArrayListMagnet
    *   zero one two three
    *   zero one three four
    *   zero one three four 4,2
    *   zero one three four 4,2
    */
    public static void main(String[] args) {  //3
        ArrayList <String> a = new ArrayList<String> ();//4
        a.add(0,"zero"); //5
        a.add(1,"one"); //5
        a.add(2,"two"); //6
        a.add(3,"three"); //7
        printAL(a); //7

        if (a.contains("three")){
            a.add("four");
        }

        a.remove(2);
        printAL(a);

        if (a.indexOf("four") != 4){
            a.add(4,"4.2");
        }
        printAL(a);

        if(a.contains("two")){
            a.add("2.2");
        }
        printAL(a);
    }

    public static void printAL(ArrayList<String> al){
        for (String element : al){
            System.out.println(element + " ");
        }
        System.out.println(" ");
    }

}
