import java.util.concurrent.ThreadLocalRandom;

public class ExceptionsTimeMeasurement {
    static int numberOfTries = 10000000;
    static int nbExceptions = 0;
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        for (int i=0;i<numberOfTries;i++){
            double x = callNormalMethod(Math.random()*10,Math.random()*10);
           if (x==0){
                //
            } else {

            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        start = System.currentTimeMillis();
        for (int i=0;i<numberOfTries;i++){
            try {
                callExceptionalMethod(Math.random()*10,Math.random()*10);
            } catch (Exception e){
                nbExceptions ++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println(end-start + " " + nbExceptions);
    }

    private static double callExceptionalMethod(double a, double b) throws Exception {
        Object x = null;
        if (ThreadLocalRandom.current().nextDouble() < 0.1)
            x.toString();
        return a+b;
    }

    private static double callNormalMethod(double a, double b) {
        if (ThreadLocalRandom.current().nextDouble() < 0.1)
            return Integer.MAX_VALUE;
        return a+b;
    }
}