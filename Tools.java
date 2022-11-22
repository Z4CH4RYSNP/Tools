import java.lang.Math;

/**
 * <style>
 *      body {
 *      background-color: black;  
 *      }
 * 
 *      .description {
 *      color: green;   
 *      }
 * 
 *      .description h1, .description h3 {
 *      font-family: 'Courier New', monospace;
 *      color: green;
 *      }
 * 
 *      .description p {
 *      color: white;
 *      }
 * </style>
 * 
 * 
 * <div class = "description"> 
 * 
 * 
 *  <h1>ZACH'S DOPE TOOLBOX OF WONDERS</h1>
 * 
 *  <p>
 *  This .java file contains all of my tools/functions I've created and saved.
 *  </p>
 *  
 *  <br>
 *  
 *  <p>
 *  If you borrow anything from here <strong>I'd appreciate if you left the JavaDoc with the author tag on it. </strong>
 *  Of course <em>add yourself to the credit</em> if you make any changes. :D 
 *  </p>
 * 
 *  <br>
 * 
 *  <p>
 *  Remember; to access this file in your program, firstly import it into your project folder, then use the line:
 *  <strong> Tools aName = new Tools();   (You might need to change the file
 *  and class name if you already have a Tools.java file.)</strong>
 *  </p>
 * 
 *  <br>
 * 
 *  <p>
 *  Also if anything is broken or you think it is working improperly, let me know so I can fix it.
 *  Keep in mind most the stuff written in here was made at 3am after downing like 4 coffees. 
 *  You can find me @ zs20np@snpsteam.com for school related stuff or Z 4 C H 4 R Y#6650 on Discord to chat or ask questions. 
 *  </p>
 * 
 *  <h3>Hopefully this helps. :)</h3>
 * 
 *  <br>
 *
 * </div>
 * 
 * @author Zachary Sousa, with contributions and additions from: Eli Wood, Dave Slemon, Nathan Braniff
 * @version 1.14
 * 
 * 
 */
public class Tools
{
        //V GENERIC CONSOLE STUFF V
    /**
     * pl
     * 
     * <ul>
     *  <li>Smaller version of System.out.println</li>
     * </ul>
     * 
     * @param  s        string to print 
     *
     * @author Zachary Sousa
     * @version 1.00
     * 
     * 
     */
    public static void pl(String s) {
        System.out.println(s);
    }
    
    
    
    /**
     * pl
     * 
     * <ul>
     *  <li>Smaller version of System.out.print</li>
     * </ul>
     * 
     * 
     * @param  s        string to print 
     *
     * @author Zachary Sousa
     * @version 1.00
     * 
     * 
     */
    public static void p(String s) {
        System.out.print(s);
    }
    
    
    
    
        //V GENERIC STRING STUFF V
    /**
     * reverseString
     * 
     * <ul>
     *  <li>This function takes a String of any size and rewrites it in backwards order</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param phrase    a string of any length, inputted by you or the user
     * 
     * @return          bwPhrase (reveresed version of inputted String)
     * 
     * 
     */
    public static String reverseString (String phrase) {
        
        String bwPhrase = "";
        
            for(int i = phrase.length() - 1; i > -1; i --)
            {
                bwPhrase = bwPhrase + Character.toString(phrase.charAt(i)); //Creates a new string by indexing all characters of phrase in reverse order.
            }
            
        return bwPhrase;
        
    }
    
    
    
    /**
     * orderedPair
     * 
     * <ul>
     *  <li>This function takes a set of 2 floats and formats them to be an ordered pair in a String</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     *
     * @param x         the first number in the ordered pair, represented by the x-axis
     * @param y         the second number in the ordered pair, represented by the y-axis
     * 
     * @return          the formatted string 
     * 
     * 
     */
    public static String orderedPair (float x, float y) {
        
        return "(" + x + ", " + y + ")";
        
    }
    
    
    
    /**
     * getMonthName
     * 
     * <ul>
     *  <li>This function returns a month name related to a given month number</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     *
     * @param monthNum         the number of the month 
     * @return                 the month's name 
     * 
     * 
     */
    public static String getMonthName(int monthNum){
        
        switch(monthNum){
            
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "INVALID MONTH NUMBER";
            
        }
        
    }
    
    
    
        //V GENERIC MATHEMATICAL STUFF V
    /**
     * isOdd
     * <ul>
     *  <li>This function will determine whether an integer is odd or even, through use of the % operator</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param num       an int, inputted by you or the user
     * 
     * @return          true if odd, false if even
     */
    public static boolean isOdd (int num) {
        
        if((num % 2) == 0) {
            return false;
        }
        else {
            return true;
        }
        
    }
    
    
    
    /**
     * getDist
     * <ul>
     *  <li>This function will calculate the distance between 2 coordinates.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param x1       the x coordinate of the first ordered pair
     * @param y1       the y coordinate of the first ordered pair
     * @param x2       the x coordinate of the second ordered pair
     * @param y2       the y coordinate of the second ordered pair
     * 
     * @return         distance between the 2 coordinates
     */
    public static float getDist (float x1, float y1, float x2, float y2) {
        
        float d;
        
        d = (float)Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
        
        return d;
        
    }
    
    
    
    /**
     * getSlope
     * <ul>
     *  <li>This function will calculate the slope of 2 coordinates.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     *
     * @param x1       the x coordinate of the first ordered pair
     * @param y1       the y coordinate of the first ordered pair
     * @param x2       the x coordinate of the second ordered pair
     * @param y2       the y coordinate of the second ordered pair
     * 
     * @return         slope of the 2 coordinates
     */
    public static double getSlope (double x1, double y1, double x2, double y2) {
        
        double s;
        
        s = (y2 - y1) / (x2 - x1);
        
        return s;
        
    }
    
    
    
    /**
     * areaOfTri
     * <ul>
     *  <li>This function will calculate the area of a triangle.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     *
     * @param a        side length a
     * @param b        side length b
     * @param c        side length c
     * 
     * @return         area of the triangle
     */
    public static float areaOfTri (float a, float b, float c) {
        
        float s;
        float A;
        
        s = (a + b + c) / 2;
        
        A = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        return A;
        
    }
    
    
    
    /**
     * getMidpoint
     * <ul>
     *  <li>This function will calculate the midpoint of 2 coordinates.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param x1       the x coordinate of the first ordered pair
     * @param y1       the y coordinate of the first ordered pair
     * @param x2       the x coordinate of the second ordered pair
     * @param y2       the y coordinate of the second ordered pair
     * 
     * @return         midpoint of the 2 coordinates
     */
    public static String getMidpoint (double x1, double y1, double x2, double y2) {
        
        double mpX;
        double mpY;
        
        mpX = (x1 + x2) / 2;
        mpY = (x1 + x2) / 2;
        
        return "(" + mpX + ", " + mpY + ")";
        
    }
    
    
    
    /**
     * bubbleSort uses the bubble sort algoithm to sort an array of integers
     *
     * @author Dave Slemon, Zachary Sousa (modified to use floats)
     * @version 1.01 
     *
     * @param A is an array of floats to be sorted
     * @param n is the number elements to sort from the beginning
     *
     * @return A of floats sorted in ascending order
     */  
    public static void bubbleSort(float[] A, int n) { //bubble 
    
    float temp = 0;  
     for(int i=0; i < n; i++)
     {  
             for(int j=1; j < (n-i); j++)
             {  
                      if(A[j-1] > A[j]){  
                             //swap elements  
                             temp = A[j-1];  
                             A[j-1] = A[j];  
                             A[j] = temp;  
                     }  
                      
             }  
      }
      
    } //bubble
        
        
        
    /**
     * bubbleSort uses the bubble sort algorithm to sort an array of integers
     *
     * @param A is an array of doubles to be sorted
     * @param n is the number elements to sort from the beginning
     * 
     * @return A of doubles sorted in ascending order
     * 
     * @author Dave Slemon, Nathan Braniff - Updated to use integer arrays
     * @version 1.00
     */
    public static void bubbleSort(int[] A, int n) { //bubble

        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (A[j - 1] > A[j]) {
                    //swap elements
                    temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }

            }
        }

    } //bubble
        
        
        
    /**
     * bubbleSort uses the bubble sort algoithm to sort an array of integers
     *
     * @author Dave Slemon
     * @version 1.00
     *
     * @param A is an array of doubles to be sorted
     * @param n is the number elements to sort from the beginning
     *
     * @return A of doubles sorted in ascending order
     */  
    public static void bubbleSort(double[] A, int n) 
    { //bubble 
        
        double temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(A[j-1] > A[j]){  
                                 //swap elements  
                                 temp = A[j-1];  
                                 A[j-1] = A[j];  
                                 A[j] = temp;  
                         }  
                          
                 }  
          }
          
    } //bubble

        
    
    /**
     * getMedian
     * <ul>
     *  <li>This function will calculate the median when given an array of any length</li>
     * <ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param array         the array to find the median of
     * @param n             the int length of the array
     * 
     * @return              the median, including the optional step of finding average when given an array of an even length
     * 
     */
    public static double getMedian(double[] array, int n) {
        Tools t = new Tools();
        
        bubbleSort(array, n);
        
        double num1, num2, mean;
        
        if(t.isOdd(n)) {
            return array[n/2];
        } 
        
        num1 = array[n/2-1];
        num2 = array[n/2];
        
        mean = (num1 + num2) / 2;
        
        return mean;
        
    }
    
    
    
    /**
     * getMean
     * <ul>
     *  <li>This function will calculate the mean of an array of any length.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param dataSet       array to get the mean of
     * 
     * @return              the mean of the array
     * 
     */
    public static double getMean(double[] dataSet) {
        
        double sum = 0;
        double mean;
        
        for(int i = 0; i < dataSet.length; i++) {
            
            sum = sum + dataSet[i];
            
        }
        
        mean = sum / dataSet.length;
        
        return mean;
        
    }
    
    
    
    /**
     * getMode
     * finds the mode in an array
     * @param array is numbers list
     * @return the mode of the numbers
     * @author Nathan Braniff, with help from Zachary Sousa
     * @version 2.00
     */
    public static String getMode(int array[]){
        int uniqueNumbers[] = {array[0]};
        boolean isMode = false;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < uniqueNumbers.length; j++) {
                if(array[i] != uniqueNumbers[j]) {
                    int temp[] = new int [uniqueNumbers.length + 1];
                    for(int k = 0; k < uniqueNumbers.length; k++) {
                        temp[k] = uniqueNumbers[k];
                    }
                    temp[uniqueNumbers.length] = array[i];
                    uniqueNumbers = temp;
                }
            }
        }

        int occurances[] = new int[uniqueNumbers.length];

        for (int i = 0; i < occurances.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j] == uniqueNumbers[i]) {
                    occurances[i] ++;
                }
            }
        }

        for (int i = 0; i <occurances.length - 1; i++) {
            if(occurances[i] != occurances[i+1]) {
                isMode = true;
                break;
            }
        }
        if (isMode) {

            int biggest = 0;
            int index = 0;
            for (int i = 0; i < occurances.length; i++) {
                if (biggest < occurances[i]) {
                    biggest = occurances[i];
                    index = i;
                }
            }

            return String.valueOf(uniqueNumbers[index]) + "%";
        }else {
            return "no mode";
        }
    }
    
    
    
    /**
     * <h1>Angle</h1>
     * <p>
     * this function finds the angle of a point by using 3 side lenghts
     * </p>
     * 
     * @param  a            first side 
     * @param  b            second side
     * @param  c            third side
     * @return angle        the angle of the first side's corresponding angle
     * 
     * @author Eli Wood, Zachary Sousa
     * @version 1.00        (modified to use floats -ZS
     *                       also updated param description as it was incorrect
     *                       from "x1,y1,x2,y2  Two sets of ordered coordinates")
     */
    public static float angle(float a, float b, float c) {
        float angle;

        angle = (float)Math.toDegrees(Math.acos((-a*a + b*b + c*c) / (2.0*b*c)));

        return angle;
    }
    //Thanks Eli for giving me this^ formula because the way I would've done it was way over complicated.
    
    
    
    /**
     * isRightAngled
     * <ul>
     *  <li>This function will check if a triangle contains an (approximately) right angle.</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.00
     * 
     * @param aa            angle A
     * @param ab            angle B
     * @param ac            angle C
     * 
     * @return              true if one of the angles is ~90 degress, otherwise false
     * 
     */
    public static boolean isRightAngled(float aa, float ab, float ac) {
        
        if(Math.abs(90-aa) < 0.0001 || Math.abs(90-ab) < 0.0001 || Math.abs(90-ac) < 0.0001) {
            return true;
        } else {
            return false;
        }
        
    }
    
    
    
        //V MEASUREMENT UNIT CONVERSIONS V
    /**
     * cToF
     * <ul>
     *  <li>Returns a String containing the conversion of a given temperature in celsius to fahrenheit</li>
     * </ul>
     * 
     * @author Zachary Sousa
     * @version 1.02
     * 
     * @param celsius       a double, representing a temperature measured in celsius
     * @param addNotation   if true, will add a degrees symbol and "F" on the end of the number; otherwise just the number
     * 
     * @return              a String containing the converted value
     */
    public static String cToF (double celsius, boolean addNotation) {
        
        String fahrenheit = Double.toString((celsius * 9/5) + 32);
        
        if(addNotation) {
            return fahrenheit + "\u00B0" + "F";
        }
        else {
            return fahrenheit;
        }
        
    }
    
    
    
    /**
     * cToK
     * <ul>
     *  <li>Returns a String containing the conversion of a given temperature in celsius to kelvin</li>
     * </ul>
     * 
     * @author Zachary Sousa     
     * @version 1.02
     * 
     * @param celsius       a double, representing a temperature measured in celsius
     * @param addNotation   if true, will add a degrees symbol and "K" on the end of the number; otherwise just the number
     *
     *@return               a String containing the converted value
     */
    public static String cToK (double celsius, boolean addNotation) {
        
        String kelvin = Double.toString(celsius + 273.15);
        
        if(addNotation) {
            return kelvin + "\u00B0" + "K";
        }
        else {
            return kelvin;           
        }
        
    }
    
    
    
    /**
     * kmToImperial
     * <ul>
     *  <li>Returns a double containing the coversion of a given distance in kilometers to feet</li>
     * </ul>
     * 
     * @author Zachary Sousa     
     * @version 1.02
     * 
     * @param km            a double, representing a distance measured in kilometers
     * @param unit          a selector for what unit to convert to (accepted are "ft", "yd", "mi", "in"), 
     *                      if nothing/or an invalid string is inputted the output will default to miles
     * 
     * @return              a double containing the converted value
     */
    public static double kmToImperial (double km, String unit) {
        
        double ft = km * 3280.839895;
        double yd = ft / 3;
        double mi = km * 0.6214;
        double in = km * 39370.1;
        
        switch(unit) {
            
            case "ft":
                return ft;
            case "yd":
                return yd;
            case "mi":
                return mi;
            case "in":
                return in;
            default:
                return mi;
            
        }
    }
    
}
