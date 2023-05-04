public class Main {
    public static void main(String[] args) {

        int oneMily = 20;                   // количество рублей для одной бонусной мили
        int ticketPrice = 13676;            // цена билета
        int mily = ticketPrice / oneMily;    // количество бонусных миль

        System.out.println("Бесплатные бонусные мили = " + mily);
    }
}
