import java.util.Scanner;

public class AreaCodesDriver
{
    public static void main (String args[])
    {
        //Creating objects for validation
        AreaCodes firstCode = new AreaCodes("951");
        AreaCodes secondCode = new AreaCodes("00");

        //Asking the user for input
        Scanner scan = new Scanner(System.in);
        String areaCode = "";

        System.out.println("Examples: " + firstCode.validateAreaCode());
        System.out.println(secondCode.validateAreaCode());
        //System.out.println("Invalid area code: " + secondCode.validateAreaCode() + "\nEnter a valid California area code:");
        System.out.println("\nNow that you know how to format the code,\nenter a valid California area code:");
        areaCode = scan.nextLine();
        System.out.println("You entered:" + areaCode);

        //Implementing Regex by determining the county from area code
        if (areaCode.matches("[9]+[5]+[1]"))
            System.out.println("You are in Riverside/San Bernardino County!");
        if (areaCode.matches("[7]+[6]+[0]"))
            System.out.println("You are in the Palm Desert/Salton Sea area!");
        if (areaCode.matches("[4]+[1]+[5]"))
            System.out.println("You are in the San Fracisco/San Rafael/Corte Madera area!");
        if (areaCode.matches("[9]+[4]+[9]"))
            System.out.println("You are in the Irvine/San Clemente/Laguna Beach area!");
        if (areaCode.matches("[5]+[1]+[0]"))
            System.out.println("You are in the Oakland/Fremont area!");
        if (areaCode.matches("[8]+[0]+[5]"))
            System.out.println("You are in San Luis Obispo/Santa Barbara/Ventura area!");
        if (areaCode.matches("[9]+[1]+[6]"))
            System.out.println("You are in the Sacramento area!");
        if (areaCode.matches("[9]+[0]+[9]"))
            System.out.println("You are in the San Bernardino/Rancho Cucamonga area!");
        if (areaCode.matches("[6]+[2]+[6]"))
            System.out.println("You are in the Pasadena/La Puente/Alhambra area!");
        if (areaCode.matches("[5]+[6]+[2]"))
            System.out.println("You are in the Long Beach/Downey/La Hambra area!");
        //Utilizing the character class. This is meant to be the "special feature"
        //If the user inputs the wrong format, then the Bee Movie script prints
        if (areaCode.matches("[\\p{Alpha}]"))
            System.out.println("This is what happens when people do not follow directions: \nBee Movie Script\n" +
                    "  \n" +
                    "  \n" +
                    "According to all known laws\n" +
                    "of aviation,\n" +
                    "\n" +
                    "  \n" +
                    "there is no way a bee\n" +
                    "should be able to fly.\n" +
                    "\n" +
                    "  \n" +
                    "Its wings are too small to get\n" +
                    "its fat little body off the ground.\n" +
                    "\n" +
                    "  \n" +
                    "The bee, of course, flies anyway\n" +
                    "\n" +
                    "  \n" +
                    "because bees don't care\n" +
                    "what humans think is impossible.\n");
    }//end main method
}//end class AreaCodesDriver
