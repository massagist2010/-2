public class Main {
    public static void main(String[] args) {;
        //седьмая задача:
        byte lose = 7;
        short weight = 1000;
        int loseWeight = lose * weight;

        short gr = 250;
        int totalDay250 = loseWeight / gr;
        System.out.println("всего дней, если спортсмен теряет 250гр.в день, " +totalDay250);

        short gr2 = 500;
        int totalDay500 = loseWeight / gr2;
        System.out.println("дней, если спортсмен теряет 500гр. в день, " +totalDay500);


        byte day01 = 28;
        byte day02 = 14;
        int daysWeight = day02 + day01;
        int daysOnAverage = daysWeight / lose;
        System.out.println("дней в среднем на похудение " +daysOnAverage);
    }
    }