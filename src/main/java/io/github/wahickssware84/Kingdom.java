package io.github.wahickssware84;
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
        return kingdomID;
    }

    public Integer getKingdomPool() {
        this.kingdomPool = kingdomPool;
        return kingdomPool;
    }

    public String getKingdom() {
        this.kingdom = kingdom;
        return kingdom;
    }
}
