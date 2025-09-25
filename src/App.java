public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rojo Polo Paella Inc.");
        System.out.println("");
        System.out.println("Carretera Muelle 38");
        System.out.println("37531 Ávila, Ávila");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.printf("%-30s %-30s %-30s %30s %n", "FACTURAR A", "ENVIAR A ", "Nº FACTURA", "ES-001");
        System.out.println("");
        System.out.printf("%-30s %-30s %-30s %30s %n", "Leda Villareal", "Leda Villareal", "FECHA", "ES-001");
        System.out.printf("%-30s %-30s %-30s %30s %n", "Virgen Blanca 63", "Cercas Bajas 68", "Nº PEDIDO", "1730/2019");
        System.out.printf("%-30s %-30s %-30s %30s %n", "08759 Burgos, Burgos", "47300 Cádiz, Cádiz", "FECHA VCTO.", "29.01.2019");
        System.out.println("");
        System.out.printf("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────%n");
        System.out.printf("%-30s %-30s %-30s %30s %n", "Total Factura", "", "", "199,65");
        System.out.printf("───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────%n");
        System.out.println("");
        System.out.printf("%-10s %-50s %30s %30s %n", "CANT.", "DESCRIPCIÓN", "PRECIO UNITARIO", "IMPORTE");
        System.out.println("");
        System.out.printf("%-10s %-50s %30s %30s %n", "1", "Talla pequeña traje de luces en rojo", "100,00", "100,00");
        System.out.printf("%-10s %-50s %30s %30s %n", "2", "Mui grande churrolito", "25,00", "50,00");
        System.out.printf("%-10s %-50s %30s %30s %n", "3", "Equipaje de fútbol", "5,00", "15,00");
        System.out.println("");
        System.out.printf("%-10s %-50s %30s %30s %n", "", "", "Subtotal", "165,00");
        System.out.printf("%-10s %-50s %30s %30s %n", "", "", "IVA 21.0%", "34,65");
    }
}
