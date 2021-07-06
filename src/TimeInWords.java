public class TimeInWords {
    private static final String[] tensNames = {
            "",
            "ten",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private static final String[] numNames = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    public static String numToWord(int num) {
        if (num < 20) {
            return numNames[num];
        }
        int ones = num % 10;
        int tens = num/10;

        return tensNames[tens] + numNames[ones];
    }

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return numToWord(h) + " o' clock";
        }
        else if (m == 15) {
            return "quarter past " + numToWord(h);
        }
        else if (m == 30) {
            return "half past " + numToWord(h);
        }
        else if (m == 45) {
            return "quarter to " + numToWord(h+1);
        }
        else if (m > 0 && m < 30) {
            if (m == 1) {
                return numToWord(m) + " minute past " + numToWord(h);
            }
            return numToWord(m) + " minutes past " + numToWord(h);
        }
        else {
            if ((60 - m) == 1) {
                return numToWord(60 - m) + " minute to " + numToWord(h+1);
            }
            return numToWord(60 - m) + " minutes to " + numToWord(h+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(6, 1));
    }
}
