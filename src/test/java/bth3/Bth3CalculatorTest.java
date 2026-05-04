package bth3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Bth3CalculatorTest {
    @Test
    void rectanglePerimeterReturnsValidResult() {
        assertEquals(16.0, Bth3Calculator.rectanglePerimeter(5, 3));
    }

    @Test
    void rectanglePerimeterHandlesBoundaryWithZeroValues() {
        assertEquals(0.0, Bth3Calculator.rectanglePerimeter(0, 0));
    }

    @Test
    void rectanglePerimeterRejectsNegativeDimensions() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectanglePerimeter(-1, 3));
    }

    @Test
    void rectanglePerimeterRejectsNonNumberDimensions() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectanglePerimeter("5", 3));
    }

    @Test
    void rectangleAreaReturnsValidResult() {
        assertEquals(15.0, Bth3Calculator.rectangleArea(5, 3));
    }

    @Test
    void rectangleAreaHandlesBoundaryWithZeroValues() {
        assertEquals(0.0, Bth3Calculator.rectangleArea(0, 7));
    }

    @Test
    void rectangleAreaRejectsNegativeDimensions() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectangleArea(-1, 3));
    }

    @Test
    void rectangleAreaRejectsNonNumberDimensions() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectangleArea(5, "3"));
    }

    @Test
    void quadraticEquationWithTwoDistinctRoots() {
        Bth3Calculator.QuadraticSolution result = Bth3Calculator.solveQuadratic(1, -3, 2);
        assertEquals("distinct", result.type());
        assertEquals(List.of(1.0, 2.0), result.roots());
    }

    @Test
    void quadraticEquationWithDoubleRoot() {
        Bth3Calculator.QuadraticSolution result = Bth3Calculator.solveQuadratic(1, 2, 1);
        assertEquals("double", result.type());
        assertEquals(List.of(-1.0), result.roots());
    }

    @Test
    void quadraticEquationWithComplexRoots() {
        Bth3Calculator.QuadraticSolution result = Bth3Calculator.solveQuadratic(1, 0, 1);
        assertEquals("complex", result.type());
        assertTrue(result.roots().isEmpty());
    }

    @Test
    void quadraticEquationBecomesLinearWhenAIsZero() {
        Bth3Calculator.QuadraticSolution result = Bth3Calculator.solveQuadratic(0, 2, -4);
        assertEquals("linear", result.type());
        assertEquals(List.of(2.0), result.roots());
    }

    @Test
    void quadraticEquationRejectsInvalidCoefficients() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.solveQuadratic(0, 0, 1));
    }

    @Test
    void quadraticEquationRejectsNonNumberCoefficients() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.solveQuadratic("1", 2, 3));
    }

    @Test
    void daysInMonthReturnsStandardMonthLength() {
        assertEquals(30, Bth3Calculator.daysInMonth(4, null));
    }

    @Test
    void daysInMonthReturnsThirtyOneDaysMonthLength() {
        assertEquals(31, Bth3Calculator.daysInMonth(1, null));
    }

    @Test
    void daysInMonthReturnsLeapYearFebruary() {
        assertEquals(29, Bth3Calculator.daysInMonth(2, 2024));
    }

    @Test
    void daysInMonthReturnsLeapYearForCenturyDivisibleBy400() {
        assertEquals(29, Bth3Calculator.daysInMonth(2, 2000));
    }

    @Test
    void daysInMonthReturnsNonLeapYearFebruary() {
        assertEquals(28, Bth3Calculator.daysInMonth(2, 2023));
    }

    @Test
    void daysInMonthReturnsNonLeapYearForCenturyNotDivisibleBy400() {
        assertEquals(28, Bth3Calculator.daysInMonth(2, 1900));
    }

    @Test
    void daysInMonthReturnsFebruaryWithoutYearAsStandardCase() {
        assertEquals(28, Bth3Calculator.daysInMonth(2, null));
    }

    @Test
    void daysInMonthRejectsInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.daysInMonth(13, null));
    }

    @Test
    void daysInMonthRejectsInvalidMonthBelowRange() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.daysInMonth(0, null));
    }

    @Test
    void daysInMonthRejectsNonIntegerMonth() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.daysInMonth(2.5, null));
    }

    @Test
    void daysInMonthRejectsNonIntegerYearWhenProvided() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.daysInMonth(2, 2024.5));
    }

    @Test
    void primeCheckReturnsTrueForPrimeNumber() {
        assertTrue(Bth3Calculator.isPrime(29));
    }

    @Test
    void primeCheckReturnsTrueForTwo() {
        assertTrue(Bth3Calculator.isPrime(2));
    }

    @Test
    void primeCheckReturnsFalseForNonPrimeNumber() {
        assertFalse(Bth3Calculator.isPrime(21));
    }

    @Test
    void primeCheckReturnsFalseForEvenComposite() {
        assertFalse(Bth3Calculator.isPrime(10));
    }

    @Test
    void primeCheckHandlesLowerBoundary() {
        assertFalse(Bth3Calculator.isPrime(1));
    }

    @Test
    void primeCheckTreatsNegativeValuesAsNonPrime() {
        assertFalse(Bth3Calculator.isPrime(-7));
    }

    @Test
    void primeCheckRejectsNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.isPrime(2.5));
    }

    @Test
    void alternatingSumReturnsValidResult() {
        assertEquals(3, Bth3Calculator.alternatingSum(5));
    }

    @Test
    void alternatingSumHandlesEvenBoundaryPattern() {
        assertEquals(-3, Bth3Calculator.alternatingSum(6));
    }

    @Test
    void alternatingSumHandlesZero() {
        assertEquals(0, Bth3Calculator.alternatingSum(0));
    }

    @Test
    void alternatingSumRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.alternatingSum(-1));
    }

    @Test
    void alternatingSumRejectsNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.alternatingSum(2.2));
    }

    @Test
    void gcdReturnsCommonDivisor() {
        assertEquals(6, Bth3Calculator.gcd(24, 18));
    }

    @Test
    void gcdHandlesZeroAndANumber() {
        assertEquals(15, Bth3Calculator.gcd(0, 15));
    }

    @Test
    void gcdHandlesNegativeValues() {
        assertEquals(6, Bth3Calculator.gcd(-24, 18));
    }

    @Test
    void gcdRejectsBothZeros() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.gcd(0, 0));
    }

    @Test
    void gcdRejectsNonIntegerInputs() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.gcd(4.5, 2));
    }

    @Test
    void factorialReturnsValidResult() {
        assertEquals(120L, Bth3Calculator.factorial(5));
    }

    @Test
    void factorialHandlesZero() {
        assertEquals(1L, Bth3Calculator.factorial(0));
    }

    @Test
    void factorialRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.factorial(-3));
    }

    @Test
    void factorialRejectsNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.factorial(3.3));
    }

    @Test
    void factorialSumReturnsValidResult() {
        assertEquals(33L, Bth3Calculator.factorialSum(4));
    }

    @Test
    void factorialSumHandlesZero() {
        assertEquals(0L, Bth3Calculator.factorialSum(0));
    }

    @Test
    void factorialSumRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.factorialSum(-2));
    }

    @Test
    void factorialSumRejectsNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.factorialSum(4.2));
    }

    @Test
    void rectanglePerimeterRejectsNaNInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectanglePerimeter(Double.NaN, 3));
    }

    @Test
    void rectangleAreaRejectsInfiniteInput() {
        assertThrows(IllegalArgumentException.class, () -> Bth3Calculator.rectangleArea(Double.POSITIVE_INFINITY, 2));
    }
}