using System;
using System.Collections;
using ApprovalTests;
using ApprovalTests.Combinations;
using ApprovalTests.Reporters;
using Xunit;

using Game;

namespace Game.tests
{
    [UseReporter(typeof(DiffReporter))]
    public class AttackCalculatorTests 
    {
        [Fact]
        public void HeroAttacksMonster()
        {
            int[] defendersArmorClass = {1, 5};
            int[] attackersForce =  {1, 5};
            int[] attackersDamage =  {1, 5};
            int[] diceRolled =  {1, 5, 20};
            
            CombinationApprovals.VerifyAllCombinations(
                 (a, b, c, d) => doAttackCalculation(a, b, c, d),
                attackersDamage,
                attackersForce,
                defendersArmorClass,
                diceRolled
                );
        }

        private static int doAttackCalculation(int attackersDamage, int attackersForce, int defendersArmorClass, int diceRolled)
        {
            var hero = new Character(1, attackersDamage, "human", attackersForce);
            var monster = new Character(defendersArmorClass, 1, "orc", 1);
            var damage = AttackCalculator.CalculateDamageForDice(hero, monster, diceRolled);
            return damage;
        }
    }
}
