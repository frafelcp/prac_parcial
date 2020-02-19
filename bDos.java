/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parB;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class dos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // TODO code application logic here
        //ARTICULOS
        String[] articulos = {"bate", "guayos", "balon_soccer", "balon_baloncesto",
            "pelota_beisbol"};

        //SUCURSALES
        String[] sucursales = {"panorama", "plaza_sol", "viva", "buenavista"};

        //INGRESAR ARTICULOS VENDIDOS
        //varaibles e inicializacion
        int[] sucPano = new int[articulos.length];
        int[] sucPlaz = new int[articulos.length];
        int[] sucViv = new int[articulos.length];
        int[] sucBue = new int[articulos.length];

        //leer cantidades vendidas
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
        //varibles e inicializacion
        int conBate = 0;
        for (int i = 0; i <= 0; i++) {
            conBate = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }

        //cantidad total guayos
        //varibles e inicializacion
        int conGua = 0;
        for (int i = 1; i == 1; i++) {
            conGua = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }

        //cantidad total balon de soccer
        //varibles e inicializacion
        int conSoc = 0;
        for (int i = 2; i == 2; i++) {
            conSoc = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }

        //cantidad total balon de baloncesto
        //varibles e inicializacion
        int conBal = 0;
        for (int i = 3; i == 3; i++) {
            conBal = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }

        //cantidad total pelota de besibol
        //varibles e inicializacion
        int conBei = 0;
        for (int i = 4; i == 4; i++) {
            conBei = (sucPano[i] + sucPlaz[i]) + (sucViv[i] + sucBue[i]);
        }

        //cantiadad total por articulo
        int[] cant_tot_xArt = {conBate, conGua, conSoc, conBal, conBei};

        //escribimos
        for (int i = 0; i < articulos.length; i++) {
            System.out.print("Cantidad total de " + articulos[i] + ":" + 
                    cant_tot_xArt[i]);
        }
        
        //CANTIDAD DE EN LA SUCURSAL 2 PLAZA DEL SOL
        //variables e inicializacion
        int sum_art_suc_plaza = 0;
        
        //suma
        for (int i = 0; i < sucPlaz.length; i++) {
            sum_art_suc_plaza += sucPlaz[i];
        }
        
        //escribimos
        System.out.print("Total articulos Sucursal " + sucursales[1] + ":" + 
                sum_art_suc_plaza);
        
        
        //CANTIDAD DE ARTICULO 3 EN SUCURSAL 1
        for (int i = 0; i < sucursales.length; i++) {
            if (sucursales[i].equals("panorama")) {
                System.out.print("total de articulo " + articulos[2] + " en la "
                        + "sucursal " + sucursales[i] + ":" + sucPano[2]);
            }
        }
    }
}
