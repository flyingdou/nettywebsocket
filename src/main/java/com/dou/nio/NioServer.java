package com.dou.nio;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 * @author flying
 * @date 2020/9/23 17:35
 */
public class NioServer {


    public static void main(String[] args) throws Exception {
        // 创建serverSocketChannel -> serverSocket
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        //得到一个selector对象
        Selector selector = Selector.open();

        // 绑定一个端口6666，在服务器端监听
        serverSocketChannel.socket().bind(new InetSocketAddress(6666));

        // 设置非阻塞
        serverSocketChannel.configureBlocking(false);

        //把serverSocketChannel注册到selector, 关心事件为op_accpet
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

    }



}
