public class IfStatement {
    public static void main(String[] args) {
        boolean logicTest = false;

        //if then
        if (logicTest) ;
        {
            // om logicTest är true körs koden vi skriver här inne köras.
            System.out.println("Logic test is true");

        }
        int age = 20;

        if (age == 18) {
            System.out.println("Yuo can go to the Pub!");

        } else if (age >= 20) {
            System.out.println("You can go to Systembolaget");

        } else {
            System.out.println(" Sorry you have to wait a few years to go to the pub or systembolaget");
        }
        //else if (age == 20 || age > 20)
        // här kollar vi om age är exakt lika med 20 ELLER || om age är större än 20

    }
}
