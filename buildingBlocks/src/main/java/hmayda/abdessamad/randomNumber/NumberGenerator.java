package hmayda.abdessamad.randomNumber;

import java.util.Random;

public class NumberGenerator {

   static Random randomGenerator=new Random();

    public static Double generating(int max){
        return randomGenerator.nextDouble()*max;
    }

    public static void main(String[] args) {
        System.out.println(generating(100));
    }

}
