
public class termProjectTest extends termProject{


    public static void testingBubbleSort(){
        termProject bubbleSortTesting = new termProjectTest();
        int numArray = 50;
        int iteration = 100;
        bubbleSortTesting.bubbleSortRunningTime(numArray, iteration);
    }

    public static void main(String[] args) {
        testingBubbleSort();
    }
}
