package task1;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 1. Testing of boundary values: x=-1, x=1
 * 2. Testing for x=0
 * 3. Testing for positive x less than one
 * 4. Testing for negative x less than one
 * 5. Testing a random value of x in the range from -1 to 1.
 */
public class ArcSinFunctionTest {
    double eps = 0.1;

    @ParameterizedTest
    @ValueSource(doubles = {1, -1,1.00001,-1.00001})
    public void boundaryValues(double value){
        Assertions.assertEquals(Math.asin(value), ArcSinFunction.arcsin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, -0.0000001,0.0000001})
    public void zeroValues(double value){
        Assertions.assertEquals(Math.asin(value), ArcSinFunction.arcsin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.8, 2, 0.1, 1+0.00001, 1-0.00001})
    public void positiveValues(double value){
        Assertions.assertEquals(Math.asin(value), ArcSinFunction.arcsin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.8,-5, -1+0.00001, -1-0.00001})
    public void negativeValues(double value){
        Assertions.assertEquals(Math.asin(value), ArcSinFunction.arcsin(value), eps);
    }

    @ParameterizedTest
    @ValueSource(doubles = {3,0.1, 0.6, 8.5, 0.000215})
    public void randomValues(double value){
        Assertions.assertEquals(Math.asin(value), ArcSinFunction.arcsin(value), eps);
    }
}
