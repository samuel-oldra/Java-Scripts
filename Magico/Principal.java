/*
 Samuel Brando Oldra
 Programa��o III
 Faculdade de Inform�tica
*/

import java.io.*;

public class Principal {

    // vari�veis
    static private Magico oQuadradoMagico;

    public static void main(String vsArgs[]) {

        // vari�veis.
        int iSize = 9;
        boolean bNumOK = false;

        while (bNumOK == false) {

            try {
                System.out.print("Digite a medida do lado do quadrado: ");
                BufferedReader brResp = new BufferedReader(new InputStreamReader(System.in));
                iSize = Integer.parseInt(brResp.readLine());
            } catch (Exception eErro) {
                System.out.println("Houve um erro: " + eErro.getMessage());
                System.out.println("Digite novamente!");
            }

            if ((iSize % 2) != 0) {
                bNumOK = true;
            } else {
                System.out.println("Digite um numero impar!");
            }

        }
        System.out.println();
        oQuadradoMagico = new Magico(iSize);

        System.exit(0); // fecha a aplica��o.
    }
}