package com.lzh.game.socket;

import java.io.Serializable;

public class GameResponse extends AbstractRemotingCommand
        implements Response, Serializable {

    private static final long serialVersionUID = 802660945444591938L;

    private Request request;

    private int status;

    private Throwable error;

    @Override
    public int status() {
        return status;
    }

    public Request getRequest() {
        return request;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.status = FAIL;
        this.error = error;
    }

    public static GameResponse of(Request request, int commandKey) {
        GameResponse response = new GameResponse();
        response.request = request;
        response.setStatus(OK);
        response.setCommonKey(commandKey);
        response.setRemoteId(request.remoteId());
        response.setSession(request.getSession());
        return response;
    }
}
