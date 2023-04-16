package dao;

import java.util.Base64;

public class TvImpl implements HDMI {
    @Override
    public void print(byte[] data) {
        System.out.println("Afichage utilisons HDMI");
        String s = new String(data);
        System.out.println(s);

    }
}
