public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание. Переменные. Часть 2!");

        //Задача 1
        System.out.println("задача 1");
        int machineWeight = 3;
        System.out.println("Значение переменной 'machineWeight' с типом int равно " +machineWeight );
        byte meatWeight = 6;
        System.out.println("Значение переменной 'meatWeight' с типом byte равно " + meatWeight);
        short amountMoney = 3156;
        System.out.println("Значение переменной 'amountMoney' с типом scort равно " + amountMoney );
        long kilometerstotal = 3_156_000_000L;
        System.out.println("Значение переменной 'kilometersTotal' с типом scort равно " + kilometerstotal);
        float d = -3.00000004f;
        System.out.println("Значение переменной 'd' с типом float равно " +d );
        double e = 1.00000000000000017;
        System.out.println("Значение переменной 'e' с типом double равно " +e );

        //Задача 2
        System.out.println("задача 2");
        float d1 = 27.12f;
        long f1 = 987_678_965_549L;
        double e1 = 2.786;
        boolean g1 = false;
        char h1 = 569;
        short c1 = 27897;
        byte b1 = 67;

        //Задача 3
        System.out.println("задача 3");
        byte lюдмилыПавловны = 23;
        byte aнныСергеевны = 27;
        byte eкатериныАндреевны = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " +paper/(lюдмилыПавловны+aнныСергеевны+eкатериныАндреевны) +" листов бумаги.");

        //Задача 4
        System.out.println("задача 4");

        byte b2 = 16;
        byte b3 = 2;
        byte b4 = 20;
        byte b5 = 1;
        byte b6 = 3;
        int a1 = 24*60;
        int a2 = 3*a1;
        int a3 = 30*a1;
        System.out.println("За " + b4 + " мин. машины произвела бутылок " + b4/b3*b2+  " штук.");
        System.out.println("За " + b5 + " сут. машины произвела бутылок " + a1/b3*b2+  " штук.");
        System.out.println("За " + b6 + " сут. машины произвела бутылок " + a2/b3*b2+  " штук.");
        System.out.println("За " + b5 + " мес. машины произвела бутылок " + a3/b3*b2+  " штук.");

        //Задание 5
        System.out.println("задача 5");

        byte b7 = 120;
        byte b8 = 2;
        byte b9 = 4;
        int a4 = b7/(b8+b9);
        int a5 = a4*2;
        int a6 = a4*4;
        System.out.println("В школе, где " + a4 + " классов, нужно" + a5 + " банок белой краски и " + a6 + " банок коричневой краски.");

        //Задание 6
        System.out.println("задача 6");
        byte banana=5;
        byte weight1Banana=80;
        int milk=200;
        byte weight100MlMilk=105;
        byte iceCream=2;
        byte weight2IceCreamBars=100;
        byte egg=4;
        byte weight1Egg=70;
        int breakfast=(banana*weight1Banana)+(milk/100*weight100MlMilk)+(iceCream*weight2IceCreamBars)+(egg*weight1Egg);
        int breakfast2=(breakfast/1000);
        System.out.println("вес такого спорт-завтрака "+breakfast+ " грамм");
        System.out.println("вес такого спорт-завтрака "+breakfast2+ " килограмм");

        //Задание 7
        System.out.println("задача 7");
        byte loseWeightrKg=7;
        int reset1WayGr=250;
        float reset1WayKg=reset1WayGr/1000f;
        int reset2WayGr=500;
        float reset2WayKg=reset2WayGr/1000f;
        float total1 = loseWeightrKg/reset1WayKg;
        float total2 = loseWeightrKg/reset2WayKg;
        System.out.println(+total1+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        System.out.println(+total2+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        float totalMean=(total1+total2)/2;
        System.out.println("может потребоваться " +totalMean+ " дней в среднем, чтобы добиться результата похудения.");





    }
}