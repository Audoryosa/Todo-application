package com.audruskumpis.todolist;

import com.audruskumpis.todolist.datamodel.TodoData;
import com.audruskumpis.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;
    @FXML
    private TextArea detailsArea;
    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue;

        if(shortDescription.equals("")){
            shortDescription = "Todo";
        }

        if(deadlinePicker.getValue() == null){
           deadlineValue = LocalDate.now();
        } else {
            deadlineValue = deadlinePicker.getValue();
        }


        TodoItem item = new TodoItem(shortDescription, details, deadlineValue);
        TodoData.getInstance().addTodoItem(item);
        return item;
    }

}
