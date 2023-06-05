package caja.controllers;

import caja.objects.meat;
import caja.objects.potato;
import caja.objects.product;
import caja.objects.raice;
import caja.storage.database;
import caja.views.view;

import java.util.List;

public class register {
    private caja.storage.database database;

    public register() {
        database = new database();
    }

    // Inicia el proceso de la registradora
    public void register() {
        Integer option;
        do {
            view.showHeaderPrincipal();
            view.showMenuPrincipal();
            view.showGetOption();
            option = view.getOption();
            switch (option) {
                case 1:
                    buy();
                    break;
                case 2:
                    sale();
                    break;
                case 3:
                    showStock();
                    break;
                case 4:
                    showPurchases();
                    break;
                case 5:
                    showSales();
                    break;
                case 6:
                    view.showThanks();
                    System.exit(0);
                    break;
                default:
                    view.showInvalidOption();
            }
        } while (option >= 1 && option <= 6);

    }

    // buy se encarga de mostrar el menú de compras y obtener la opción deseada por el usuario
    private void buy() {
        view.showBuyHeader();
        int option;
        do {
            view.showGetOption();
            option = view.getOption();
            if (option >= 1 && option <= 3) {
                buyProduct(option);
            } else if (option == 4) {
                view.showGetBack("Compras");
            } else {
                view.showInvalidOption();
                return;
            }
        } while (option < 1 || option > 4);
    }

    // Registra en la base de datos el producto comprado
    private void buyProduct(Integer option) {
        product product = null;
        switch (option) {
            case 1:
                product = new potato("Sabritas");
                break;
            case 2:
                product = new raice("Morelos");
                break;
            case 3:
                product = new meat("Purísima");
                break;
            default:
                view.showInvalidOption();
        }
        view.showGetAmount();
        int amount = view.getAmount();
        view.showGetPrice();
        double price = view.getPrice();

        product.setAmount(amount);
        product.setPrice(price);
        database.buy(product);
    }

    private void showStock() {
        view.showStockHeader();
        view.showItemsStock(database.getAll());
        view.showAnyKey();
        view.getOption();
    }

    // sale se encarga de mostrar el menú de ventas y obtener la opción deseada por el usuario
    private void sale() {
        view.showSaleHeader();
        int option;
        do {
            view.showGetOption();
            option = view.getOption();
            if (option >= 1 && option <= 3) {
                saleProduct(option);
            } else if (option == 4) {
                view.showGetBack("Ventas");
            } else {
                view.showInvalidOption();
                return;
            }
        } while (option < 1 || option > 4);
    }

    // Registra en la base de datos el producto comprado
    private void saleProduct(Integer option) {
        product product = null;
        if (option < 1 || option > 3) {
            view.showInvalidOption();
            return;
        }

        product = database.getByIndex(option - 1);
        view.showGetAmount();
        int amount = view.getAmount();
        if (product.getAmount() < amount) {
            view.showInvalidAmount();
            return;
        }
        product.setAmount(amount);
        database.sale(product);
    }

    private void showPurchases() {
        List<product> list = database.getPurchases();
        view.showBuyListHeader();
        view.showPurchases(list);
    }

    private void showSales() {
        List<product> list = database.getSales();
        view.showSaleListHeader();
        view.showSales(list);
    }
}
