import javax.swing.*;
import java.awt.*;


public class Atv01 {
    public static void main(String[] args) {
        JFrame Janela = new JFrame("Calculadora De Doleta");
        Janela.setSize(350, 250);

        JPanel Pagina01 = new JPanel();
        Janela.add(Pagina01);
        Pagina01.setBackground(Color.YELLOW);

        JLabel Label1 = new JLabel("Digite O valor a ser convertido: ");
        Pagina01.add(Label1);

        JTextField Edit1 = new JTextField(10);
        Pagina01.add(Edit1);
        JLabel Label2 = new JLabel("Digite O Valor Do Dollar: ");
        Pagina01.add(Label2);

        JTextField Edit2 = new JTextField(10);
        Pagina01.add(Edit2);

        JButton BOTAO01 = new JButton("Calcular");
        Pagina01.add(BOTAO01);

        JLabel LabelResultado = new JLabel();
        Pagina01.add(LabelResultado);

        BOTAO01.addActionListener(Event -> {
                    try {
                        int valor = Integer.parseInt(Edit1.getText());
                        double valorDol = Double.parseDouble(Edit2.getText());
                        LabelResultado.setText(String.format("O VALOR SENDO CONVERTIDO É: %.2f ",(valor/valorDol)));
                    } catch (NumberFormatException ex){
                        LabelResultado.setText("Digite um valor valido:");

                    }
                }
              );


    Janela.setVisible(true);
        
    }


}
