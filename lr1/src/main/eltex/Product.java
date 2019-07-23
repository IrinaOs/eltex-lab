package eltex;

import java.util.Scanner;
import java.util.UUID;

public abstract class Product implements ICrudAction {

    static int count = 0;
    private UUID ID;
    String name;
    int number;

    Product() {
        ID = UUID.randomUUID();
        count++;
    }

    @Override
    public void read() {
        System.out.println(ID);
        System.out.println(count);
        System.out.println(name);
        System.out.println(number);
    }

    @Override
    public void update() {
        System.out.println("Введите кол-во товара");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }

    public UUID getUUID() {
            return ID;
        }
}