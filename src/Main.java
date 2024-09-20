public class Main {
    public static void main(String[] args) {


            org.example.entities.Produit lait=new org.example.entities.Produit();
            lait.setLibelle("Lait");
            lait.setId(1021);
            lait.setMarque("Delice");

            org.example.entities.Produit Yaourt=new org.example.entities.Produit();
            lait.setLibelle("Yaourt");
            lait.setId(2510);
            lait.setMarque("Vitalait");

            org.example.entities.Produit Tomate=new org.example.entities.Produit();
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