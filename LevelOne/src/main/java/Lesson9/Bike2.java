package Lesson9;

public class Bike2 {
    public static void main(String[] args) {

        Bike Naked = new Bike();
        Naked.show_Bike("Серый", "Двухцилиндровый", "Нейкд", 100);
        Naked.changeBike("Белый", "Восемьсот-кубовый", "Спорт", 120);
        Bike Turist = new Bike();
        Turist.changeBike("Красный", "Литровый", "Турист", 115.5);
        Bike sport_Turist = new Bike();
        sport_Turist.changeBike("Фиолетовый", "Двух-литровый", "Спортивно-Туристический", 180.5);
        Bike Croise = new Bike();
        Croise.changeBike("Черный", "Два с половиной литра", "Круизер", 120.5);
        Bike Chopper = new Bike();
        Chopper.changeBike("Синий", "Литровый", "Чоппер", 100);
        Bike Classic = new Bike();
        Classic.changeBike("Металлик", "Двух-Литровый", "Классический", 120.5);
        Bike Triple = new Bike();
        Triple.changeBike("Черный", "Восемьсот-кубовый", "Тройка(с коляской)", 90);
        Bike Cross = new Bike();
        Cross.changeBike("Желтый", "Литровый", "Кроссовый", 120.5);

        Turist=null;
        sport_Turist=null;
        Croise=null;
        Chopper=null;
        Classic=null;
        Triple=null;

    }
}
