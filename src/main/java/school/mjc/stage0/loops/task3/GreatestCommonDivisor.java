package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (second == 0) {
            System.out.println(first);
        } else {
            printGCD(second, first % second);
        }
    }
}
