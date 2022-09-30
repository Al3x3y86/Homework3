public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int bananasCount = 3;
        System.out.println("Значение переменной bananasCount с типом int ровно " + bananasCount);
        byte applesCount = 8;
        System.out.println("Значение переменной applesCount с типом byte ровно " + applesCount);
        short dogsCount = 5;
        System.out.println("Значение переменной dogsCount с типом short ровно " + dogsCount);
        Long carsCount = 2_200_000_000L;
        System.out.println("Значение переменной carsCount с типом long ровно " + carsCount);
        float pi = 3.14159265359F;
        System.out.println("Значение переменной pi с типом float ровно " + pi);
        double e = 2.71828;
        System.out.println("Значение переменной e с типом float ровно " + e);

        // Задача 2
        System.out.println("Задача 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupil = papersCount / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги ");

        // Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int performancePerMinutes = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + performancePerMinutes * twentyMinutes + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут машина произвела бутылок " + performancePerMinutes * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + performancePerMinutes * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок " + performancePerMinutes * minutesInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println(" В школе, где " + totalClasses + " классов, нужно "+ totalWhiteCans +" банок белой краски и "+ totalBrownCans +" банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int oneBananaWeight = 80;
        int totalWeightBananas = bananas * oneBananaWeight;
        int milk = 200;
        int hundredMillilitersMilk = 105;
        int totalWeightMilk = hundredMillilitersMilk * 2;
        int iceCream = 2;
        int oneIceCreamWeight = 100;
        int totalWeightIceCream = iceCream * oneIceCreamWeight;
        int eggs = 4;
        int oneEggWeight = 70;
        int totalWeightEggs = eggs * oneEggWeight;
        int totalWeightGr = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEggs;
        int grPerKg = 1000;
        float weightKg = totalWeightGr/(float)grPerKg;
        System.out.println("Вес такого завтрака составляет "+ totalWeightGr +  " грамм, или " + weightKg + " кг. ");

        // Задача 7
        System.out.println("Задача 7");
        int loseWeightKg = 7;
        int firstOptionGr = 250;
        int gramPerKg = 1000;
        float firstOptionKG = firstOptionGr /(float)gramPerKg;
        float firstLoseWeightDays = loseWeightKg /firstOptionKG;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то потребуется " + firstLoseWeightDays + " дней ");
        int secondOptionGr = 500;
        float secondOptionKG = secondOptionGr /(float)gramPerKg;
        float secondLoseWeightDays = loseWeightKg /secondOptionKG;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то потребуется " + secondLoseWeightDays + " дней ");
        int thirdOptionGr = 375;
        float thirdOptionKG = thirdOptionGr /(float)gramPerKg;
        float thirdLoseWeightDays = loseWeightKg /thirdOptionKG;
        System.out.println("В среднем потребуется " + thirdLoseWeightDays + " дней, чтобы добиться результата похудения.");

        // Задача 8
        System.out.println("Задача 8");
        int mashaPay = 67760;
        int denisPay = 83690;
        int kristinaPay = 76230;
        int monthsPerYear =12;
        int percent = 10;
        int mashaPayYear = mashaPay * monthsPerYear;
        int diffMashaPay = (mashaPay * percent) / 100 ;
        int newMashaPayMonth = mashaPay + diffMashaPay;
        int newMashaPayYear = newMashaPayMonth * monthsPerYear;
        int diffMashaPayYear = newMashaPayYear - mashaPayYear;
        System.out.println("Маша теперь получает " + newMashaPayMonth + " рублей. Годовой доход вырос на " + diffMashaPayYear + " рублей.");
        int denisPayYear = denisPay * monthsPerYear;
        int diffDenisPay = (denisPay * percent) / 100 ;
        int newDenisPayMonth = denisPay + diffDenisPay;
        int newDenisPayYear = newDenisPayMonth * monthsPerYear;
        int diffDenisPayYear = newDenisPayYear - denisPayYear;
        System.out.println("Денис теперь получает " + newDenisPayMonth + " рублей. Годовой доход вырос на " + diffDenisPayYear + " рублей.");
        int kristinaPayYear = kristinaPay * monthsPerYear;
        int diffKristinaPay = (kristinaPay * percent) / 100 ;
        int newKristinaPayMonth = kristinaPay + diffKristinaPay;
        int newKristinaPayYear = newKristinaPayMonth * monthsPerYear;
        int diffKristinaPayYear = newKristinaPayYear - kristinaPayYear;
        System.out.println("Кристина теперь получает " + newKristinaPayMonth + " рублей. Годовой доход вырос на " + diffKristinaPayYear + " рублей.");




    }
}