package objects.item;

import java.util.HashMap;

/**
 * Created by Tony on 2017/4/23.
 */
public class ItemList {
    static HashMap<Short,Item> items;

    public static void init(){
        items=new HashMap<>();
    }
}
