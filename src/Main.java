public class Main {

    public static void main(String[] args) {
        int convertedNumber = 0;

        Hanoi hanoi = new Hanoi();
        hanoi.move(4,"A", "B", "C");
/*        convertedNumber = convert("102", 2, 6);
        System.out.println(convertedNumber);*/

        Fibonnacci fibonnacci = new Fibonnacci();

        System.out.println("Fibbonacci ");

        for (int i = 0; i < 50; i++) {
            System.out.println(fibonnacci.fibElement(i));
        }


        System.out.println("2 to power 5 is " +fastPower(2,5));
    }


    public static int convert(String number, int numberBase, int resultBase) {

        int myNumber = 0;
        String result = "";

        //myNumber = convertFromStringToNumber(number); // initial string is decimal but number
        myNumber = convertFromBaseToDecimal(number, numberBase);
        result = convertDecimalToBase(myNumber, resultBase); // initial decimal number  is converted to base string
        //myNumber = convertFromStringToNumber(result);
        //myNumber = convertFromStringToNumber(result);
        return myNumber;
    }

    private static String convertDecimalToBase(int myNumber, int numberBase) {
        int remainder=0;
        int number = myNumber;
        String resultString ="";
        // System.out.println(numberBase);
        do  {
            remainder = (myNumber % numberBase);
            myNumber = (int)(myNumber/numberBase);
            // System.out.println("new char " + (char)(remainder+48));
            resultString =  (char)(remainder+48) + resultString;
            // System.out.println(resultString);
        } while (myNumber != 0);
        System.out.println("Number converted to base " + numberBase + " is " + resultString + " and its a string");
        return resultString;
    }

    private static int convertFromBaseToDecimal(String myBaseNumber, int base) {
        int result=0;
        int power = 1;
        System.out.println("String to convert is " +myBaseNumber);

        for (int i = myBaseNumber.length()-1; i>=0; i--) {
            //System.out.println("next character is " + (myBaseNumber.charAt(i)-48));
            result = result + (myBaseNumber.charAt(i)-48)* power;
            power = power*base;
            //System.out.println("result is: " + result);
        }
        System.out.println("Number " + myBaseNumber + " converted from base " + base + " to decimal is " + result + " and its a string");
        return result;
    }

    public static int convertFromStringToNumber(String number) {
        int myNumber=0;
        // convert string to numbers character by character
        if (number.length()>1) {
            for (int i=0; i<number.length(); i++) {
                myNumber = myNumber*10 + (number.toString().charAt(i)-48);
            }
        }
        System.out.println("String " + number + " converted to number is int with value of " + myNumber);
        return myNumber;
    }


    public static int fastPower(int number, int n) {
        int p = 0;

        if (n==0) return 1;
        if ((n % 2) != 0) {
             p = fastPower(number, (n-1)/2);
            return number * p * p;
        } else {
            p = fastPower(number, n/2);
            return p*p;
        }
    }




}
