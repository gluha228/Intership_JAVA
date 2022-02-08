import java.util.ArrayList;
import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("q:");
        int q = myInput.nextInt();
        int n;
        int a;
        int b;
        int add;
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            System.out.println("a b n");
            a = myInput.nextInt();
            b = myInput.nextInt();
            n = myInput.nextInt();
            add = 1;
            s = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a += add * b;
                add *= 2;
                s.add(a);
            }
            output.add(s);
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println();
            for (int j = 0; j < output.get(i).size(); j++)
                System.out.print(output.get(i).get(j) + " ");
        }
    }
}
