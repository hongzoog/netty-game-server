package com.lzh.game.socket.core.session;


import io.netty.channel.Channel;

import java.util.function.Consumer;

/**
 * Main class for for access to the {@link Session ,Channel}
 */
public interface SessionManage<T extends Session> extends SessionFactory<T> {

    T getSession(String sessionId);

    void updateLastAccessTime(T session);

    void pushSession(String sessionId, T session);

    void addSessionCloseListening(Consumer<T> consumer);

    boolean contain(String sessionId);

    T getSession(Channel channel);

    boolean removeSession(String sessionId);

    /**
     * Session connect event
     * @param connected
     */
    void addConnectListener(Consumer<T> connected);
}
