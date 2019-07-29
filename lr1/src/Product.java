import java.util.Scanner;
import java.util.UUID;

public abstract class Product implements ICrudAction {

    static int count = 0;
    private UUID ID;
    String name;
    int price;
   // int number;
    String firm;
    String country;

    Product() {
        ID = UUID.randomUUID();
        count++;
    }

    @Override
    public void create() {

    }

    @Override
    public void read() {
        System.out.println(ID);
        System.out.println(count);
        System.out.println(name);
        //System.out.println(number);
        System.out.println(firm);
        System.out.println(country);
    }

    @Override
    public void update() {
        /*System.out.println("Введите кол-во товара: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();*/
        System.out.println("Введите название: ");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextInt();
        System.out.println("Введите стоимость товара: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Введите фирму производителя: ");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextInt();
        System.out.println("Введите страну производителя: ");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextInt();
        System.out.println("Введите кол-во товара");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextInt();
    }

    @Override
    public void delete() {

    }

    public UUID getUUID() {
            return ID;
        }


}