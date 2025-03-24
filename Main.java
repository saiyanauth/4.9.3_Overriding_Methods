// Main.java
public class Main {
    public static void main(String[] args) {
        // Create instances of each object
        Hook myHook = new Hook();
        Bait myBait = new Bait();
        Fish myFish = new Fish(5.0);  // Fish with weight 5.0
        Wallet myWallet = new Wallet();
        Boot myBoot = new Boot();

        // Test the say() method for each object
        System.out.println(myHook.say());   // Should print: You now have a hook!
        System.out.println(myBait.say());   // Should print: You now have some bait!
        System.out.println(myFish.say());   // Should print: You caught a fish!
        System.out.println(myWallet.say()); // Should print: You now have a wallet!
        System.out.println(myBoot.say());   // Should print: You found a boot!

        // Test the wasCaught() method for each object with the Hook
        System.out.println("Fish caught: " + myFish.wasCaught(myHook));  // Should print: true
        System.out.println("Bait caught: " + myBait.wasCaught(myHook));  // Should print: false
        System.out.println("Boot caught: " + myBoot.wasCaught(myHook));  // Should print: true (always true for Boot)
        System.out.println("Wallet caught: " + myWallet.wasCaught(myHook));  // Should print: false
    }
}
