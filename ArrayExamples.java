
package arrayexamples;

/**
 * Gives examples at how to create and use arrays
 * 
 * @author Adam
 * @date 11/4/2019
 */
public class ArrayExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] myArray = new int[100]; //having 100 in the brackets means our array will have 100 spaces starting at index 0 going to index 99
        
        //for loops are a great way to cycle through arrays 
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random() * 51); //Adds a random number between 1 and 50 into our Array
        }
        
        //Adds five to each number in our array
        for(int i = 0; i < myArray.length; i++){
            myArray[i] += 5;
        }
        
        //Gets the largest number in our array
        int max = Integer.MIN_VALUE; //Set a maximum for our search through the array. Integer.MIN_VALUE returns the smallest value in java, this way we won't have to worry that the number we set is bigger than anything in our array
        //int max = 0; This can be called instead if you don't understand what Integer.MIN_VALUE means
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){ //Check to see if the value here in the array is largest than the most highest vaue we've found so far
                max = myArray[i]; //If it was larger we save it as the new max
            }
        }
        System.out.println("The largest number in our array was " + max); //Print out the maximum
        
        //Print out the full array
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Index " + i + ": " + myArray[i]);
        }
        
    }
    
}
