package simulation.entity;

import simulation.Coordinates;
import simulation.CoordinatesShift;

import java.util.Set;

public class Herbivore extends Creature {

    public Coordinates coordinates;
    public Herbivore(Coordinates coordinates) {
        super(coordinates);

    }

    @Override
    protected Set<CoordinatesShift> getCreatureMoves() {
        return null;
    }

    @Override
    public void makeMove() {

    }

    public void eat(){

    }

}
