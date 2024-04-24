package E6;
public class Principal {
    public static void main(String[] args) {
        
        Chalet c1 = new Chalet();
        Chalet c2 = new Chalet();
        Chalet c3 = new Chalet();
        Chalet c4 = new Chalet();
        Chalet c5 = new Chalet();
        
        c1.getCalle();
        c1.getPrecio();
        c1.getPrecio();
        c1.getSuperficie();
       
        c2.setCalle("Fin1");
        c2.setNumParcela(8);
        c2.setPrecio(1000);
        c2.setSuperficie(500);
        
        c3.setCalle("Fin2");
        c3.setNumParcela(15);
        c3.setPrecio(500);
        c3.setSuperficie(200);
        
        c4.setCalle("Fin3");
        c4.setNumParcela(9);
        c4.setPrecio(-50);
        c4.setSuperficie(500);
        
        c5.setCalle("Fin4");
        c5.setNumParcela(9);
        c5.setPrecio(1000);
        c5.setSuperficie(5000);
      
        c1.mostrarDatos();
        c2.mostrarDatos();
        c3.mostrarDatos();
        c4.mostrarDatos();
        c5.mostrarDatos();
    }  
}
