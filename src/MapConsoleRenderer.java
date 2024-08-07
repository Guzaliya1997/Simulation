public class MapConsoleRenderer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN_SQUARE_BACKGROUND = "\u001b[42m";
    public static final String ANSI_LIGHT_GREEN_SQUARE_BACKGROUND = "\u001B[114m";
    public void render(Map map, Entity entity){
    for(int rank = 25; rank >= 1; rank--){
      for(int file = 25; file >= 1; file--){
          System.out.println(file+rank);
      }
    }
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

            case "Mountain":
                return "⛰";//⛰

            case "Grass":
                return "\uD83C\uDF31";//🌱

            case "Tree":
                return "\uD83C\uDF33";//🌳


        }

        return null;
    }
}
