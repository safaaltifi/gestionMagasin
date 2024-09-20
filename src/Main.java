public class Main {
    public static void main(String[] args) {


           Produit lait=new Produit();
            lait.setLibelle("Lait");
            lait.setId(1021);
            lait.setMarque("Delice");

            Produit Yaourt=new Produit();
            lait.setLibelle("Yaourt");
            lait.setId(2510);
            lait.setMarque("Vitalait");

           Produit Tomate=new Produit();
            lait.setLibelle("Tomate");
            lait.setId(3250);
            lait.setMarque("Sicam ");

            lait.afficher();
            Yaourt.afficher();
            Tomate.afficher();

            lait.setPrix(0.700);
            Yaourt.setPrix(0.700);
            Tomate.setPrix(0.700);

        }

}