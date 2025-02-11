package com.lzh.game.client.bootstrap;

import com.lzh.game.socket.core.session.Session;

public interface ClientSessionListener {

    String CACHE_KEY = "client_session_listener";

    void onClose(Session session);

    void onOpen(Session session);

    void onException(Session session);
}
