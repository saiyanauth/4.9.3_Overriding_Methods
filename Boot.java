/*
 * Activity 4.9.3
 */
// Boot.java
public class Boot extends LakeObject {

    @Override
    public String say() {
        return "You found a boot!";
    }

    // Override wasCaught method to always return true, meaning it's always caught
    @Override
    public boolean wasCaught(Hook h) {
        return true; // Always returns true, so it's always caught when hooked
    }
}
