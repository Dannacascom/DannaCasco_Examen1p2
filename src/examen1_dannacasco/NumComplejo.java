
package examen1_dannacasco;

public class NumComplejo {
    private NumImaginarios imaginario;
    private NumReal real;

    public NumComplejo() {
    }

    public NumComplejo(NumImaginarios imaginario, NumReal real) {
        this.imaginario = imaginario;
        this.real = real;
    }

    public NumImaginarios getImaginario() {
        return imaginario;
    }

    public void setImaginario(NumImaginarios imaginario) {
        this.imaginario = imaginario;
    }

    public NumReal getReal() {
        return real;
    }

    public void setReal(NumReal real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "NumComplejo{" + "imaginario=" + imaginario + ", real=" + real + '}';
    }
    
    
}
