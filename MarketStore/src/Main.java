

public class Main {
    public static void main(String[] args) {

        Card card1 = new Bronze(0, 150);
        System.out.println(card1.toString());
        /*
        Purchase value: $150,00
        Discount rate: 0,0%
        Discount: $0,00
        Total: $150,00
         */

        Card card2 = new Silver(600, 850);
        System.out.println(card2.toString());
        /*
        Purchase value: $850,00
        Discount rate: 3,5%
        Discount: $29,75
        Total: $820,25
         */

        Card card3 = new Gold(1500, 1300);
        System.out.println(card3.toString());
        /*
        Purchase value: $1300,00
        Discount rate: 10,0%
        Discount: $130,00
        Total: $1170,00
        */

    }
}
