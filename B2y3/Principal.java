package B2y3;


public class Principal {
    
     public static void main(String[] args) {
        Mascara m1 = new Mascara();
        Mascara m2 = new Mascara();
        
        
        m1.Personaje = "Antonio";
        m1.TienePelo = false;
        
        m2.Personaje = "Maria";
        m2.TienePelo = true;
        
        m1.mostrarDatos();
        m2.mostrarDatos();
         
     }
    
    
    
}
