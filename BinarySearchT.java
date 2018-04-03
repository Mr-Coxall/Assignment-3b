/**********************************************************************
 * Assingment3b
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 *
 **********************************************************************/


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;

 public class BinarySearchT{
     public static int binarySearch(List<Integer>inputArray, int inputNum){
         int startP = 0;
         int endP = (inputArray.size()-1);
         int midValue;

         while(startP<endP){
             int midP = (endP + startP)/2;
             midValue = inputArray.get(midP);

             if(inputNum == midValue){
                 return midP;
             }else if (inputNum < midValue){
                 startP = midP + 1;
             }else if (inputNum > midValue){
                 startP = midP - 1;
             }
         }
         return-1;
     }
     
          
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = "";
         int inputNum = 0;
         int numOfPrintList = 100;
         List<Integer>randomList = new ArrayList<>();

         System.out.println("List here :");

         for(int count = 0; count<numOfPrintList; count++){
               int numOfRange = new Random().nextInt(200);
             System.out.print(numOfRange+" ");
         } 
         
	  while (input == ""){
				System.out.println("\nInput a number:");
				
	  try {
			input = scanner.nextLine();
			inputNum = Integer.parseInt(input);
		}catch (IllegalArgumentException x) { 
			System.out.println("Please Input a number!");
		        input = "";
		}
		}
		
         int answer = binarySearch(randomList,inputNum);

         if(answer == 0){
             System.out.println("Number not in list!");
         }else{
             System.out.println(inputNum+" is at index "+(answer+2) +" from the list");
         }
         



     }
     }
 




