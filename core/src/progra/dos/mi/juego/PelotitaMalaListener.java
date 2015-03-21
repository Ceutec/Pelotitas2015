package progra.dos.mi.juego;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by turupawn on 03-21-15.
 */
public class PelotitaMalaListener extends InputListener
{
    PelotitaMala pelotita_mala;
    PelotitaMalaListener(PelotitaMala pelotita_mala)
    {
        this.pelotita_mala = pelotita_mala;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        MiClasePrincipal.perdiste.setVisible(true);
        MiClasePrincipal.perdiste.toFront();
        pelotita_mala.remove();
        return true;
    }
}
