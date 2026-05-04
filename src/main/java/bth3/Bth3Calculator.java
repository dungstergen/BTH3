package bth3;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Bth3Calculator {
    private static final Set<Integer> THIRTY_ONE_DAY_MONTHS = Set.of(1, 3, 5, 7, 8, 10, 12);

    private Bth3Calculator() {
    }

    public static double rectanglePerimeter(Object length, Object width) {
        double validatedLength = requireNonNegativeNumber(length, "length");
        double validatedWidth = requireNonNegativeNumber(width, "width");
        return 2 * (validatedLength + validatedWidth);
    }

    public static double rectangleArea(Object length, Object width) {
        double validatedLength = requireNonNegativeNumber(length, "length");
        double validatedWidth = requireNonNegativeNumber(width, "width");
        return validatedLength * validatedWidth;
    }

    public static QuadraticSolution solveQuadratic(Object a, Object b, Object c) {
        double coefficientA = requireNumber(a, "a");
        double coefficientB = requireNumber(b, "b");
        double coefficientC = requireNumber(c, "c");

        if (coefficientA == 0) {
            if (coefficientB == 0) {
                throw new IllegalArgumentException("a and b cannot both be zero");
            }
            return new QuadraticSolution("linear", List.of(-coefficientC / coefficientB));
        }

        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC;
        if (discriminant < 0) {
            return new QuadraticSolution("complex", Collections.emptyList());
        }
        if (discriminant == 0) {
            return new QuadraticSolution("double", List.of(-coefficientB / (2 * coefficientA)));
        }

        double squareRoot = Math.sqrt(discriminant);
        return new QuadraticSolution(
            "distinct",
            List.of(
                (-coefficientB - squareRoot) / (2 * coefficientA),
                (-coefficientB + squareRoot) / (2 * coefficientA)
            )
        );
    }

    public static int daysInMonth(Object month, Object year) {
        int validatedMonth = requireInteger(month, "month");
        if (validatedMonth < 1 || validatedMonth > 12) {
            throw new IllegalArgumentException("month must be between 1 and 12");
        }

        if (validatedMonth != 2) {
            if (THIRTY_ONE_DAY_MONTHS.contains(validatedMonth)) {
                return 31;
            }
            return 30;
        }

        if (year == null) {
            return 28;
        }

        int validatedYear = requireInteger(year, "year");
        boolean leapYear = validatedYear % 400 == 0 || (validatedYear % 4 == 0 && validatedYear % 100 != 0);
        return leapYear ? 29 : 28;
    }

    public static boolean isPrime(Object value) {
        int validatedValue = requireInteger(value, "value");
        if (validatedValue < 2) {
            return false;
        }
        if (validatedValue == 2) {
            return true;
        }
        if (validatedValue % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(validatedValue);
        for (int divisor = 3; divisor <= limit; divisor += 2) {
            if (validatedValue % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int alternatingSum(Object n) {
        int validatedN = requireInteger(n, "n");
        if (validatedN < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int total = 0;
        for (int index = 1; index <= validatedN; index++) {
            total += index % 2 == 1 ? index : -index;
        }
        return total;
    }

    public static int gcd(Object a, Object b) {
        int validatedA = requireInteger(a, "a");
        int validatedB = requireInteger(b, "b");
        if (validatedA == 0 && validatedB == 0) {
            throw new IllegalArgumentException("a and b cannot both be zero");
        }

        long first = Math.abs((long) validatedA);
        long second = Math.abs((long) validatedB);
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        return (int) first;
    }

    public static long factorial(Object value) {
        int validatedValue = requireInteger(value, "value");
        if (validatedValue < 0) {
            throw new IllegalArgumentException("value must be non-negative");
        }

        long result = 1;
        for (int index = 2; index <= validatedValue; index++) {
            result *= index;
        }
        return result;
    }

    public static long factorialSum(Object n) {
        int validatedN = requireInteger(n, "n");
        if (validatedN < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        long total = 0;
        for (int index = 1; index <= validatedN; index++) {
            total += factorial(index);
        }
        return total;
    }

    private static double requireNonNegativeNumber(Object value, String name) {
        double validatedNumber = requireNumber(value, name);
        if (validatedNumber < 0) {
            throw new IllegalArgumentException(name + " must be non-negative");
        }
        return validatedNumber;
    }

    private static double requireNumber(Object value, String name) {
        if (!(value instanceof Number number)) {
            throw new IllegalArgumentException(name + " must be a number");
        }

        double validatedNumber = number.doubleValue();
        if (Double.isNaN(validatedNumber) || Double.isInfinite(validatedNumber)) {
            throw new IllegalArgumentException(name + " must be a finite number");
        }
        return validatedNumber;
    }

    private static int requireInteger(Object value, String name) {
        double validatedNumber = requireNumber(value, name);
        if (Math.floor(validatedNumber) != validatedNumber) {
            throw new IllegalArgumentException(name + " must be an integer");
        }
        return (int) validatedNumber;
    }

    public record QuadraticSolution(String type, List<Double> roots) {
    }
}