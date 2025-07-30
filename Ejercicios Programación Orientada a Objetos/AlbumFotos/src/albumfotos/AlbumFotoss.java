package albumfotos;

public class AlbumFotoss {
    private int numPaginas;
    
    public AlbumFotoss(){
        this.numPaginas = 16;
    }
    
    public AlbumFotoss(int numPag){
        this.numPaginas = numPag; 
    }
    
    public int getNumPaginas(){
        return numPaginas;
    }
}
