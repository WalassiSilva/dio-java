public class Usuario {
    public static void main(String [] args){
        SmartTv tv = new SmartTv();

        tv.turnOn();
        System.out.println("TV ligada: " + tv.isOn);
        
        System.out.println("Canal atual: " +tv.channel);
        
        System.out.println("Volume atual: " +tv.volume);
        
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        tv.increaseVolume();
        System.out.println("Volume atual: " +tv.volume);
        
        tv.decreaseVolume();
        System.out.println("Volume atual: " +tv.volume);
        
        tv.channelUp();
        tv.channelUp();
        System.out.println("Canal atual: " +tv.channel);

        tv.changeChannel(12);
        System.out.println("Canal atual: " +tv.channel);

        tv.channelDown();
        System.out.println("Canal atual: " +tv.channel);


        tv.turnOff();
        System.out.println("Novo Status -> TV ligada? " + tv.isOn);
    }
}