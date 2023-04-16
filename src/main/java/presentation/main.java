package presentation;

import dao.ClavierImpl;
import dao.EcranImpl;

import dao.TvImpl;
import dao.VideoImpl;
import metier.HdmiVgaAdapter;
import metier.UniteCentraleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    //IMetier metier;
    public static  void main(String[] args){

        //EcranImpl dao = new EcranImpl();
        //VideoImpl dao2 = new VideoImpl();
        // instanciation dynamique
        //UniteCentraleImpl metier = new UniteCentraleImpl(); //Instanciation statique
        //metier.setVga(dao2); // injection des dépendances
        //metier.printData("hola");

        //ClavierImpl dao3 = new ClavierImpl();
        // instanciation dynamique
        //metier.setDaoUsb(dao3); // injection des dépendances
        //System.out.println(metier.readData());

        //TvImpl dao4 = new TvImpl();
        //HdmiVgaAdapter hdmivga = new HdmiVgaAdapter(dao4);
        // instanciation dynamique
        //metier.setVga(hdmivga); // injection des dépendances
        //metier.printData("afichage utilisent adapter");

        // Spring file config.txt
        //ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        //UniteCentraleImpl metier = springContext.getBean(UniteCentraleImpl.class);
        //IMetier metier = (IMetier) springContext.getBean("metier");
       // metier.printData("fffff");

        // Spring Annotation
        ApplicationContext springContext = new AnnotationConfigApplicationContext("dao", "metier");
        UniteCentraleImpl metier = springContext.getBean(UniteCentraleImpl.class);

        metier.printData("e");
    }
}
