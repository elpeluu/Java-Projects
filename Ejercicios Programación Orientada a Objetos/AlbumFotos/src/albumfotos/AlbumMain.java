package albumfotos;

public class AlbumMain {

    public static void main(String[] args) {
        // Creacion de un album de forma predeterminada
        AlbumFotoss album1 = new AlbumFotoss();
        System.out.println("El Album 1 tiene " + album1.getNumPaginas() + " fotos");
        
        // Album creado especificando el numero de paginas
        AlbumFotoss album2 = new AlbumFotoss(24);
        System.out.println("El Album 2 tiene " + album2.getNumPaginas() + " fotos");
        
        // Creacion de un Album grande
        superAlbumFotos superAlbum = new superAlbumFotos();
        System.out.println("El super album tiene " + superAlbum.getNumPaginas() + " fotos");
    }
    
}
