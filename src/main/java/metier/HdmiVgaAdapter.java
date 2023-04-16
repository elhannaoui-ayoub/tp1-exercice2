package metier;

import dao.HDMI;
import dao.VGA;

public class HdmiVgaAdapter implements VGA {

    private HDMI hdmi;
    @Override
    public void print(String message) {
        hdmi.print(message.getBytes());
    }
    public HdmiVgaAdapter(HDMI hdmi){
        this.hdmi = hdmi;
    }
}
