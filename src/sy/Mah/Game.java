package sy.Mah;

import java.util.Scanner;

public class Game {

   public final int SCHERE = 0;
   public final int STEIN = 1;
   public final int PAPIER = 2;

   public void run(){

       log("Spieler1 Bitte wähle Schere(0) Stein(1) Papier(2)");
       // write your code here
       Scanner myscanner =new Scanner(System.in);
       int player =myscanner.nextInt();

       log("Spieler1 hat gewählt "+convert(player));
       log("Spieler2 Bitte wähle Schere(0) Stein(1) Papier(2)");
       int computer =myscanner.nextInt();
       log("Spieler2 hat gewählt "+convert(computer));
      if (player==computer) {
          log("niemand hat gewonen");
      }
       switch (computer){
           case SCHERE:
               if(computer==STEIN){
                   log("der computer hat gewonnen");
               } else if(computer==PAPIER){
                   log("Sie haben gewonnen");
               }
               break;

           case STEIN:
               if (computer==SCHERE) {
                   log("Sie haben gewonnen");
               }else if (computer==PAPIER) {
                   log("der computer hat gewonnen");
               }
               break;
           case PAPIER:
               if (computer==SCHERE) {
                   log("der computer hat gewonnen");
               }else if (computer==STEIN) {
                   log("Sie haben gewonnen");
               }
               break;

               }
   }
    private void log(String text){

       System.out.println(text);
    }

    public String convert(int value){
       switch(value){

           case SCHERE:
               return "Schere";
           case STEIN:
               return "Stein";
           case PAPIER:
               return "Papier";
            default:
                log( "offnen Sie Ihre Augen");
                throw new RuntimeException();

       }
    }



}
