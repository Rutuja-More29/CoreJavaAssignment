package TwoDArray;

import java.util.Scanner;

public class Xtest {
	public static void   SumAverageElements(int []a,int len)
    {
      int sum=0;
      for(int i=0;i<len;i++){
        sum= sum+a[i];
      }
      int average=sum/len;
      
      System.out.println(sum);
      System.out.println(average);
      
      
    }
   public static void Main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
       int size=5;       
     
       int[] a = new int[size];
        

     for(int i=0;i<size;i++){
       a[i]=sc.nextInt();
     }
     
       int len = a.length;
       SumAverageElements(a, len);
   }
}

