package eltex;

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
        // реализовать
    }

    @Override
    public void read() {
        super();
        System.out.println(this.beans);
        // реализовать
    }

    @Override
    public void update() {
        Scanner st = new Scanner(System.in);
        String beans = st.nextLine();
        // реализовать
    }

    @Override
    public void delete() {
        // реализовать
    }
}
