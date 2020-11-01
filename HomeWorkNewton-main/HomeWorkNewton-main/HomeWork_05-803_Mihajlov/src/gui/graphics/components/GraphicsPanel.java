package gui.graphics.components;

import javax.swing.*;
import java.awt.*;
import gui.graphics.Painter;
import gui.graphics.coordinatesystem.Converter;
import gui.graphics.MouseClick;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;


public class GraphicsPanel extends JPanel {
    Painter p = null;
    MouseClick m;

    public void addPainter(Painter p){
        this.p = p;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(p!=null) p.paint(g);
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                m.getDots(getMousePosition().x, getMousePosition().y);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
    public void addMausEvent(MouseClick m){
        this.m = m;
    }
}