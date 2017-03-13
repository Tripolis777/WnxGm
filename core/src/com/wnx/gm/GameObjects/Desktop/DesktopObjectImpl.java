package com.wnx.gm.GameObjects.Desktop;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.wnx.gm.GameObjects.GameObjectImpl;

/**
 * Created by tripo on 3/13/2017.
 */
public class DesktopObjectImpl extends GameObjectImpl implements DesktopObject{
    protected OrthographicCamera camera;

    public Vector2 position;
    public Vector2 scale;
    public float scaleRate;

    public DesktopObjectImpl() { super(); init(); }
    public DesktopObjectImpl(final OrthographicCamera camera) {
        super();
        this.camera = camera;
        init();
    }

    private void init() {
        position = new Vector2(0f, 0f);
        scale = new Vector2(100f, 100f);
        scaleRate = 1f;
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void render() {
    }

    @Override
    public void setCamera(final OrthographicCamera camera) {
        this.camera = camera;
    }
}
