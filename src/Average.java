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

   
  
    //Create an object scanner
   
    
      private int data[];
    private double mean; 
    
     Average (Average s) {
       this.mean = s.mean; 
       this.data = s.data;
  
       //for loop data
        Scanner input = new Scanner(System.in);
       for (int i = 0; i <= data.length; i ++){
         System.out.println("Please enter a score number: ");
         input.nextLine();
            
           
       }
   }
    public double calculateMean(){
       for (int j = 0; j<= data.length; j ++){
       this.mean += (double)(this.data/data.length);
       
       }
       return this.mean;
    }
   public String toString(int[] data){
       return Arrays.toString(selectionSort(this.data));
   }
    
   public int[] selectionSort(int[] data){
       return this.data;
       
   }


public static void main(String[] args){
    int data1 = 1;

    System.out.println("str" + Average());
    System.out.println("str" + toString());
}


}