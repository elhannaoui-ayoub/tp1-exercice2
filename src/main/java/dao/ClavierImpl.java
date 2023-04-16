package dao;

import java.util.Scanner;

public class ClavierImpl implements USB {
    @Override
    public int read() {
        System.out.println("Lire apartir de la clavier");
        Scanner obj = new Scanner(System.in);
        return obj.nextInt();
    }
}
