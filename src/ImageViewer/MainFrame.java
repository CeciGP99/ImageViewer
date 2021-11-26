package ImageViewer;

import Presenter.Command;
import View.UI.Swing.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    private SwingImageDisplay imageDisplay;
    private Map<String, Command> commands = new HashMap<>();
    
    public MainFrame() {
        this.setTitle("Image Viewer");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.add(image());
        this.add(toolbar(), BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private Component image() {
        SwingImageDisplay swingImageDisplay = new SwingImageDisplay();
        this.imageDisplay = swingImageDisplay;
        return swingImageDisplay;
    }

    public void add(Command command){
        commands.put(command.name(), command);
    }
    
    public SwingImageDisplay getImageDisplay() {
        return imageDisplay;
    }  
    
    public Component toolbar(){
        JPanel panel = new JPanel();
        
        panel.add(button("Previous"));
        panel.add(button("Next"));
        
        return panel;
    }
    
    public Component button(String name){
        JButton jButton = new JButton(name);
        return jButton;
    }
}
