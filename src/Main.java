public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//Задание 1
byte a = 120;
short b = 32000;
int c = 100000;
long d = 100L;
float e = 1.5f;
double g = 30.7;
System.out.println("Значение переменной а = " + a + " с типом байт");

 //Задание 2
float y = 27.12f;
long h = 987678965549L;
double k = 2.786;
boolean v = false;
short q = 569;
short r = -159;
int n = 27897;
char p = 67;

//Задание 3

byte lP = 23;
byte aS = 27;
byte eA = 30;
int paper = 480/(lP+aS+eA);
System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

// Задание 4
short min = 16 / 2 * 20;
int day = 16 / 2 * (24 * 60);
int threeDays = 16 / 2 * (24 * 3 * 60);
int month = 16 / 2 * (24 * 30 * 60);
System.out.println("За 20 минут работы, машина произвела бутылок в количестве " + min + " шт!");
System.out.println("За 1 день работы, машина произвела бутылок в количестве " + day + " шт!");
System.out.println("За 3 дня работы, машина произвела бутылок в количестве " + threeDays + " шт!");
System.out.println("За 1 месяц работы, машина произвела бутылок в количестве " + month + " шт!");

//Задание 5
byte whiteColor = 2;
byte brownColor = 4;
int colorOneClass = whiteColor + brownColor;
int repair = 120 / colorOneClass;
int repairBrown = repair * brownColor;
int repairWhite = repair * whiteColor;
System.out.println("В школе, где " + repair + " классов, нужно " + repairWhite + " белой краски и " + repairBrown + " коричневой краски!");

//Задание 6
short weightBananas = 5 * 80;
short weightMilk = 2* 105;
short weightIceCream = 2 * 100;
short weightEgg = 4 * 70;
int wholeWight = weightBananas + weightMilk + weightIceCream + weightEgg;
System.out.println("Общий вес завтрака составляет " + wholeWight + " грамм");
float wightKg = wholeWight / 1000f;
System.out.println("Общий вес завтрака составляет " + wightKg + " кг");

//Задание 7
float mass1 = 7 / 0.25f;
float mass2 = 7 / 0.5f;
float average = (mass1 + mass2) / 2;
System.out.println( "Если спортсмен будет худеть по 250 грамм ежедневно, то чтобы приготовиться к соревнованиям у него уйдет " + mass1 + " дней ,а если по 500 грамм то " + mass2 +  " дней  ,в среднем, он подготовиться к соревнованиям за " + average + " день");

//Задание 8
float Masha = 67760 * 0.1f + 67760;
float Denis = 83690 * 0.1f + 83690;
float Christina = 76230 * 0.1f + 76230;

int OldYearM = 67760 * 12;
int OldYearD = 83690 * 12;
int OldYearC = 76230 * 12;

float NewYearM = Masha * 12;
float NewYearD = Denis * 12;
float NewYearC = Christina * 12;

float oddsM = NewYearM - OldYearM;
float oddsD = NewYearD - OldYearD;
float oddsC = NewYearC - OldYearC;
System.out.println("Маша теперь получает " + Masha + " рублей в месяц, годовой доход вырос на " + oddsM + " рублей." );
System.out.println("Денис теперь получает " + Denis + " рублей в месяц, годовой доход вырос на " + oddsD + " рублей." );
System.out.println("Кристина теперь получает " + Christina + " рублей в месяц, годовой доход вырос на " + oddsC + " рублей." );










    }
    }