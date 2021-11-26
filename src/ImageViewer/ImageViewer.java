package ImageViewer;

import Presenter.NextCommand;
import Presenter.PrevCommand;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        
        ImageLoader imageLoader = new FileImageLoader("C:\\Users\\Cecilia Gimenez\\Documents\\NetBeansProjects\\ImageViewer\\Imagenes\\");
        
        MainFrame mainFrame = new MainFrame();
        NextCommand nextCommand = new NextCommand();
        PrevCommand prevCommand = new PrevCommand();
        
        mainFrame.add(prevCommand);
        mainFrame.add(nextCommand);
        
        mainFrame.getImageDisplay().display(imageLoader.load());
    }
    
}
