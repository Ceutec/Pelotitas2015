package progra.dos.mi.juego;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by turupawn on 03-14-15.
 */
public class MiInputListener extends InputListener{

    MiActor actor;

    MiInputListener(MiActor actor)
    {
        super();
        this.actor = actor;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        actor.setX(0);
        actor.setY(0);
        return true;
    }
}
