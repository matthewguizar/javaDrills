import java.text.BreakIterator;

public class Conditions {
    public static void main(String[] args){
        String handleColor = "black";
        String bladeColor = "purple";
        if (handleColor == "black" & bladeColor == "purple"){
            System.out.println("This one's mine!");
        } else{
            System.out.println("Pass");
        }
        String shipName = "Millenium Falcon";
        if (shipName == "Millenium Falcon"){
            System.out.println("Let's go");
        } else {
            System.out.println("I better hide somewhere");
        }
        float itemCost = 5.00f;
        boolean isRecommendedItem = true;
        float drinkCost= 1.00f;
        float drinkSizeInOz = 24.0f;
        if (itemCost < 5 & isRecommendedItem == true){
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
