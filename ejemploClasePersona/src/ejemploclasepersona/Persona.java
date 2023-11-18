
package ejemploclasepersona;


class Persona {
    private String nombre; //Creamos el atributo para el nombre de tipo String y lo hacemos privado, para que solo sea accesible desde la clase
    private String apellido; // Lo mismo que el anterior pero con el apellido
    private int edad; // Creamos el atributo edad, que en este caso sera un numero "int" y sera también privado. 
    private char sexo; // En este caso creamos el atributo sexo, que sera tipo char "H o M" (Hombre o mujer)
    
    // A PARTIR DE AQUÍ SE ENCUENTRAN LOS METODOS GET Y SET PARA PODER USAR LOS ATRIBUTOS DENTRO DEL OBJETO PERSONA

    public String getNombre(){ // Metodo para obtener el Nombre
        return nombre;
    }
    public void setNombre(String txt){ // Metodo para poder setear el nombre, que sera tipo String y se almacenara en txt.
        nombre = txt;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String txt){
        apellido = txt;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int n){
        edad = n;
    }
    
    public String getSexo(){
        String s = null;
        if (sexo=='H')s="Hombre";
        if (sexo=='M')s="Mujer";
        if (sexo!='H'&&sexo!='M')s="Desconocido";
        return s;
    }
    
    public void setSexo(char s){
        sexo=s;
    }
}
            
        
        
        
    
    
    
    
    

    
    
    

