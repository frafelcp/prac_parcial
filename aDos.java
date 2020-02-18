/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parB;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // TODO code application logic here
        //ARTICULOS
        String[] articulos = {"bate", "guayos", "balon_soccer", "balon_baloncesto",
            "pelota_beisbol"};

        //SUCURSALES
        String[] sucursales = {"panorama", "plaza_sol", "viva", "buenavista"};

        //INGRESAR ARTICULOS VENDIDOS
        int[] sucPano = new int[articulos.length];
        int[] sucPlaz = new int[articulos.length];
        int[] sucViv = new int[articulos.length];
        int[] sucBue = new int[articulos.length];
        
        System.out.println("Registro de ventas");
        for (int i = 0; i < sucursales.length; i++) {
            if (sucursales[i].equals("panorama")) {
                System.out.println("Sucursal " + sucursales[i]);
                for (int j = 0; j < articulos.length; j++) {
                    System.out.print("Articulo " + articulos[j] + ":");
                    sucPano[j] = 50;
                }
            } else {
                if (sucursales[i].equals("plaza_sol")) {
                    System.out.println("Sucursal " + sucursales[i]);
                    for (int j = 0; j < articulos.length; j++) {
                        System.out.print("Articulo " + articulos[j] + ":");
                        sucPlaz[j] = 50;
                    }
                } else {
                    if (sucursales[i].equals("viva")) {
                        System.out.println("Sucursal " + sucursales[i]);
                        for (int j = 0; j < articulos.length; j++) {
                            System.out.print("Articulo " + articulos[j] + ":");
                            sucViv[j] = 50;
                        }
                    } else {
                        if (sucursales[i].equals("buenavista")) {
                            System.out.println("Sucursal " + sucursales[i]);
                            for (int j = 0; j < articulos.length; j++) {
                                System.out.print("Articulo " + articulos[j] + ":");
                                sucBue[j] = 50;
                            }
                        }
                    }
                }
            }
        }
        
        //CANTIDAD TOTAL DE CADA ARTICULO
        //cantidad total bate
        int conBate = 0;        
        for (int i = 0; i <= 0; i++) {
            conBate = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }
        
        int conGua = 0;
        for (int i = 0; i == 1; i++) {
            conBate = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }
        
        int conSoc = 0;
        for (int i = 0; i == 1; i++) {
            conSoc = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }
        
        int conBal = 0;
        for (int i = 0; i == 1; i++) {
            conBal = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }
        
        int conBei = 0;
        for (int i = 0; i == 1; i++) {
            conBei = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }
        
        int [] cant_tot_xArt = {conBate, conGua, conSoc, conBal, conBei};
        
        for (int i = 0; i < articulos.length; i++) {
            System.out.print("Cantidad total de " + articulos[i] + ":" + cant_tot_xArt[i]);
        }
    }

}
