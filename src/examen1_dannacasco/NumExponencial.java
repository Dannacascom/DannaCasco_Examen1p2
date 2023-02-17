
package examen1_dannacasco;

public class NumExponencial extends NumReal{

    public NumExponencial(double num1, double num2) {
        super(num1,num2);
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
  
    public static double expo(double num1, double num2){
        return (Math.pow(num1, num2));
    }
  
}
