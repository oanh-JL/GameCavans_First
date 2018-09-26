package tklibs;

public class Mathx {
    public static double lerp(double a, double b, double f){
        return a+f*(b-a);
    }

    public static double clamp(double value, double min, double max){
        if(value<min) return min;
        if(value>max) return max;
        return value;
    }
    public static int clamp(int value, int min, int max){
        if(value<min) return min;
        if(value >max) return max;
        return value;
    }

}
