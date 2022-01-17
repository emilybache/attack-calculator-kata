package dojo;

import java.util.Random;

public class AttackCalculator {

    Random random = new Random();

    public int CalculateDamage(Character atk, Character def)
    {
        var defaultAttack = atk.getForce();
        int dice = random.nextInt(1, 20);
        var currentAttack = defaultAttack + dice;
        var damage = atk.getWeaponDamage();


        if (atk.getForce() + dice > def.getArmorClass())
        {
            if (dice == 1)
            {
                damage = 0;
            }

            if (dice == 20)
            {
                damage = atk.getWeaponDamage() * 2;
            }

            return damage;
        }
        else
        {
            return 0;
        }
    }

}
