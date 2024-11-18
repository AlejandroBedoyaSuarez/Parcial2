package Deber1;

class Juego{
    protected String nombreJuego;
    protected double precioJuego;
    protected String generoJuego;
    public Juego(String nombreJuego, double precioJuego, String generoJuego){
       
        this.nombreJuego= nombreJuego;
        this.precioJuego= precioJuego;
        this.generoJuego= generoJuego;
    }

    public String getNombreJuego(){
        return nombreJuego;
    }
    
    public void setNombreJuego(String nombreJuego){
        this.nombreJuego= nombreJuego;
    }

    public double getPrecioJuego(){
        return precioJuego;
    }

    public void setPrecioJuego(double precioJuego){
        this.precioJuego= precioJuego;
    }

    public String getGeneroJuego(){
        return generoJuego;
    }

    public void setGeneroJuego(String generoJuego){
        this.generoJuego= generoJuego;
    }

    public void valorJuegos(){
        System.out.println("El valor del juego: " + nombreJuego + ", del género : "+ generoJuego +" es de " + precioJuego + "");
    }
}

