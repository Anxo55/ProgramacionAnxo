package Ejercicio2B;

public class Portero extends Jugador{

    private int golesRecibidos;
    private int penaltisParados;

    public Portero() {
        super("sin nombre", "sin demarcacion", 0, 0, 0, 0);
        this.golesRecibidos = 0;
        this.penaltisParados = 0;
    }
    public Portero(String n, String d, int p, int g, int a, int r, int golesRecibidos, int penaltisParados) {
        super(n,d,p,g,a,r);
        this.golesRecibidos = golesRecibidos;
        this.penaltisParados = penaltisParados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
    public int getPenaltisParados() {
        return penaltisParados;
    }
    public void setPenaltisParados(int penaltisParados) {
        this.penaltisParados = penaltisParados;
    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Goles: "+golesRecibidos);
        System.out.println("Penaltis Parados: "+penaltisParados);
    }

    

    
    
}
