package ImageViewer;

import Presenter.NextCommand;
import Presenter.PrevCommand;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        
        ImageLoader imageLoader = new FileImageLoader("C:\\Users\\Cecilia Gimenez\\Documents\\NetBeansProjects\\ImageViewer\\Imagenes");
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().display(imageLoader.load());
        
        NextCommand nextCommand = new NextCommand(mainFrame, imageLoader);
        PrevCommand prevCommand = new PrevCommand(mainFrame, imageLoader);
        
        mainFrame.add(prevCommand);
        mainFrame.add(nextCommand);
    }
    
}
