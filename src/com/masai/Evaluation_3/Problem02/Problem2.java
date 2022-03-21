package com.masai.Evaluation_3.Problem02;

public class Problem2 {

    /*

    1. What is the difference between Checked and Unchecked Exceptions in Java, create a user-defined checked and unchecked exception class?

Ans : checked exception is come complite  error and Unchecked expception is come by Runtime.

2. What is the difference between the throw and throws keyword in Java?

Throws is used to declare an exception, which means it works similar to the try catch block on the other hand throw keyword is used to throw an exception.
In the syntax wise  throw is followed an instance of Exception  class and throws is working for exception class names.

throw new ClassCastException(“Class Cast Exception”);
throws ClassCastException;
	Throw keyword is used in the method body to throw an exception , and 	throws is used in method , to declare the exception that can occur in the statement present in the method.

We can declare one Exception at a time but we can handle multiple exception declare them using throws keyword.
Exa:
public class Main {
   public static void main(String[] args) {
//        System.out.println();
       Main exa = new Main();
       exa.value(15);

   }
   void value(int x){
       if(x % 2 == 0){
           throw new ArithmeticException("this is not a even number");

       }else {
           System.out.println("This is odd Numb");
       }
   }

}




3. What is the difference between final and finally in Java?

Ans:

final : final is a keyword that is used to apply restriction on a class, method, or variable.
        class with final keyword is not inheirted.
        Method with final keyword cannot be override.
        Variable with final keyword cannot be changed.

finally : finally is block code to place important code that will be excuted whether or not an exception is handled.

exa :
public static void main(String args[]){
try{
int x = 1000;

}catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("finally bolck is printed in any codition");
}
}



    */
}
