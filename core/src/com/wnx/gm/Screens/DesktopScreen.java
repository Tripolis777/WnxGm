package com.wnx.gm.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.wnx.gm.GameObjects.Desktop.Window.SimpleWindow;
import com.wnx.gm.WnxGmMain;

/**
 * Created by tripo on 3/13/2017.
 */
public class DesktopScreen implements Screen {
    private ShapeRenderer shapeRenderer;
    private OrthographicCamera camera;
    private SimpleWindow window;
    private WnxGmMain game;

    public DesktopScreen(final WnxGmMain game) {
        this.game = game;

        float width = Gdx.graphics.getWidth();
        float height = Gdx.graphics.getHeight();

        camera = new OrthographicCamera(width, height);
        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
        camera.update();

        float rectWidth = 200;
        float rectHeight = 100;
        float rectX = (width - rectWidth) / 2f;
        float rectY = (height - rectHeight) / 2f;

        window = new SimpleWindow(camera);
        //window.position = new Vector2(rectX, rectY);
        //window.scale = new Vector2(width, height);
        window.show();
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void show() {
        Gdx.app.log("Debug", "Create DesktopScreen");
    }

    @Override
    public void render(float delta) {
        camera.update();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        window.render();

//        float width = Gdx.graphics.getWidth();
//        float height = Gdx.graphics.getHeight();
//
//        float rectWidth = 200;
//        float rectHeight = 100;
//        float rectX = (width - rectWidth) / 2f;
//        float rectY = (height - rectHeight) / 2f;
//
//        float mouseX = Gdx.input.getX();
//        float mouseY = Gdx.input.getY();
//
//        Color rectColor = new Color(0f, 0f, 0f, 1f);
//
//        Gdx.app.log("Debug", String.format("mouseX:%f, mouseY:%f", mouseX, mouseY));
//
//        if ((mouseX >= rectX && mouseX <= rectX + rectWidth) &&
//                (mouseY >= rectY && mouseY <= rectY + rectHeight )) {
//            rectColor.g = 1f;
//        }
//
//        shapeRenderer.setProjectionMatrix(camera.combined);
//        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
//        shapeRenderer.setColor(rectColor);
//        shapeRenderer.rect(rectX, rectY, rectWidth, rectHeight);
//        shapeRenderer.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
        window.dispose();
    }
}
