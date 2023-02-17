/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1_dannacasco;

public class NumImaginarios {
    private NumReal real;
    private String valorConstante;

    public NumImaginarios(NumReal real, String valorConstante) {
        this.real = real;
        this.valorConstante = valorConstante;
    }

    public NumImaginarios() {
    }

    public NumReal getReal() {
        return real;
    }

    public void setReal(NumReal real) {
        this.real = real;
    }

    public String getValorConstante() {
        return valorConstante;
    }

    public void setValorConstante(String valorConstante) {
        this.valorConstante = "i";
    }

    @Override
    public String toString() {
        return "NumImaginarios{" + "real=" + real + ", valorConstante=" + valorConstante + '}';
    }
    
    
}
