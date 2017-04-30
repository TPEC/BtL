package objects.block;

/**
 * Created by Tony on 2017/4/30.
 */
public class Section {
    byte y;

    BlockIns[] bi;

    public Section(){
        bi=new BlockIns[4096];
    }
}
