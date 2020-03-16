package com.audruskumpis.todolist;

import com.audruskumpis.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class UpdateDateDialog {

    @FXML
    private DatePicker updateDatePicker;

    public TodoItem updateDate(TodoItem item){

        LocalDate date = updateDatePicker.getValue();
        item.setDeadline(date);

        return item;
    }
}
