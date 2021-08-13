public class Encapsulation {
    public static void main(String[] args){
       SoftwareRegistration sr = new SoftwareRegistration(2012);
       SoftwareRegistration sr2 = new SoftwareRegistration(2015);
       
       sr.connaitreAnneExp();
       sr2.connaitreAnneExp();

       sr.connaitreEntreprise();
       sr2.connaitreEntreprise();
     }
}
