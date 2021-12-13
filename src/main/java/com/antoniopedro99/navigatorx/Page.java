package com.antoniopedro99.navigatorx;

import javafx.scene.layout.AnchorPane;

public class Page {
    static String title;
    private AnchorPane view;

    public Page(AnchorPane view){
        this.view = view;
    }

    public AnchorPane getView() {
        return this.view;
    }

    public void setView(AnchorPane view){
        this.view = view;
    }
}