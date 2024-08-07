import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class MapUtils {
    public static List<Coordinates> getDiagonalCoordinatesBetween(Coordinates source, Coordinates target) {
        List<Coordinates> result = new ArrayList<>();
        int fileShift = (source.file < target.file) ? 1 : -1;
        int rankShift = (source.rank < target.rank) ? 1 : -1;
        for (int file = source.file + fileShift,
             rank = source.rank + rankShift;
             file != target.file && rank != target.rank;
             file += fileShift, rank += rankShift
        ){
            result.add(new Coordinates(file, rank));
    }
        return result;
    }
    public static List<Coordinates> getVerticalCoordinatesBetween(Coordinates source, Coordinates target){
        List<Coordinates> result = new ArrayList<>();
        int rankShift = source.rank < target.rank ? 1: -1;
        for(int rank = source.rank + rankShift;
        rank != target.rank; rank += rankShift) {
            result.add(new Coordinates(source.file,rank));
        }

        return result;

    }
    public static List<Coordinates> getHorizontalCoordinatesBetween(Coordinates source, Coordinates target){
        List<Coordinates> result = new ArrayList<>();
        int fileShift = source.file < target.file ? 1: -1;
        for(int file = source.file + fileShift;
        file != target.file; file += fileShift){
            result.add(new Coordinates(file,source.rank));
        }
        return result;
    }
}
