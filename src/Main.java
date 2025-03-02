//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        } int citizenry = 45000;
        System.out.println("Значение переменной" + " citizenry" + " с типом int равно " + citizenry);
        byte apples = 15;
        System.out.println("Значение переменной" + " apples" + " с типом byte равно " + apples);
        short cars = 20000;
        System.out.println("Значение переменной" + " cars" + " с типом short равно " + cars);
        long income = 700085600;
        System.out.println("Значение переменной" + " income" + " с типом long равно " + income);
        float percentage = 1.5f;
        System.out.println("Значение переменной" + " percentage" + " с типом float равно " + percentage);
        double details = 7.93287711;
        System.out.println("Значение переменной" + " details" + " с типом double равно " + details);
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
byte pupils1 = 23;
byte pupils2 = 27;
byte pupils3 = 30;
short paper = 480;
long allPupils = pupils1 + pupils2 + pupils3;
long paperForEveryPupil = paper / allPupils;
System.out.println("На каждого ученика рассчитано " + paperForEveryPupil + " листов бумаги");
byte efficiency = 16 / 2;
long efficiencyIn20Min = efficiency * 20;
System.out.println("За 20 минут машина произвела " + efficiencyIn20Min + " штук бутылок");
short Day = 24 * 60;
long efficiencyDay = Day * 8;
System.out.println("За сутки машина произвела " + efficiencyDay + " штук бутылок");
short threeDays = 3 * 24 * 60;
long efficiencyThreeDays = threeDays * 8;
System.out.println("За три дня машина произвела " + efficiencyThreeDays + " штук бутылок");
long Month = 30 * 60 * 60;
long efficiencyMonth = Month * 8;
System.out.println("За сутки машина произвела " + efficiencyMonth + " штук бутылок");
byte allCansOfPaint = 120;
byte white = 2;
byte brown = 4;
long forOneClassroom = white + brown;
long numberOfClassrooms = allCansOfPaint / forOneClassroom;
long whiteAll = numberOfClassrooms * white;
long brownAll = numberOfClassrooms * brown;
System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски");
short bananas = 80 * 5;
short milk = 105 * 2;
short iceCream = 100 * 2;
short eggs = 70 * 4;
long breakfast = bananas + milk + iceCream + eggs;
System.out.println(breakfast);
float breakfastKg = breakfast / 1000f;
System.out.println(breakfastKg);
short resultGm = 7 * 1000;
long amountOfDays1 = resultGm / 250;
System.out.println(amountOfDays1);
long amountOfDays2 = resultGm / 500;
System.out.println(amountOfDays2);
long averageAmountOfDays = (amountOfDays1 + amountOfDays2) / 2;
System.out.println(averageAmountOfDays);
long mashaSalary = 67760 + (67760 / 100 * 10);
long mashaSalaryLastYear = 67760 * 12;
long mashaSalaryThisYear = mashaSalary * 12;
long mashaDifference = mashaSalaryThisYear - mashaSalaryLastYear;
System.out.println("Маша теперь получает " + mashaSalary + " рублей." + " Годовой доход вырос на " + mashaDifference + " рублей.");
long denisSalary = 83690 + (83690 / 100 * 10);
long denisSalaryLastYear = 83690 * 12;
long denisSalaryThisYear = denisSalary * 12;
long denisDifference = denisSalaryThisYear - denisSalaryLastYear;
System.out.println("Денис теперь получает " + denisSalary + " рублей." + " Годовой доход вырос на " + denisDifference + " рублей.");
long christinaSalary = 76230 + (76230 / 100 * 10);
long christinaSalaryLastYear = 76230 * 12;
long christinaSalaryThisYear = christinaSalary * 12;
long christinaDifference = christinaSalaryThisYear - christinaSalaryLastYear;
System.out.println("Кристина теперь получает " + christinaSalary + " рублей." + " Годовой доход вырос на " + christinaDifference + " рублей.");









    }
}