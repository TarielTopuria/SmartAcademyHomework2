public class Main {
    public static void main(String[] args) {
//        N2 საშინაო დავალების სავარჯიშოები მოთავსებულია HomeWork2 კლასსა და homeWork2() მეთოდში;
        HomeWork2.homeWork2();

//        ლექციაზე გავლილი ამოცანები და მათი ჩემეული გადაწყვეტები მოცემულია LectureExercises კლასსა და მის მეთოდებში;
//        ასაკის შესამოწმებელი მეთოდები, რომელიც არ აბრუნებს მნიშვნელობას (void)
        System.out.println("\nლექციაზე გავლილი ამოცანა N1 - მეთოდი არ აბრუნებს მნიშვნელობას (void): ");
        LectureExercises.ageMethodOne(15);
        LectureExercises.ageMethodOne(18);
        LectureExercises.ageMethodOne(35);

//        ასაკის შესამოწმებელი მეთოდები, რომელიც აბრუნებს String მნიშვნელობას;
        System.out.println("\nლექციაზე გავლილი ამოცანა N1 - მეთოდი აბრუნებს String მნიშვნელობას:");
        System.out.println(LectureExercises.ageMethodTwo(14));
        System.out.println(LectureExercises.ageMethodTwo(18));
        System.out.println(LectureExercises.ageMethodTwo(36));

/*
          int [] მასივის შექმნა და მასივის წევრების ჯამის გამოთვლა მეთოდში დაბრუნებული მნიშვნელობისა და პარამეტრად მასივის გადაცემით შექმნილ მეთოდზე;
          პარამეტრად გადასაცემი მასივი შექმნილია Main კლასში, arrayCalculator მეთოდის გამოყენებამდე;
 */
        System.out.println("\nლექციაზე გავლილი ამოცანა N2 - მეთოდს გადაეცემა პარამეტრად ინტეჯერ ტიპის მასივი და მეთოდი აბრუნებს int მნიშვნელობას");
        int [] firstArray = new int[] {1, 9, 3, 6, 13, 230, 92};
        System.out.println(LectureExercises.arrayCalculator(firstArray));

        System.out.println("\nლექციაზე გავლილი ამოცანა N3 - ფიბონაჩის მიმდევრობა 0-დან 10-მდე");
        LectureExercises.fibonacci();

/*
            ორი ინტეგერ მასივის შექმნა, მეთოდისთვის გადასაცემად
            მეთოდის გამოძახება ორი ინტეგერ მასივის შედარებისთვის;
*/
        System.out.println("\nლექციაზე გავლილი ამოცანა N4 - მეთოდისთვის პარამეტრად მასივების გადაცემა და მასივების შედარება:");
        int[] arrayOne = new int[] {1, 30, 123, 290, 987, 212};
        int[] arrayTwo = new int[] {5, 8, 123, 98, 2};
        System.out.println(LectureExercises.arrayCompare(arrayOne, arrayTwo));
    }
}
