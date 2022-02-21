import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] arr = {1,2,18,5,9,23,54,23,22,22,17};

    // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  //MAX PRIORITY QUEUE
    PriorityQueue<Integer> pq = new PriorityQueue<>(); //MIN PRIORITY QUEUE
    for(int i = 0; i<arr.length; i++){
      pq.add(arr[i]);
    }
    // pq.remove();
    // System.out.print(pq.peek());

    while(pq.size() != 0){
      System.out.print(pq.remove()+" ");
    }

  }
}