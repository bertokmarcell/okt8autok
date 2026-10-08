package autok;
public class Teherauto extends Auto{
    private static final String szallit = "tehert";
    public Teherauto(String sofor,String rendszam) {
        super(sofor,rendszam);
    }
    @Override
    public void szallit(){
        System.out.println(szallit);
    }
    public void allinfo(){
        System.out.println("sofor: "+sofor+"\nrendszam: "+rendszam+"\nmit szallit: "+szallit);
    }
    
}
