public class Lab6{


    public static String maxValueTraded(String ibmFilename, String beginDate, String endDate){
        // Return the date within the date range with the maximum value traded. We will define value traded as the
        // price times the volume (number of shares traded) on a given day. The range should include the end points,
        // though this edge case will not be tested during grading.


        return "";
    }


    public static void main(String[] args){

        // Testing code

        String filename = "IBM.csv";

        String begin = "1998-03-02";
        String end = "1998-11-05";
        System.out.println("Expected: 1998-07-21");
        System.out.println("Returned: " + maxValueTraded(filename, begin, end));

        begin = "1000-03-02";
        end = "3000-11-05";
        System.out.println("\nExpected: 1997-01-22");
        System.out.println("Returned: " + maxValueTraded(filename, begin, end));

        begin = "2000-01-01";
        end = "2017-03-30";
        System.out.println("\nExpected: 2014-10-20");
        System.out.println("Returned: " + maxValueTraded(filename, begin, end));

        begin = "1900-01-01";
        end = "1990-01-01";
        System.out.println("\nExpected: 1987-10-20");
        System.out.println("Returned: " + maxValueTraded(filename, begin, end));
    }

}
