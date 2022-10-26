package se.nackademin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.util.List;

public class SwitchAction implements ActionListener {

    private List<Path> paths;
    private JLabel jLabel;
    private static int index = 0;
    public SwitchAction(JLabel jLabel, List<Path> paths) {
        this.paths = paths;
        this.jLabel = jLabel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (index == paths.size())
            index= 0;

        ImageIcon imageIcon = new ImageIcon(paths.get(index++).toString());
        Image image = imageIcon.getImage();

        image.getScaledInstance(300, 200,1);
        imageIcon.setImage(image);
        jLabel.setIcon(imageIcon);
    }
}
