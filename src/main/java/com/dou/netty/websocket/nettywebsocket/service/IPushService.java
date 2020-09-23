package com.dou.netty.websocket.nettywebsocket.service;

import com.dou.netty.websocket.nettywebsocket.entity.MessageRequest;

/**
 * @author LHL
 */
public interface IPushService {
    /**
     * 推送给指定用户
     *
     * @param request 请求
     */
    void pushMsgToOne(MessageRequest request);

    /**
     * 推送给所有用户
     *
     * @param msg 消息
     */
    void pushMsgToAll(String msg);
}
