package dojo;

import java.util.Random;

public class AttackCalculator {

    Random random = new Random();

    public int CalculateDamage(Character atk, Character def)
    {
        int dice = random.nextInt(1, 20);
        return CalculateDamageForDice(atk, def, dice);
    }

    public static int CalculateDamageForDice(Character atk, Character def, int dice)
    {
        var defaultAttack = atk.force();
        var currentAttack = defaultAttack + dice;
        var damage = atk.weaponDamage();


        if (atk.force() + dice > def.armorClass())
        {
            if (dice == 1)
            {
                damage = 0;
            }

            if (dice == 20)
            {
                damage = atk.weaponDamage() * 2;
            }

            return damage;
        }
        else
        {
            return 0;
        }
    }
}
