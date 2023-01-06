package helpers;

import setups.DriverSetup;

import java.util.Set;

public class Switcher {
    int index;

    //context switcher, n = 0 to app, n = 1 to web
    public void switchContextTo(int index){
        this.index = index;

        Set<String> contextNames = DriverSetup.getAppiumDriver().getContextHandles();
        DriverSetup.getAppiumDriver().context((String) contextNames.toArray()[index]);
        System.out.println("Actual Context: " + contextIdx());
    }

    public int contextIdx() {
        int idx = this.index;
        return idx;
    }
}