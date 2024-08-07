public  abstract class Entity {



    public Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    static class Tree{
        public Tree(Coordinates coordinates){

        }

    }
    static class Rock{
        public Rock(Coordinates coordinates){

        }
    }

    public static Entity Grass;
}