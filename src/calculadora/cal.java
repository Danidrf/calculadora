package calculadora;
import javax.swing.JOptionPane;
public class cal {
	private double num1;
	private double num2; 
	
	public cal() {
		super();
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
	public double sumar() { 
		double resultado; 
		resultado=num1 + num2; 
		return resultado;
	}
	public double restar() { 
		double resultado; 
		resultado=num1-num2; 
		return resultado; 
	}
	public double multi() { 
		double resultado; 
		resultado=num1*num2; 
		return resultado; 
	}
	public double divi() { 
		double resultado; 
		resultado=num1/num2; 
		return resultado; 
	}
	public double potenciacion() { 
		double potencia; 
		potencia=Math.pow(num1,num2); 
		return potencia;
	}
	public void visualizar() { 
		JOptionPane.showMessageDialog(null,"Calculadora Simple"); 
		
	} 
	public double leer() {
		double n; 
		String info=JOptionPane.showInputDialog("Introduzca un número");
		n=Double.parseDouble(info);
		return n;
	} 
	public String calculo(){
		String opera; 
		opera=JOptionPane.showInputDialog(null,"Introduzca la operación que se desea realizar: "); 
		return opera;	
	}
}
