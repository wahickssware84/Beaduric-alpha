/**
 * @param
 * @return
 */
public class Settlement {
    private Integer settlementID;
    private Integer settlementPool;
    private String settlement;

    public Settlement(Integer settlementID, Integer settlementPool, String settlement) {
        this.settlementID = settlementID;
        this.settlementPool = settlementPool;
        this.settlement = settlement;
    }

    public Integer getSettlementID() {
        this.settlementID = settlementID;
        return settlementID;
    }

    public Integer getSettlementPool() {
        this.settlementPool = settlementPool;
        return settlementPool;
    }

    public String getSettlement() {
        this.settlement = settlement;
        return settlement;
    }
}
