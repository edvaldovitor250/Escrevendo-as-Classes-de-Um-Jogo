public class Heroi{

     String nomeHeroi = "Vitor";
     int idadeHeroi = 30;
     String tipoHeroi = "Ninja";

     void  ataque(String ataque){
        System.out.println("O tipo do heroi é " +  tipoHeroi + "atacou usando"  + ataque  );
        
     }

     public static void main(String[] args) {
        Heroi h1 = new Heroi();
        h1.ataque("Espada de fogo");
     }


}