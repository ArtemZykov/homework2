public class Main {
    public static void main(String[] args) {

        System.out.println( "     Задача №1 ");
        int a = 400000;
        System.out.println(a);
        byte b = 10;
        System.out.println(b);
        short c = 5000;
        System.out.println(c);
        long d = 10L;
        System.out.println(d);
        float e = 7.12f;
        System.out.println(e);
        double f = 10.00007d;
        System.out.println(f);

        System.out.println( "     Задача №2 ");
        float q = 27.12f;
        System.out.println(q);
        long w = 987678965549L;
        System.out.println(w);
        float r = 2.786f;
        System.out.println(r);
        short t = 569;
        System.out.println(t);
        short y = -159;
        System.out.println(y);
        short u = 27897;
        System.out.println(u);
        byte i = 67;
        System.out.println(i);

        System.out.println("      задача №3 ");
        byte ticherOne = 23;
        byte ticherTwo = 27;
        byte ticherThree = 30;
        int allStudent = ticherOne + ticherTwo + ticherThree;
        System.out.println(" всего учеников " + allStudent);
        short papers = 480;
        float papersStudent =  papers / allStudent;
        System.out.println(" всего на каждого студента листов бумаги составит " + papersStudent + " шт ");

        System.out.println("      Задача №4  ");
        short allBotleInTwoMinits = 16;
        short oneMinit = 60;
        int sekondTwoMinits = oneMinit * 2;
        System.out.println(" секунд в 2-ух минутах " + sekondTwoMinits + " сек ");
        int oneBotleSekond = sekondTwoMinits / allBotleInTwoMinits;
        System.out.println(" одна бутылка изготавливается за " + oneBotleSekond + " сек ");
        System.out.println( " сколько бутылок изготовится за 20 минут ");
        short twentyMinitsSekonds = 20 * 60;
        System.out.println( "в 20 минутах всего " + twentyMinitsSekonds + " сек ");
        int twentyMinitsBotls = twentyMinitsSekonds / oneBotleSekond;
        System.out.println( " за двадцать минут машина изготовит " + twentyMinitsBotls + " шт бутылок ");
        int botlsOneHour = 171 * 3;
        System.out.println( " производится бутылок в один час " + botlsOneHour + " шт ");
        int dayHour = 24;
        int dayHourBotls = dayHour * botlsOneHour;
        System.out.println( " за сутки машина изготавливает " + dayHourBotls + " шт бутылок ");
        int treeDayHours = dayHour * 3;
        System.out.println( " в трех днях всего " + treeDayHours + " часа ");
        float botlsTreeDay = treeDayHours * botlsOneHour;
        System.out.println( " за три дня машина изготовит " + botlsTreeDay + " шт бутылок ");
        int oneMonthDay = 31;
        float hourInMonth = oneMonthDay * dayHour;
        System.out.println( " все часов в 1 месяце составляет " + hourInMonth + " ЧАСА ");
        float oneMonthBotls = hourInMonth * botlsOneHour;
        System.out.println( " за месяц машина изготовит " + oneMonthBotls + " шт бутылок ");

        System.out.println( "         Задача №5  ");
        byte repairAllScoolCansPaint = 120;
        System.out.println(" закуплено краски для ремонта школы " + repairAllScoolCansPaint + " банок " );
        byte repairOneClassCansPaintWhite = 2;
        byte reparOneClassCansPaintBroun = 4;
        int forRepairOneClass = reparOneClassCansPaintBroun + repairOneClassCansPaintWhite;
        System.out.println( " для ремонта одного класса нужно " + repairOneClassCansPaintWhite + " банки белой краски и " + reparOneClassCansPaintBroun + "  банки коричневой краски ");
        System.out.println( " всего краски для ремонта одного класса необходимо  " + forRepairOneClass + " банок ");
        int quantityClass = repairAllScoolCansPaint / forRepairOneClass;
        System.out.println( " всего в школе " + quantityClass + " классов  ");
        int allWhitePaint = quantityClass * repairOneClassCansPaintWhite;
        int allBrounPaint = quantityClass * reparOneClassCansPaintBroun;
        System.out.println( " В школе, где " + quantityClass + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrounPaint + " банок коричневой краски ");

        System.out.println( "         Задачана №6 ");
        short oneBananas = 80;
        short onePorsioMilk = 105;
        short oneIceCrime = 100;
        short oneEgg = 70;
        int breakfast = (oneBananas * 5) + (onePorsioMilk * 2) + (oneIceCrime * 2) + ( oneEgg * 4);
        System.out.println( " на завтрак спортсмен съест " + breakfast + " грамм продуктов ");
        float breakfastKg = breakfast / 1000f;
        System.out.println( " на завтрак спортсмен съест " + breakfastKg + " кг продуктов");

        System.out.println( "          Задача №7");
        byte loseWeightKg = 7;
        short weightLossGramm1 = 250;
        short weightLossGramm2 = 500;
        int loseWeightGramm = loseWeightKg * 1000;
        int dayGramm1 = loseWeightGramm / weightLossGramm1;
        int dayGramm2 = loseWeightGramm / weightLossGramm2;
        System.out.println( " для похудения на 7 килограмм при потере в весе на 250 грамм спортсмену понадобится " + dayGramm1 + " дней, " + " а при потере в весе на 500 грамм в день понадобится " + dayGramm2 + " дней ");

        System.out.println( "          Задача №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKris = 76230;
        int salaryMashaold = salaryMasha * 12;
        System.out.println( " старая зарплата в год у Маши составляла " + salaryMashaold + " руб ");
        float differenceMonthMasha = (salaryMasha * 10) / 100f;
        System.out.println(" увеличение зарплаты Маши увеличится на " + differenceMonthMasha + " руб ");
        float salaryMashaNew = salaryMasha + differenceMonthMasha;
        System.out.println( " зарплата Маши после повышения составит " + salaryMashaNew + " рублей ");
        float salaryMashaNewYear = salaryMashaNew * 12f;
        System.out.println( " новая зарлпата Маши в год составит " + salaryMashaNewYear + " рублей ");
        float increaseSalaryMasha = salaryMashaNewYear - salaryMashaold;
        System.out.println( " увеличение зарплаты в год у Маши состваляет на " + increaseSalaryMasha + " рублей ");
        System.out.println( " Маша теперь получает " + salaryMashaNew + " Годовой доход Маши составляет " + salaryMashaNewYear + " рублей ");

        float differenceMonthDenis = (salaryDenis * 10) / 100f;
        System.out.println(" увеличение зарплаты Дениса составит на " + differenceMonthDenis + " руб ");
        int salaryDenisOld = salaryDenis * 12;
        System.out.println( " старая зарплата в год у Дениса составляла " + salaryDenisOld + " руб ");
        float salaryDenisNew = salaryDenis + differenceMonthDenis;
        System.out.println( " зарплата Денис после повышения составит " + salaryDenisNew + " рублей ");
        float salaryDenisNewYear = salaryDenisNew * 12f;
        System.out.println( " новая зарлпата Дениса в год составит " + salaryDenisNewYear + " рублей ");
        float increaseSalaryDenis = salaryDenisNewYear - salaryDenisOld;
        System.out.println( " увеличение зарплаты в год у Дениса состваляет на " + increaseSalaryMasha + " рублей ");
        System.out.println( " Денис теперь получает " + salaryDenisNew + " рублей " + " Годовой доход Дениса составляет " + salaryDenisNewYear + " рублей ");

        float differenceMonthKris = (salaryKris * 10) / 100f;
        System.out.println(" увеличение зарплаты Кристины составит на " + differenceMonthKris + " руб ");
        int salaryKrisOld = salaryKris * 12;
        System.out.println( " старая зарплата в год у Кристины составляла " + salaryKrisOld + " руб ");
        float salaryKrisNew = salaryKris + differenceMonthKris;
        float salaryKrisNewYear = salaryKrisNew * 12f;
        System.out.println( " зарплата Кристины после повышения составит " + salaryKrisNew + " рублей ");
        System.out.println( " зарлпата Кристины после повышенния в год составит " + salaryKrisNewYear + " рублей " + " ");
        System.out.println( " Кристина теперь получает " + salaryKrisNew + " рублей " + " Годовой доход Кристины состваляет " + salaryKrisNewYear + " рублей ");
    }
}