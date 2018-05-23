/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.secondfeature;

import javafx.scene.Scene;
import mvpfxstevepoc.mainview.*;

/**
 *
 * @author andresteve07
 */
public interface SecondFeatureViewContract {
    public Scene getScene();
    public void changeButtonToBlue();
    public void goToFirst();
}
