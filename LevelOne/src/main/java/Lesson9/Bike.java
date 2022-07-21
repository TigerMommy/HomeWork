package Lesson9;

public class Bike {
    String Color  ;
    String Engine;
    String Style;
    double Speed;

    void show_Bike(String Color, String Engine, String Style, double Speed) {
        System.out.println("Цвет мотоцикла:" + " " + Color + " " + "Тип Двигателя:" + " " + Engine +" "+ "Тип мотоцикла:" + " " + Style + " " + "Скорость мотоцикла:" + " " + Speed);
    }
    public void changeBike(String Color2, String Engine2, String Style2, double Speed2) {
        this.Color = Color2;
        this.Engine = Engine2;
        this.Style = Style2;
        this.Speed = Speed2;

        System.out.println("Цвет мотоцикла изменился:" + " " + Color2 + " " + "Тип Двигателя поменялся:" + " " + Engine2+" " + "Тип мотоцикла изменился:" + " " + Style2 + " " + "Скорость мотоцикла поменялась:" + " " + Speed2);
    }
}
