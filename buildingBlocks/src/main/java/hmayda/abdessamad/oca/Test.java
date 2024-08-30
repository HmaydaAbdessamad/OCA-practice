package hmayda.abdessamad.oca;

import java.util.ArrayList;

public class Test {

    private static void testVarargas(ArrayList<String>... lists){
        for (ArrayList<String> item:lists
             ) {
                    System.out.println(item.get(0));
                }
    }

    public void testIt(ArrayList list){

    }
    public  static void main(String... args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Element1");
        list1.add("Element2");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Element3");
        list2.add("Element4");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        testVarargas(list1,list2);
    }
}
