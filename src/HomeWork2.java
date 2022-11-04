import java.util.ArrayList;

public class HomeWork2 {
    public static void homeWork2(){
//        კენტი რიცხვების დაბეჭდვა;
        System.out.println("დავალება N1: ");
        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

//        Random რიცხვების ბეჭდვა double ტიპით;
        System.out.println("\nდავალება N2: ");
        double randomDoubleNumber = Math.random();
        System.out.println(randomDoubleNumber);



//        Random რიცხვების ბეჭდვა int ტიპით 0-დან 100-მდე;
        System.out.println("\nდავალება N2 კასტინგის გამოყენება და 0-დან 100-მდე რიცხვების ბეჭდვა: ");
        int randomIntNumbers2 = (int) (Math.random() * 100);
        System.out.println(randomIntNumbers2);


//        double ტიპის მასივის შექმნა და საშუალო არითმეტიკულის გამოთვლა;
        System.out.println("\nდავალება N3: ");
        double[] myArray = new double[] {5.2, 9.3, 7.8, 1.7, 9.8};
        double myArraySum = 0;
        for (double v : myArray) {
            myArraySum += v;
        }
        double averageNumber = myArraySum / myArray.length;
        System.out.println(averageNumber);


//        ინტეჯერების მასივში მინიმალური ელემენტების პოვნა;
        System.out.println("\nდავალება N4 array-ის გამოყენებით: ");
        int [] myArray1 = new int[] {35, 10, 6, 30, 13, 123, 19, 57};
        int minimalNumber1 = myArray1[0];
        for (int i : myArray1) {
            if(minimalNumber1 > i){
                minimalNumber1 = i;
            }
        }
        System.out.println(minimalNumber1);

//        ინტეჯერების arrayList-ში მინიმალური ელემენტების პოვნა;
        System.out.println("\nდავალება N4 arrayList-ის გამოყენებით: ");
        ArrayList<Integer> myArray2 = new ArrayList<>();
        myArray2.add(15);
        myArray2.add(10);
        myArray2.add(98);
        myArray2.add(65);
        int minimalNumber2 = myArray2.get(0);
        for (Integer integer : myArray2) {
            if (minimalNumber2 > integer) {
                minimalNumber2 = integer;
            }
        }
        System.out.println(minimalNumber2);
    }
}
