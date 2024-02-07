/**
 * The Calci class is a Java program that performs basic arithmetic operations such as addition,
 * subtraction, multiplication, and division on two floating-point numbers.
 */
class Calculator extends ExtCal{
 
    /**
     * The function "Add" takes two float numbers as input and returns their sum.
     * 
     * @param num1 The first number to be added.
     * @param num2 The second number to be added.
     * @return The sum of num1 and num2.
     */
     float Add( float num1, float num2){
        return num1+num2;   
     }
     /**
      * The function calculates the difference between two floating-point numbers.
      * 
      * @param num1 The first number to be subtracted.
      * @param num2 The second number to be subtracted from the first number.
      * @return the difference between num1 and num2.
      */
     float Diff( float num1, float num2){
         return num1-num2;   
      }
     /**
      * The Mul function multiplies two floating-point numbers and returns the result.
      * 
      * @param num1 The first number to be multiplied.
      * @param num2 The second number to be multiplied.
      * @return The product of num1 and num2 is being returned.
      */
      float Mul( float num1, float num2){
         return num1*num2;   
      }
      /**
       * The function Div takes two float numbers as input and returns their division result.
       * 
       * @param num1 The first number to be divided.
       * @param num2 The second number that will be divided by the first number.
       * @return the result of dividing `num1` by `num2`.
       */
      float Div( float num1, float num2){
         return num1/num2;   
      }
 
      /**
       * The main function creates an instance of the Calci class and performs addition, subtraction,
       * multiplication, and division operations on two numbers.
       */
      public static void main(String[] args) {
         Calculator c=new Calculator();
         ExtCal e=new ExtCal();
 
         float num1=2;
         float num2=1;
 

         System.out.println("sum of numbers :" + c.Add(num1, num2));
         System.out.println("difference of numbers :" + c.Diff(num1,num2));
 
         System.out.println("product of numbers :" + c.Mul(num1,num2));
         System.out.println("division of numbers :" +c.Div(num1,num2));
 
         System.out.println("squared result=" + e.square(num1));
         System.out.println("cube result=" + e.cube(num1));

         System.out.println("modulus result=" + e.modulus(num1,num2));

 
      }
 
 }