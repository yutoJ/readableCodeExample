package ex11;

import java.time.LocalDate;

public class DueDate {

    LocalDate dueDate;

    boolean isEpired(){
        return false;
    }

    boolean isExpiredOn(LocalDate date){
        return false;
    }

    int remainingDays(){
        return 0;
    }

    AlertType alertPriority(){
        return null;
    }
}
