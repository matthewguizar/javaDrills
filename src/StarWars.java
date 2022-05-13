public class StarWars {
    public static void main(String[] args) {

        String firstName = "R2", lastName = "D2";
        String birthYear = "32 BBY", homeWorld = "Naboo";
        float heightInMeters = 1.08f;
        float weightInKilograms = 32;

        System.out.println("My favorite Star Wars character is: " + firstName + " " + lastName + ".");
        System.out.println("Born on: " + homeWorld + " in the year " + birthYear);
        System.out.println("Height (meters): " + heightInMeters + "\nWeight (kilograms): " + weightInKilograms);

        float purse = 150.0f;
        float droid = 24.3f, boots = 45.0f;
        purse = purse - droid;
        float cowboyBoots = 45.0f;
        purse = purse - cowboyBoots;
        purse = purse * 2.0f;
        float saber = purse * 0.1f;
        purse = purse - saber;
        System.out.println("Remaining credits in purse: "+ purse);

        String handleColor = "black";
        String bladeColor = "purple";
        if (handleColor.equalsIgnoreCase("black") & bladeColor.equalsIgnoreCase("purple")){
            System.out.println("This one's mine!");
        } else{
            System.out.println("Pass");
        }
        String shipName = "Millenium Falcon";

        if (shipName.equalsIgnoreCase("millenium falcom")){
            System.out.println("Let's go");
        } else {
            System.out.println("I better hide somewhere");
        }
        float itemCost = 5.00f;
        boolean isRecommendedItem = true;
        float drinkCost= 1.00f;
        float drinkSizeInOz = 24.0f;

        if (itemCost < 5 & isRecommendedItem){
            System.out.print("ORDERED ITEM ");
        } else {
            System.out.println("Wheres my drink?");
        }

        if (drinkCost< 1 | drinkSizeInOz > 24){
            System.out.println("& ORDERED DRINk");
        } else {
            System.out.println("MY DIET DR KELP?");
        }
    }


}


