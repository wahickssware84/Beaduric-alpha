/**
 * @param
 * @return
 */
public class Enemy {
    private String name = "";
    private Integer melee;
    private Integer ranged;
    private Integer manpower;
    private Integer firepower;

    public Enemy(String name, Integer melee, Integer ranged, Integer manpower, Integer firepower) {
        this.name = name;
        this.melee = melee;
        this.ranged = ranged;
        this.manpower = manpower;
        this.firepower = firepower;
    }

    public String getName() {
        this.name = name;
    }

    public Integer getMelee() {
        this.melee = melee;
    }

    public Integer getRanged() {
        this.ranged = ranged;
    }

    public Integer getManpower() {
        this.manpower = manpower;
    }

    public Integer getFirepower() {
        this.firepower = firepower;
    }
}
