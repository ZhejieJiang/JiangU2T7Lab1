//Imports
import java.util.Scanner; //For Scanners
public class Main
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first String:");
        String string1 = scan.nextLine();
        int length1 = string1.length();
        System.out.println("String length: " + length1);
        System.out.println("First half: " + string1.substring(0,length1/2));
        System.out.println("Second half: " + string1.substring(length1/2 +1));
        System.out.print("Enter second String: ");
        String string2 = scan.nextLine();
        int length2 = string2.length();

        if (length2 > length1){
            System.out.println(string2 + " is longer than " + string1);}
        else if (length1 > length2){
            System.out.println(string1 + " is longer than " + string1);}
        else{
            System.out.println(string2 + " is the same length as " + string1);}


        if (string1.equals(string2)){
            System.out.println("they are the same character");}
        else{
            int comparison = string1.compareTo(string2);
            if (comparison > 0){
                System.out.println(string2 + " comes first alphabetically");}
            else {System.out.println(string1 + " comes first alphabetically");
            }
        }
        int index = string1.indexOf(string2);
            if (index != -1){
            System.out.println(string2 + " is found in " + string1 +" at index " + string2.indexOf(string1));}
        else{System.out.println(string2 +" is NOT found in " + string1);}
    }
}