import java.util.Scanner;
import java.util.Random; // randomizer

/**
 * @param
 * @return
 */
public class Brytenwealda {
    public static void main(String[] args) {
        // global variables
        Integer highScore = 0;
        Integer factionID = 0;
        String kingdomPool = ""; // for selecting a random Kingdom (based on Faction)
        String settlementPool = ""; // for selecting a random Settlement (based on Kingdom)
        String userInput = "";
        String faction = "";
        String intro = ("Welcome to Brytenwealda!\n");
        String factionsPrompt = ("- CHOOSE YOUR FACTION -\n" +
                "1. Angles (Germanic, Pagan)\n" +
                "2. Saxons (Germanic, Pagan)\n" +
                "3. Jutes (Germanic, Christian)\n" +
                "4. Britons (Brythonic, Christian)\n" +
                "5. Picts (Brythonic, Pagan)\n" +
                "6. Gaels (Goidelic, Pagan)\n");

        // Create Scanner object
        Scanner in = new Scanner(System.in);

        displayWindow(intro);
        displayWindow(factionsPrompt);
        userInput = in.nextLine();
        factionID = Integer.parseInt(userInput);
        System.err.print("\tFaction ID:" + factionID);

        // TODO: create method that assigns Faction to Player

        System.err.print("\tFaction:" + faction);
        displayWindow("THE " + faction.toUpperCase());
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

    public static void displayBorder() {
        char x = '*';
        int y = 40;
        for (int i = 0; i < y; i++) {
            System.out.print(x);
        }
        System.out.print('\n');
    }
}
