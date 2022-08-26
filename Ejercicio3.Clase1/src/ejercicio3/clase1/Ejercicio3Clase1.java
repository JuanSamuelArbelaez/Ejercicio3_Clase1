//Area y perimetro de un rectangulo

package ejercicio3.clase1;

import javax.swing.JOptionPane;

public class Ejercicio3Clase1
{
    public static void main(String[] args)
    {
        double base, altura, area, perimetro;
        
        base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del retangulo en centimetros (cm): "));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del retangulo en centimetros (cm): "));
        
        area=base*altura;
        perimetro=(2*base)+(2*altura);
        
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: "+perimetro+"cm" +
                                            "\nEl area del rectangulo es: "+area+"cm");
    }  
}