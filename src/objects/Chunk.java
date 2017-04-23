package objects;

/**
 * Created by Tony on 2017/4/23.
 */
public class Chunk {
    int xPos;
    int zPos;
    int[] blocks;

    public Chunk(){
        blocks=new int[512];
    }
}
