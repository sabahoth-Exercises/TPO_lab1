package task1;

/**
 * Here we use Maclaurin's formula for arcsin(x) and calculate the first 1000000000 elements of the series.
 * The result of this algorithm will have an accuracy of up to 15 decimal places.
 * Note that before starting calculations, it is necessary to make sure that the variable x is in the range [-1, 1],
 * since arcsin(x) is not defined for values of x outside this range.
 */
public class ArcSinFunction {
    public static double arcsin(double x) {
        if ( (Math.abs(x) < -1 ) || (Math.abs(x) > 1 )){
            return Double.NaN;
        }
        double result = x;
        double term = x;
        int n = 1;
        while (n <= 1000000000) {
       // while (n <= 15) {
            term *= ((double)(2 * n - 1) / (2 * n)) * x * x;
            result += term / (2 * n + 1);
            n++;
        }
        return result;
    }
}


