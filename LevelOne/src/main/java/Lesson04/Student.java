package Lesson04;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double midMath;
    double midEcon;
    double midEng;

    @Override
    public String toString() {
        return "Средняя арифметическая оценка" + " " + name + " " + surname + "=" + (midMath + midEcon + midEng) / 3;
    }

    public double getMiddle() {
        return (midMath + midEcon + midEng) / 3;
    }
}
// сноска mid - middle указывает на среднее значение определнного предмета(математика,экономика и английский);






