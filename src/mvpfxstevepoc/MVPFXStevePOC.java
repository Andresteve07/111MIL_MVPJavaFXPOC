/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mvpfxstevepoc.mainview.MainView;
import mvpfxstevepoc.secondfeature.SecondFeatureView;

/**
 *
 * @author andresteve07
 */
public class MVPFXStevePOC extends Application implements ViewsController{
    private Stage mainStage;
    private MainView mainView = null;
    private SecondFeatureView secondFeatureView = null;
    
    @Override
    public void start(Stage primaryStage) {
        this.mainStage = primaryStage;
        this.launchMainView();
        this.mainStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void launchMainView() {
        if(this.mainView == null){
            this.mainView = new MainView(this);
        }
        this.mainStage.setScene(this.mainView.getScene());
    }

    @Override
    public void launchSecondView() {
        if(this.secondFeatureView == null){
            this.secondFeatureView = new SecondFeatureView(this);
        }
        this.mainStage.setScene(this.secondFeatureView.getScene());
    }
    
}
