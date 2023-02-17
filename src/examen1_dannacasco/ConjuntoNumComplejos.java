
package examen1_dannacasco;

import java.awt.Color;
import java.util.ArrayList;


public class ConjuntoNumComplejos extends Conjunto {
   private ArrayList <NumComplejo> conjuntosComplejos = new ArrayList();

    public ArrayList<NumComplejo> getConjuntosComplejos() {
        return conjuntosComplejos;
    }

    public void setConjuntosComplejos(ArrayList<NumComplejo> conjuntosComplejos) {
        this.conjuntosComplejos = conjuntosComplejos;
    }

    public ConjuntoNumComplejos() {
        super();
    }


    public ConjuntoNumComplejos(Color color) {
        super(color);
    
    }

    @Override
    public String toString() {
        return "ConjuntoNumComplejos{";
    }
    
    
    
}
