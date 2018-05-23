/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.secondfeature;

import mvpfxstevepoc.mainview.*;

/**
 *
 * @author andresteve07
 */
public class SecondFeaturePresenter implements SecondFeaturePresenterContract{
    private SecondFeatureViewContract view;
    
    public SecondFeaturePresenter(SecondFeatureViewContract view) {
        this.view = view;
    }

    @Override
    public void iniciar() {
        this.view.changeButtonToBlue();
    }

    @Override
    public void mainButtonPressed() {
        this.view.goToFirst();
    }
    
}
