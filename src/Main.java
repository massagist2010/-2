public class Main {
    public static void main(String[] args) {;
        //восьмая задача:
        int masha = 67760;

        int dan = 83690;
        int kris = 76230;
        byte inYear = 12;
        double promotion = 0.1;

        double manyD = dan * promotion;
        double manyDan = dan + manyD;
        int nowD = dan * inYear;
        double newD = manyDan * inYear;
        double differ = newD - nowD;
        System.out.println("Денис теперь получает " + newD + " .годовой доход увеличен на " + differ);

        double maniK = kris * promotion;
        double manyKris = kris + maniK;
        int nowK = kris * inYear;
        double newK = manyKris * inYear;
        double diffK = newK - nowK;
        System.out.println("Кристина теперь получает " + newK + " .годовой доход увеличен на " + diffK);

        double maniM = masha * promotion;
        double manyMasha = masha + maniM;
        int nowM = masha * inYear;
        double newM = manyMasha * inYear;
        double difM = newM - nowM;
        System.out.println(" Маша теперь получает " + newM + " .годовой доход увеличен на " + difM);
    }
    }