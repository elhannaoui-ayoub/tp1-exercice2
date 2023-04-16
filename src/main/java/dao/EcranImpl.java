package dao;


import org.springframework.stereotype.Repository;

@Repository("E")
public class EcranImpl implements VGA{
    @Override
    public void print(String message) {
        System.out.println("afichage utilisent l'ecran ");
        System.out.println(message);
    }
}
