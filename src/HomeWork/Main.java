package HomeWork;

import java.util.*;

public class Main {
    public static void main(String[]args){
        Random random = new Random();
        int[] array = {random.nextInt(-1, 2), random.nextInt(-1, 2),random.nextInt(-1, 2)};
        System.out.println("Before: ");
        System.out.println("---------- Array -----------");
        for (int i:array) {
            System.out.println(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(random.nextInt(-1,2));
        arrayList.add(random.nextInt(-1, 2));
        arrayList.add(random.nextInt(-1, 2));
        System.out.println("---------- ArrayList -----------");
        arrayList.forEach(System.out::println);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(random.nextInt(-1, 2));
        linkedList.add(random.nextInt(-1, 2));
        linkedList.add(random.nextInt(-1, 2));
        System.out.println("---------- LinkedList -----------");
        linkedList.forEach(System.out::println);

        System.out.println("After: ");
        System.out.println("---------- Array -----------");
        sort(array);
        System.out.println("---------- ArrayList -----------");
        sort(arrayList);
        System.out.println("---------- LinkedList -----------");
        sort(linkedList);
    }
    public static void sort(int[] array){
        Arrays.sort(array);
        System.out.println("array = " + Arrays.toString(array));
    }
    public static  void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println("arrayList = " + arrayList);
        System.out.println(arrayList);
    }
    public  static void sort(LinkedList<Integer> linkedList){
        Collections.sort(linkedList);
        System.out.println("linkedList = " + linkedList);
    }




}
