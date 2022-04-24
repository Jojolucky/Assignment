package edu.neu.csye6200;
public class ConvertUtility {



    public static int StringToint(String s){
        int  i=0;
        try {
           i = Integer.parseInt(s);
        }
        catch (ClassCastException e){
            System.out.println(e);
        }
        return i;

    }

    public static float StringToFloat(String s){
        float  f = 0f;
        try {
            f = Float.valueOf(s);
        }
        catch (ClassCastException e){
            System.out.println(e);
        }
        return f;

    }

    public static double StringToDouble(String s){
        double  d = 0;
        try {
            d = Double.valueOf(s);
        }
        catch (ClassCastException e){
            System.out.println(e);
        }
        return d;

    }
}
