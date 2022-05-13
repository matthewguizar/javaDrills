public class switchFizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
           switch (i){
               case 15, 30, 45, 60, 75, 90:
                   System.out.println("fizzbuzz");
                   break;
               case 3, 6, 9, 12, 24, 36 , 48, 72, 84, 97:
                   System.out.println("fizz");
                   break;
               case 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100:
                   System.out.println("buzz");
                   break;
               default:
                   System.out.println(i);
           }
           
        }
    }
}
