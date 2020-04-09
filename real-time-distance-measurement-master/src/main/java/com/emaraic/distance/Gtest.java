package com.emaraic.distance;

import javax.swing.*;
import java.awt.*;

class GTest extends JFrame
{

    public GTest()
    {
        setSize(300, 200); // 300 pixels across, 200 down
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // Makes window visible
    }
    public void paint(Graphics g) {
        f foo = new f(45, 45);
        while (true) {
            super.paint(g);
            g.setColor(Color.red); // Sets color to red

// NOTE: Title Bar about 22 pixels down
// Border frame about 7 pixels across
// Draw rectangle at X=10, Y=50,
// width=100, height = 70 pixels
            g.drawOval((int) foo.x, (int)foo.y, 20, 20);
// Write text at X = 100, Y = 150
        }
    }

    public static void main(String[] args)
    {
        GTest myWindow = new GTest(); // Title
    }
}
