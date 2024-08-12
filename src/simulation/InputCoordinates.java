package simulation;

import simulation.entity.Creature;
import simulation.entity.Entity;
import simulation.entity.Herbivore;
import simulation.entity.Predator;


import java.util.Scanner;
import java.util.Set;

public class InputCoordinates {
    Predator predator;
    Herbivore herbivore;

    static Scanner scanner = new Scanner(System.in);
    public static Coordinates input(){
        while(true){
            System.out.println("Please input coordinates (example 21).");
            String line = scanner.nextLine();
            if(line.length() != 2){
                System.out.println("Invalid format");
                continue;
            }
            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if(!Character.isDigit(fileChar) || !Character.isDigit(rankChar) ){
                System.out.println("Invalid format");
                continue;
            }
            int file = Character.getNumericValue(fileChar);
            int rank = Character.getNumericValue(rankChar);
            if(rank < 1 || rank > 25 || file < 1 || file > 25){
                System.out.println("Invalid format");
                continue;
            }

            return new Coordinates(file, rank);
        }
    }
    public static Coordinates inputCreatureCoordinates(Creature creature ,Map map) {
        while (true) {
            System.out.println("Enter coordinates for a creature to move");
            Coordinates coordinates = input();

            if (map.isSquareEmpty(coordinates)) {
                System.out.println("Empty square");
                continue;
            }

            Entity entity = map.getEntity(coordinates);
            if(entity == coordinates.tree || entity == coordinates.rock || entity == coordinates.grass){
                System.out.println("This is a nature's entity. It can not be moved! Choose a creature to move!");
                continue;
            }
            //Entity entity1 = map.getEntity(coordinates);

            if (entity.getClass() != creature.getClass()) {
                System.out.println("Wrong species");
                continue;
            }
            Set<Coordinates> availableMoveSquares = creature.getAvailableMoveSquares(map);
            if (availableMoveSquares.size() == 0) {
                System.out.println("Blocked character");
                continue;
            }

            return coordinates;
        }
    }
    public static Coordinates inputAvailableSquare(Set<Coordinates> coordinates) {
        while (true) {
            System.out.println("Enter your move for selected piece");
            Coordinates input = input();

            if (!coordinates.contains(input)) {
                System.out.println("Non-available square");
                continue;
            }

            return input;
        }
    }
    public static void main(String[] args) {
        Map map  = new Map();
        map.setupDefaultEntitiesPositions();
        Coordinates coordinates = inputCreatureCoordinates(new Predator(new Coordinates(5,9)),map);
        System.out.println("coordinates "+ coordinates);
    }
}
