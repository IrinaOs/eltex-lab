import java.util.Scanner;

public class Coffee extends Product {
    String beans;

   public Coffee() {
        super();
        System.out.println("");
   }

   /* public Coffee () {
        this ();
        System.out.println(message);
    }*/

    @Override
    public void create() {

    }

    @Override
    public void read() {
        super();
        System.out.println(this.beans);
    }

    @Override
    public void update() {
        System.out.println("Введите вид зёрен: ");
        Scanner st = new Scanner(System.in);
        String beans = st.nextLine();
    }

    @Override
    public void delete() {

    }
}
