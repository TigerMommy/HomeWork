package Lesson04;

public class StudentTest {
    public static void main(String[] args) {

            Student Sasha = new Student();
            Student Misha = new Student();
            Student Jora = new Student();

            Sasha.id =10;
            Sasha.name ="Aleksandr";
            Sasha.surname ="Popov";
            Sasha.year =2006;
            Sasha.MidMath =4;
            Sasha.MidEcon =4;
            Sasha.MidEng =3;

            Misha.id =12;
            Misha.name ="Mihail";
            Misha.surname ="Petrov";
            Misha.year =2003;
            Misha.MidMath =3;
            Misha.MidEcon =3;
            Misha.MidEng =4;

            Jora.id =14;
            Jora.name ="Egor";
            Jora.surname ="Ivanov";
            Jora.year =2001;
            Jora.MidMath =5;
            Jora.MidEcon =5;
            Jora.MidEng =4;


             System.out.println("Средняя арифметическая оценка" + " " + Sasha.name + Sasha.surname + "=" + (Sasha.MidMath + Sasha.MidEcon + Sasha.MidEng) / 3);
            System.out.println("Средняя арифметическая оценка" + " " + Misha.name + Misha.surname + "=" + (Misha.MidMath + Misha.MidEcon + Misha.MidEng) / 3);
             System.out.println("Средняя арифметическая оценка" + " " + Jora.name + Jora.surname + "=" + (Jora.MidMath + Jora.MidEcon + Jora.MidEng) / 3);

        }
    }




