package dao;

import org.springframework.stereotype.Repository;

@Repository("v")
public class VideoImpl implements VGA{
    @Override
    public void print(String message) {
        System.out.println("On utilise Video");
        System.out.println(message);
    }
}
