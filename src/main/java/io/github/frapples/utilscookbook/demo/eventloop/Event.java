package io.github.frapples.utilscookbook.demo.eventloop;


/**
 * @author Frapples <isfrapples@outlook.com>
 * @date 2018/9/5
 */
public interface Event {

    boolean isComplete();

    void runCallback();
}
