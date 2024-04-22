package tx.com;

import org.springframework.stereotype.Component;

@Component
public class C  implements I{
    String str;
    @Override
    public void setString(String str) {
        this.str = str;
    }

    @Override
    public String getString() {
        return this.str;
    }
}
