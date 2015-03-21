package progra.dos.mi.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

public class MiClasePrincipal extends ApplicationAdapter {
    Stage stage;
    static Ganaste ganaste;
    static Perdiste perdiste;
    static int frame;
    static int velocidad;

    static ArrayList<Pelotita> mis_pelotitas;
    static ArrayList<PelotitaMala> mis_pelotitas_malas;

    static int pelotitas_presionadas;

    SpriteBatch sprite_batch;
    BitmapFont bitmap_font;

    @Override
    public void create () {
        frame = 0;

        velocidad=1;

        pelotitas_presionadas = 0;

        mis_pelotitas = new ArrayList<Pelotita>();
        mis_pelotitas_malas = new ArrayList<PelotitaMala>();

        stage = new Stage();
        stage.addActor(new Fondo());

        ganaste = new Ganaste();
        ganaste.setVisible(false);
        stage.addActor(ganaste);

        perdiste = new Perdiste();
        perdiste.setVisible(false);
        stage.addActor(perdiste);

        Gdx.input.setInputProcessor(stage);

        sprite_batch = new SpriteBatch();
        bitmap_font = new BitmapFont();
    }

    @Override
    public void render () {

        if(!ganaste.isVisible() && !perdiste.isVisible())
        {
            if(frame%50==0)
            {
                Pelotita p = new Pelotita();
                stage.addActor(p);
                mis_pelotitas.add(p);
            }
            if(frame%70==0)
            {
                PelotitaMala pm = new PelotitaMala();
                stage.addActor(pm);
                mis_pelotitas_malas.add(pm);
            }

            frame++;
        }

        stage.draw();
        stage.act();

        sprite_batch.begin();
        bitmap_font.draw(sprite_batch,"presionadas: "+pelotitas_presionadas,100,100);
        bitmap_font.draw(sprite_batch,"tiempo: "+frame,100,200);
        sprite_batch.end();


    }

    static void reiniciarJuego()
    {
        ganaste.setVisible(false);
        perdiste.setVisible(false);

        for(int i=0; i<mis_pelotitas.size(); i++)
        {
            mis_pelotitas.get(i).remove();
        }

        for(int i=0; i<mis_pelotitas_malas.size(); i++)
        {
            mis_pelotitas_malas.get(i).remove();
        }

        pelotitas_presionadas = 0;
        frame=0;
        velocidad=1;
    }
}