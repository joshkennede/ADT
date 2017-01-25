/**
 * Created by JoshuaK on 1/24/2017.
 */
public class WaitLine {

     private int numberOfArrivals;
     private int numberServed;
     private int totalTimeWaited;

     /**
      * Constructor for WaitLine
      */
     public WaitLine() {
          reset();
     } // end default constructor

     // Testing...
     public static void main(String args[]) {
          WaitLine customerLine = new WaitLine();
          customerLine.simulate(20,0.5,5);
          customerLine.displayResults();
     } // end main

     /**
      * Simulate the WaitLine
      * @param duration
      * @param arrivalProbability
      * @param maxTransactionTime
      */
     public void simulate(int duration, double arrivalProbability, int maxTransactionTime) {
          int transactionTimeLeft = 0;
          for (int clock = 0; clock < duration; clock++) {
               if (Math.random() < arrivalProbability) {
                    numberOfArrivals++;
                    int transactionTime = (int)(Math.random()* maxTransactionTime + 1);
                    Customer nextArrival = new Customer(clock, transactionTime, numberOfArrivals);
                    System.out.println("Customer " + numberOfArrivals + " enters line at time " + clock +
                     ". Transaction time is " + transactionTime);
               } // end if
               if (transactionTimeLeft > 0)
                    transactionTimeLeft--;
               else if (!line.isEmpty()) {
                    transactionTimeLeft = nextCustomer.getTransactionTime() - 1;
                    int timeWaited = clock - nextCustomer.getArrivalTime();
                    totalTimeWaited = totalTimeWaited + timeWaited;
                    numberServed++;
                    System.out.println("Customer " + nextCustomer.getCustomerNumber() + " begins service at time "
                    + clock + ". Time waited is " + timeWaited);
               } // end if
          } // end for
     } // end simulate

     /**
      * Display the simulation
      */
     public void displayResults() {
          System.out.println();
          System.out.println("Number served = " + numberServed);
          System.out.println("Total time waited = " + totalTimeWaited);
          double averageTimeWaited = ((double)totalTimeWaited) / numberServed;
          System.out.println("Average time waited = " + averageTimeWaited);
          int leftInLine = numberOfArrivals - numberServed;
          System.out.println("Number left in line = " + leftInLine);
     } // end displayResults

     /**
      * Reset the line
      */
     public final void reset() {
          line.clear();
          numberOfArrivals = 0;
          numberServed = 0;
          totalTimeWaited = 0;
     } // end reset
} // end WaitLine
