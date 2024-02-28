// Main program to test your work
public class MainProgram {
    public static void main(String[] args) {
        // TESTS FOR PART 1 (PaymentCard.java)
        /*
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
         */

        /*
        Output should be:
        money 10.0
        successfully took: true
        money 2.0
        successfully took: false
        money 2.0
         */

        // TESTS FOR PART 2 (PaymentTerminal.java)
        /*
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
         */

        /*
        Output should be:
        remaining change: 7.5
        remaining change: 2.5
        remaining change: 0.0
        money: 1009.3, number of sold afforable meals: 2, number of sold hearty meals: 1
         */

        // TESTS FOR PART 3 (PaymentTerminal.java)
        /*
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);
         */

        /*
        Output should be
        remaining change: 7.5
        there was enough money: true
        there was enough money: false
        there was enough money: true
        money: 1002.5, number of sold afforable meals: 2, number of sold hearty meals: 1
         */

        // TESTS FOR PART 4 (PaymentTerminal.java)
        /*
         PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
         */

        /*
        Output should be
        money: 1000.0, number of sold afforable meals: 0, number of sold hearty meals: 0
        amount of money on the card is 2.0 euros
        there was enough money: false
        there was enough money: true
        amount of money on the card is 97.7 euros
        money: 1100.0, number of sold afforable meals: 0, number of sold hearty meals:
         */
    }
}