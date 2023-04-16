package dao;

import java.util.Scanner;

public class SourisImpl implements USB{
    @Override
    public int read() {
        System.out.println("Lire apartir de la souris");
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }
}
