package dasturlash.uz;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private String nickName;

    @PostConstruct
    public void initMethod() throws Exception {
        System.out.println("After bean initialization.");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Before bean destroying.");
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
