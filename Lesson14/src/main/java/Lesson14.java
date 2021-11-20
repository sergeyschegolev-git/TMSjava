import io.service.*;

import java.io.IOException;

public class Lesson14 {
    public static void main(String[] args) {
        Runable firstHomeworkService = new FirstHomeworkService();
        Runable secondHomeworkService = new SecondHomeworkService();
        Runable thirdHomeworkService = new ThirdHomeworkService();
        Runable fourthHomeworkService = new FourthHomeworkService();

        Runable[] tasks = {firstHomeworkService, secondHomeworkService, thirdHomeworkService, fourthHomeworkService};

        try {
            for (Runable task : tasks) {
                task.run();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
