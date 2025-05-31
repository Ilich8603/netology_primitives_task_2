public class Main {
    public static void main(String[] args) {

        int bonusCost = 100; // стоимость бонуса
        int initBalance = 200; // начальный счёт
        int pay = 1397; // сумма пополнения


        int bonus; // сумма бонуса по условию
        if (pay > 1000) {
            bonus = pay / bonusCost;
        } 
        else {
            bonus = 0;
        }

        int finalBalance = initBalance + pay + bonus; // итоговая сумма

        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");

    }
}
