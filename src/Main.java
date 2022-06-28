public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : arr1) {
            System.out.println(i);
        }

        System.out.println("---------------");

        // Exercise 2
        int[] arr2 = {1, 2, 3, 4, 5};

        for (int j : arr2) {
            System.out.println(j);
        }

        System.out.println("---------------");

        for (int k = 0; k < arr2.length; k++) {
            arr2[k] = k * 10;
            System.out.println(arr2[k]);
        }

        System.out.println("---------------");

        //Challenge 1
        System.out.println(addDigits(74));
        System.out.println("---------------");

        //Challenge 2
        System.out.println(Numbers.numberToWords(21));
        System.out.println(Numbers.numberToWords(14));
        System.out.println(Numbers.numberToWords(20));
        System.out.println(Numbers.numberToWords(200));
        System.out.println(Numbers.numberToWords(201));
    }

    //Challenge 1
    public static int addDigits(int num) {
        int firstDigit = num / 10;
        int secondDigit = num % 10;
        return firstDigit + secondDigit;
    }

}