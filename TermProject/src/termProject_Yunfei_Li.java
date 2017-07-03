import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

//Name: Yunfei Li
//Assignment: Term Project
//Class: CS5070
//Date: July 2nd 2017



public class termProject_Yunfei_Li {
    //==========================================
    //              Bubble Sort
    //==========================================
    public static void bubbleSort(int [] arr){
        int n = arr.length;
        for(int j = n; j > 0; j--){
            for(int i = 1; i < j; i++){
                if(arr[i-1]>arr[i]){
                   swap(arr, i-1, i);
                }
            }
        }
    }
    //==========================================
    //              Selection Sort
    //==========================================
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int currentMin = arr[i];
            int currentMinIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(currentMin > arr[j]){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex !=1){
                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }

    //Swap Function for bubble sort
    public static void swap(int[] arr, int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    //Get Random number
    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }

    //Current Time
    public static int currentTime(){
        long startTime = System.currentTimeMillis(); //gets current time
        return (int) startTime; //returns current time as an integer
    }


    //==========================================
    //      1)  Bubble Sort Array
    //==========================================
    // Code for question one
    public static void bubbleSortArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of items being sorted"); //asks the user for a number to generate an array
        int num = input.nextInt(); //takes the input and store it in num
        int [] arr = new int[num]; //creates the array
        for(int i=0; i<num; i++){
            arr[i] = getRandom(num-1); //looping through the array to generate random numbers for array
        }
        for(int i:arr){
            System.out.println(i); //prints the array before sorting
        }
        System.out.println("bubble sorting");
        bubbleSort(arr); //sorting the array
        for(int i:arr){
            System.out.println(i); //prints the array after sorting
        }
    }
    //==========================================
    //     2)  Selection Sort Array
    //==========================================
    // code for question 2
    public static void selectionSortArray(){
        //same method as bubble sort except using selection sort as main sorting method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of items being sorted");
        int num = input.nextInt();
        int [] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = getRandom(num-1);
        }
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("seletion sorting");
        selectionSort(arr); //selection sorting
        for(int i:arr){
            System.out.println(i);
        }
    }

    //===========================================================
    //     3)  Bubble Sort Running Time
    //===========================================================
    // code for question 3 -- program
    // Runs the method one time asking the user for inputs
    public static int bubbleSortRunningTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = input.nextInt();
        System.out.println("Enter a number of iterations");
        int num_i = input.nextInt();
        int running_time = 0; //initialize running_time
        for( int i=0; i<num_i; i++){ //looping the iterations
            int [] arr = new int[n]; //initialize the array
            for(int j=0; j<n; j++) { //looping through the array
                arr[j] = getRandom(n - 1); //adding random integers
            }
            int startTime = currentTime(); //starting time
            bubbleSort(arr); //bubble sorting
            int endTime = currentTime(); //end time
            int time = endTime - startTime; // the difference between start and end time
            running_time += time; // adding it up to running_time
        }
        return running_time; //returns running time
    }

    //===========================================================
    //     4)  Selection Sort Running Time
    //===========================================================
    // code for question 4 -- program
    // runs the method one time asking the user for the size and iterations
    public static int selectionSortRunningTime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = input.nextInt();
        System.out.println("Enter a number of iterations");
        int num_i = input.nextInt();
        int running_time = 0;
        for( int i=0; i<num_i; i++){
            int [] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = getRandom(n-1);
            }
            int startTime = currentTime();
            selectionSort(arr); //sorting with selection sort
            int endTime = currentTime();
            int time = endTime - startTime;
            running_time += time;
        }
        return running_time;
    }

    //===========================================================
    //                  Bubble Sort Result
    //===========================================================
    // code for question 3--result
    // runs the method 9 times but asking the user for iterations
    // the method takes no arguments because the question says asking the user for inputs and iterations
    // however, i did run the test 9 times and the results will be on the excel file
    public static void bubbleSortTesting(){
        //1
        System.out.println(bubbleSortRunningTime());
        //2
        System.out.println(bubbleSortRunningTime());
        //3
        System.out.println(bubbleSortRunningTime());
        //4
        System.out.println(bubbleSortRunningTime());
        //5
        System.out.println(bubbleSortRunningTime());
        //6
        System.out.println(bubbleSortRunningTime());
        //7
        System.out.println(bubbleSortRunningTime());
        //8
        System.out.println(bubbleSortRunningTime());
        //9
        System.out.println(bubbleSortRunningTime());
    }

    //===========================================================
    //                  Selection Sort Result
    //===========================================================
    // code for question 4 -- result
    // runs the method 9 times but asking the user for iterations
    // the method takes no arguments because the question says asking the user for inputs and iterations
    // however, i did run the test 9 times and the results will be on the excel file
    public static void selectionSortTesting(){

        //1
        System.out.println(selectionSortRunningTime());
        //2
        System.out.println(selectionSortRunningTime());
        //3
        System.out.println(selectionSortRunningTime());
        //4
        System.out.println(selectionSortRunningTime());
        //5
        System.out.println(selectionSortRunningTime());
        //6
        System.out.println(selectionSortRunningTime());
        //7
        System.out.println(selectionSortRunningTime());
        //8
        System.out.println(selectionSortRunningTime());
        //9
        System.out.println(selectionSortRunningTime());
    }

    public static void main(String[] args) {
        bubbleSortTesting(); //runs the method 9 times bubble sorting
        selectionSortTesting(); //runs the method 9 times selection sorting
    }
}
