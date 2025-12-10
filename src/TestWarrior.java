public class TestWarrior {
    public static void main(String[] args) {

        // Create behavior strategies
        Warrior.AttackBehavior gun = new GunAttack();     // Warrior uses a gun to attack
        Warrior.MoveBehavior run = new RunMovement();     // Warrior runs to move

        // Create a warrior with initial behaviors
        Warrior w1 = new Warrior(gun, run);

        // Execute and print the warrior's behaviors
        System.out.println("w1 attack: " + w1.attack());
        System.out.println("w1 move: " + w1.move());

        // Change the attack behavior at runtime
        w1.setAttackBehavior(new SwardAttack());           // Switch to sword attack
        System.out.println("w1 new attack: " + w1.attack());

        // Create another warrior with different behaviors
        Warrior w2 = new Warrior(new GunAttack(), new SneakMovement());
        System.out.println("w2 attack & move: " + w2.attack() + " & " + w2.move());
    }
}
