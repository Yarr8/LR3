package SUT.IST012m.Tarasenko.LR3;

import SUT.IST012m.Tarasenko.LR3.Heads.GooseHead;
import SUT.IST012m.Tarasenko.LR3.Heads.Head;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext_old {
    @Bean
    public Bird bird() {
        Bird bird = new Bird();
        bird.setHead(GooseHead());
        return bird;
    }

    @Bean
    public Head GooseHead() {
        Head head = new GooseHead();
        return head;
    }
}
