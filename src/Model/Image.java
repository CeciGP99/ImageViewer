package Model;

public interface Image {
    
    byte[] bitMap();
    
    Image next();
    Image previous();
}
