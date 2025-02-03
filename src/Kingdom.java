/**
 * @param
 * @return
 */
public class Kingdom {
    private Integer kingdomID;
    private Integer kingdomPool;
    private String kingdom;

    public Kingdom(Integer kingdomID, Integer kingdomPool, String kingdom) {
        this.kingdomID = kingdomID;
        this.kingdomPool = kingdomPool;
        this.kingdom = kingdom;
    }

    public Integer getKingdomID() {
        this.kingdomID = kingdomID;
    }

    public Integer getKingdomPool() {
        this.kingdomPool = kingdomPool;
    }

    public String getKingdom() {
        this.kingdom = kingdom;
    }
}
