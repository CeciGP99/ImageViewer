package Presenter;

import ImageViewer.MainFrame;
import View.UI.Swing.SwingImageDisplay;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

public class PrevCommand implements Command{

    private MainFrame mainframe;
    private SwingImageDisplay sid;
    private FileImageLoader fileImageLoade;
    
    public PrevCommand(MainFrame mainFrame,ImageLoader fileImageLoader) {
        this.mainframe = mainFrame;
        sid = mainFrame.getImageDisplay();
        this.fileImageLoade = (FileImageLoader) fileImageLoader;
    }
    
    @Override
    public String name() {
        return "Prev";
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().previous());
    }
    
}
