package autok;

public abstract class Auto {
     String sofor;
     String rendszam;
    public Auto() {
    }
    public Auto(String sofor, String rendszam) {
        //*ellenorzes
        this.sofor = sofor;
        this.rendszam=rendszam;
    }
    public void sofor(){
        System.out.printf("%s eszik. \n",sofor);
    }
    public String getsofor() {
        return sofor;
    }
    public String getRendszam() {
        return rendszam;
    }
    public void info(){
        System.out.println("sofor: "+getsofor()+"\nrendszam: "+getRendszam());
    }
    
    public abstract void szallit();
    
}
