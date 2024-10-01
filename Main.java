//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Khrystyna Semenyna
 */

 public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5}; 

  // output of the array in order using a while loop
    int i = 0 ;
    while (i < nums.length){
      System.out.println(nums[i]);
      i += 1;
    }

    System.out.println("----------");

  // output of the array in reverse using a for loop 
    for (int y = nums.length - 1; y >= 0; i++ ){
      System.out.println(nums[y]);
      y -= 1;
    }

    System.out.println("----------");
  // output the first and last values of the array

    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length-1]);

    System.out.println("----------");

    Lab1 lab = new Lab1();
    System.out.println("Maximum of 4 and 9: " + lab.maximum(4,9));
    System.out.println("Minimum of 4 and 9: " + lab.minimum(4,9));
    System.out.println("Sum of the array: " + lab.arraysum(nums));
    System.out.println("Average of values in the array " + lab.average(nums));
    System.out.println("Maximum value in the array: " + lab.maxforarray(nums));
    System.out.println("Minimum value in the array: " + lab.minforarray(nums));

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int maximum(int a, int b) {
    if (a > b){
      return a;
    } else {
      return b;
    }
  }

  public int minimum (int a, int b) {
    if (a < b){
      return a;
    } else {
      return b;
    }
  }

  public int arraysum(int[] numbers) {
   int sum = 0;
   for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
   }
   return sum;
  }

    
  public double average(int[] numbers) {
    int count = 0;
    int total = 0;
    for (int num : numbers){
      total += num;
      count += 1;
    }
    return (double) total / count;
  }

  public int maxforarray(int[] numbers){
    int lmax = 0;
    for (int i = 0; i < numbers.length ; i++){
      int current = numbers[i];
      if(current > lmax){
        lmax = current;
      } 
    }
    return lmax;
  }

  public int minforarray(int[] numbers){
    int lmin = numbers[0];
    for (int i = 0; i < numbers.length ; i++){
      int current = numbers[i];
      if(current < lmin){
        lmin = current;
      } 
    }
    return lmin;
  }



}

