package net.vastsum.weifactory.payapis.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;


@ServerEndpoint(value = "/websocket/{productId}")
@Component
public class MyWebSocket {
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();

    private static ConcurrentHashMap<String,MyWebSocket> webSocketHashMap = new ConcurrentHashMap<>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session, @PathParam("productId")String productId) {
        this.session = session;
        webSocketHashMap.put(productId,this);
        addOnlineCount();           //在线数加1
        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
        System.out.println("productId是："+productId);
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        Iterator iterator = webSocketHashMap.keySet().iterator();
        while(iterator.hasNext()){
            String productId = (String)iterator.next();
            if(webSocketHashMap.get(productId) == this){
                iterator.remove();
            }
        }
        subOnlineCount();           //在线数减1
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
    @OnMessage
    public void onMessage(String message, Session session) {
    }

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }


    public static void sendMessage(String productId,String message){
        MyWebSocket webSocket = webSocketHashMap.get(productId);
        if (webSocket == null)
            return;
        try {
            String jsonMsg = "{\n" +
                    "  \"code\": 1000,\n" +
                    "  \"message\": \""+message+"\",\n" +
                    "  \"data\": \""+productId+"\",\n" +
                    "  \"success\": true\n" +
                    "}";
            webSocket.session.getBasicRemote().sendText(jsonMsg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }
}
