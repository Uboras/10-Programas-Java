/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program9;

import java.util.*;

public class Program9 {

    public static void main(String args[]) {
      // create queue
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Rajendra");
        queue.add("Mahendra");
        queue.add("Raja");
        queue.add("Technolamror");
        queue.add("Rahul");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //delete peek (2 times)
        System.out.println("---------");
        System.out.println("eliminado");
        System.out.println(queue.remove());
                System.out.println("eliminado");
        System.out.println(queue.poll());
        System.out.println("---------");
        System.out.println("after removing two elements:");
        //show queue
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
