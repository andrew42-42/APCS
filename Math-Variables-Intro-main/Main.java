class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");//prints the words "Hello world"

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    System.out.println("I am "+15+" years old");
    System.out.print("wassup ");
    System.out.print("y'all");


   



    //ANSWER: ln makes the next print be below it



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): numbers with no decimals
    //double: numbers with decimals
    //boolean: true/false

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES

    int apples=2;
    int oranges=4;
    int grapes=6;
    double pounds=3.2;
    double ounces=16.6;
    double grams=123.4;
    boolean alive=false;
    boolean asleep=true;
    boolean hungry=true;







    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    for(int k=0; k<100; k++){
      if(k%2==1){
        System.out.println(k);
      }
      else{
        continue;
      }
    }
  



    //All multiples of 3 from 1 to 100




    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
  }
}
