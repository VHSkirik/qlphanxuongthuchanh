package views.label;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;

public class SVGImage extends JLabel {

    private FlatSVGIcon svgIcon;

    public void setSVGImage(String imageURL) {
        if (svgIcon != null)
            return;
        svgIcon = new FlatSVGIcon(imageURL, getWidth(), getHeight());
        setIcon(svgIcon);
    }
    
    public void setSVGImage(String imageURL, int w, int h) {
        if (svgIcon != null)
            return;
        svgIcon = new FlatSVGIcon(imageURL, getWidth() - w, getHeight() - h);
        setIcon(svgIcon);
    }
}
