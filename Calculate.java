import javax.swing.JOptionPane; public class Calculate {
public static void main(String[] args){
// Sum
	String strNum1, strNum2;
	double sum, diff,pro, quo;
	strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane. INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);
	strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number", JOptionPane. INFORMATION_MESSAGE);
	double num2 = Double.parseDouble(strNum2);
	sum = num1 + num2;
	diff = num1 - num2;
	pro = num1 * num2;
	quo = num1 / num2;
	JOptionPane.showMessageDialog(null, sum, "The sum is ", JOptionPane. INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, diff, "The difference is ", JOptionPane. INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, pro, "The product is ", JOptionPane. INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, quo, "The quotient is ", JOptionPane. INFORMATION_MESSAGE);

System.exit(0);
}
}