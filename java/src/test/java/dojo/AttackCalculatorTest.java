package dojo;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.approvaltests.combinations.CombinationApprovals.verifyAllCombinations;

public class AttackCalculatorTest {

    @Test
    public void heroAttacksMonster() {
        Integer[] defendersArmorClass = {1, 5};
        Integer[] attackersForce = {1, 5};
        Integer[] attackersDamage = {1, 5};
        Integer[] diceRolled = {1, 5, 20};

        verifyAllCombinations(
                AttackCalculatorTest::doAttackCalculation,
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
