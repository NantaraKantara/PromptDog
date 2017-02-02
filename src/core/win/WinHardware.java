/**
 * Implementation of HardwareCore for Windows
 * 
 * @author William Barden
 * Jan 27, 2017
 */
package core.win;


import core.HardwareCore;


public class WinHardware implements HardwareCore {

    //systeminfo | find "Host Name"
    @Override
    public String getHostName() {
        return "Will-Lenovo";
    }

    //systeminfo | find "OS Name"
    @Override
    public String getOsName() {
        return "Microsoft Windows 10 Home";
    }

    //systeminfo | find "OS Version"
    @Override
    public String getOsVersion() {
        return "10.0.14393 N/A Build 14393";
    }

    //systeminfo | find "System Type"
    @Override
    public String getSysType() {
        return "x64-based PC";
    }

    //systeminfo | find "BIOS Version"
    @Override
    public String getBiosVersion() {
        return "LENOVO 74CN47WW(V3.08), 1/30/2015";
    }

    //systeminfo | find "Total Physical Memory"
    @Override
    public String getTotalPhysicalMem() {
        return "8,108 MB";
    }

    //systeminfo | find "Available Physical Memory"
    @Override
    public String getTotalAvailableMem() {
        return "4,177 MB";
    }

}
