package lecture4;

import java.util.ArrayList;
import java.util.LinkedList;

public class HW_3 {


    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        LinkedList<Integer> llnum = new LinkedList<Integer>(); 
        
        System.out.println("The number of elements in both lists are 300000");
        
       int i;
       
       long start = System.nanoTime();
       for(i=0;i<300000;i++){
           num.add(i);
       }
       long stop = System.nanoTime();
       double time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for ArrayList ADD " + time + "sec");
       
       start = System.nanoTime();
       for(i=0;i<300000;i++){
           llnum.add(i);
       }
       stop = System.nanoTime();       
       time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for LinkedList ADD " + time + "sec");
       
       start = System.nanoTime();
       for(i=0;i<num.size();i++){
           num.get(i);
       }
       stop = System.nanoTime();       
       time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for ArrayList GET " + time + "sec");
//       
       start = System.nanoTime();
       for(i=0;i<llnum.size();i++){
           llnum.get(i);
       }
       stop = System.nanoTime();       
       time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for LinkedList GET " + time + "sec");

       start = System.nanoTime();
       for(i=0;i<num.size();i++){
           num.remove(i);
       }
       stop = System.nanoTime();       
       time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for ArrayList REMOVE " + time + "sec");
//       
       start = System.nanoTime();
       for(i=0;i<llnum.size();i++){
           llnum.remove(i);
       }
       stop = System.nanoTime();       
       time = (double)(stop-start)/1000000000;
       System.out.println("Time taken for LinkedList REMOVE " + time + "sec");
       
    }
}
