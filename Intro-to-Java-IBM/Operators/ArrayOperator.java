
public class ArrayOperator {
    public static void main(String[] args) {

        // Make Array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Addition
        System.out.println("Addition: + operator " + (myArray[0] + myArray[1]) );
        // Subtraction
        System.out.println("Subtraction: - operator " + (myArray[2] - myArray[3]) );
        // Multiplication
        System.out.println("Multiplication: * operator " + (myArray[4] * myArray[5]) );
        // Division
        System.out.println("Division: / operator " + (myArray[6] / myArray[7]) );
        // Modulus (remainder)
        System.out.println("Modulus: % operator " + (myArray[8] % myArray[9]) );

        /* Use a for loop to check if the next number in the array is greater than, less than or equal to the current number. 
        User ternary and relational operator.
        */
        for (int i = 0; i < myArray.length - 1; i++) {
            String comparison = (myArray[i] < myArray[i + 1]) ? "less than" :
                                (myArray[i] > myArray[i + 1]) ? "greater than" : "equal to";
            System.out.println("Element " + myArray[i] + " is " + comparison + " element " + myArray[i + 1]);
        }

    }

}
