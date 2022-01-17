namespace Game
{
    public class Character
    {
        internal readonly int armorClass;
        internal readonly int damageDealt;

        public string Race { get; internal set; }
        internal int Force { get; set; }

        public Character(int armorClass, int weaponDamage, string race, int force)
        {
            this.armorClass = armorClass;
            this.damageDealt = weaponDamage;
            Race = race;
            Force = force;
        }
    }
}