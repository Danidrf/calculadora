package calculadora; 
import java.util.Scanner;
import javax.swing.JOptionPane;
	public class app_calculadora {
			public static void main(String[] args) {
					Scanner teclado;
					teclado= new Scanner(System.in);
					double num1, num2;
					String operacion;
					String respu;
					char letrarespu;
					double resul=0;
					cal c;
						do{
							c=new cal();
							num1=c.leer();
							num2=c.leer();
							c.setNum1(num1);
							c.setNum2(num2);
							operacion=c.calculo();
							switch (operacion){
								case "+":
									resul=c.sumar();
									break;
								case "-":
									resul=c.restar();
									break;
								case "*":
									resul=c.multi();
									break;
								case "/":
									resul=c.divi();
									break;
								
												}
							JOptionPane.showMessageDialog(null,c.getNum1()+operacion+c.getNum2()+" = "+ resul);
								respu=JOptionPane.showInputDialog("Quieres realizar otra operación (S/N): ");
								letrarespu = respu.charAt(0);
								letrarespu = Character.toUpperCase(letrarespu );
									while ((letrarespu != 'S') && (letrarespu != 'N')){	
											System.out.println("Error teclea (S/N): ");
											respu= JOptionPane.showInputDialog("Error teclea (S/N): ");
											letrarespu = respu.charAt(0);
											letrarespu = Character.toUpperCase(letrarespu);
									}
						}while (letrarespu == 'S');
						JOptionPane.showMessageDialog(null, "Fin Programa");
}
 }