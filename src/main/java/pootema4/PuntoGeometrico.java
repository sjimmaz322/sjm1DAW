package pootema4;

public class PuntoGeometrico {
    
    private int coorX, coorY;

    public PuntoGeometrico() {
        this.coorX = 0;
        this.coorY = 0;
    }

    public PuntoGeometrico(int coordenadaX, int coordenadaY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }
    
    @Override
    public String toString() {
        return " coordinada X = ("+ coorX + ") y coordenada Y = ("+ coorY+")";
    }
    
    
    
}
