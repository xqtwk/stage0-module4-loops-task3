package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.print(first);
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
