import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> entities = new HashMap<>();
    public void setPiece(Coordinates coordinate, Entity entity){
        entity.coordinates = coordinate;
        entities.put(coordinate,entity);
    }

    public void setupDefaultPiecesPositions(){

        //set lion
        setPiece(new Coordinates(1,1),new Lion(new Coordinates(1,1)));
        setPiece(new Coordinates(5,5),new Lion(new Coordinates(5,5)));
        setPiece(new Coordinates(20,20),new Lion(new Coordinates(20,20)));
        setPiece(new Coordinates(15,15),new Lion(new Coordinates(15,15)));

        //set crocodile
        setPiece(new Coordinates(16,16),new Crocodile(new Coordinates(16,16)));
        setPiece(new Coordinates(10,10),new Crocodile(new Coordinates(10,10)));
        setPiece(new Coordinates(8,8),new Crocodile(new Coordinates(8,8)));
        setPiece(new Coordinates(3,3),new Crocodile(new Coordinates(3,3)));

        //set Hare
        setPiece(new Coordinates(6,6),new Zebra(new Coordinates(6,6)));
        setPiece(new Coordinates(21,21),new Zebra(new Coordinates(21,21)));
        setPiece(new Coordinates(17,17),new Zebra(new Coordinates(17,17)));
        setPiece(new Coordinates(9,9),new Zebra(new Coordinates(9,9)));

        // set Zebra
        setPiece(new Coordinates(12,12),new Hare(new Coordinates(12,12)));
        setPiece(new Coordinates(26,26),new Hare(new Coordinates(26,26)));
        setPiece(new Coordinates(7,7),new Hare(new Coordinates(7,7)));
        setPiece(new Coordinates(18,18),new Hare(new Coordinates(18,18)));


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

}
