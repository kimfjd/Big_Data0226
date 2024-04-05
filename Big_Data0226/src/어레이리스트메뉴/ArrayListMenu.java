package 어레이리스트메뉴;


import java.util.ArrayList;
import java.util.List;

public class ArrayListMenu {
    public static void main(String[] args) {
        List<MenuInfo> menuList= new ArrayList<>();
        menuList.add(new MenuInfo("Americano",2800,"Coffee","커피",true));
        menuList.add(new MenuInfo("Latte",4000,"Coffee","커피",true));
        menuList.add(new MenuInfo("Espresso", 2500,"Coffee","커피",true));
        for(MenuInfo meun:menuList) System.out.println(meun.getJsonFormat());
    }
}
class MenuInfo{
    String name;
    int price;
    String category;
    String desc;
    boolean isTax;

    public MenuInfo(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+ name +","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }

}



