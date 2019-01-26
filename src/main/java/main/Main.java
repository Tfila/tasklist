package main;

import location.model.Location;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Location location= new Location(1,"Łódź","90-444","Pomorska","117");
        Task task = new Task(1,"instalacja","instalacja sprzetu klienta",null, Status.OPEN,false,
                LocalDate.now(),null,null, Priority.LOW,location,null,null);
        Task task2=new Task.TaskBuilder()
                .withId(2)
                .withTitle("Naprawa")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary("Naprawa usterki")
                .withLocation(new Location(2,"Łódź","90-505","Mickiewicza","9"))
                .withStatus(Status.OPEN)
                .withDone(false)
                .withCreateDate(LocalDate.now())
                .build();
    }
}
