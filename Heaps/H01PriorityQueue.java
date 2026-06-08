import java.util.*;

public class H01PriorityQueue{

    //To compare objects
    static class Student implements Comparable<Student>{

        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); //O(logn)
        }

        System.out.println("\n====REVERSE-ORDER====\n");
        //to reverse priority
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Comparator.reverseOrder());

        rpq.add(3); //O(logn)
        rpq.add(4);
        rpq.add(1);
        rpq.add(7);

        while(!rpq.isEmpty()){
            System.out.println(rpq.peek()); // O(1)
            rpq.remove(); //O(logn)
        }


        System.out.println("\n====Object====\n");
        //To compare objects using student class with compareTo function 
        PriorityQueue<Student> opq = new PriorityQueue<>();

        opq.add(new Student("A",3)); //O(logn)
        opq.add(new Student("B",5));
        opq.add(new Student("C",7));
        opq.add(new Student("D",2));

        while(!opq.isEmpty()){
            System.out.println("Name: " + opq.peek().name + " Rank: " + opq.peek().rank); // O(1)
            opq.remove(); //O(logn)
        }
    }

}