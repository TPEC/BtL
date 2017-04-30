package objects.block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Tony on 2017/4/23.
 */
public class BlockList {
    static HashMap<Short,Block> blocks;

    public static void init(){
        blocks=new HashMap<>();
        Block block=new Block();
        blocks.put(block.id,block);
    }
}
