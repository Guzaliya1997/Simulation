public abstract  class Creature extends Entity{
    int speed;
    int HP_count;

    public Creature(Coordinates coordinates) {
        super(coordinates);
    }

    public abstract void makeMove();
}
