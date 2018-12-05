package com.github.al3dekev.actingscreen;

import javax.swing.*;
import java.awt.*;

public class MainMenuTitle extends JPanel {

    public MainMenuTitle(){

    }

    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
        System.out.println("Je suis exécutée !");
        g.fillOval(20, 20, 75, 75);
    }

}
