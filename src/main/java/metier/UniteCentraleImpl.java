package metier;

import dao.USB;
import dao.VGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UniteCentraleImpl implements UniteCentrale {
    @Autowired
    @Qualifier("E")
    private VGA vga;
    private USB usb;//couplge faible
    public UniteCentraleImpl() {

    }
    public UniteCentraleImpl(VGA vga) {
        this.vga = vga;
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
    public void setDaoUsb(USB usb) {
        this.usb = usb;
    }
    @Override
    public int readData() {
        return this.usb.read();
    }

    @Override
    public void printData(String data) {
        this.vga.print(data);
    }
}
