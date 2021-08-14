package jc.entities;

public final class Pegasus extends Horse{ // Le mot final signifie que la classe ne peut pas être étendue
    public Pegasus(String name){
        super(name);
        this.m_Posz = 100;
    }

public void fly(int z){
    this.m_Posz = z;

    System.out.println(super.m_name + " s'eleve dans les airs (Z = " + this.m_Posz + ").");
}
    //Attributs

    private int m_Posz;
    
    
}
