package io.github.wahickssware84;

import java.util.Scanner;
import java.util.Random;
/**
 * @param
 * @return
 */
public class BeaduricAlpha {
    public static void main(String[] args) {
        // CLI variables
        Integer highScore = null;
        Integer factionID = null;
        String kingdomPool = ""; // for selecting a random Kingdom (based on Faction.factionID)
        String settlementPool = ""; // for selecting a random Settlement (based on Kingdom.kingdomID)
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
        
        // null Faction declaration ( BeaduricAlpha.assignPlayerFaction() )
        // null Faction declaration ( BeaduricAlpha.assignEnemyFaction() )
        
        // null Culture declaration ( BeaduricAlpha.assignPlayerCulture() )
        // null Culture declaration ( BeaduricAlpha.assignEnemyCulture() )
        
        // null Kingdom declaration ( BeaduricAlpha.assignPlayerKingdom() )
        // null Kingdom declaration ( BeaduricAlpha.assignEnemyKingdom() )
        
        // null Settlement declaration ( BeaduricAlpha.assignPlayerSettlement() )
        // null Settlement declaration ( BeaduricAlpha.assignEnemySettlement() )
        
        
        // The entrypoint.
        displayWindow(intro);
        displayWindow(factionsPrompt);
        System.out.print(factionsList);
        userInput = in.nextLine();
        factionID = Integer.parseInt(userInput);
        System.err.print("\tFaction ID:" + factionID);
        System.err.print("\tFaction:" + faction);
        displayWindow("THE " + faction.toUpperCase());
        
        // N.B. Player methods are configured once PER GAME, whereas Enemy methods are determined once PER ROUND (after each Battle the player wins).
        // The player must successfully win 7 battles in order to win the game. High score will be overriden IF (and ONLY IF - make a unit test!) Player.score > highScore. 
        
        // Player configuration methods
        // method that assigns Faction to Player
        // method that assigns Culture to Player (determined by Faction)
        // method that assigns name to Player (determined by Culture - utilises .stringFormatter (Culture.java))
        // method that assigns kingdomPool to Player (determined by factionID + RNG)
        // method that assigns Kingdom to Player (fetch from kingdomPool.csv)
        // method that assigns settlementPool to Player (determined by kingdomID + RNG)
        // method that assigns Settlement to Player (fetch from settlePool.csv)
        
        // Enemy configuration methods
        // N.B. .csv files (/src/resources) are not used for Enemy configuration (instead, they are determined by the Player's current location (Settlement)).
        // method that assigns Faction to Enemy
        // method that assigns Culture to Enemy
        // method that assigns name to Enemy
        // method that assigns Kingdom to Enemy
        // method that assigns Settlement to Enemy


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
