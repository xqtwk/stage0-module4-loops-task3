package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0, num = 0;
        for (int i = 0 ; i < lengthOfLastNumber; i++) {
            num = num * 10 + 9;
            sum += num;
        }
        System.out.println(sum);
    }
}
