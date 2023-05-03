public class Main {
    public static void main(String[] args) {
        int ticketPrice;
        int oneMily;
        int mily;

        oneMily = 20;                   // количество рублей для одной бонусной мили
        ticketPrice = 13676;            // цена билета

        mily = ticketPrice / oneMily;    // количество бонусных миль

        System.out.println("Бесплатные бонусные мили = " + mily);
    }
}
