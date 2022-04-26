public class FizzBuzz { //declaring a class Fizzbuzz
    public static void main(String[] args) { //entry point
        fizzBuzz100();
    }

    private static void fizzBuzz100() { //declaring private static. it can only be accessible from class
        for (int i = 1; i <= 100; i++) { //looping 1 - 100
            if ((i % 3) == 0)   //all statements are in the same scope. they can all be applied instead of just one
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
            /*supposed to print out fizz for numbers divisible by 3 buzz for 5 and fizzbuzz for 3 and 5
            it's not working because fizzbuzz is last... since its checking and replacing for 3 and then for 5 so fizzbuzz doesn't appear
            must check numbers if they are divisible by both first to get fizzbuzz*/
        }

            
        }
    }

