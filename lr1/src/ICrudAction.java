import java.util.Scanner;

public interface ICrudAction {

    void create(); //заполнение объекта случайными значениями и инкремент счётчика.
    void read(); //вывод данных на экран
    void update(); //ввод данных с клавиатуры
    void delete(); // удаление базы
}
