package A0.연습장;

import java.util.TreeSet;

public class ZH_Tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);

        for (Integer e : ts) System.out.print(e + " ");

    }
}
