public class functions {
    public static void main(String[] args){
        helloWorld();
        greeting(" Valerie");
        add(8, 2);
        favColorFinder("black");
        thatsOdd(10);
        bigOrSmall();
    }

    public static void bigOrSmall(){

    }
    public static void helloWorld(){
        System.out.println("Hello world!");
    }
    public static void greeting(String name){
        System.out.println("sup" + name);
    }
    public static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void favColorFinder(String color){
        switch (color) {
            case "red":
                System.out.println("red is a great color");
                break;
            case "green":
                System.out.println("green is a solid favorite color");
                break;
            case "black":
                System.out.println("so trendy");
                break;
            default:
                System.out.println("YOU NEED TO CHANGE UR FAV COLOLR");
        }

    }
    public static void thatsOdd(int num){
        if (num % 2 == 1){
            System.out.println("odd foo");
        } else {
            System.out.println("even cuh");
        }
    }
}
