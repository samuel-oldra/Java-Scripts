// import files
import javax.swing.JOptionPane; // biblioteca da classe JOptionPane

public class Calculo {
    public static void main(String args[]) {
        String sAltPrim, sAltSegu, // alturas das pessoas
        sCrePrim, sCreSegu; // crescimento das pessoas
        int iAltPrim, iAltSegu, // alturas das pessoas
        iCrePrim, iCreSegu; // crescimento das pessoas
        float fAnos; // tempo de crescimento

        // leitura dos dados da altura e do crescimento das duas pessoas.
        sAltPrim = JOptionPane.showInputDialog(null, "Qual � a altura da 1� pessoa?",
            "Altura da 1� pessoa", JOptionPane.QUESTION_MESSAGE);
        sAltSegu = JOptionPane.showInputDialog(null, "Qual � a altura da 2� pessoa?",
            "Altura da 2� pessoa", JOptionPane.QUESTION_MESSAGE);
        sCrePrim = JOptionPane.showInputDialog(null, "Quanto cresce a 1� pessoa?",
            "Crescimento da 1� pessoa", JOptionPane.QUESTION_MESSAGE);
        sCreSegu = JOptionPane.showInputDialog(null, "Quanto cresce a 2� pessoa?",
            "Crescimento da 2� pessoa", JOptionPane.QUESTION_MESSAGE);

        // convers�o das strings para inteiros
        iAltPrim = Integer.parseInt(sAltPrim);
        iAltSegu = Integer.parseInt(sAltSegu);
        iCrePrim = Integer.parseInt(sCrePrim);
        iCreSegu = Integer.parseInt(sCreSegu);

        if (iAltPrim == iAltSegu) {
            // escrita da resposta
            JOptionPane.showMessageDialog(null, "Alturas iguais",
                "Resultado", JOptionPane.WARNING_MESSAGE);

            // fecha a aplica��o
            System.exit(0);
        }

        if (iCrePrim == iCreSegu) {
            // escrita da resposta
            JOptionPane.showMessageDialog(null, "Crescimentos iguais",
                "Resultado", JOptionPane.WARNING_MESSAGE);

            // fecha a aplica��o
            System.exit(0);
        }

        if (iAltPrim > iAltSegu) {
            if (iCrePrim >= iCreSegu) {
                // escrita da resposta
                JOptionPane.showMessageDialog(null, "O menor nunca alcan�ar� o maior",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);

                // fecha a aplica��o
                System.exit(0);
            }
        }

        if (iAltSegu > iAltPrim) {
            if (iCreSegu >= iCrePrim) {
                // escrita da resposta
                JOptionPane.showMessageDialog(null, "O menor nunca alcan�ar� o maior",
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);

                // fecha a aplica��o
                System.exit(0);
            }
        }

        // f�rmula
        fAnos = ((iAltSegu - iAltPrim) / (iCrePrim - iCreSegu));

        // escrita da resposta
        JOptionPane.showMessageDialog(null, "O menor vai levar " + fAnos + " para alcan�ar",
            "Resultado", JOptionPane.INFORMATION_MESSAGE);

        // fecha a aplica��o
        System.exit(0);
    }
}