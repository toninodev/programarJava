
package ejemploclasepersona;


public class EjemploClasePersona {

    
    public static void main(String[] args) {
        Persona a = new Persona();
        a.setNombre("Miguel");
        a.setApellido("Perez");
        a.setEdad(25);
        a.setSexo('H');
        
        System.out.println("Nombre :"+a.getNombre()+" "+a.getApellido());
        System.out.println("Edad :"+a.getEdad());
        System.out.println("Sexo :"+a.getSexo());
    }
    
}
