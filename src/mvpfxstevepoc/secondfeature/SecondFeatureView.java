/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.secondfeature;


import mvpfxstevepoc.mainview.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import mvpfxstevepoc.ViewsController;

/**
 *
 * @author andresteve07
 */
public class SecondFeatureView implements SecondFeatureViewContract{
    
    private SecondFeaturePresenterContract presenter;
    private ViewsController controller;
    
    private Scene scene;
    private StackPane root;
    private Button mainButton;
    
    public SecondFeatureView(ViewsController controller) {
        this.controller = controller;
        this.setupGraphicObjects();
        this.presenter = new SecondFeaturePresenter(this);
        this.presenter.iniciar();
    }
    
    private void setupGraphicObjects(){
        this.root = new StackPane();
        this.scene = new Scene(this.root,600, 600);
        this.mainButton = new Button();
        mainButton.setText("SECONDARY BUTTON");
        mainButton.setOnAction((ActionEvent event) -> {
            System.out.println("SECONDDDDDD VIEW!!");
            this.presenter.mainButtonPressed();
        });
        this.root.getChildren().add(this.mainButton);
    }
    
    @Override
    public void changeButtonToBlue(){
         this.mainButton.setStyle("-fx-background-color: #00ff88");
    }
    

    @Override
    public Scene getScene() {
        return this.scene;
    }

    @Override
    public void goToFirst() {
        this.controller.launchMainView();
    }
    
    
    
    
}
