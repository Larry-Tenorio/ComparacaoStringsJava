/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostrings;

/**
 *
 * @author trixti
 */
public class ComparacaoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        String nome1 = "Larry";
        String nome2 = "Larry";
        String nome3 = new String("Larry");
        String res;
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        */
        
        String nome1 = "Larry";
        String nome2 = "Larry";
        String nome3 = new String ("Larry");
        String res;
        res =(nome1.equals(nome3)?"igual":"diferente");
        System.out.println(res);
        
    }
    
}
