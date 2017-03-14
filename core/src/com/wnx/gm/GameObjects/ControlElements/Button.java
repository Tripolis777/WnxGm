package com.wnx.gm.GameObjects.ControlElements;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.wnx.gm.GameObjects.Desktop.DesktopObjectImpl;
import com.wnx.gm.GameObjects.GameObjectImpl;

/**
 * Created by tripo on 3/14/2017.
 */
public class Button extends GameObjectImpl{

    private ButtonListener buttonListener;
    private Rectangle body;

    public Button(float x, float y, float width, float height) {
        this.width = width;
        this.height = height;

        body = new Rectangle(x, y, width, height);

        Gdx.input.setInputProcessor(new InputProcessor() {
            @Override
            public boolean keyDown(int keycode) {
                return false;
            }

            @Override
            public boolean keyUp(int keycode) {
                return false;
            }

            @Override
            public boolean keyTyped(char character) {
                return false;
            }

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                if (button == Input.Keys.LEFT) {
                    if (body.contains(screenX, screenY))
                        buttonListener.onButtonClick();
                    return true;
                }
                return false;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchDragged(int screenX, int screenY, int pointer) {
                return false;
            }

            @Override
            public boolean mouseMoved(int screenX, int screenY) {
                return false;
            }

            @Override
            public boolean scrolled(int amount) {
                return false;
            }
        });
    }

    public Button(float x, float y, float width, float height, ButtonListener buttonListener) {
        this(x, y, width, height);
        this.buttonListener = buttonListener;
    }

    public void setButtonListener(ButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    public void update() {
        float mouseX = Gdx.input.getX();
        float mouseY = Gdx.input.getY();

        if (body.contains(mouseX, mouseY)) {
            buttonListener.onButtonFocus();
        }
    }

    @Override
    public void dispose() {

    }
}
