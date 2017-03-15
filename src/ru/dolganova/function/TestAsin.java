package ru.dolganova.function;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created on 15.03.17.
 */
public class TestAsin {
    //Testing border point
    @Test
    public void testArcSinMinusOneL() { // x = -1 - 0.01
        double x = -1.01;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinMinusOne() { // x = -1
        double x = -1;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinMinusOneG() { // x = -1 + 0.01
        double x = -0.99;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinMinus0Dot95L() { // x = -0.95 - 0.01
        double x = -0.96;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinMinus0Dot95() { // x = -0.95
        double x = -0.95;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinMinus0Dot95G() { // x = -0.95 + 0.01
        double x = -0.94;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0L() { // x = 0 - 0.01
        double x = -0.01;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0() { // x = 0
        double x = 0;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0G() { // x = 0 + 0.01
        double x = 0.01;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0Dot95L() { // x = 0.95 - 0.01
        double x = 0.94;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0Dot95() { // x = 0.95
        double x = 0.95;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSin0Dot95G() { // x = 0.95 + 0.01
        double x = 0.96;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinOneL() { // x = 1 - 0.01
        double x = 1;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinOne() { // x = 1
        double x = 1;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinOneG() { // x = 1 + 0.01
        double x = 1;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    // Classes of equivalence
    @Test
    public void testArcSinNaN() { // x < -1 || x > 1
        double x = 2;
        assertEquals(Double.NaN, ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinEqMinusWrongTaylor() { //-1 < x < -0.95
        double x = -0.98;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinEqMinusTaylor() { // -0.95 < x < 0
        double x = -0.5;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinEqTaylor() { // 0 < x < 0.95
        double x = 0.5;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }

    @Test
    public void testArcSinEqWrongTaylor() { // 0.95 < x < 1
        double x = 0.98;
        assertEquals(Math.asin(x), ArcSin.calc(x, 1E-7), 1E-6);
    }
}
