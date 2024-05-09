package ru.liga.dcs.badcode;

public class DeepStackException {
    private static long startTime;
    private static final long STACK_DEEPNESS = 5000L;//или 1

    public static void main(String[] args) {
        try {
            recursiveCall(0, "0");
        } catch (Exception e) {
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Exception thrown in: " + duration / 1_000_000 + " ms");
        }
    }
    public static void recursiveCall(int level, String paramString) {
        int localInt = level;
        double localDouble = Math.random();
        String localString = paramString + localInt + localDouble;
        if (level < STACK_DEEPNESS) {
            recursiveCall(localInt + 1, localString);
        } else {
            startTime = System.nanoTime();
            throw new RuntimeException("Deep stack exception at level " + level);
        }
    }
}
