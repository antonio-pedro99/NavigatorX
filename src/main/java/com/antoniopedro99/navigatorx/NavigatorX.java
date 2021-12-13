package com.antoniopedro99.navigatorx;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Stack;

public class NavigatorX  implements  Navigable {

    private Stack<Page> pageStack = new Stack<Page>();

    //Push a page into the stack - At the top!
    @Override
    public void goTo(Page page) {
        updateScreen(page);
    }

    //Pop the page at the top of the stack.
    @Override
    public void goBack() {
        pageStack.pop();
        updateScreen(pageStack.peek());
        System.out.printf("poped"+pageStack.size());
    }

    //Push the page into the stack and remove the previous top
    @Override
    public void goToAndDontComeBack(Page page) {

    }

    public void setInitPage(Page page){
        pageStack.push(page);
    }

    public Stack<Page>  getStack(){
        return pageStack;
    }

    //add the page to the user view automatically.  Will be called to redraw the user
    private void updateScreen(Page page) {
        AnchorPane _current = (AnchorPane) getStack().peek().getView();
        Stage nextStage = (Stage) _current.getScene().getWindow();
        nextStage.setScene(new Scene(page.getView()));
        pageStack.push(page);
        System.out.printf("Pushed!!!" + pageStack.size());
        nextStage.show();
    }
}
