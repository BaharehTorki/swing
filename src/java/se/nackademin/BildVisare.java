package se.nackademin;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class BildVisare extends JFrame {

    private final static String DIR_PATH = System.getProperty("user.dir")+"\\image";

    public void run() {
        System.out.println(DIR_PATH);
        List<Path> collection = null;
        try {
            collection = Files.list(Path.of(DIR_PATH)).toList();
        } catch (IOException e) {
            System.out.println(e);
        }

        JPanel jPanel = new JPanel();
        this.add(jPanel);

        JButton jButton = new JButton("next");
        JLabel jLabel = new JLabel();
        jPanel.add(jButton);
        jPanel.add(jLabel);

        jButton.addActionListener(new SwitchAction(jLabel, collection));

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(600, 500);
    }
}
