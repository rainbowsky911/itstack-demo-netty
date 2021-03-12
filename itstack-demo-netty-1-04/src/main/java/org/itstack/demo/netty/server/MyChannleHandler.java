package org.itstack.demo.netty.server;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 *
 * @author 51473
 */
public class MyChannleHandler {

    //// TODO: 2021/3/12  群组发消息接收不到消息 
    //存放用户Channel信息。
    public  static  ChannelGroup channelGroup =new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
