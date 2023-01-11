
public interface VNRemote {
    final int MAXofButtons =20;
    int price = 10;
    public static void setTimmer(int number){
        System.out.println("Shut down after " + number + "second");
    }
    public abstract void onDevice();    
    abstract public void offDevice();
    default void setLock(){
        System.out.println("set lock in the default mode");
    }
    
}
