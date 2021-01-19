package gui;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import model.entities.Department;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {

    private Department entity;

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;
    @FXML
    private Labeled lblErrorName;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnCancel;

    public void setDepartment(Department entity) {
        this.entity = entity;
    }

    public void updateFormData() {
        if (entity == null){
            throw new IllegalStateException("Entity was null");
        }
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(entity.getName());
    }

    @FXML
    public void onBtnSaveAction() {
        System.out.println("btnSave");
    }

    @FXML
    public void onBtnCancelAction() {
        System.out.println("btnCancel");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeNodes();
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 30);
    }

}
