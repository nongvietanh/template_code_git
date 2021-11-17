package uet.oop.bomberman.tile;

import uet.oop.bomberman.graphics.Sprite;

public class TileManage {
    public static Tile[] tile = new Tile[10];

    public TileManage() {

    }

    public static void createTile() {
        tile[0] = new Tile();
        tile[0].img = Sprite.wall.getFxImage(); // wall = 0
        tile[0].collision = true;

        tile[1] = new Tile();
        tile[1].img = Sprite.brick.getFxImage(); // brick = 1
        tile[1].collision = true;

        tile[2] = new Tile();
        tile[2].img = Sprite.grass.getFxImage(); // grass = 2
//        tile[2].collision = true;

        /*tile[3] = new Tile();
        tile[3].img = Sprite.portal.getFxImage(); // portal = 3
        tile[3].collision = true;*/
    }
}
