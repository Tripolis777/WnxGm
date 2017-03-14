package com.wnx.gm.GameObjects.Desktop.Window;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.wnx.gm.GameObjects.Desktop.DesktopObjectImpl;

/**
 * Created by tripo on 3/13/2017.
 */
public class SimpleWindow extends DesktopObjectImpl implements Window {
    private SimpleWindowHeader header;

    private boolean hidden;
    private ShapeRenderer shapeRenderer;

    public SimpleWindow() {
        super();
        init();
    }

    public SimpleWindow(OrthographicCamera camera) {
        super(camera);
        init();
    }

    private void init() {
        shapeRenderer = new ShapeRenderer();
        hidden = true;
        header = new SimpleWindowHeader();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }

    @Override
    public void render() {
        if (hidden) return;
        if (camera == null) return;
        shapeRenderer.setProjectionMatrix(camera.combined);

        shapeRenderer.setColor(new Color(1f, 1f, 1f, 1f));
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.rect(this.position.x, this.position.y, this.scale.x, this.scale.y);
        shapeRenderer.end();

        header.render();
    }

    @Override
    public void show() {
        hidden = false;
    }

    @Override
    public void hide() {
        hidden = true;
    }

    @Override
    public void open() {
        hidden = false;
    }

    @Override
    public void close() {
        hidden = true;
    }

    public WindowHeader getHeader() {
        return header;
    }

    private class SimpleWindowHeader extends WindowHeader {
        public SimpleWindowHeader() {
            this.color = new Color(240/255f, 100/255f, 55/255f, 1f);
            this.height = 20f;
        }

        private void render() {
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(color);
            shapeRenderer.rect(SimpleWindow.this.position.x, SimpleWindow.this.position.y + (SimpleWindow.this.scale.y - height),
                    SimpleWindow.this.scale.x, this.height);
            shapeRenderer.end();
        }

    }
}
