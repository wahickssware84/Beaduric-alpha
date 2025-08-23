package io.github.wahickssware84;
/**
 * @param
 * @return
 */
public class Faction {
    private Integer factionID;
    private String faction;
    private String demonym;
    private String description;
    public static String angles_desc = "Originating from somewhere near the river Schleswig in southern Jutland, these people migarated en masse to eastern Britain after the Roman withdrawl. Historically, these tribes would later unite and form the kingdom of \"Angla-land\" (later England).";
    public static String saxons_desc = "Hardy warriors from the forests of northwestern Germany who never leave their homes without weapons. They founded several petty kingdoms in southern Britain (notably, Wessex) during this period.";
    public static String jutes_desc = "Hailing from somewhere in the Jutland peninsula, the Jutes of southern Scandinavia were among the first Germanics to arrive in southeastern Britain. Historians still aren't sure what prompted their migration. Some believe that it was a war with the Danes, while others maintain that it was displacement due to climate change and/or crop failure.";
    public static String britons_desc = "These partially-Romanised, Celtic peoples have inhabited Britain since the Iron Age. When the Romans left, inter-tribal warfare resumed, inadvertently opening a new frontier to continental tribesmen. Indeed, the eastern lands are now lost, and your people have been resisting their encroachment for over a hundred years.";
    public static String picts_desc = "The mysterious Picts, of uncertain origin, have inhabited the Highlands of northern Britain since prehistoric times. The only clues they left were tall, ancient stones with symbolic inscriptions. They were also known to intermittently raid Brythonic settlements, which prompted the Romans to construct Hadrian's Wall.";
    public static String gaels_desc = "The Gaels of Hibernia are descended from the continental Celtic warriors who fled Gaul (France) during the Gallo-Roman Wars. Since then, they have gradually splintered off into several petty kingdoms and chiefdoms throughout the western Isles.";

    public Faction(Integer factionID, String faction, String demonym, String description) {
        this.factionID = factionID;
        this.faction = faction;
        this.demonym = demonym;
        this.description = description;
    }

    public static final Faction Angles = new Faction(1, "Angles", "Anglic", angles_desc);
    public static final Faction Saxons = new Faction(2, "Saxons", "Saxon", saxons_desc);
    public static final Faction Jutes = new Faction(3, "Jutes", "Jutish", jutes_desc);
    public static final Faction Britons = new Faction(4, "Britons", "Romano-British", britons_desc);
    public static final Faction Picts = new Faction(5, "Picts", "Pictish", picts_desc);
    public static final Faction Gaels = new Faction(6, "Gaels", "Gaelic", gaels_desc);

    public Integer getFactionID() {
        this.factionID = factionID;
        return factionID;
    }

    public String getFaction() {
        this.faction = faction;
        return faction;
    }

    public String getDemonym() {
        this.demonym = demonym;
        return demonym;
    }

    public String getDescription() {
        this.description = description;
        return description;
    }
}
