/*
 * Activity 4.9.3
 */
// Bait.java
public class Bait extends LakeObject {

    @Override
    public String say() {
        return "You now have some bait!";
    }

    // Default behavior for wasCaught (bait isn't caught by hooks)
    @Override
    public boolean wasCaught(Hook h) {
        return false;
    }
}
