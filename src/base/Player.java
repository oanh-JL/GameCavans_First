package base;

import tklibs.SpriteUtils;

public class Player extends  GameObject{
    public Player(){
        this.image= SpriteUtils.loadImage("asset/images/players/straight/0.png");
        this.x=200;
        this.y=300;

    }
    @Override
    public  void run(){
        if (KeyEventPress.isUpPress) {
            if (KeyEventPress.isLeftPress) {
                this.move(-1, -1);
            } else if (KeyEventPress.isRightPress) {
                this.move(1, -1);
            } else {
                this.move(0, -1);
            }
        } else if (KeyEventPress.isDownPress) {
            if (KeyEventPress.isLeftPress) {
                this.move(-1, 1);
            } else if (KeyEventPress.isRightPress) {
                this.move(1, 1);
            } else {
                this.move(0, 1);
            }
        } else if (KeyEventPress.isRightPress) {
            this.move(1, 0);
        } else if (KeyEventPress.isLeftPress) {
            this.move(-1, 0);
        }
    }

    private void move(int translateX, int translateY) {
        this.x=this.x+translateX;
        this.y=this.y+translateY;
    }



}
