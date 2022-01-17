package dojo;

public class Character {
    private final int armorClass;
    private final int damageDealt;
    private String race;
    int force;

    public Character(int armorClass, int weaponDamage, String race, int force) {
        this.armorClass = armorClass;
        this.damageDealt = weaponDamage;
        this.race = race;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public int getWeaponDamage() {
        return damageDealt;
    }

    public int getArmorClass() {
        return armorClass;
    }
}
