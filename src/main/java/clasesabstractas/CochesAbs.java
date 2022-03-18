package clasesabstractas;

/*
 * @author samjimmaz
 */
public abstract class CochesAbs {//Si pone final no va a tener descendencia.
    
    private int bastidor;
    
    public final void setbastidor(int bastidor){this.bastidor = bastidor;}//Las hijas no van a poder tocar esto al ser final
    
    public abstract int getVelocidad();
    
}
