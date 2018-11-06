import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame
{
    public Gui()
    {
        super("演示字体、颜色、绘图");
        setVisible(true);
        setSize(480, 250);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(new Font("SansSerif",Font.BOLD,12));
        g.setColor(Color.blue);
        g.drawString("字体ScanSerif,粗体，12号，蓝色",20,50);

        g.setFont(new Font("Serif",Font.ITALIC,14));
        g.setColor(new Color(255,0,0));
        g.drawString("字体Serif，斜体，14号，红色",250,50);

        g.setColor(new Color(125,125,200));
        g.drawLine(20,60,460,60);//绘制直线

        g.setColor(Color.green);
        g.drawRect(20,70,100,50);
        g.fillRect(130,70,100,50);

        g.setColor(Color.yellow);
        g.drawRoundRect(240,70,100,50,50,50);
        g.fillRoundRect(350,70,100,50,50,50);

        g.setColor(Color.cyan);
        g.drawOval(240,130,100,50);
        g.fillOval(350,130,100,50);

        g.setColor(new Color(0,120,0));
        g.drawArc(20,190,100,50,0,90);
        g.fillArc(130,190,100,50,0,90);
    }

    public static void main(String[] args)
    {


    }

}




