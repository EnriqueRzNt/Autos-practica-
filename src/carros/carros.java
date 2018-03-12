/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author user
 */
public class carros {

    //declaro variables
    private int id;
    private String name;
    private String color;
    private boolean status;
    private int people;
    private int price;
    //terminó de declarar variables

    //built the constructor
    public carros(int id, String Nombre,int precio, String color, boolean estado, int numpersonas ) {

        this.id = id;
        this.name = Nombre;
        this.color = color;
        this.status = estado;
        this.people = numpersonas;
        this.price = precio;

    }//end of the constructor
    
    //creation of method setidCar
    public void setidcar(int idcar) {
        this.id = idcar;

    }//end of method setidCar

    //creation of method getidCar
    public int getidcar() {
        System.out.println("el id de este coche es:" + id);
        return id;
    }//end of method getidCar

    //creation of method setnameCar
    public void setnamecar(String nameofcar) {
        this.name = nameofcar;

    }//end of method setnameCar

    //creation of method getnameCar
    public String getnamecar() {
        System.out.println("el nombre de este coche es:" + name);
        return name;
    }//end of method getnameCar
    
     //creation of method setcarprice
    public void setcarprice(int precio) {
        this.price = precio;

    }//end of method setcarprice

    //creation of method getcarprice
    public int getcarprice() {
        System.out.println("el precio del coche es: $" + price);
        return price;
    }//end of method getcarprice

    //creation of method setcolorCar
    public void setcolorcar(String colorofcar) {
        this.color = colorofcar;

    }//end of method setcolorCar

    //creation of method getcolorCar
    public String getcolorcar() {
        System.out.println("el color de este coche es:" + color);
        return color;
    }//end of method getcolorCar
    
     //creation of method setcarstatus
    public void setcarstatus(boolean EstadoDelAuto) {
        this.status = EstadoDelAuto;

    }//end of method setcarstatus

    //creation of method getcarstatus
    public boolean getcarstatus() {
        System.out.println("el coche esta:" + status);
        return status;
    }//end of method getcarstatus

    //creation of method setpeople in Car
    public void setpeoplecar(int peopleincar) {
        this.people = peopleincar;

    }//end of method setpeople in Car

    //creation of method getpeople in Car
    public int getpeoplecar() {
        System.out.println("el numero de personas en este coche es de:" + people +" personas");
        return people;
    }//end of method getpeople in Car

  //creation of method toString
  @Override
  public String toString() {
  String aux = "";

        aux = "El id del auto es: "+id+  ", auto se llama: " + name + " el precio es de: $"+price+", es de color:" + color + ", en su interior hay "+people+" personas, y esta ";

        if (status) {
            aux = aux + "encendido";

        } else {
            aux = aux + "apagado";
        }
        return aux;
  
  
  
  }//end of method toString

}
