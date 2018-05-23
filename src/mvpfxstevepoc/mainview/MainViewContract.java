/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.mainview;

import javafx.scene.Scene;

/**
 *
 * @author andresteve07
 */
public interface MainViewContract {
    public Scene getScene();
    public void changeButtonToBlue();
    public void goToSecond();
}
