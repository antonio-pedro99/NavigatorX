package com.antoniopedro99.navigatorx;

public interface Navigable {

    /*Define all the behaviour of the navigation.
    *
    *
    * */

    void goTo(Page page);
    void goBack();

    void goToAndDontComeBack(Page page);
}
