/**
 * @param
 * @return
 */
public class Player {
    // campaign variables
    private Integer score = 0;
    private Integer balance = 900; /*
                                    * The number of scillingas (shillings) the player currently has in their
                                    * inventory. The initial value is set to 900, as this ensures that the player
                                    * has no more than 90 soldiers and no less than 36 soldiers upon initiating the
                                    * first battleSequence().
                                    */
    // combat variables
    private Integer melee;
    private Integer ranged;
    private Integer manpower;
    private Integer firepower;
    private String meleeUnits = "";
    private String rangedUnits = "";
    private String eliteUnits = "";
    private String culture = "";
    private String faction = "";
    private String name1 = "";
    private String name2 = "";

    public Player(Integer score, Integer balance, Integer melee, Integer ranged, Integer manpower, Integer firepower,
            String name, String meleeUnits, String rangedUnits, String eliteUnits, String culture) {
        this.score = score;
        this.balance = balance;
        this.melee = melee;
        this.ranged = ranged;
        this.manpower = manpower;
        this.firepower = firepower;
        this.name = name;
        this.meleeUnits = meleeUnits;
        this.rangedUnits = rangedUnits;
        this.eliteUnits = eliteUnits;
        this.culture = culture;
    }

    public Integer getScore() {
        this.score = score;
        return score;
    }

    public Integer getBalance() {
        this.balance = balance;
        return balance;
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

    public String getCulture() {
        this.culture = culture;
        return culture;
    }
}
