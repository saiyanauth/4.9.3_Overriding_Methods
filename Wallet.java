/*
 * Activity 4.9.3
 */
// Wallet.java
public class Wallet extends LakeObject {

    @Override
    public String say() {
        return "You now have a wallet!";
    }

    @Override
    public boolean wasCaught(Hook h) {
        return false; // Wallet is not caught by a hook
    }
}
