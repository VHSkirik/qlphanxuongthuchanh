package views.table;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class TableStatus extends JLabel {

    private StatusType type;
    
    public TableStatus() {
        setForeground(Color.WHITE);
    }
    
    public StatusType getType() {
        return type;
    }

    public void setType(StatusType type) {
        this.type = type;
        setText(type.toString());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp;
            if (type == StatusType.DangCho) {
                gp = new GradientPaint(0, 0, new Color(186, 123, 247), 0, getHeight(), new Color(167, 94, 236));
            } else if (type == StatusType.DaDuyet) {
                gp = new GradientPaint(0, 0, new Color(142, 142, 250), 0, getHeight(), new Color(123, 123, 245));
            } else {
                gp = new GradientPaint(0, 0, new Color(240, 130, 130), 0, getHeight(), new Color(200, 110, 110));
            }
            g2.setPaint(gp);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 3, 3);
        }
        super.paintComponent(g);
    }
}
