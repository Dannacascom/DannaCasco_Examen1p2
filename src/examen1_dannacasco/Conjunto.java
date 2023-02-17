
package examen1_dannacasco;

import java.awt.Color;
import java.util.ArrayList;

public class Conjunto {
    protected Color color;
    private ArrayList<ConjuntoNumComplejos> conjuntos = new ArrayList();

    public ArrayList<ConjuntoNumComplejos> getConjuntos() {
        return conjuntos;
    }

    public void setConjuntos(ArrayList<ConjuntoNumComplejos> conjuntos) {
        this.conjuntos = conjuntos;
    }

    public Conjunto() {
    }

    public Conjunto(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "color=" + color + '}';
    }
}
