import base.BackGround;
import base.Player;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    BackGround backGround;
    Player player;
    public GameCanvas(){
        this.backGround=new BackGround();
        this.player=new Player();
    }
    public void run (){
        backGround.run();
        player.run();
    }
    public void render(Graphics g){
        backGround.render(g);
        player.render(g);
    }
    @Override
    protected  void paintComponent(Graphics g){this.render(g);}
}
