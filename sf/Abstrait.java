package sf;

abstract public class Abstrait { //le mot abstract est a préciser si au moins une de ces méthodes au minimum est aussi abstraite
    
    protected String m_Name;

    public String Nommer(){
        return m_Name;
    }

    abstract public void manger();
    public void parler(){
        System.out.println(m_Name+ " rugis !");
    }
}
