public class TestWarrior {
    public static void main(String[] args) {
        Warrior.AttackBehavior gun = new GunAttack();
        Warrior.MoveBehavior run = new RunMovement();
        Warrior w1 = new Warrior(gun, run);

        System.out.println("w1 attack: " + w1.attack());
        System.out.println("w1 move: " + w1.move());

        w1.setAttackBehavior(new SwardAttack());
        System.out.println("w1 new attack: " + w1.attack());

        Warrior w2 = new Warrior(new GunAttack(), new SneakMovement());
        System.out.println("w2 attack & move: " + w2.attack() + " & " + w2.move());
    }
}
