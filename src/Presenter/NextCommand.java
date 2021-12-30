package Presenter;

import ImageViewer.MainFrame;
import View.UI.Swing.SwingImageDisplay;
import View.persistence.ImageLoader;
import View.persistence.files.FileImageLoader;

public class NextCommand implements Command{
    
    private MainFrame mainframe;
    private SwingImageDisplay sid;
    private FileImageLoader fileImageLoade;
    
    public NextCommand(MainFrame mainFrame,ImageLoader fileImageLoader) {
        this.mainframe = mainFrame;
        sid = mainFrame.getImageDisplay();
        this.fileImageLoade = (FileImageLoader) fileImageLoader;
    }
    
    @Override
    public String name() {
        return "Next";
    }

    @Override
    public void execute() {
        sid.display(sid.getImage().next());
    }
    
}
