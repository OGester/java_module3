public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        // hur många oporatorer har vi här?
        // vi har två operatorer

        int prevRes = result;

        //ändra värdet på result

        result = result - 1;
        //System.out.println(result);

        //System.out.println(prevRes);

        // + operatorn på char datatyper

        char firstChar = 'A';
        char secondChar = 'B';

       // System.out.println(firstChar + secondChar);
        // char datatyper lagras som byte siffror i minnet och blir därför
        // en suma när vi plussar ihop dem.

        //System.out.println("" + firstChar + secondChar);
        // en tom sträng "" motverkar detta och printar AB i konsollen ist för 131


        //multiplikation

        result = 2;

        result = result * 10;
        //System.out.println(result);

        //division

        result = result / 4;
        //System.out.println(result);


        // REMAINDER/MODULUS

        result = 5;

        result = result % 3;
        System.out.println(result);
        //hur många ggr får operanden på höger sida % plats i operanden till vänster.
        // återstoden blir resultatet.







































    }
}
