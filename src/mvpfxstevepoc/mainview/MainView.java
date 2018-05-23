/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.mainview;


import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import mvpfxstevepoc.ViewsController;

/**
 *
 * @author andresteve07
 */
public class MainView implements MainViewContract{
    
    private MainPresenterContract presenter;
    private ViewsController controller;
    
    private Scene scene;
    private GridPane root;
    private Button mainButton;
    
    public MainView(ViewsController controller) {
        this.controller = controller;
        this.setupGraphicObjects();
        this.presenter = new MainPresenter(this);
        this.presenter.iniciar();
    }
    
    private void setupGraphicObjects(){
        this.root = new GridPane();
        root.setPadding(new Insets(5));
        root.setHgap(10);
        root.setVgap(10);
        this.scene = new Scene(this.root,300, 300);
        //getClass().getClassLoader().getResourceAsStream("imgs/pic1.png").toString();
        //getClass().getResource(name)
        File file = new File("/Users/andresteve07/NetBeansProjects/MVPFXStevePOC/resources/background.jpg");
        System.out.println(file.getName() + " " + file.length());
        //String imagePath = "/Users/andresteve07/NetBeansProjects/MVPFXStevePOC/resources/background.jpg";
        ImageView imageView = null;
        try{
            String imagePath = file.toURI().toURL().toString();
            Image image = new Image(imagePath);
            imageView = new ImageView(image);
            imageView.setFitHeight(10.0);
            imageView.setFitWidth(30.0);
        } catch(Exception exc){
            System.out.println(exc.getMessage());
        }
        final HBox pictureRegion = new HBox();
        pictureRegion.getChildren().add(imageView);
        this.mainButton = new Button();
        //this.mainButton.setStyle("-fx-background-image: url('resources/testing/background.jpg')");
        mainButton.setText("MAIN BUTTON");
        mainButton.setOnAction((ActionEvent event) -> {
            System.out.println("MAIN VIEW!!");
            this.presenter.mainButtonPressed();
        });
        //this.root.add(this.mainButton,1,1);
        this.root.add(pictureRegion, 1, 1);
    }
    
    @Override
    public void changeButtonToBlue(){
         this.mainButton.setStyle("-fx-background-color: #009944");
    }
    

    @Override
    public Scene getScene() {
        return this.scene;
    }

    @Override
    public void goToSecond() {
        this.controller.launchSecondView();
        
    }
    
}
