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

    @Override
    public void update() {
        Scanner st = new Scanner(System.in);
        String pack = st.nextLine();
    }

    @Override
    public void delete() {

    }
}
