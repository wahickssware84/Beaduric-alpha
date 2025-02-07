import java.util.Scanner;

/**
 * @param
 * @return
 */
public class Brytenwealda {

    public static void main(String[] args) {
        Integer factionID;
        String userInput = "";
        String faction = "";
        String intro = ("Welcome to Brytenwealda!\n");
        String factionPrompt = ("- CHOOSE YOUR FACTION -\n" +
                "1. Angles\n" + // (Germanic, Pagan)
                "2. Saxons\n" + // (Germanic, Pagan)
                "3. Jutes\n" + // (Germanic, Christian)
                "4. Britons\n" + // (Brythonic, Christian)
                "5. Picts\n" + // (Brythonic, Pagan)
                "6. Gaels\n"); // (Goidelic, Pagan)

        Scanner in = new Scanner(System.in);

        displayWindow(intro);
        displayWindow(factionPrompt);
        userInput = in.nextLine();
        factionID = Integer.parseInt(userInput);
        // System.err.print("\t" + factionID);
        faction = assignFaction(factionID);
        // System.err.print("\t" + faction);
        displayWindow("THE " + faction.toUpperCase());
    }

    public static String assignFaction(Integer factionID) {
        String s = "";
        if (factionID == 1)
            s = "Angles";
        else if (factionID == 2)
            s = "Saxons";
        else if (factionID == 3)
            s = "Jutes";
        else if (factionID == 4)
            s = "Britons";
        else if (factionID == 5)
            s = "Picts";
        else if (factionID == 6)
            s = "Gaels";
        return s;
    }

    public static void displayWindow(String s) {
        char x = '*';
        int y = 40;
        for (int i = 0; i < y; ++i) {
            System.out.print(x);
        }
        System.out.print("\n\t" + s + "\n");
        for (int i = 0; i < y; ++i) {
            System.out.print(x);
        }
        System.out.print('\n');
    }
}
