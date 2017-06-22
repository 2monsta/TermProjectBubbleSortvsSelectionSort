import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class termProject {


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
    public static void bubbleSortArray(){
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
        System.out.println("bubble sorting");
        bubbleSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    //==========================================
    //     2)  Selection Sort Array
    //==========================================
    public static void selectionSortArray(){
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
        selectionSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }

    //===========================================================
    //     3)  Bubble Sort Running Time
    //===========================================================
    public static int bubbleSortRunningTime(int n, int num_i){
        int running_time = 0; //initialize running_time
        for( int i=0; i<num_i; i++){ //looping the iterations
            int [] arr = new int[n]; //initialize the array
            for(int j=0; j<n; j++){ //looping through the array
                arr[j] = getRandom(n-1); //adding random integers 0 through n
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
    public static int selectionSortRunningTime(int n, int num_i){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number of items in array");
//        n = input.nextInt();
//        System.out.println("Enter a number of iterations");
//        num_i = input.nextInt();
        int running_time = 0;
        for( int i=0; i<num_i; i++){
            int [] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = getRandom(n-1);
            }
            int startTime = currentTime();
            selectionSort(arr);
            int endTime = currentTime();
            int time = endTime - startTime;
            running_time += time;
        }
        return running_time;
    }


    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        System.out.println(bubbleSortRunningTime(50,100));
        System.out.println(bubbleSortRunningTime(50,1000));
        System.out.println(bubbleSortRunningTime(50,10000));
        System.out.println(bubbleSortRunningTime(250,100));
        System.out.println(bubbleSortRunningTime(250,1000));
        System.out.println(bubbleSortRunningTime(250,10000));
        System.out.println(bubbleSortRunningTime(500,100));
        System.out.println(bubbleSortRunningTime(500,1000));
        System.out.println(bubbleSortRunningTime(500,10000));
        System.out.println("Selection Sort");
        System.out.println(selectionSortRunningTime(50,100));
        System.out.println(selectionSortRunningTime(50,1000));
        System.out.println(selectionSortRunningTime(50,10000));
        System.out.println(selectionSortRunningTime(250,100));
        System.out.println(selectionSortRunningTime(250,1000));
        System.out.println(selectionSortRunningTime(250,10000));
        System.out.println(selectionSortRunningTime(500,100));
        System.out.println(selectionSortRunningTime(500,1000));
        System.out.println(selectionSortRunningTime(500,10000));

    }
}
