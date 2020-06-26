/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q3;

/**
 *
 * @author yasmi
 */
public class Desafio6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     int cont, num, contDentro, contFora;
        contDentro =  0 ;
        contFora =  0 ;
        for  (cont = 1 ; cont <= 10 ; cont ++ ) {  
        contFora =  0 ; cont = 1 ;
        while (cont <=  10 ) {
            num =  Inteiro . parseInt ( JOptionPane . showInputDialog ( " Digite um nº " ));
            if (num > = 10  && num <= 20 ) {
                contDentro ++ ;
            } mais {
                contFora ++ ;
            } // fim faça se
            cont ++ ;
        } // fim do loop
        JOptionPane . showMessageDialog ( null , " Sem intervalo de [10,20] "
                +  " existem: " + contDentro + " e para este intervalo "
}
