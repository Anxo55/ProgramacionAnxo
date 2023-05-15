package capitulo5.Deportes;

public interface PartidoFutbol extends MatchDeportivo{

    //Atributo final que representa la duracion de un partido de futbol
    static final int duracionPartidoFutbol = 90;

    void sestGolesEquipoLocal(int marcador);

    void setGolesEquipoVisitante(int marcador);
    
}
