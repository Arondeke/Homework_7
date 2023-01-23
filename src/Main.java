public class Main {
    public static void main(String[] args) {
        System.out.println();
        task1();
        System.out.println();
        task2();
        System.out.println();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int vklad = 15000;
        int total = 0;
        int month = 1;

        while (total < 2_459_000) {
            total = total + vklad;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month = month + 1;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        int g = 10;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; g > 0; g--) {
            System.out.print(g + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        double populationY = 12_000_000;
        int borning = 17;
        int diying = 8;

        for (int year = 1; year <= 10; year++) {
            populationY = populationY + populationY / 1000 * borning - populationY / 1000 * diying;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int vklad = 15000;
        int month = 1;

        while (vklad < 12_000_000) {
            vklad = vklad + vklad / 100 * 7;
            System.out.println(month + " месяц, сумма " + vklad);
            month = month + 1;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int vklad = 15000;
        int month = 1;

        while (vklad < 12_000_000) {
            vklad = vklad + vklad / 100 * 7;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, сумма " + vklad);
            }
            month = month + 1;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int vklad = 15000;
        int month = 1;

        while (month <= 108) {
            vklad = vklad + vklad / 100 * 7;
            if (month % 6 == 0) {
                System.out.println(month + " месяц, сумма " + vklad);
            }
            month = month + 1;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 6;

        while (friday + 7 <= 31) {
            friday = friday + 7;
            System.out.println("Сегодня пятница, " + friday + "е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int forNewCommit = 0; //для нового коммита
        int yearCommet = 0;
        int yearNow = 2023;

        while (yearCommet <= (yearNow + 100)) {
            if (yearCommet >= yearNow - 200) {
                System.out.println(yearCommet);
            }
            yearCommet = yearCommet + 79;
        }
    }
}







