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
 
    public boolean binarySearch(List<Integer>inputArray, int inputNum){
        int startP = 0;
        int endP = (inputArray.size()-1);
        int midValue;
        
        while(startP<=endP){
             int midP = (endP + startP)/2;
             midValue = inputArray.get(midP);

            if(inputNum == midValue){
                return true;
            } else if (inputNum < midValue){
                 startP = midP + 1;
            } else if (inputNum > midValue){
                 startP = midP - 1;
            }
        }
        
        return false;
    }


	public static List<Integer> sortList(List<Integer> inputArray) {
        
        List<Integer> sortedList = new ArrayList<>();
	    Integer smallestNum = 0; 
			
	    for(int count = 0 ; count<inputArray.size() ; ) {
				
            smallestNum = inputArray.get(0);

            for(int eachNum: inputArray) {
                smallestNum = (eachNum < smallestNum)? eachNum : smallestNum;
            }
			
            sortedList.add(smallestNum);
            inputArray.remove(smallestNum); 
        }

        return sortedList;
    }
          
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int inputNum = 0;
        int numOfPrintList = 100;
        List<Integer> randomList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        int answer = 0;
		
        System.out.println("\n\nList here :");

        for(int count = 0; count < numOfPrintList; count++){
            int numOfRange = new Random().nextInt(999);
            System.out.print(numOfRange + " ");
            randomList.add(numOfRange);
        } 
        /* 
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
        */

        sortedList = sortList(randomList); 

        System.out.print("\n\nSorted list:" + sortedList + "\n");
			
		 
        //int answer = binarySearch(sortList, inputNum);

        if(answer == 0){
            System.out.println("Number not in list!");
        } else {
            System.out.println(inputNum + " is at index " + (answer) + " from the list");
        }
        
    }
}