package objects.block;

import glObject.Model;

/**
 * Created by Tony on 2017/4/23.
 *
 * block: 固定的方块
 */
public class Block {
    short id;
    byte data;
    byte light;

    short dropEntity;
    byte dropCount;

    Model model;
}
