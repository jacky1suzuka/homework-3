public class Main {
    public static void main(String[] args) {

        // Задание 1
        int varOne = 32;
        System.out.println(varOne);
        byte varTwo = 101;
        System.out.println(varTwo);
        short varThree = 19999;
        System.out.println(varThree);
        long varFour = 2131232133123123123L;
        System.out.println(varFour);
        float varFive = 0.123f;
        System.out.println(varFive);
        double varSix = 0.321312;
        System.out.println(varSix);

        // Задание 2
        float varOneOne = 27.12f;
        long varTwoTwo = 987678965549L;
        double varThreeThree = 2.786;
        boolean varFourFour = false;
        byte varFiveFive = 67;
        short varSixSix = -159;
        int varSevenSeven = 27897;
        char varEightEight = 569;

        // Задание 3
        short firstClass = 23;
        short secondClass = 27;
        short thirdClass = 30;
        short sumStudents = (short) (firstClass + secondClass + thirdClass);
        short papers = 480;
        short papersPerStudent = (short) (papers / sumStudents);
        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги.");

        // Задание 4
        short bottlesPerMinute = 16 / 2;
        short bottlesPerTwentyMinutes = (short) (bottlesPerMinute * 20);
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " бутылок.");
        short bottlesPerDay = (short) (bottlesPerMinute * 60 * 24);
        System.out.println("За 1 день машина произвела " + bottlesPerDay + " бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " бутылок.");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " бутылок.");

        // Задание 5
        byte totalPaints = 120;
        byte whitePaintsPerCabinet = 2;
        byte brownPaintsPerCabinet = 4;
        byte totalCabinets = (byte) (totalPaints / (whitePaintsPerCabinet + brownPaintsPerCabinet));
        byte totalWhitePaints = (byte) (totalCabinets * whitePaintsPerCabinet);
        byte totalBrownPaints = (byte) (totalCabinets * brownPaintsPerCabinet);
        System.out.println("В школе, где " + totalCabinets + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " банок коричневой краски.");

        // Задание 6
        short weightBananas = 5 * 80;
        short weightMilk = 2 * 105;
        short weightIceCream = 2 * 100;
        short weightEggs = 4 * 70;
        float totalWeight = weightBananas + weightMilk + weightIceCream + weightEggs;
        float totalWeightKg = totalWeight / 1000;
        System.out.println("Вес завтрака равен " + totalWeightKg + " кг.");

        // Задание 7
        float weight = 7f;
        float twoHundredFiftyPerDay = (float) (weight / 0.25);
        System.out.println("Спортсмен похудеет на 7 кг за " + twoHundredFiftyPerDay + " дней, если будет терять по 250 грамм в день.");
        float fiveHundredPerDay = (float) (weight / 0.5);
        System.out.println("Спортсмен похудеет на 7 кг за " + fiveHundredPerDay + " дней, если будет терять по 500 грамм в день.");
        float avgDays = (twoHundredFiftyPerDay + fiveHundredPerDay) / 2;
        System.out.println("В среднем спортсмену потребуется " + avgDays + " день, чтобы похудеть на 7 кг.");

        // Задание 8
        float mashaSalary = 67760f;
        float denisSalary = 83690f;
        float kristinaSalary = 76230f;
        float raiseCoef = 1.1f;
        float mashaNewSalary = mashaSalary * raiseCoef;
        float mashaDiff = (mashaNewSalary * 12) - (mashaSalary * 12);
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDiff + " рублей.");
        float denisNewSalary = denisSalary * raiseCoef;
        float denisDiff = (denisNewSalary * 12) - (denisSalary * 12);
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDiff + " рублей.");
        float kristinaNewSalary = kristinaSalary * raiseCoef;
        float kristinaDiff = (kristinaNewSalary * 12) - (kristinaSalary);
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDiff + " рублей.");

    }
}