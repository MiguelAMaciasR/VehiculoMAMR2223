
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMaciasRodriguezMiguelAngel2223 miVehiculoMaciasRodriguezMiguelAngel2223;
        int stockActual;
        
        miVehiculoMaciasRodriguezMiguelAngel2223 = new VehiculoMaciasRodriguezMiguelAngel2223("Seat",18000,100);
        operativaVehiculosMaciasRodriguezMiguelAngel2223(miVehiculoMaciasRodriguezMiguelAngel2223, 50); 
    }

    private static void operativaVehiculosMaciasRodriguezMiguelAngel2223
        (VehiculoMaciasRodriguezMiguelAngel2223 miVehiculoMaciasRodriguezMiguelAngel2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoMaciasRodriguezMiguelAngel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoMaciasRodriguezMiguelAngel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoMaciasRodriguezMiguelAngel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
