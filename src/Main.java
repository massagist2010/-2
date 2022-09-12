public class Main {
    public static void main(String[] args) {;
        //шестая задача:
      byte banana = 5;
      byte oneBanana = 80;
      int weightBananas = banana * oneBanana;
      int milk = 200;
      byte milk1 = 100;
      byte milk2 = 105;
      long weightMilk = milk / milk1 * milk2;
      byte ice = 2;
      byte oneIce = 100;
      int twoIce = ice * oneIce;
      byte eggs = 4;
      byte oneEgg = 70;
      int eggs4 = eggs * oneEgg;

      long aloneGrams = eggs4 + twoIce + weightMilk + weightBananas;
        System.out.println(aloneGrams);
      short kg = 1000;

      double theWeightKg = aloneGrams / kg;
        System.out.println("вес в кг. будет " + theWeightKg);
    }
    }