package caja.views;

import caja.objects.product;

import java.util.List;
import java.util.Scanner;

public class view {
    public static void showHeaderPrincipal() {
        System.out.println("\t\t**************************************");
        System.out.println("\t\t* BIENVENIDO A LA CAJA RESGISTRADORA *");
        System.out.println("\t\t**************************************");
    }

    public static void showMenuPrincipal() {
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas");
        System.out.println("\t\t\t 6. Salir");
    }

    public static void showGetOption() {
        System.out.print("\t\t Digite la opción: ");
    }

    public static void showGetAmount() {
        System.out.print("\t\t Digite la cantidad: ");
    }

    public static void showGetPrice() {
        System.out.print("\t\t Digite el precio: ");
    }

    public static Integer getOption() {
        Scanner entry = new Scanner(System.in);
        return entry.nextInt();
    }

    public static Integer getAmount() {
        Scanner entry = new Scanner(System.in);
        return entry.nextInt();
    }

    public static Double getPrice() {
        Scanner entry = new Scanner(System.in);
        return entry.nextDouble();
    }

    public static void showBuyHeader() {
        System.out.println("\t\t*****************************************");
        System.out.println("\t\t*           MENÚ DE COMPRAS             *");
        System.out.println("\t\t*****************************************");
        showItemsMenu();
    }

    public static void showSaleHeader() {
        System.out.println("\t\t*****************************************");
        System.out.println("\t\t*            MENÚ DE VENTAS             *");
        System.out.println("\t\t*****************************************");
        showItemsMenu();
    }

    public static void showStockHeader() {
        System.out.println("\t\t*****************************************************************");
        System.out.println("\t\t*                      I N V E N T A R I O                      *");
        System.out.println("\t\t*****************************************************************");
        showItemsHeader();
    }

    public static void showItemsHeader(){
        System.out.println("\t\t-----------------------------------------------------------------");
        System.out.println("\t\t*     PRODUCTO\t | CANTIDAD\t | VR UNITARIO\t | VR TOTAL\t     *");
        System.out.println("\t\t-----------------------------------------------------------------");
    }

    public static void showBuyListHeader() {
        System.out.println("\t\t*****************************************************************");
        System.out.println("\t\t*                        C O M P R A S                          *");
        System.out.println("\t\t*****************************************************************");
        showItemsHeader();
    }

    public static void showSaleListHeader() {
        System.out.println("\t\t*****************************************************************");
        System.out.println("\t\t*                         V E N T A S                           *");
        System.out.println("\t\t*****************************************************************");
        showItemsHeader();
    }

    public static void showItemsMenu() {
        System.out.println("\t\t\t 1. Papa");
        System.out.println("\t\t\t 2. Arroz");
        System.out.println("\t\t\t 3. Carne");
        System.out.println("\t\t\t 4. Volver");
    }

    public static void showThanks() {
        System.out.println("Gracias por utilizar mi programa. :') || Dedicado a Aideé Berenice Correa Villegas");
    }

    public static void showInvalidOption() {
        System.out.println("Opción no válida");
    }

    public static void showGetBack(String name) {
        System.out.println("\t\t\tSaliendo del módulo " + name);
    }

    public static void showAnyKey() {
        System.out.print("Digite cualquier número para continuar: ");
    }

    public static void showItemsStock(product[] products) {
        for (product v: products) {
            System.out.println("\t\t* " + v.getName() + "\t\t| " + v.getAmount() + "\t\t\t| " + v.getPrice() + "\t\t\t| " + v.getAmount() * v.getPrice() + "\t\t*");
        }
    }

    public static void showInvalidAmount() {
        System.out.println("La cantidad no es válida");
    }

    public static void showPurchases(List<product> list) {
        for (product v: list) {
            System.out.println("\t\t* " + v.getName() + "\t\t| " + v.getAmount() + "\t\t\t| " + v.getPrice() + "\t\t\t| " + v.getAmount() * v.getPrice() + "\t\t*");
        }
    }

    public static void showSales(List<product> list) {
        for (product v: list) {
            System.out.println("\t\t* " + v.getName() + "\t\t| " + v.getAmount() + "\t\t\t| " + v.getPrice() + "\t\t\t| " + v.getAmount() * v.getPrice() * 1.25 + "\t\t*");
        }
    }
}
