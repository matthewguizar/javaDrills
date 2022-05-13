public class functions {
    public static void main(String[] args) {
        helloWorld();
        tisOdd(1);
    }

    private void bigOrSmall(int[] arr){
    }
    private static void helloWorld(){
        System.out.println("Hello world!");

    }
    private static void greeting(String name){
        System.out.println("sup" + name);

    }
    private static int add(int num1, int num2){
        return (num1 + num2);
    }
    private static String favColorFinder(String color){
        switch (color) {
            case "red":
                return ("red is a great color");
            case "green":
                return ("green is a solid favorite color");
            case "black":
                return ("so trendy");
            default:
                return ("YOU NEED TO CHANGE UR FAV COLOR");
        }

    }
    private static void tisOdd(int num){
        if (num % 2 == 1){
        } else {
        }
    }
}
