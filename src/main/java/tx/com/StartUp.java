package tx.com;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class StartUp implements CommandLineRunner {

    String str;
   @Override
    public void run(String... args) throws Exception {


       MyThread thread = new MyThread(str);
       Thread thr1 = new Thread(thread);
       thr1.start();
       Thread.sleep(3000);
       System.out.println(str);

    }

}