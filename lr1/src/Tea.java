import java.util.Scanner;

public class Tea extends Product {
    String pack;

    public Tea(){
        super();
        System.out.println();
    }

    @Override
    public void create() {
    }

    public void read() {
        super();
        System.out.println(this.pack);
    }

    @Override
    public void update() {
        System.out.println("Введите тип упаковки: ");
        Scanner st = new Scanner(System.in);
        String pack = st.nextLine();
    }

    @Override
    public void delete() {
    }
}
