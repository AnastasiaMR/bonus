public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long refill = 1336;
        long bonus = 0;
        if (refill >= 1000)
            bonus = refill / 100;

        long new_balance = balance + bonus + refill;

        System.out.println("На вашем счету " + new_balance + " рублей");
    }
}
