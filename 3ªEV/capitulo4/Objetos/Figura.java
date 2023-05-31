import java.util.Arrays;

import capitulo5.ejemplo3.Color;

public class Figura {

private Color ColorFigura;
 private int[] Posicion = new int[2];

 Figura(java.awt.Color blue) {
 EstableceColor(blue);
 }

 private void EstableceColor(Color color) {
}

Figura(java.awt.Color green, int[] Posicion) {
 EstableceColor(green);
 EstableceCentro(Posicion);
 }

 private void EstableceColor(java.awt.Color green) {
}

private void EstableceCentro(int[] posicion2) {
}

public void setColor(Color color) {
 ColorFigura = color;
 }

 public Color getColor() {
 return ColorFigura;
 }

 public void setCentro(int[] Posicion) {
 this.Posicion[0] = Posicion[0];
 this.Posicion[1] = Posicion[1];
 }

 public int[] getCentro() {
 return Posicion;
 }

@Override
public String toString() {
    return "Figura [ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
}
 

}
