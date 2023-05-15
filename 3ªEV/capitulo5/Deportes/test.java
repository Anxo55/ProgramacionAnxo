package capitulo5.Deportes;

public class test {

    public static void main(String[] args) {
        PartidoFutbolLigaEspañola partido = new PartidoFutbolLigaEspañola();
        partido.setEquipoLocal("Peñasco");
        partido.setEquipoVisitante("lavadores");
        partido.sestGolesEquipoLocal(3);
        partido.setGolesEquipoVisitante(0);
        System.out.println("Tiempo de juego: "+ PartidoFutbol.duracionPartidoFutbol);
        System.out.println(partido.toString());

        PartidoBaloncestoEuroLiga nba = new PartidoBaloncestoEuroLiga();
        nba.setEquipoLocal("Los Lakers");
        nba.setEquipoVisitante("Warriors");
        nba.setCestasEquipoLocal(140);
        nba.setCestasEquipoVisitante(129);
        System.out.println("Tiempo de juego: "+ PartidoBaloncesto.duracionPartidoBaloncesto);
        System.out.println(nba.toString());

        PartidoTenisMontecarlo juego = new PartidoTenisMontecarlo();
        juego.setEquipoLocal("Alcaraz");
        juego.setEquipoVisitante("Rafa Nadal");
        juego.setJuegosLocal(6);
        juego.setJuegosVisitante(4);
        // System.out.println("Tiempo de juego: "+ PartidoTenis.duracionPartido);
        System.out.println(juego.toString());
    }
    
}
