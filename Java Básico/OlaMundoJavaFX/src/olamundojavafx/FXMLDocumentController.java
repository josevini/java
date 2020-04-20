package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMsg;
    private Button btn;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMsg.setText("Olá, Mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
