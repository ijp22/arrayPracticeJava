public class Numbers {
    static String[] units = {"", "one", "two", "three", "four",
            "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen",
            "nineteen"};

    static String[] tens = {"", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty",
            "ninety"};


    public static String numberToWords(int num) {
        String output = "";

        if (num > 99) {
            int hundreds = num / 100;
            output += units[hundreds] + " hundred";
            num %= 100;
            if (num > 0) {
                output += " and ";
            }
        }

        if (num < 20) {
            output += units[num];
        } else {
            int firstDigit = num / 10;
            int secondDigit = num % 10;
            output += tens[firstDigit];
            if (secondDigit > 0) {
                output += " ";
                output += units[secondDigit];
            }
        }

        return output;
    }

}

