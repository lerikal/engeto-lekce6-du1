import java.util.ArrayList;

public class ProductList extends ArrayList<String> {

    /**
     *  Metoda pro výpis pozice v seznamu produktu. Pokud produkt neexistuje, vypíše informaci o jeho nedostupnosti.
     * @param productName název produktu
     */

    public void findProduct(String productName) {
        System.out.println( "\n" + "Vyhledávání a aktualizace");

        if (this.contains(productName)) {
            System.out.println("Pozice produktu v seznamu: " + this.indexOf(productName) + ".");
        } else {
            System.out.println("Produkt s názvem \"" + productName + "\" neexistuje.");
        }
    }

    /**
     *  Funkce, která umožní uživateli zadat jméno produktu a zjistit, zda je skladem, a pokud ano, kolik kusů je k dispozici.
     * @param productName název produktu
     */
    public int getStock(String productName) {
        int index;
        if (this.contains(productName)) {
            index =  (this.indexOf(productName));
            return Main.stockLevels[index];
        } else {
            return 0;
        }
    }

}
