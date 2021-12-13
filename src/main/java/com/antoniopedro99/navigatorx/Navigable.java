package com.antoniopedro99.navigatorx;

import javafx.scene.layout.AnchorPane;

public interface Navigable {
    void goTo(AnchorPane node);
    void goBack();
}
