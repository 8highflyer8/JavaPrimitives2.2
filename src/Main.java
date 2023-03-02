public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        int startAccount = 100;
        // суммы пополнения и тп
        int addSum = 1100;
        int totalAccount;
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
          if (addSum >1000) {
            totalAccount = startAccount + addSum + (addSum / 100);
          } else {
            totalAccount = startAccount + addSum;
          }
        int bonus = totalAccount - startAccount - addSum  ;
        System.out.println("Итоговый счёт: " + totalAccount);
        System.out.println("Количество бонусных рублей: "+ bonus);
    }
}