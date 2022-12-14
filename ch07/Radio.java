package ch07;

public class Radio {
    double channel;
    int volume;
    boolean onoff;
    String state = "";
    String radioModel = "";


    public void print(){
        System.out.println("["+radioModel+"]"+"\n"+"라디오가"+state+"\n"+
                "현재 채널은"+channel+"입니다"+"\n"+"볼륨은"+volume+"입니다");
    }
    public void setChannel(double channel) {
        this.channel = channel;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setOnoff(boolean onoff) {
        if (onoff==false) {
            state = "꺼져 있습니다";
        }else {
            state = "켜져 있습니다";
        }this.onoff = onoff;
    }
    public void setRadioModel(String radioModel) {
        this.radioModel = radioModel;
    }

}
