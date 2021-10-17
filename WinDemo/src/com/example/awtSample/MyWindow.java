package com.example.awtSample;

import java.awt.*; // meaning to import all java classes, subclasses and static objects from that package
import java.awt.event.WindowAdapter; // this is a subpackage in awt package - .WindowAdapter is a class in .event
import java.awt.event.WindowEvent; // the same as the annotation above

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0 );
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, (12));
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);

    }
}
