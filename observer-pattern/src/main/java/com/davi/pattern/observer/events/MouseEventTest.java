package com.davi.pattern.observer.events;


import com.davi.pattern.observer.events.mouseevent.Mouse;
import com.davi.pattern.observer.events.mouseevent.MouseEventCallback;
import com.davi.pattern.observer.events.mouseevent.MouseEventType;

/**
 * @Date 2021/6/5
 * @Created by hdw
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        // @谁？  @回调方法
        mouse.addListener(MouseEventType.ON_CLICK, callback);
        mouse.addListener(MouseEventType.ON_FOCUS, callback);

        mouse.click();

        mouse.focus();


    }
}
