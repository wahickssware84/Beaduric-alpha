/**
 * @param
 * @return
 */
public class Faction {
    private Integer factionID;
    private String faction;
    private String demonym;
    private String description;

    public Faction(Integer factionID, String faction, String demonym, String description) {
        this.factionID = factionID;
        this.faction = faction;
        this.demonym = demonym;
        this.description = description;
    }

    public static final Faction Angles = new Faction(1, "Angles", "Anglic", "angles_desc");
    public static final Faction Saxons = new Faction(2, "Saxons", "Saxon", "saxons_desc");
    public static final Faction Jutes = new Faction(3, "Jutes", "Jutish", "jutes_desc");
    public static final Faction Britons = new Faction(4, "Britons", "Romano-British", "britons_desc");
    public static final Faction Picts = new Faction(5, "Picts", "Pictish", "picts_desc");
    public static final Faction Gaels = new Faction(6, "Gaels", "Gaelic", "gaels_desc");

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
