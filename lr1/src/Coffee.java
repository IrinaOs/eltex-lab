import java.util.Scanner;

public class Coffee extends Product {
    String beans;

   public Coffee() {
        super();
        System.out.println("");
   }

  /* public Coffee () {
        this ();
   }*/

    @Override
    public void create() {

    }

    @Override
    public void update() {
        Scanner st = new Scanner(System.in);
        String beans = st.nextLine();
    }

    @Override
    public void delete() {

    }
}
