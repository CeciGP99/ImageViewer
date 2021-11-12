package ImageViewer;

import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        
        ImageLoader imageLoader = new FileImageLoader("C:\\Users\\Cecilia Gimenez\\Documents\\NetBeansProjects\\ImageViewer\\Imagenes\\dragon.jpg");
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        mainFrame.setVisible(true);
    }
    
}
