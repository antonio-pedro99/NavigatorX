package com.antoniopedro99.navigatorx;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Page extends AnchorPane implements Navigable {
    static AnchorPane currentPage;
    static AnchorPane nextPage;
    static String title;


    @Override
    public void goTo(AnchorPane nextPage) {
        Page.nextPage =  nextPage;
        Stage nextStage = (Stage) currentPage.getScene().getWindow();
        nextStage.setScene(new Scene(nextPage));
        nextStage.setTitle(Page.title);
        nextStage.show();
    }

    @Override
    public void goBack() {
        Stage stage = (Stage) Page.nextPage.getScene().getWindow();
        stage.setScene(Page.currentPage.getScene());
        stage.show();
    }

    static void setCurrent(AnchorPane currentPage) {
        Page.currentPage = currentPage;
    }

    void setTitle(String title) {
        Page.title = title;
    }
}
