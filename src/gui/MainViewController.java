package gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("seller");
    }

    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("department");
    }
    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("about");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
