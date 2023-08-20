/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio01;

/**
 *
 * @author LiamRojas
 */
public class Laboratorio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primer ejemplo 
        // ------------------------------------
        
     String nombre = "Frank";

        Persona per = new Persona(nombre);
        per.setApellido("Torres");
        per.setDni("75945211");
        per.setEdad(22);

        String imprimir=per.getConsola();
        System.out.println(imprimir);

        // Segundo ejemplo
        //---------------------------------

        String nombre2 = "miguel";
        String apellido = "cervantes";
        String dni = "11112222";

        Persona per2 = new Persona(
                nombre2, apellido,dni);

        String imprimir2=per2.getConsola();
        System.out.println(imprimir2);


        Persona per3 = new Persona();

        String imprimir3=per3.getConsola();
        System.out.println(imprimir3);
    }
    
}
