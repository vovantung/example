package tx.com;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyThread implements Runnable{
    private String str;
    @Override
    public void run() {
        this.str = "Vo Van Tung";
        System.out.println("ppp");

    }
    public MyThread(String str){
        this.str =str;
    }

}
