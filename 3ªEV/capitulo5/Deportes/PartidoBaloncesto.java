package capitulo5.Deportes;

public interface PartidoBaloncesto extends MatchDeportivo{
    //Atributo final que representa la duracion de un partido en minutos
    static final int duracionPartidoBaloncesto = 40;

    void setCestasEquipoLocal(int marcador);

    void setCestasEquipoVisitante(int marcador);
    
}
