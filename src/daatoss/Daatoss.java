/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daatoss;

/**
 *
 * @author 52636
 */
public class Daatoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciando objeto = "info"
        Informacion info = new Informacion("Antonio" , "Sistemas" , 2);
        //encapsular
        String NumCont = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre()+" ";
        System.out.println("Datos del alumno:"+NumCont);
    }
    
  
         
}
