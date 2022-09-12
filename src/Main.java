public class Main {
    public static void main(String[] args) {;
        //четвертая задача
        byte bottle = 16;
        byte min = 2;
        int bIn1Min = bottle / min;
        System.out.println("бутылок в минуту " + bIn1Min );
        byte ch = 60;
        byte day = 24;
        int aloneInDay = day * 60;
        System.out.println(aloneInDay + " min. in day");

        byte pOn20M =  20;
        int b20M = bottle / min * pOn20M;
        System.out.println("за 20 минут машина произвела бутылок " + b20M + " штук");

        int bottlesInDay = aloneInDay * bottle;
        System.out.println("За 1 день машина произвела бутылок " + bottlesInDay + " штук");

        byte week3 = 3;
        int aloneInWeek = week3 * aloneInDay * bIn1Min;
        System.out.println("За 3 дня машина произвела бутылок " + aloneInWeek + " штук");

        byte m = 30;
        long aloneInMonth = m * aloneInDay * bIn1Min;
        System.out.println("За 1 месяц машина произвела бутылок " + aloneInMonth + " штук");


    }
    }