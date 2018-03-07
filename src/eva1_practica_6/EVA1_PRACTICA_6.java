/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_practica_6;

/**
 *
 * @author Evelyn
 */
/*
TOME LA PRACTICA 5 COMO BASE
GENERE UN ARREGLO QUE CONTENGA EXACTAMENTE LA MISMA CANTIDAD DE VALORES PARES DEL ARREGLO CON VALORES ALEATORIOS.
COPIE LOS VALORES PARES AL NUEVO ARREGLO
HAGA LO MISMO PARA LOS VALORES IMPARES
*/
public class EVA1_PRACTICA_6 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAMOS EL ARREGLO
        int aiArreglo[] = new int[50];
        //ASIGNAMOS VALORES 
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int)(Math.random()*100)+1;
            
        }
        //IMPRIMIMOS EL ARREGLO
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.print("[" + aiArreglo[i] + "]");
        }
        System.out.println(" ");
        //INICIALIZAMOS DOS CONTADORES UNO PARA LOS DATOS PARES Y OTRO PARA LOS DATOS IMPARES
        int iContadorPares=0;
        int iContadorImpares=0;
        //RECORREMOS EL ARREGLO Y HACEMOS CONTEO DE CADA NUMERO PAR E IMPAR
        for (int i = 0; i < aiArreglo.length; i++) {
            if(aiArreglo[i] % 2==0){
                iContadorPares++;
            }else{
                iContadorImpares++;
            }
        }
        //CREAMOS UN ARREGLO PARA LOS NUMEROS PARES Y LO IMPRIMIMOS 
        System.out.println("Arreglo de los nuemros pares");
        int aiPares[] = new int[iContadorPares];
        int iAuxiliar =0;
        for (int i = 0; i < aiArreglo.length; i++) {
            if (aiArreglo[i] % 2 ==0) {
                aiPares[iAuxiliar] = aiArreglo[i];
                iAuxiliar++;
            }
        }
        for (int i = 0; i < aiPares.length; i++) {
            System.out.print("[" + aiPares[i] + "]");
        }
        System.out.println(" ");
        //CREAMOS UN ARREFLO PARA LOS NUMEROS IMPARES Y LO IMPRIMOMOS
        System.out.println("Arreglo de los numero impares");
        int aiImpares[] = new int[iContadorImpares];
        int iAuxiliar2 =0;
        for (int i = 0; i < aiArreglo.length; i++) {
            if(aiArreglo[i] % 2 != 0 ){
                aiImpares[iAuxiliar2] = aiArreglo[i];
                iAuxiliar2++;
            }
        }
        for (int i = 0; i < aiImpares.length; i++) {
            System.out.print("[" + aiImpares[i] + "]");
        }
        System.out.println(" ");
    }
    
}
