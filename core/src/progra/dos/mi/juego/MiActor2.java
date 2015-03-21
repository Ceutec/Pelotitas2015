package progra.dos.mi.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by turupawn on 03-14-15.
 */
public class MiActor2 extends Image{
    MiActor2()
    {
        super(new Texture("badlogic.jpg"));
    }
    @Override
    public void act(float delta)
    {
        setY(getY()+1);
    }
}
