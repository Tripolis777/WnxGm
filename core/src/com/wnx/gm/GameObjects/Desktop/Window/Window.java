package com.wnx.gm.GameObjects.Desktop.Window;

import com.badlogic.gdx.graphics.Color;
import com.wnx.gm.GameObjects.Desktop.DesktopObject;

/**
 * Created by tripo on 3/13/2017.
 */
public interface Window {
    // Behavior methods

    public void show();
    public void hide();

    public void open();
    public void close();

    public class WindowHeader {
        protected Color color;
        protected float height = 50f;

        public void WindowHeader() {
            color = new Color(1f, 1f, 1f, 1f);
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void setHeight(float height) {
            this.height = height;
        }
    }

}

