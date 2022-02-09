package canciones;

import java.util.Objects;

public class Cancion {
    
    private String titulo, autor, genero;
    private int numPista, anioLanzamiento;

    public Cancion(String titulo, String autor, String genero, int numPista, int anioLanzamiento) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPista = numPista;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPista() {
        return numPista;
    }

    public void setNumPista(int numPista) {
        this.numPista = numPista;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int añoLanzamiento) {
        this.anioLanzamiento = añoLanzamiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + Objects.hashCode(this.genero);
        hash = 41 * hash + this.numPista;
        hash = 41 * hash + this.anioLanzamiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (this.anioLanzamiento != other.anioLanzamiento) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }

    @Override
    public String toString() {
        return "La canción se llama "+titulo+" creada por "+autor+" pertenece al género "+genero+" fue lanzada en "+anioLanzamiento+" y ocupa el numero de pista "+numPista+" en el disco.";
    }

    
    
}
