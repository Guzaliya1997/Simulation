package simulation;

import simulation.Coordinates;
import simulation.Map;
import simulation.entity.Creature;
import simulation.entity.Entity;

import java.util.Set;

import static java.util.Collections.emptySet;

public class MapConsoleRenderer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";
    public void render(Map map, Creature creatureToMove){
        Set<Coordinates> availableMoveSquares = emptySet();
        if(creatureToMove != null){
            availableMoveSquares = creatureToMove.getAvailableMoveSquares(map);
        }
    for(int rank = 25; rank >= 1; rank--){
        String line = "";
      for(int file = 25; file >= 1; file--){
          Coordinates coordinates = new Coordinates(file,rank);
          boolean isHighlight = availableMoveSquares.contains(coordinates);
          if(map.isSquareEmpty(coordinates)){
              line += getSpriteForEmptySquare(coordinates, isHighlight);}
          else{
              line += getEntitySprite(map.getEntity(coordinates), isHighlight);
          }

      }
        line += ANSI_RESET;
        System.out.println(line);
    }
    }
    public void render(Map map) {
        render(map,null);
    }
    private String colorizeSprite(String sprite,boolean isHighlight){

        String result = sprite;

        if (isHighlight) {
            result = ANSI_HIGHLIGHTED_SQUARE_BACKGROUND + result;
        }

        return  result;
    }
    private String getSpriteForEmptySquare(Coordinates coordinates, boolean isHighlight){
        return colorizeSprite("....", isHighlight);
    }
    private String selectUnicodeSpriteForEntity(Entity entity){
        switch(entity.getClass().getSimpleName()){
            case "Lion":
                return "\uD83E\uDD81";//🦁

            case "Hare":
                return "\uD83D\uDC07";//🐇

            case "Duck":
                return "\uD83E\uDD86";//🦆

            case "Crocodile":
                return "\uD83D\uDC0A";//🐊

            case "Zebra":
                return "\uD83E\uDD93";//🦓

            case "Peacock":
                return "\uD83E\uDD9A";//🦚

            case "Rock":
                return "⛰";//⛰

            case "Grass":
                return "\uD83C\uDF31";//🌱

            case "Tree":
                return "\uD83C\uDF33";//🌳


        }

        return "";
    }
    private String getEntitySprite(Entity entity, boolean isHighlight) {

        return colorizeSprite(" "+selectUnicodeSpriteForEntity(entity)+" ", isHighlight);
    }
}
