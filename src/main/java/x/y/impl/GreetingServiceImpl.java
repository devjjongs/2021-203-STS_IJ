package x.y.impl;

import x.y.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    private String greeting;
    private int loopCount;

    public GreetingServiceImpl() {

    }

    public GreetingServiceImpl(String greeting, int loopCount) {
        this.greeting = greeting;
        this.loopCount = loopCount;
    }

    @Override
    public void greetings() {
        for (int i = 1; i <= loopCount; i++) {
            System.out.println(greeting);
        }
    }
}
