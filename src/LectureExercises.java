public class LectureExercises {
    //   ლექციაზე გავლილი ამოცანა N1 - ასაკის შემოწმების მეთოდი void მაგალითზე:
    public static void ageMethodOne(int age){
        if(age < 18){
            System.out.println("You are under 18 years");
        }else if(age == 18){
            System.out.println("You are 18 years old");
        }else{
            System.out.println("You are above 18 years");
        }
    }

    //    ლექციაზე გავლილი ამოცანა N1 - ასაკის შემოწმების მეთოდი String მნიშვნელობის დაბრუნების მაგალითზე;
    public static String ageMethodTwo(int age){
        if (age < 18) {
            return "You are under 18 years old";
        }else if(age == 18){
            return "You are 18 years old";
        }else{
            return "You are over 18 years old";
        }
    }

    /*    ლექციაზე გავლილი ამოცანა N2 -
          int [] მასივის შექმნა და მასივის წევრების ჯამის გამოთვლა მეთოდში დაბრუნებული მნიშვნელობისა და პარამეტრად მასივის გადაცემით შექმნილ მეთოდზე;
          პარამეტრად გადასაცემი მასივი შექმნილია Main კლასში, arrayCalculator მეთოდის გამოყენებამდე;
     */
    public static int arrayCalculator (int[] numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }

    //    ლექციაზე გავლილი ამოცანა N3 - ფიბონაჩის მიმდევრობის გამომთვლელი მეთოდი
    public static void fibonacci(){
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        System.out.println(firstNumber);
        for (int i = 0; i < 6; i++){
            thirdNumber = firstNumber + secondNumber;
            secondNumber = firstNumber;
            firstNumber = thirdNumber;
            System.out.println(firstNumber);
        }
    }

    //    ლექციაზე გავლილი ამოცანა N4 - ორი ინტეგერ მასივის შედარების დავალება
    public static String arrayCompare(int[] firstArray, int[] secondArray){
        if(firstArray.length <2 || secondArray.length <2){
            return "Array lengths less than 2";
        }else if(firstArray[0] == secondArray[0] || firstArray[firstArray.length -1] == secondArray[secondArray.length-1]){
            return "True";
        }else{
            return "False";
        }
    }
}
