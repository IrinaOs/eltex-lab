package eltex;

import java.util.Scanner;

public class Tea extends Product {
    String pack;

    public Tea(){
        super();
        System.out.println();
    }

    @Override
    public void create() {
        // необхоимо реализовать интерфейс
    }

    @Override
    public void read() {
        // реализовать (т.к. у тебя данный класс отличается от базового одним дополнительным полем (pack), то логика реализованного метода в базовом классе
        // будет нарушать логику отображения элементов текущего класса Tea
        // Поэтому необходимо добавить к выводу ещё одно поле
    }

    @Override
    public void update() {
        Scanner st = new Scanner(System.in);
        String pack = st.nextLine();
        // реализовать этот метод
        // не забудь также добавить проверки на ввод (то есть что вот считанное значение может быть преобразовано к int например
        // ну если не понятно то спросишь
    }

    @Override
    public void delete() {
        // реализовать
    }
}
