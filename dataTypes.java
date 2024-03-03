Data Types And variables 

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVariable = 10;         // 8-bit signed integer
        short shortVariable = 100;      // 16-bit signed integer
        int intVariable = 1000;         // 32-bit signed integer
        long longVariable = 100000L;    // 64-bit signed integer

        float floatVariable = 10.5f;    // 32-bit floating point number
        double doubleVariable = 10.123; // 64-bit floating point number

        char charVariable = 'A';        // 16-bit Unicode character
        boolean booleanVariable = true;  // true or false value

        // Reference Data Types
        String stringVariable = "Hello, World!";  // Sequence of characters

        // Array Data Type
        int[] arrayVariable = {1, 2, 3, 4, 5};    // Collection of elements of the same type

        // Brief explanation of each data type
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteVariable);  
        System.out.println("short: " + shortVariable); 
        System.out.println("int: " + intVariable);   
        System.out.println("long: " + longVariable);  
        System.out.println("float: " + floatVariable); 
        System.out.println("double: " + doubleVariable); 
        System.out.println("char: " + charVariable);   
        System.out.println("boolean: " + booleanVariable); 
        System.out.println("\nReference Data Type:");
        System.out.println("String: " + stringVariable);  
        System.out.println("\nArray Data Type:");
        System.out.println("int[]: " + java.util.Arrays.toString(arrayVariable));  
    }
}

Explanation of data types:

Primitive Data Types:

byte: 8-bit signed integer ranging from -128 to 127.
short: 16-bit signed integer ranging from -32,768 to 32,767.
int: 32-bit signed integer ranging from -2^31 to 2^31 - 1.
long: 64-bit signed integer ranging from -2^63 to 2^63 - 1.
float: 32-bit floating-point number with single precision.
double: 64-bit floating-point number with double precision.
char: 16-bit Unicode character representing a single character.
boolean: Represents true or false values.
Reference Data Types:

String: Represents a sequence of characters.
Array Data Type:
array: Represents a collection of elements of the same type.
This code provides a basic overview of different data types in Java along with examples and brief explanations.

