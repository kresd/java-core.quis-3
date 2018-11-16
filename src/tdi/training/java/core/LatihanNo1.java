package tdi.training.java.core;

import tdi.training.java.core.service.LatihanNo2;
import tdi.training.java.core.data.LatihanNo3;

public class LatihanNo1 {
    public static void main(String[] args) {
        LatihanNo2 service = new LatihanNo2();
        LatihanNo3 data = new LatihanNo3();
        
        service.setNamaLengkap(data);
    }
}