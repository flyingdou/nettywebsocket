package com.dou.netty.websocket.nettywebsocket.controller;

import com.dou.netty.websocket.nettywebsocket.entity.MessageRequest;
import com.dou.netty.websocket.nettywebsocket.service.IPushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author LHL
 */
@Controller
@RequestMapping("/push")
public class PushController {

    @Autowired
    private IPushService pushService;


    /**
     * 推送给所有用户
     *
     * @param msg 消息
     */
    @PostMapping("/pushAll")
    @ResponseBody
    public void pushToAll(@RequestParam("msg") String msg) {
        pushService.pushMsgToAll(msg);
    }

    /**
     * 推送给指定用户
     *
     * @param request 消息信息
     */
    @PostMapping("/pushOne")
    @ResponseBody
    public void pushMsgToOne(@RequestBody MessageRequest request) {
        pushService.pushMsgToOne(request);
    }

}
