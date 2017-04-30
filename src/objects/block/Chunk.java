package objects.block;

/**
 * Created by Tony on 2017/4/23.
 */
public class Chunk {
    int xPos;
    int zPos;
    Section[] section;

    public Chunk(){
        section=new Section[16];
    }
}
