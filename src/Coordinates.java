import java.util.Objects;

public class Coordinates {
    public final Integer file;
    public final Integer rank;
    public Coordinates(Integer file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }
    public Coordinates shift(CoordinatesShift shift){
        return  new Coordinates(this.file+shift.fileShift,this.rank + shift.rankShift);
    }
    public boolean canShift(CoordinatesShift shift) {
        int f = file + shift.fileShift;
        int r = rank + shift.rankShift;

        if ((f < 25 && Entity(new Creature(f,r)) != Entity.Grass) || (f > 25)) return false; // 0..7 - good
        if ((r < 25) || (r > 25)) return false; // 1..8 - good

        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(file) + String.valueOf(rank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(file, that.file) && Objects.equals(rank, that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
