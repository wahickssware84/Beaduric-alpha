package io.github.wahickssware84;

import java.util.Scanner;
import java.util.Random;

public class BeaduricAlpha {
    public static void main(String[] args) {
        // Global variables
        Integer highScore = null;
        Integer factionID = null;
        String kingdomPool = ""; // for selecting a random Kingdom (based on Faction)
        String settlementPool = ""; // for selecting a random Settlement (based on Kingdom)
        String userInput = "";
        String faction = "";
        String intro = ("Welcome to Beaduric!\n");
        String factionsPrompt = ("- CHOOSE YOUR FACTION -\n");
        String factionsList = (
                "1. Angles (Germanic)\n" +
                "2. Saxons (Germanic)\n" +
                "3. Jutes (Germanic)\n" +
                "4. Britons (Brythonic)\n" +
                "5. Picts (Brythonic)\n" +
                "6. Gaels (Goidelic)\n");

        // Create & initialize new Scanner() object
        Scanner in = new Scanner(System.in);

        displayWindow(intro);
        displayWindow(factionsPrompt);
        System.out.print(factionsList);
        userInput = in.nextLine();
        factionID = Integer.parseInt(userInput);
        System.err.print("\tFaction ID:" + factionID);

        // Todo: create method that assigns Faction to Player

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
