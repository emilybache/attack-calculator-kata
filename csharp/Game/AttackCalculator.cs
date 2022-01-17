using System;

namespace Game
{
    public class AttackCalculator
    {
        Random random = new Random();

        public int CalculateDamage(Character atk, Character def)
        {
            var defaultAttack = atk.Force;            
            int dice = random.Next(1, 20);
            var currentAttack = defaultAttack + dice;
            var damage = atk.damageDealt;
            

            if (atk.Force + dice > def.armorClass)
            {
                if (dice == 1)
                {
                    damage = 0;
                }

                if (dice == 20)
                {
                    damage = atk.damageDealt * 2;
                }

                return damage;
            }
            else
            {
                return 0;
            }
        }
    }
}
