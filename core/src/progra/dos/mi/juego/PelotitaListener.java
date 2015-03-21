package progra.dos.mi.juego;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/*
  Created by turupawn on 03-21-15.
 */
public class PelotitaListener extends InputListener
{
    Pelotita pelotita;
    PelotitaListener(Pelotita pelotita)
    {
        super();
        this.pelotita = pelotita;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        pelotita.remove();
        return true;
    }
}
