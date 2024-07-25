public class Rettangolo {

    // 1 Attributi
    private double base;
    private double altezza;

    // 2 COSTRUTTORE
    public Rettangolo(double base,double altezza){
        this.base=base;
        this.altezza=altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaPerimetro () {
        return (getBase()+getAltezza())*2;
    }

    public double calcolaArea () {
        return getBase()*getAltezza();
    }

    public void stampaRettangolo(){
        System.out.println("AREA: " + calcolaArea());
        System.out.println("PERIMETRO: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2){
        System.out.println("RETTANGOLO 1: ");
        ret1.stampaRettangolo();
        System.out.println("----------");
        System.out.println("RETTANGOLO 2: ");
        ret2.stampaRettangolo();
        System.out.println("----------");
        System.out.println("SOMMA AREE: " + (ret1.calcolaArea()+ret2.calcolaArea()));
        System.out.println("SOMMA PERIMETRI: " + (ret1.calcolaPerimetro()+ret2.calcolaPerimetro()));
    }

}

