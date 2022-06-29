package Lesson6;

public class MethodOverloading {
    void bob(int i1) {// метод "void" ничего не возвращает;
        System.out.println(i1);
    }
}
 class MethodOverloadingTest{
     public static void main(String[] args) {
         MethodOverloading Do = new MethodOverloading();
         int i1 = 100;
         System.out.println(i1);
     }

 }

