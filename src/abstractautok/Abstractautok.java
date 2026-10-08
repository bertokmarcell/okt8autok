package abstractautok;
import autok.Szemelyauto;
import autok.Teherauto;
import autok.Auto;
public class Abstractautok {
    
    public static void main(String[] args) {
        Auto a1 = new Szemelyauto("Ben Den","AAA-111");
        Auto a2 = new Teherauto("Den Ben","BBB-222");
       // Auto a3 = new Auto("Den Den","CCC-333");
       a1.info();
       a1.szallit();
        
    }
    
}
