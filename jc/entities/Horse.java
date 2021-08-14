package jc.entities;

public class Horse{
    public Horse(String name){
        this.m_name = name;
        this.m_Posx = 50;
        this.m_Posy = 50;

        

    } 
    
    public void Move(int x, int y){

        
        this.m_Posx = x;
        this.m_Posy = y;

      

        System.out.println(this.m_name + " se deplace (X = " + this.m_Posx + ", Y = " + this.m_Posy + ").");
    }
    //Attributs
    protected String m_name;
    protected int m_Posy;
    protected int m_Posx;
}
