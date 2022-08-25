package sem4hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        Task task1 = new Task(1l,LocalDateTime.now(),"Make invoice","Jhon","Smith");
        Task task2 = new Task(1l,LocalDateTime.now(),"Make invoice","Jhon","Smith");
        Task task3 = new Task(1l,LocalDateTime.now(),"Make invoice","Jhon","Smith");

        List<Task> tasks = new ArrayList<>();

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        PrintWriter pw = new PrintWriter("/Users/dmitrybuben/IdeaProjects/OOPSeminars/tasks.csv");
        for (Task task : tasks) {
            pw.println(task);
        }
        pw.close();

    }
}
