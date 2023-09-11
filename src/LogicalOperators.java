public class LogicalOperators {
    public static void main(String[] args) {
        int testNumberOne = 96;

        /*if (testNumberOne < 100) {
            System.out.println("test number is less than 100");
        }*/

        int testNumberTwo = 80;

        //OCH OPERATORN
        // vi ska  kolla om test ett är större än test två OCH om test ett är mindre än hundra
        if (testNumberOne > testNumberTwo && testNumberOne < 100) {
            System.out.println("Test number one is greater than test number two and less than hundred");
        }

        //ELLER OPERATORN
        if(testNumberOne > 90 || testNumberTwo <= 90) {
            System.out.println("Either or both conditions are true");
        }








    }
}
