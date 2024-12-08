/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;

import java.util.Scanner;
/**
 *
 * @author yasmi
 */
public class Average {
    
      private int data[];
    private double mean; 
    
     public Average () {
      
  data = new int[5];
        //Create an object scanner
        Scanner input = new Scanner(System.in);
        //for loop data
       for (int i = 0; i < data.length; i ++){
         System.out.println("Please enter score number " + (i + 1) + " :");
         data[i]=  input.nextInt(); 
           
       }
       
         System.out.println("The mean is : " + calculateMean());
         System.out.printf("The numbers in descending order are : ");
         selectionSort();
       
   }
     //the calculateMean() method
    public double calculateMean(){
        double totalscore = 0;
       for (int j = 0; j < data.length; j ++){
       totalscore += data[j];
       
       }
       mean = (double)(totalscore/data.length);
      return mean; 
    }
      @Override
   public String toString(){
       String result = " ";
       for (int i = 0; i < data.length; i ++)
       {
           result += data[i] + " ";
}
       return result;
       } 
     
   //the selectionSort() method
   public void  selectionSort(){
      //invoking sort() method of the Arrays class  
     Arrays.sort(data);
     for (int i = 0, j = data.length - 1, k; i < j; i++, j--) {
            k = data[i];
            data[i] = data[j];
            data[j] = k;
        }
     
     }
}

