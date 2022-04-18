import main.java.examples.Example1;
import main.java.examples.Example1Opt1;

public class Main {
    public static void main(String[] args) {
        long startTime = System. currentTimeMillis();
        Example1 example1 = new Example1();
        String output = example1.ReverseString("hello");
        long endTime = System. currentTimeMillis();
        System.out.println(output);
        long time1 = endTime-startTime;
        System.out.println(time1);

        startTime = System. currentTimeMillis();
        Example1Opt1 example1Opt = new Example1Opt1();
        output = example1Opt.ReverseString("hello");
        endTime = System. currentTimeMillis();
        System.out.println(output);
        long time2 = endTime-startTime;
        long diff = time1-time2;
        System.out.println(time2);
        System.out.println("/n Optimized time (ms)" + diff );


    }
}