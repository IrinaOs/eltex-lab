import java.util.Scanner;

public interface ICrudAction {


    /**
     *  заполнение объекта случайными значениями и инкремент счётчика.
     */
    void create();


    /**
     * * вывод данных на экран.
     */
    void read();

    /**
     *  ввод данных с клавиатуры
     */
    void update();

    void delete();
}
