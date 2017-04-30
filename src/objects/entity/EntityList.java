package objects.entity;

import java.util.HashMap;

/**
 * Created by Tony on 2017/4/23.
 */
public class EntityList {
    static HashMap<Short,Entity> entities;

    public static void init(){
        entities=new HashMap<>();

    }
}
