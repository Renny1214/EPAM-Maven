package EPAMMaven;

import EPAMMaven.Chocolates.Chocolate1;
import EPAMMaven.Chocolates.Chocolate2;
import EPAMMaven.Chocolates.Chocolate3;
import EPAMMaven.Chocolates.Chocolates;
import EPAMMaven.Gifts.Gift;
import EPAMMaven.Sweets.Sweets;
import EPAMMaven.Sweets.Sweets1;
import EPAMMaven.Sweets.Sweets2;
import EPAMMaven.Sweets.Sweets3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App
{
    private static <T> String mostExpensive(ArrayList<T> arrayList) {
        return arrayList.get(0).toString();
    }
    public static void main( String[] args )
    {
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting chocolates : ");
        Chocolates chocolate1 = new Chocolate1("choco1",100,150);
        Chocolates chocolate2 = new Chocolate2("choco2",150,200);
        Chocolates chocolate3 = new Chocolate3("choco3",200,250);

        System.out.println("Getting Sweets : ");
        Sweets sweets1 = new Sweets1("sweet1",100,150);
        Sweets sweets2 = new Sweets2("sweet2",150,200);
        Sweets sweets3 = new Sweets3("sweet3",200,250);

        Gift gift = new Gift();

        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3);
        System.out.println("Sorting items according to their price.");

        gift.sort();

        System.out.println("Total Weight of Gifts : "+gift.findWeight());

        System.out.println("Enter '1' to get all chocolates : ");
        System.out.println("Enter '2' to get all sweets : ");
        System.out.println("Enter '3' to get most expensive chocolate and sweets : ");
        choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                ArrayList<Chocolates> arrayList=gift.getChocolates();
                for (int i=0;i<arrayList.size();i++) {
                    System.out.println(arrayList.get(i).toString());
                }
                break;
            case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (int i=0;i<arrayList1.size();i++) {
                    System.out.println(arrayList1.get(i).toString());
                }
                break;
            case 3:
                System.out.println("Most Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("Most Expensive Sweet : "+mostExpensive(gift.getSweets()));
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
