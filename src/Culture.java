/**
 * @param
 * @return
 */
public class Culture {
    private Integer cultureID; // debug
    private String culture;
    private String faith;

    public Culture(Integer cultureID, String culture, String faith) {
        this.cultureID = cultureID;
        this.culture = culture;
        this.faith = faith;
    }

    public Integer getCultureID() {
        this.cultureID = cultureID;
    }

    public String getCulture() {
        this.culture = culture;
    }

    public String getFaith() {
        this.faith = faith;
    }
}
