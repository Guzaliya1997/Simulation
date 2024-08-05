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
                return "\uD80C\uDCEC";

            case "Hare":
                return "\uD80C\uDCF9";

            case "Duck":
                return "\uD83E\uDD86";

            case "Crocodile":
                return "\uD83D\uDC0A";

            case "Mountain":
                return "♛";

            case "Grass":
                return "♚";
        }
        return  "";
    }
}
