
public class Television implements ChinaRemote, VNRemote {

    @Override
    public void increaseVolumn() {
        System.out.println("increase volumn");
    }

    @Override
    public void descreaseVolumn() {
        System.out.println("decrease volumn");
    }

    @Override
    public void onDevice() {
        System.out.println("ON TV");
    }

    @Override
    public void offDevice() {
        System.out.println("OFF TV");
    }
    public static void main(String[] args) {
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        VNRemote.setTimmer(10000);
        System.out.println("TV remote's price: " + VNRemote.price);
        System.out.println("TV remote has: "+ VNRemote.MAXofButtons + "buttons");
        ChinaRemote remote2 = new Television();
        remote2.increaseVolumn();
    }
}
