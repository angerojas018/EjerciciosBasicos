package C4;


public class Principal {
    public static void main(String[] args) {
        
    
    Vivienda v1 = new Vivienda();
    Vivienda v2 = new Vivienda();
    Vivienda v3 = new Vivienda();
    Vivienda v4 = new Vivienda();
    
    
    v1.Calle = "Avenida";
    v1.Numero = 495;
    v1.Precio = 500;
    v1.Superficie = 150;
    v1.ConGaraje = false;
    
    v2.Calle = "Cra";
    v2.Numero = 28;
    v2.Precio = 150;
    v2.Superficie = 60;
    v2.ConGaraje = false;
    
    v3.Calle = "Circunvalar";
    v3.Numero = 458;
    v3.Precio = 1000;
    v3.Superficie = 500;
    v3.ConGaraje = true;
    
    v4.Calle = "Rotonda";
    v4.Numero = 8495;
    v4.Precio = 450;
    v4.Superficie = 120;
    v4.ConGaraje = true;
    
    v1.mostrarDatos();
    v2.mostrarDatos();
    v3.mostrarDatos();
    v4.mostrarDatos();
    
    }
    
    
    
    
    
    
    
    
}
