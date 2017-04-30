package objects;

import objects.block.Chunk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2017/4/23.
 */
public class World {
    List<Chunk> chunks;

    public World(){
        chunks=new ArrayList<>();
    }
}
