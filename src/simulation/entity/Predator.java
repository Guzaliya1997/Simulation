package simulation.entity;

import simulation.Coordinates;
import simulation.CoordinatesShift;

import java.util.Set;

public class Predator extends Creature {
    public Coordinates coordinates;
    int attackForce;

    public Predator(Coordinates coordinates) {
        super(coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getCreatureMoves() {
        return null;
    }

    @Override
    public void makeMove() {

    }
    public void attackHerbivore(){
        //При этом количество HP травоядного
        // уменьшается на силу атаки хищника. Если значение HP жертвы опускается до 0, травоядное исчезает
    }
}
