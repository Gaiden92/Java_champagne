public class SoftwareRegistration {
    /**
     * Les ACCESSEURS
     *  getters : accés (lecture) des attributs
     *  setters : modification des attributs
     */
    public SoftwareRegistration(int expiration){
        this.m_expirationAnnee = expiration;
        System.out.println("Licence valable jusqu'a fin " + this.m_expirationAnnee+ ".");
    }
    
    
    
    
    //Attributs
    private int m_expirationAnnee;
      //Ces ACCESSEURS
        public void changerAnneeExp(int expiration){this.m_expirationAnnee = expiration;}
        public int connaitreAnneExp(){return this.m_expirationAnnee;}

    //Variables de classes
    // variable commune à la classe crée
    private static String m_Entreprise = "IBM";
      //ACCESSEURS
      public void connaitreEntreprise(){ System.out.println(this.m_Entreprise);}
}
