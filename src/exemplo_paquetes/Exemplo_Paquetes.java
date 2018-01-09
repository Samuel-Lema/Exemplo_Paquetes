package exemplo_paquetes;

import com.samuel.venta.Ventas;
import com.samuel.taller.Taller;

public class Exemplo_Paquetes {

    public static void main(String[] args) {
        
        Coches coche1 = new Coches("1111");
        Ventas venta1 = new Ventas(coche1, 134, "Renault");
        Taller factura1 = new Taller(coche1, 134.5f);
        
        factura1.cobrar(venta1.getCoche());
        
        System.out.println(venta1.toString());
        System.out.println(factura1.toString());
    }
    
}
