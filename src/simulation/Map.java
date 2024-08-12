package simulation;

import simulation.Coordinates;
import simulation.entity.*;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> entities = new HashMap<>();
    public void setEntity(Coordinates coordinate, Entity entity){
        entity.coordinates = coordinate;
        entities.put(coordinate,entity);
    }

    public void setupDefaultEntitiesPositions(){

        //set Lion
        setEntity(new Coordinates(1,1),new Lion(new Coordinates(1,1)));
        setEntity(new Coordinates(5,25),new Lion(new Coordinates(5,25)));
        setEntity(new Coordinates(20,2),new Lion(new Coordinates(20,2)));
        setEntity(new Coordinates(10,15),new Lion(new Coordinates(10,15)));
        setEntity(new Coordinates(23,3),new Lion(new Coordinates(23,3)));
        setEntity(new Coordinates(19,13),new Lion(new Coordinates(19,13)));
        setEntity(new Coordinates(8,3),new Lion(new Coordinates(8,3)));
        setEntity(new Coordinates(11,7),new Lion(new Coordinates(11,7)));

        //set Crocodile
        setEntity(new Coordinates(16,1),new Crocodile(new Coordinates(16,1)));
        setEntity(new Coordinates(19,10),new Crocodile(new Coordinates(19,10)));
        setEntity(new Coordinates(8,23),new Crocodile(new Coordinates(8,23)));
        setEntity(new Coordinates(3,23),new Crocodile(new Coordinates(3,23)));
        setEntity(new Coordinates(16,21),new Crocodile(new Coordinates(16,21)));
        setEntity(new Coordinates(13,23),new Crocodile(new Coordinates(13,23)));
        setEntity(new Coordinates(8,5),new Crocodile(new Coordinates(8,5)));
        setEntity(new Coordinates(3,5),new Crocodile(new Coordinates(3,5)));

        //set Hare
        setEntity(new Coordinates(6,16),new Zebra(new Coordinates(6,16)));
        setEntity(new Coordinates(21,25),new Zebra(new Coordinates(21,25)));
        setEntity(new Coordinates(17,18),new Zebra(new Coordinates(17,18)));
        setEntity(new Coordinates(9,25),new Zebra(new Coordinates(9,25)));

        // set Zebra
        setEntity(new Coordinates(12,15),new Hare(new Coordinates(12,15)));
        setEntity(new Coordinates(25,2),new Hare(new Coordinates(25,2)));
        setEntity(new Coordinates(7,21),new Hare(new Coordinates(7,21)));
        setEntity(new Coordinates(18,21),new Hare(new Coordinates(18,21)));


        // set Duck
        setEntity(new Coordinates(5,18),new Duck(new Coordinates(5,18)));
        setEntity(new Coordinates(22,25),new Duck(new Coordinates(22,25)));
        setEntity(new Coordinates(3,9),new Duck(new Coordinates(3,9)));
        setEntity(new Coordinates(8,17),new Duck(new Coordinates(8,17)));

        // set Peacock
        setEntity(new Coordinates(17,12),new Peacock(new Coordinates(17,12)));
        setEntity(new Coordinates(21,18),new Peacock(new Coordinates(21,18)));
        setEntity(new Coordinates(17,7),new Peacock(new Coordinates(17,7)));
        setEntity(new Coordinates(18,5),new Peacock(new Coordinates(18,5)));
        setEntity(new Coordinates(12,19),new Peacock(new Coordinates(12,19)));
        setEntity(new Coordinates(25,5),new Peacock(new Coordinates(25,5)));
        setEntity(new Coordinates(7,13),new Peacock(new Coordinates(7,13)));
        setEntity(new Coordinates(1,18),new Peacock(new Coordinates(1,18)));

        // set Grass
        setEntity(new Coordinates(12,9),new Entity.Grass(new Coordinates(12,9)));
        setEntity(new Coordinates(2,25),new Entity.Grass(new Coordinates(2,25)));
        setEntity(new Coordinates(7,4),new Entity.Grass(new Coordinates(7,4)));
        setEntity(new Coordinates(8,1),new Entity.Grass(new Coordinates(8,1)));
        setEntity(new Coordinates(1,3),new Entity.Grass(new Coordinates(1,3)));
        setEntity(new Coordinates(8,16),new Entity.Grass(new Coordinates(8,16)));
        setEntity(new Coordinates(17,19),new Entity.Grass(new Coordinates(17,19)));
        setEntity(new Coordinates(3,10),new Entity.Grass(new Coordinates(3,10)));
        setEntity(new Coordinates(15,13),new Entity.Grass(new Coordinates(15,13)));
        setEntity(new Coordinates(21,16),new Entity.Grass(new Coordinates(21,16)));
        setEntity(new Coordinates(23,19),new Entity.Grass(new Coordinates(23,19)));
        setEntity(new Coordinates(25,10),new Entity.Grass(new Coordinates(25,10)));
        setEntity(new Coordinates(3,13),new Entity.Grass(new Coordinates(3,13)));
        setEntity(new Coordinates(2,19),new Entity.Grass(new Coordinates(2,19)));
        setEntity(new Coordinates(20,19),new Entity.Grass(new Coordinates(20,19)));
        setEntity(new Coordinates(24,10),new Entity.Grass(new Coordinates(24,10)));
        setEntity(new Coordinates(23,6),new Entity.Grass(new Coordinates(23,6)));
        setEntity(new Coordinates(22,5),new Entity.Grass(new Coordinates(22,5)));

        // set Tree
        setEntity(new Coordinates(1,19),new Entity.Tree(new Coordinates(1,19)));
        setEntity(new Coordinates(2,24),new Entity.Tree(new Coordinates(2,24)));
        setEntity(new Coordinates(5,17),new Entity.Tree(new Coordinates(5,17)));
        setEntity(new Coordinates(11,18),new Entity.Tree(new Coordinates(11,18)));

        // set Rock
        setEntity(new Coordinates(13,10),new Entity.Rock(new Coordinates(13,10)));
        setEntity(new Coordinates(16,20),new Entity.Rock(new Coordinates(16,20)));
        setEntity(new Coordinates(14,3),new Entity.Rock(new Coordinates(14,3)));
        setEntity(new Coordinates(18,9),new Entity.Rock(new Coordinates(18,9)));
        setEntity(new Coordinates(17,16),new Entity.Rock(new Coordinates(17,16)));
        setEntity(new Coordinates(11,20),new Entity.Rock(new Coordinates(11,20)));
        setEntity(new Coordinates(9,25),new Entity.Rock(new Coordinates(9,25)));
        setEntity(new Coordinates(8,23),new Entity.Rock(new Coordinates(8,23)));


    }
    public boolean isSquareEmpty(Coordinates coordinates){
        return  !entities.containsKey(coordinates);
    }
    public Entity getEntity(Coordinates coordinates){
        return entities.get(coordinates);
    }
    public  void  removeEntity(Coordinates coordinates){
        entities.remove(coordinates);
    }
    public void  moveEntity(Coordinates from, Coordinates to){
        Entity entity = getEntity(from);
        removeEntity(from);
        setEntity(to,entity);

    }

}
