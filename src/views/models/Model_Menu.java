
package views.models;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {
    
    String icon;
    String name;
    MenuType menuType;

    public Model_Menu() {
    }

    public Model_Menu(String icon, String name, MenuType menuType) {
        this.icon = icon;
        this.name = name;
        this.menuType = menuType;
    }
    
    public Icon toIcon(){
        FlatSVGIcon svgIcon = new FlatSVGIcon("./views/icon/svg/" + icon + ".svg", 32, 32);
        return  svgIcon;
//        return new ImageIcon(getClass().getResource("/views/icon/" + icon + ".png"));
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getMenuType() {
        return menuType;
    }

    public void setMenuType(MenuType menuType) {
        this.menuType = menuType;
    }
    
    public static enum MenuType{
        TITLE, MENU, EMPTY
    }
}
