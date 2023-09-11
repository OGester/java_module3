public class TernaryOperators {
    public static void main(String[] args) {
        String dog = "Bullterrier";

        //boolean isShortHairBreed = false;

        boolean isShortHairBreed = dog == "Bullterrier" ? true : false;
        // det som kommer bakom ? är precis samma sak som vi skriver i blocket efter vår if sats.
        // det som står efter kolon är samma sa som vårt else block.

        if (isShortHairBreed) {
            System.out.println("Bullterrier is a short hair breed");
        }

        String breed = isShortHairBreed ? "This dog is a short haired breed" : "This dog is a long haired breed";
        System.out.println(breed);
    }
}
