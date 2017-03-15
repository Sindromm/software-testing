package ru.dolganova.function;

/**
 * Created on 15.03.17.
 */
public class ArcSin {

    private final static Double border = 0.96;

    public static double fact(double num) {
        return (num <= 0) ? 1 : num * fact(num - 1);
    }

    public static double calc(double x, double eps){
        if (Math.abs(x) > 1) return Double.NaN;

        double result = 0;
        double prevRes;
        int n = 0;

        if (Math.abs(x) >= border) { //arcsin(x) = arccos(sqrt(1 - x^2)); arccos(x) = p/2 - arcsin(x)
            Double newX = Math.sqrt(1 - x * x);
            do {
                prevRes = result;
                result += fact(2*n) * Math.pow(newX, 2*n + 1) / (Math.pow(4, n) * Math.pow(fact(n),2) * (2 * n+1));
                n++;
            } while (Math.abs(result-prevRes) > eps);
            result =  Math.signum(x) * (Math.PI / 2 - result);
        } else {
            do {
                prevRes = result;
                result += fact(2*n) * Math.pow(x, 2*n + 1) / (Math.pow(4, n) * Math.pow(fact(n),2) * (2 * n+1));
                n++;
            } while (Math.abs(result-prevRes) > eps);
        }
        return Math.abs(result);
    }
}
