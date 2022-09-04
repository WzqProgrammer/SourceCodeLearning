package com.source.wzq.domin;

/**
 * @author wangzhengqing
 * 音响
 */
public class Stereo {

    int volume;

    public void on(){
        System.out.println("音响打开");
    }

    public void off(){
        System.out.println("音响关闭");
    }

    public void setCD(){
        System.out.println("放入CD");
    }

    public void setDvd(){
        System.out.println("放入Dvd");
    }

    public void setRadio(){
        System.out.println("设置收音机");
    }

    public void setVolume(){
        System.out.println("设置音量");
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
}
