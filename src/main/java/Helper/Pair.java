package Helper;

public class Pair {
    private int val1;
    private int val2;

    public Pair(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public long getSumm() {
        return ((long) val1) + val2;
    }

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }
}
