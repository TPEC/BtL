package objects.entity;

/**
 * Created by Tony on 2017/4/23.
 *
 * entity: 掉落物、手中的物品、箱子等
 */
public class Entity {
    short id;
    float fallDistance;
    short fire; //着火
    short air;  //氧气
    byte onGround;
    byte invulnerable;  //不可摧毁
    long UUID;
}
