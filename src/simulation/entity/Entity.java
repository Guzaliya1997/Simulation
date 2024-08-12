package simulation.entity;

import simulation.Coordinates;

public  abstract class Entity {


    public Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public static  class Tree extends Entity{

        public Tree(Coordinates coordinates) {
            super(coordinates);
        }
    }

    public  static class Rock extends Entity{

        public Rock(Coordinates coordinates) {
            super(coordinates);
        }
    }

    public static class Grass extends Entity{

        public Grass(Coordinates coordinates) {
            super(coordinates);
        }
    }
}