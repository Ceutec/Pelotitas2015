package progra.dos.mi.juego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by turupawn on 03-21-15.
 */
public class PelotitaMala extends Image
{
    PelotitaMala()
    {
        super(new Texture("pelotita_mala.png"));
        addListener(new PelotitaMalaListener(this));

        setY((float)(Math.random()*1000)%(Gdx.graphics.getHeight()-getWidth()));
        setX(-getWidth());
    }
    @Override
    public void act(float delta)
    {
        float posicion_vieja = getX();
        float posicion_nueva = posicion_vieja+1;
        setX(posicion_nueva);
        //setX(getX()+1);
    }
}
