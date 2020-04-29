/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oshi;

import com.sun.jna.platform.win32.WinUser;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

/**
 *
 * @author kelvi_000
 */
public class aaa {
    public static void main(String [] args){
        SystemInfo si = new SystemInfo();
        
        HardwareAbstractionLayer hal = si.getHardware();
        
        System.out.println(hal.getMemory());
    }
    
}
