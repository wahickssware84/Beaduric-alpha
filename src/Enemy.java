/**
 * @param
 * @return
 */
public class Enemy {
    private Integer melee;
    private Integer ranged;
    private Integer manpower;
    private Integer firepower;
    private String name = "";
    private String meleeUnits = "";
    private String rangedUnits = "";
    private String eliteUnits = "";

    public Enemy(Integer melee, Integer ranged, Integer manpower, Integer firepower, String name, String meleeUnits,
            String rangedUnits, String eliteUnits) {
        this.melee = melee;
        this.ranged = ranged;
        this.manpower = manpower;
        this.firepower = firepower;
        this.name = name;
        this.meleeUnits = meleeUnits;
        this.rangedUnits = rangedUnits;
        this.eliteUnits = eliteUnits;
    }

    public Integer getMelee() {
        this.melee = melee;
        return melee;
    }

    public Integer getRanged() {
        this.ranged = ranged;
        return ranged;
    }

    public Integer getManpower() {
        this.manpower = manpower;
        return manpower;
    }

    public Integer getFirepower() {
        this.firepower = firepower;
        return firepower;
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public String getMeleeUnits() {
        this.meleeUnits = meleeUnits;
        return meleeUnits;
    }

    public String getRangedUnits() {
        this.rangedUnits = rangedUnits;
        return rangedUnits;
    }

    public String getEliteUnits() {
        this.eliteUnits = eliteUnits;
        return eliteUnits;
    }
}
