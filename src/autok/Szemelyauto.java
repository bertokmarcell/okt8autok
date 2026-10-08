package autok;
public class Szemelyauto extends Auto{
    private static final String szallit = "embert";
    public Szemelyauto(String sofor, String rendszam) {
        super(sofor,rendszam);
    }
    @Override
    public void szallit(){
        System.out.print(szallit);
    }
    public void allinfo(){
        System.out.println("sofor: "+sofor+"\nrendszam: "+rendszam+"\nmit szallit: "+szallit);
    }
}
