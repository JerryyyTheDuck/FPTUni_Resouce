
public class AirConditionor implements KoreaRemote {

    @Override
    public void subtitle(String language) {
        System.out.println("display " + language);
    }

    @Override
    public void onDevice() {
        System.out.println("ON airconditioner");
    }

    @Override
    public void offDevice() {
        System.out.println("OFF airconditioner");
        
    }
    
    public static void main(String[] args) {
        KoreaRemote re = new AirConditionor();
        re.onDevice();
        re.subtitle("Korean");
        re.setLock();
    }

}
