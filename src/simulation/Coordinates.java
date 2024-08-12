package simulation;

import simulation.entity.Entity;

import java.util.Objects;

public class Coordinates {
    Entity.Grass grass;
    Entity.Rock rock;
    Entity.Tree tree;
    Map map;
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

        if ((f < 25 || (f > 25) || map.getEntity(new  Coordinates(f,r)) == grass ||
                map.getEntity(new  Coordinates(f,r)) == tree ||
                map.getEntity(new  Coordinates(f,r)) == rock)) return false;
        if ((r < 25 || (r > 25) || map.getEntity(new  Coordinates(f,r)) == grass ||
                map.getEntity(new  Coordinates(f,r)) == tree ||
                map.getEntity(new  Coordinates(f,r)) == rock)) return false;

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
