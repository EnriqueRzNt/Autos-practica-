/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Enrique Rz.
 */
public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option2 = 0;
        int conditionid = 0;

        //creation of objects
        carros nissan = new carros(01, "nissan A100", 150000, "azul", true, 5);
        carros ford = new carros(02, "ford fiesta ", 200000, "gris", true, 2);
        carros chevrolet = new carros(03, "chevi", 100000, "negro", false, 0);
        //end of creation of objects

        //creation of ArrayList carslist
        ArrayList<carros> carslist = new ArrayList<>();
        carslist.add(nissan);
        carslist.add(ford);
        carslist.add(chevrolet);

        System.out.println("☺ ☻ ☺ ☻ WELCOME ☻ ☺ ☻ ☺");
        do {
            try {
                //main menu 
                System.out.println("\n-----------------------------\n");
                System.out.println("0-Out\n");
                System.out.println("1-Check all information\n");
                System.out.println("2-Change name of a car\n");
                System.out.println("3-sell a car\n");
                System.out.println("4-Add new car\n");
                System.out.println("Place choose an option--->");
                int option = scan.nextInt();

                if (option < 0 || option > 4) {
                    System.out.println("\n-----------------------------\n");
                    System.out.println("!!!!!!............♦ error, this option does't exist ♦............!!!!!");
                    System.out.println("\n-----------------------------\n");
                }//end of if

                //creation of switch about option of menu
                switch (option) {
                    case 0:
                        System.out.println("\n-----------------------------\n");

                        break;

                    case 1:
                        System.out.println("\n-----------------------------\n");

                        int numofcars = carslist.size();//<--aqui estoy guardando en una variable el numero total de objetos en el arraylist

                        for (int i = 0; i <= numofcars; i++) {

                            int suma = i + 1;

                            System.out.println("Car number " + suma + " --->" + carslist.get(i) + "\n\n");

                        }//end of for

                        
                        
                        
                        break;
                    case 2:
                        do {
                            conditionid = 0;
                            System.out.println("\n-----------------------------\n");
                            for(int i = 1; i<=carslist.size();i++){
                            
                                System.out.println("id : "+i);
                            }
                            System.out.println("Choose me the id car that you want to see \n");
                            int idconsulta = scan.nextInt();
                            int newidconsulta = idconsulta - 1;
                            if (idconsulta <= carslist.size() - carslist.size() || idconsulta > carslist.size()) {
                                System.out.println("♦♦♦♦this id does't exist......\n");
                                conditionid = conditionid + 1;
                            }//end of the if
                            else {
                                System.out.println("\n-----------------------------\n");

                                System.out.println(carslist.get(newidconsulta));
                                scan.nextLine();
                                System.out.println("Give me the new name of the car number :\n " + idconsulta);
                                String newnamecar = scan.nextLine();
                                carslist.get(newidconsulta);
                                carslist.get(newidconsulta).setnamecar(newnamecar);
                                System.out.println("\n-----------------------------\n");
                                System.out.println("The new information of car number  " + idconsulta + " is : \n " + carslist.get(newidconsulta) + "\n");
                            }//end of the else
                        } while (conditionid == 1);

                        break;

                    case 3:
                        do {
                            conditionid = 0;
                            System.out.println("\n-----------------------------\n");
                            for(int i = 1; i<=carslist.size();i++){
                            
                                System.out.println("id : "+i);
                            }
                            System.out.println("choose the id car that you want to sell \n");
                            int idconsulta2 = scan.nextInt();
                            int newidconsulta2 = idconsulta2 - 1;
                            if (idconsulta2 <= carslist.size() - carslist.size() || idconsulta2 > carslist.size()) {
                                System.out.println("♦♦♦♦this id does't exist......\n");
                                conditionid = conditionid + 1;
                            }//end of the if
                            else {
                                System.out.println("The information of the car sold is: \n" + carslist.get(newidconsulta2));
                                carslist.remove(newidconsulta2);
                                System.out.println("\n\n\n▬$▬$▬The car has been sold▬$▬$▬");
                                System.out.println("\n-----------------------------\n");
                            }//end of the else
                        } while (conditionid == 1);

                        break;

                    case 4:
                        String newnamecarobj;
                        int newnidcarobj = carslist.size() + 1;
                        int newpricecarobj;
                        String newcolorcarobj;
                        boolean newstatuscarobj = false;
                        int newpeoplecarobj;
                        System.out.println("\n-----------------------------\n");
                        scan.nextLine();
                        System.out.println("Give me the name of the new car :\n ");
                        newnamecarobj = scan.nextLine();

                        System.out.println("Give me the price of the new car :\n ");
                        newpricecarobj = scan.nextInt();

                        scan.nextLine();
                        System.out.println("Give me the color of the new car :\n ");
                        newcolorcarobj = scan.nextLine();

                        System.out.println("Give me the number of people in  the new car :\n ");
                        newpeoplecarobj = scan.nextInt();

                        carros mynewcar = new carros(newnidcarobj, newnamecarobj, newpricecarobj, newcolorcarobj, newstatuscarobj, newpeoplecarobj);
                        carslist.add(mynewcar);
                        System.out.println("\n-----------------------------\n");
                        System.out.println("\n-----------------------------\n");
                        System.out.println("The new car has been added\n");
                        System.out.println(carslist.get(carslist.size() + 1));
                        System.out.println("☺-☺-☺ Ready ☺-☺-☺");
                        System.out.println("\n-----------------------------\n");

                        break;

                    default:
                }//end of switch

                if (option == 0) {
                    option = option + 1;
                } else {
                    System.out.println("Would you like to do other action:\n");
                    System.out.println("1--si\n");
                    System.out.println("2--no\n");
                    option2 = scan.nextInt();
                }

            } catch (Exception ex) {
               
            }//end of the catch

        } while (option2 > 0 && option2 < 2);
        System.out.println("☻☻☻☻☻.........bye.........☻☻☻☻☻");

    }

}
