package logic_programs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        
        int testCount = Integer.parseInt(scanner.nextLine());
        
        String s = new String();
        String ssides[];
        
        for(int i = 0; i < testCount; i++){
            s = scanner.nextLine();
            ssides = s.split(" ");
            //System.out.println(s);
            //System.out.println(sides[0] + sides[1] + sides[2]);
            int side[] = new int[3];
            side[0] = Integer.parseInt(ssides[0]);
            side[1] = Integer.parseInt(ssides[1]);
            side[2] = Integer.parseInt(ssides[2]);
            
            
            
            if(side[0] == side[1] && side[1] == side[2]){
            	System.out.println("Equilateral");
            }
            
            else if(side[0] == side[1] || side[0] == side[2] || side[1] == side[2]){
            	System.out.println("Isoceles");
            }
            else{
            	System.out.println("None of these");
            }
            
            
            
        }
        
        
    }
}