public class Main {
    public static void main(String[] args) {
        long[] sales = {500, 1000, 560, 12000, 2500, 3450, 8900};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Самая крупная  продажа на " + salesManager.max() + " руб.");
    }
}