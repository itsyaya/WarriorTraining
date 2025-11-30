public class Warrior {

    private AttackBehavior attackBehavior;
    private MoveBehavior moveBehavior;

   public interface AttackBehavior{
       String attack();
    }
   public interface MoveBehavior {
        String move();
    }

    public Warrior(AttackBehavior attackBehavior, MoveBehavior moveBehavior){
        this.attackBehavior = attackBehavior;
        this.moveBehavior = moveBehavior;

    }
    public String attack() {
        return attackBehavior.attack();
    }

    public String move(){
        return moveBehavior.move();
    }
    public void setAttackBehavior(AttackBehavior newAttack){
        this.attackBehavior = newAttack;
    }

    public void setMoveBehavior(MoveBehavior newMove){
        this.moveBehavior = newMove;
    }

}
