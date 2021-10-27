package old.New;

import java.util.*;

public class Tickets {

    // Initialize Queue
// Initialize timeCounter = amount of positions Alex has moved each time
// Initialize ticketsNeeded = position of element in tickets List

//WHILE ticketsNeeded > 0
    // pull element from front of a queue
    // minus element by 1
    //  if element > 0 put at back of line else element will not be added again
    //  if p > 0 subtract p by 1
    //  else p = queue.size - 1 and ticketsNeeded --
    // increment timeCounter by 1
    //

// RETURN timeCounter

    public static void main(String[] args) {

        waitingTime(Arrays.asList(1,1,1,1), 0);
    }

    public static long waitingTime(List<Integer> tickets, int p){

        Queue<Integer> q = new LinkedList<>(tickets);

        long timeCounter = 0;
        int ticketsNeeded = tickets.get(p);

        while(ticketsNeeded > 0){
            int first = q.poll() - 1;
            if(first > 0){
                q.add(first);
            }
            if(p > 0){
                p--;
            }else{
                p = q.size() - 1;
                ticketsNeeded--;
            }
            timeCounter++;

        }
        System.out.println(timeCounter);
        return timeCounter;


    }

}
