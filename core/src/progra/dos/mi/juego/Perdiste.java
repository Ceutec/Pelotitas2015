package progra.dos.mi.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by turupawn on 03-21-15.
 */
public class Perdiste extends Image
{
    Perdiste()
    {
        super(new Texture("perdiste.png"));

        addListener(new InputListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
            {
                MiClasePrincipal.reiniciarJuego();
                return true;
            }
        });
    }
}
