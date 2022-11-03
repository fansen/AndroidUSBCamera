package com.jiangdg.usbcamera.utils;

public class RawData {
    public int index;
    public byte[] data;
    public int dataLength;

    public RawData(int index, byte[] data, int dataLength) {
        this.index = index;
        this.data = data;
        this.dataLength = dataLength;
    }

}
