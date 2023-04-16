package dao;


public class EcranImpl implements VGA{
    @Override
    public void print(String message) {
        System.out.println("afichage utilisent l'ecran ");
        System.out.println(message);
    }
}
