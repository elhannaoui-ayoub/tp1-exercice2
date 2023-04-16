package presentation;

import dao.ClavierImpl;
import dao.EcranImpl;

import dao.TvImpl;
import dao.VideoImpl;
import metier.HdmiVgaAdapter;
import metier.UniteCentraleImpl;

public class main {
    //IMetier metier;
    public static  void main(String[] args){

        EcranImpl dao = new EcranImpl();
        VideoImpl dao2 = new VideoImpl();
        // instanciation dynamique
        UniteCentraleImpl metier = new UniteCentraleImpl(); //Instanciation statique
        metier.setDao(dao2); // injection des dépendances
        metier.printData("hola");

        ClavierImpl dao3 = new ClavierImpl();
        // instanciation dynamique
        metier.setDaoUsb(dao3); // injection des dépendances
        System.out.println(metier.readData());

        TvImpl dao4 = new TvImpl();
        HdmiVgaAdapter hdmivga = new HdmiVgaAdapter(dao4);
        // instanciation dynamique
        metier.setDao(hdmivga); // injection des dépendances
        metier.printData("afichage utilisent adapter");

    }
}
