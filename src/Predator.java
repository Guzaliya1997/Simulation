public class Predator extends Creature {
    public Coordinates coordinates;
    int attackForce;

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    public void makeMove() {

    }
    public void attackHerbivore(){
        //При этом количество HP травоядного
        // уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
    }
}
