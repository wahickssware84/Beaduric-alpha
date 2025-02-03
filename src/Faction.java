/**
 * @param
 * @return
 */
public class Faction {
    private Integer factionID;
    private String faction;
    private String description;

    public Faction(Integer factionID, String faction, String description) {
        this.factionID = factionID;
        this.faction = faction;
        this.description = description;
    }

    public Integer getFactionID() {
        this.factionID = factionID;
    }

    public String getFaction() {
        this.faction = faction;
    }

    public String getDescription() {
        this.description = description;
    }
}
