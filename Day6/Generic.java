package Day6;

public class Generic {
    public static <T extends Number> int display(T a, T b){
        return a.intValue()+b.intValue();
    }
}
