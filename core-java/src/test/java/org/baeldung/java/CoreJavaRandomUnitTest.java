package org.baeldung.java;

import java.util.Random;

import org.apache.commons.math3.random.RandomDataGenerator;
import org.junit.Test;

public class CoreJavaRandomUnitTest {

    // tests - random long

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomLongUnbounded_thenCorrect() {
        final long generatedLong = new Random().nextLong();

        System.out.println(generatedLong);
    }

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomLongBounded_thenCorrect() {
        final long leftLimit = 1L;
        final long rightLimit = 10L;
        final long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        System.out.println(generatedLong);
    }

    @Test
    public void givenUsingApacheCommons_whenGeneratingRandomLongBounded_thenCorrect() {
        final long leftLimit = 10L;
        final long rightLimit = 100L;
        final long generatedLong = new RandomDataGenerator().nextLong(leftLimit, rightLimit);

        System.out.println(generatedLong);
    }

    // tests - random int

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomIntegerUnbounded_thenCorrect() {
        final int generatedInteger = new Random().nextInt();

        System.out.println(generatedInteger);
    }

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomIntegerBounded_thenCorrect() {
        final int leftLimit = 1;
        final int rightLimit = 10;
        final int generatedInteger = leftLimit + (int) (new Random().nextFloat() * (rightLimit - leftLimit));

        System.out.println(generatedInteger);
    }

    @Test
    public void givenUsingApache_whenGeneratingRandomIntegerBounded_thenCorrect() {
        final int leftLimit = 1;
        final int rightLimit = 10;
        final int generatedInteger = new RandomDataGenerator().nextInt(leftLimit, rightLimit);

        System.out.println(generatedInteger);
    }

    // tests - random float

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomFloatUnbouned_thenCorrect() {
        final float generatedFloat = new Random().nextFloat();

        System.out.println(generatedFloat);
    }

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomFloatBouned_thenCorrect() {
        final float leftLimit = 1F;
        final float rightLimit = 10F;
        final float generatedFloat = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);

        System.out.println(generatedFloat);
    }

    @Test
    public void givenUsingApache_whenGeneratingRandomFloatBounded_thenCorrect() {
        final float leftLimit = 1F;
        final float rightLimit = 10F;
        final float randomFloat = new RandomDataGenerator().getRandomGenerator().nextFloat();
        final float generatedFloat = leftLimit + randomFloat * (rightLimit - leftLimit);

        System.out.println(generatedFloat);
    }

    // tests - random double

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomDoubleUnbounded_thenCorrect() {
        final double generatedDouble = Math.random();

        System.out.println(generatedDouble);
    }

    @Test
    public void givenUsingPlainJava_whenGeneratingRandomDoubleBounded_thenCorrect() {
        final double leftLimit = 1D;
        final double rightLimit = 10D;
        final double generatedDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);

        System.out.println(generatedDouble);
    }

    @Test
    public void givenUsingApache_whenGeneratingRandomDoubleUnbounded_thenCorrect() {
        final double generatedDouble = new RandomDataGenerator().getRandomGenerator().nextDouble();

        System.out.println(generatedDouble);
    }

    @Test
    public void givenUsingApache_whenGeneratingRandomDoubleBounded_thenCorrect() {
        final double leftLimit = 1D;
        final double rightLimit = 100D;
        final double generatedDouble = new RandomDataGenerator().nextUniform(leftLimit, rightLimit);

        System.out.println(generatedDouble);
    }

}