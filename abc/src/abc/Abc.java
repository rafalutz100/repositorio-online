package abc;

import javax.swing.JOptionPane;

public class Abc {

    public static void main(String[] args) {
        int i;
        String n;
        n =JOptionPane.showInputDialog("digite seu nome");
        i =Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
        JOptionPane.showMessageDialog(null,  "nome:" + n +"\n" + "idade:" + i + "\nhello world");

    }
    
}
