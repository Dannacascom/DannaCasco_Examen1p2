
package examen1_dannacasco;


public class NumReal {
   protected double num1;
   protected double num2;
    public NumReal() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public NumReal(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "NumReal{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    

    
    
}
