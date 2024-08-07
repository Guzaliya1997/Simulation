import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> entities = new HashMap<>();
    public void setEntity(Coordinates coordinate, Entity entity){
        entity.coordinates = coordinate;
        entities.put(coordinate,entity);
    }

    public void setupDefaultEntitiesPositions(){

        //set lion
        setEntity(new Coordinates(1,1),new Lion(new Coordinates(1,1)));
        setEntity(new Coordinates(5,5),new Lion(new Coordinates(5,5)));
        setEntity(new Coordinates(20,20),new Lion(new Coordinates(20,20)));
        setEntity(new Coordinates(15,15),new Lion(new Coordinates(15,15)));

        //set crocodile
        setEntity(new Coordinates(16,16),new Crocodile(new Coordinates(16,16)));
        setEntity(new Coordinates(10,10),new Crocodile(new Coordinates(10,10)));
        setEntity(new Coordinates(8,8),new Crocodile(new Coordinates(8,8)));
        setEntity(new Coordinates(3,3),new Crocodile(new Coordinates(3,3)));

        //set Hare
        setEntity(new Coordinates(6,6),new Zebra(new Coordinates(6,6)));
        setEntity(new Coordinates(21,21),new Zebra(new Coordinates(21,21)));
        setEntity(new Coordinates(17,17),new Zebra(new Coordinates(17,17)));
        setEntity(new Coordinates(9,9),new Zebra(new Coordinates(9,9)));

        // set Zebra
        setEntity(new Coordinates(12,12),new Hare(new Coordinates(12,12)));
        setEntity(new Coordinates(26,26),new Hare(new Coordinates(26,26)));
        setEntity(new Coordinates(7,7),new Hare(new Coordinates(7,7)));
        setEntity(new Coordinates(18,18),new Hare(new Coordinates(18,18)));


    }
    public boolean isSquareEmpty(Coordinates coordinates){
        return  !entities.containsKey(coordinates);
    }
    public Entity getEntity(Coordinates coordinates){
        return  entities.get(coordinates);
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
