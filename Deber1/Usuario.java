package Deber1;

class Usuario {
    protected String nombre;
    protected int edad;
    protected String cedula;

    public Usuario(String nombre, int edad, String cedula){
        this.nombre= nombre;
        this.edad= edad;
        this.cedula=cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }


    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad= edad;
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula= cedula;
    }


    public void mostrarInformación(){
        System.out.println("Usuario: " + nombre + ", Edad: " + edad + ", Cédula: " + cedula);
    }
    
}