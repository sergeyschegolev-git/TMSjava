package tms.collection;

import tms.collection.service.Application;
import tms.collection.service.ApplicationImpl;

public class Main {
    public static void main(String[] args) {
        Application application = new ApplicationImpl();
        application.start();
    }
}
