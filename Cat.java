public class Cat {

    //On se sert du constructeur pour récuperer les attributs
       public Cat(String nom, int age){
            this.m_Nom = nom;
            this.m_age = age;
           System.out.println("Miaou, je m'appel " + this.m_Nom + " et j'ai " + this.m_age +" ans");
           
       };
       public int AugmenterAge(int nombre){
        return m_age = (m_age + nombre);
     }

     //création attributs
      private String m_Nom;
      private int m_age;
}
