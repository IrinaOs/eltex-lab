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


    /*Динамический массив*/
    @Override
    public void update() {
        /*System.out.println("Введите кол-во товара: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название: ");
        String i = sc.nextLine();
        System.out.println("Введите стоимость товара: ");
        int i = sc.nextInt();
        System.out.println("Введите фирму производителя: ");
        String i = sc.nextLine();
        System.out.println("Введите страну производителя: ");
        String i = sc.nextLine();
        System.out.println("Введите кол-во товара");
        String i = sc.nextILine();
    }

    @Override
    public void delete() {

    }

    public UUID getUUID() {
            return ID;
        }


}