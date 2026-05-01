import java.util.Arrays;


public class Main {

    // Vytvoř pole int[] stockLevels, které bude reprezentovat počty kusů pěti různých produktů ve skladu.
    static int[] stockLevels = new int[5];

    public static void main(String[] args) {
        // Vytvoření zásob
        System.out.println("Vytvoření zásob");

        // Do pole vlož libovolné hodnoty představující počet kusů každého produktu (například 20, 50, 100, atd.).
        stockLevels[0] = 100;
        stockLevels[1] = 50;
        stockLevels[2] = 300;
        stockLevels[3] = 1000;
        stockLevels[4] = 250;

        // Projdi pole a vypiš počet kusů každého produktu spolu s jeho pozicí v poli (např. "Produkt 1 má na skladě 20 kusů").
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.println("Produkt " + i + " má na skladě " + stockLevels[i] + " kusů");
        }

        // Přidej výpočet celkového počtu kusů na skladě (součet všech hodnot v poli) a vypiš ho.
        System.out.println("\nCelkem na skladě: " + Arrays.stream(stockLevels).sum() + " kusů.");

        // Seznam produktů
        System.out.println("\nSeznam produktů");

        // Vytvoř ArrayList ArrayList<String> productNames, který bude obsahovat názvy pěti produktů (např. Laptop, Telefon, Monitor, Klávesnice, Myš).
        ProductList productNames =  new ProductList();
        productNames.add("Laptop");
        productNames.add("Tablet");
        productNames.add("Telefon");
        productNames.add("Monitor");
        productNames.add("Klávesnice");

        // Přidej další produkt do seznamu (např. "Sluchátka").
        productNames.add("Sluchátka");

        // Projdi seznam a vypiš všechny názvy produktů spolu s jejich pozicí v seznamu (např. "Produkt na pozici 1 je Laptop").
        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Produkt na pozici " + i + " je " + productNames.get(i));
        }

        // Představ si, že produkt "Monitor" už není skladem. Najdi tento produkt v seznamu a odstraň ho. Poté opět vypiš celý seznam produktů.
        productNames.remove("Monitor");

        System.out.println("\nNový seznam - bez produktu \"Monitor\" ");

        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Produkt na pozici " + i + " je " + productNames.get(i));
        }

        // Vyhledávání a aktualizace
        // Vytvoř metodu findProduct, která přijme název produktu jako parametr a vypíše, na které pozici se v seznamu nachází.
        // Pokud produkt neexistuje, vypíše informaci o jeho nedostupnosti.

        // test 1 - existující produkt
        String testProduct1 = "Telefon";
        productNames.findProduct(testProduct1);

        // test 2 - neexistující produkt
        String testProduct2 = "Monitor";
        productNames.findProduct(testProduct2);

        // Vytvoř metodu updateStock, která přijme index produktu a nový počet kusů, aktualizuje hodnotu v poli stockLevels, a vypíše aktualizovaný stav skladu.
        updateStock(0, 150);


        // Funkce, která umožní uživateli zadat jméno produktu a zjistit, zda je skladem, a pokud ano, kolik kusů je k dispozici

        // test 1 - existující produkt
        System.out.println("\n" + "K dispozici je " + productNames.getStock(testProduct1) + " kusů produktu \"" + testProduct1 + "\".");

        // test 2 - neexistující produkt
        System.out.println("K dispozici je " + productNames.getStock(testProduct2) + " kusů produktu \"" + testProduct2 + "\".");
    }

    /**
     * Metoda aktualizuje počet produktů a vypíše aktuální stav skladu.
     *
     * @param index index produktu v poli
     * @param newStock nový počet kusů produktu
     */

    public static void updateStock(int index, int newStock) {
        stockLevels[index] = newStock;

        System.out.println("\n" + "Aktualizovaný stav skladu:");
        for (int i = 0; i < stockLevels.length; i++) {
            System.out.println("Produkt " + i + ": " + stockLevels[i]);
        }
    }
}