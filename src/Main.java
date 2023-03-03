public class Main {
    public static void main(String[] args) {
        int startAccount = 100;
        int addSum = 1100;
        int totalAccount;
        if (addSum > 1000) {
            totalAccount = startAccount + addSum + (addSum / 100);
        } else {
            totalAccount = startAccount + addSum;
        }
        int bonus = totalAccount - startAccount - addSum;
        System.out.println("Итоговый счёт: " + totalAccount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}