package metier;

import dao.USB;
import dao.VGA;

public class UniteCentraleImpl implements UniteCentrale {

    private VGA vga;
    private USB usb;//couplge faible
    public UniteCentraleImpl() {

    }
    public UniteCentraleImpl(VGA vga) {
        this.vga = vga;
    }

    public void setDao(VGA vga) {
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
