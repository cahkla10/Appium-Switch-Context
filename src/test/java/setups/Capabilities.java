package setups;

import com.testinium.deviceinformation.DeviceInfo;
import com.testinium.deviceinformation.DeviceInfoImpl;
import com.testinium.deviceinformation.device.DeviceType;
import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import com.testinium.deviceinformation.model.Device;
import helpers.GlobalVariables;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class Capabilities {
    public DesiredCapabilities android() throws IOException, DeviceNotFoundException {
        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        DeviceInfo deviceInfo = new DeviceInfoImpl(DeviceType.ANDROID);

        Device device = deviceInfo.getFirstDevice();

        System.out.println("======= DEVICE INFO ========");
        System.out.println("Platform Name: " + device.getDeviceProductName());
        System.out.println("Platform Version: " + device.getProductVersion());
        System.out.println("Device Name: " + device.getModelNumber());
        System.out.println("Device UDID: " + device.getUniqueDeviceID());
        System.out.println("App Path: " + GlobalVariables.USERDIR + "/src/test/resources/app/AndroidSauceLabs.apk");

        androidCapabilities.setCapability("platformName", device.getDeviceProductName());
        androidCapabilities.setCapability("platformVersion", device.getProductVersion());
        androidCapabilities.setCapability("deviceName", device.getUniqueDeviceID());
//        androidCapabilities.setCapability("app", GlobalVariables.USERDIR + "/src/test/resources/app/AndroidSauceLabs.apk");
        androidCapabilities.setCapability("appPackage", "com.android.chrome");
        androidCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        androidCapabilities.setCapability("autoGrantPermissions","true");
        androidCapabilities.setCapability("clearSystemFiles", "true");
        androidCapabilities.setCapability("chromedriverExecutable", GlobalVariables.CHROMEDRIVER);

        return androidCapabilities;
    }
}