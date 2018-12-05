package com.github.al3dekev.actingscreen;

import javax.swing.*;
import java.awt.*;


public class WindowScreen extends JFrame {

    private JPanel myPanel = new JPanel();


    public WindowScreen(){
        //using IDE, do not forget to add -Djava.awt.headless=false as VM option

        this.setTitle("Acting Screen");

        this.setSize(400,100);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        this.setResizable(false);

        myPanel.setBackground(Color.ORANGE);

        this.setContentPane(myPanel);
        this.setVisible(true);


    }


}
