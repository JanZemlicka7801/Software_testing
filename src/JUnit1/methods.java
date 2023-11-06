package JUnit1;

public class methods {
    public static boolean multiple(int number){
        return number%3==0||number%5==0;
    }

    public static int checkLargest(int num1, int num2, int num3){
        int[] numbers = {num1, num2, num3};
        int largest = num1;
        for (int number : numbers) {
            if(largest<=number){
                largest = number;
            }
        }
        return largest;
    }

    /*
    3.	Write a Java method, swap {}, to swap the first 2 letters of a 4-letter string, passed as a parameter, with the last 2 e.g. “ABCD” is swapped to “CDAB”.

    Create a corresponding Junit test file, containing a number of test methods, to test the swap {} code.
    **/
    public static String swap(String letter){
        if (letter==null || letter.length()!=4){
            return "ERROR";
        }
        return letter.substring(2) + letter.substring(0,2);
    }

    /*
    4.	Write a Java method, tempConvert {}, which receives 2 arguments, and integer denoting a temperature and a letter
    ‘F’ or ‘C’ denoting whether the temperature is in Fahrenheit or Celsius.
    Your method should return the message “The Celsius/Fahrenheit equivalent of 999 Celsius/Fahrenheit is 999”.
     */
    public static String tempConvert(int temperature, String letter){
        if (letter.equalsIgnoreCase("c")){
            return "The Fahrenheit equivalent of " + temperature + " Celsius is " + ((temperature * 9.0 / 5.0) + 32);
        } else if (letter.equalsIgnoreCase("f")){
            return "The Celsius equivalent of " + temperature + " Fahrenheit is " + (temperature - 32) * 5.0 / 9.0;
        } else {
            return "ERROR";
        }
    }
    /*
    5.	A multi-storey car park charges a €2.00 minimum fee to park for up to 3 hours.
    The car park charges an additional €0.50 for each hour, or any part of an hour, in excess of 3 hours.
    The maximum charge for any 24-hour period is €10.00.
    Write a Java method, which receives a double, representing how many hours the customer has parked, and calculates the required payment.
    */

    public static double chargeCounter(double hours){
        int hour = 0;
        for (int i = 0; i < 24; i++){
            if (hours > i && hours <= (i+1)){
                hour = i+1;
            }
        }
        // Math.ceil(hours)  Math.round ()  Math.floor ()

        if(hour<=3.00){
            return 2.00;
        } else if (hour==24){
            return 10.00;
        } else return ((hour - 3) * 0.50) + 2;
    }

    /*
    6.	A student studies 6 modules in the final semester of their degree.
    The student’s overall grade is determined by where the average of the 6
    modules lies as
    follows:

    Overall Average	Award
    70% and upwards	1.1
    60 – 69%	    2.1
    50 – 59%	    2.2
    40 – 49%	    Pass
    39% and below	Fail
    IT WILL BE MARKS DIVIDED BY SUM OF MARKS AND MULTIPLY BY 100%
    Write a Java method that accepts an array of integers, representing the
    student’s marks,
    calculates the average and returns a message indicating the student’s overall
    award
    classification.
    Create a corresponding Junit test file, containing a number of test methods,
    to test the code.
    */

    public static String studentMark(int[] array){
        int count = 0;
        double average = 0;
        for (int marks : array){
            count = count + marks;
        }
        average = ((double)count / array.length);
        if (Math.round(average)>=70){
            return "Your award is 1.1.";
        } else if (Math.round(average)>=60){
            return "Your award is 2.1.";
        }else if (Math.round(average)>=50){
            return "Your award is 2.2.";
        }else if (Math.round(average)>=40){
            return "You passed the module.";
        } else {
            return "You failed the module.";
        }
    }
}
