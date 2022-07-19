package sec01.exam05;

import sec01.exam02.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
    private int volumn;

    public void turnOn(){
        System.out.println("tv on");
    }
    public void turnOff(){
        System.out.println("tv off");
    }
    public void setVolumn(int volumn){
        if(volumn > RemoteControl.MAX_VOLUMN){
            this.volumn = RemoteControl.MAX_VOLUMN;
        }else if(volumn < RemoteControl.MIN_VOLUMN){
            this.volumn = RemoteControl.MIN_VOLUMN;
        }else{
            this.volumn = volumn;
        }
        System.out.println("현재 tv 볼륨 : "+this.volumn);
    }
    public void search(String url){
        System.out.println(url );
    }
}
