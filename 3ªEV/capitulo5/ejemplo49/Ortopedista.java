package capitulo5.ejemplo49;

public class Ortopedista extends Medico{

    enum tipos{
        MAXILOFACIAL, PEDIATRICA
    }

    private tipos tipologia;

    public tipos getTipologia() {
        return tipologia;
    }

    public void setTipologia(tipos tipologia) {
        this.tipologia = tipologia;
    }

    public Ortopedista(String nombre, tipos tipologia) {
        super(nombre);
        this.tipologia = tipologia;
    }

    @Override
    public String toString() {
        return "Ortopedista [tipologia=" + tipologia + "]";
    }
    
    
    
}
