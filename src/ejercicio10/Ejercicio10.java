/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int ni;
        String nom;
        double pat;
        int est;
        double pagmat;
        System.out.println("Ingrese Nombres");        
        nom = scan.nextLine();
        System.out.println("Ingrese numero de inscripcion");
        ni = scan.nextInt();
        System.out.println("Ingrese Patrimonio");
        pat = scan.nextDouble();
        System.out.println("Ingrese Estrato Social");
        est = scan.nextInt();
        
        pagmat = 50000;
        if (pat > 2000000 && est > 3) {
            pagmat += 0.03 * pat;
        }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + ni + " Y NOMBRE " + nom + " DEBE PAGAR:$" + pagmat);
    }

}
