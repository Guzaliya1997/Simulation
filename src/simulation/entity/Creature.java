package simulation.entity;

import simulation.Coordinates;
import simulation.CoordinatesShift;
import simulation.Map;

import java.util.HashSet;
import java.util.Set;

public abstract  class Creature extends Entity {
    int speed;
    int HP_count;

    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public Set<Coordinates> getAvailableMoveSquares(Map map){
        Set<Coordinates> result = new HashSet<>();
        for (CoordinatesShift shift : getCreatureMoves()){
            if(coordinates.canShift(shift)){
                Coordinates newCoordinates = coordinates.shift(shift);
                if(isSquareAvailableForMove(newCoordinates,map)){
                    result.add(newCoordinates);
                }
            }
        }
        return result;
    }
    protected boolean isSquareAvailableForMove(Coordinates coordinates, Map map) {
        return map.isSquareEmpty(coordinates);
    }
    protected abstract Set<CoordinatesShift> getCreatureMoves();

    public abstract void makeMove();
}
