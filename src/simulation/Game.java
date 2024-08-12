package simulation;

import simulation.entity.Creature;
import simulation.entity.Entity;
import simulation.entity.Herbivore;
import simulation.entity.Predator;

import java.util.Set;

public class Game {
    Herbivore herbivore;
    Predator predator;
    private final Map map;
    private MapConsoleRenderer renderer = new MapConsoleRenderer();

    public Game(Map map) {
        this.map = map;
    }

    public void gameLoop(){
        boolean isHerbivoreToMove = true;
        while(true){
            renderer.render(map);
            if (isHerbivoreToMove) {
                System.out.println("Herbivore to move");
            } else {
                System.out.println("Predator to move");
            }

            Coordinates sourceCoordinates = InputCoordinates.inputCreatureCoordinates(
                    isHerbivoreToMove ? herbivore : predator,map
            );
            Entity entity = map.getEntity(sourceCoordinates);

            if ((isHerbivoreToMove && entity.getClass().equals(herbivore))
                    || (!isHerbivoreToMove && entity.getClass().equals(predator))) {
                System.out.println("Wrong species");
                continue;
            }
            Creature creature = (Creature)entity;
            Set<Coordinates> availableMoveSquares = creature.getAvailableMoveSquares(map);
            renderer.render(map, creature);
            Coordinates targetCoordinates = InputCoordinates.inputAvailableSquare(availableMoveSquares);
            map.moveEntity(sourceCoordinates,targetCoordinates);

            //render
            //input
            // make move
            //pass move
           // isWhiteToMove =! isWhiteToMove;
        }

    }
}
