package list_programs;

import java.util.Arrays;

public class IntervalProblem {
    public static void main(String []args){
        System.out.println("Hello World");
        
        int[][] intervals = {{1,4},{6,8},{2,4},{7,9},{10,15}};
        print2DArray(intervals);
        
         Arrays.sort(intervals, (x,y) -> x[0] - y[0]);
        print2DArray(intervals);
     }
     
     public static void print2DArray(int[][] intervals){
         for(int rows = 0; rows < intervals.length; rows++ ){
            for(int cols = 0; cols < intervals[0].length; cols++){
                System.out.print(intervals[rows][cols]);
            }
            System.out.println();
        }
         
         System.out.println("Done\n");
     }
}
