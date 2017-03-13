package com.wnx.gm.GameObjects.Desktop;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.wnx.gm.GameObjects.GameObject;

/**
 * Created by tripo on 3/13/2017.
 */
public interface DesktopObject extends GameObject {

    public void render();
    public void setCamera(OrthographicCamera camera);

}
