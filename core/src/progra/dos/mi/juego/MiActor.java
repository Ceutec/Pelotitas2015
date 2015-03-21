package progra.dos.mi.juego;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by turupawn on 03-14-15.
 */
public class MiActor extends Image
{
    MiActor()
    {
        super(new Texture("badlogic.jpg"));
        addListener(new MiInputListener(this));

        setX(100);
    }

    @Override
    public void act(float delta)
    {
        setX(getX() + 1);
    }
}
