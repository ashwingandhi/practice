package others;
import java.util.Arrays;

public class MultiArrays {


   static double [][] matrixMult(double [][] a, double [][]b) {
   
      boolean badArray = false; 
      if (a != null && b != null) {
         for(int i = 0; i < a.length; i++)
            if ( a[i] == null) {
               badArray = true;
               break;
            }
         for(int i = 0; i < b.length; i++)
            if (b[i] == null) {
               badArray = true;
               break;
            }
      } else
         badArray = true;
         
      if(badArray)
         return null;
       //checking for jagged array by comparing lengths
      int length = a[0].length;
      for(int i = 1;  i < a.length; i++)
         if(a[i].length != length) {
            badArray = true;
            break;
         }
     
      length = b[0].length;
      for(int i = 1; i < b.length; i++)
         if (b[i].length != length) {
            badArray = true;
            break;
         }
    //checking row and column are of same length for multiplication
      if( a[0].length != b.length)
         badArray = true;
         
      if(badArray)
         return null;
         
      // Setting cardinality of the resultant matrix. See above condition for reference
      double[][] c = new double[a.length][b[0].length];
      
      int aLength = b[0].length;
      int bLength = b.length;
      int aRows = a.length;
      System.out.println("aLength = " + aLength + " bLength = " + bLength
                           + "aRows = " +aRows);
      for(int i = 0; i < aRows; i++)
         for(int j = 0; j < aLength; j++)
            for(int k = 0; k < bLength; k++)
               c[i][j] += a[i][k] * b[k][j];
               
      return c;
               
   }
   
   
   public static void main(String [] args) {
   
      double [][] A = { {0, 1} , {2, 3} };
      double [][] B = { { 0, 1, 2} , {3, 4, 5} };
      
      double [][] good = matrixMult(A, B);
      double [][] bad = matrixMult(B, A);
      
      if(good != null)
         for(int i = 0; i < good.length; i++)
            System.out.println(Arrays.toString(good[i]));
      else
         System.out.println("Null return from matrixMult");
      
      if(bad != null)
         for(int i = 0; i < bad.length; i++)
            System.out.println(Arrays.toString(bad[i]));
      else
         System.out.println("Null return from matrixMult");
   
   }

}
