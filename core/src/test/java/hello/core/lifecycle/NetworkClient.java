package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient{
    private String url;

    public NetworkClient(){
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public void connect(){
        System.out.println("connect : " + url);
    }
    public void call(String message){
        System.out.println("call : " + url + " message = " + message);
    }
    public void disconnect(){
        System.out.println("close : " + url);
    }

    @PostConstruct //가장 편리하게 사용할 수 있다. 요즘은 걍 이거 씀
    public void init(){
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy //가장 편리하게 사용할 수 있다. 요즘은 걍 이거 씀
    public void close(){
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
