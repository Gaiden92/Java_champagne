public class Personnage {
    //trois constructeur avec surcharge
    public Personnage(){
        this.m_Nom = "inconnue";
        this.m_Race = "inconnue";
        this.m_Force = 0;
        this.m_Vie = 0;
        this.m_Sexe = "";

    }

    public Personnage(String nom){
        this.m_Nom = nom;
        this.m_Race = "inconnue";
        this.m_Force = 0;
        this.m_Vie = 0;
        this.m_Sexe = "";

    }

    public Personnage(String nom, String race, int force, int vie, String sexe){
        this.m_Nom = nom;
        this.m_Race = race;
        this.m_Force = force;
        this.m_Vie = vie;
        this.m_Sexe = sexe;
    }

    public void sePresenter(){
        System.out.println("Je m'appel " + this.m_Nom + ", je suis un " + this.m_Race+ " j'ai " + this.m_Force + " de force, " + this.m_Vie + " de points de vie et je suis de sexe " + this.m_Sexe + ".") ;
    }
    private String m_Nom;
    private String m_Race;
    private int m_Force;
    private int m_Vie;
    private String m_Sexe;
}
