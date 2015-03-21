package progra.dos.mi.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MiClasePrincipal extends ApplicationAdapter {
    Stage stage;

    @Override
    public void create () {
        stage = new Stage();
        stage.addActor(new Pelotita());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render () {
        stage.draw();
        stage.act();
    }
}