package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {
    
     Scanner stdIn = new Scanner(System.in);
    
    public void Precios (double precio, int cant) {
        System.out.print("Precio de la compra del articulo: " + precio + "\n");
        System.out.print("Cantidad: " + cant + "\n");
        System.out.print("Total de orden de compra = $" + precio*cant + "\n");
    }
    public static void main(String[] args) {
        ImprimePrecioC Precio = new ImprimePrecioC();
        Precio.Precios(6, 35);
    }
}
