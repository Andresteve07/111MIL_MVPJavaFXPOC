/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvpfxstevepoc.mainview;

/**
 *
 * @author andresteve07
 */
public class MainPresenter implements MainPresenterContract{
    private MainViewContract view;
    
    public MainPresenter(MainViewContract view) {
        this.view = view;
    }

    @Override
    public void iniciar() {
        this.view.changeButtonToBlue();
    }

    @Override
    public void mainButtonPressed() {
        this.view.goToSecond();
    }
    
}
