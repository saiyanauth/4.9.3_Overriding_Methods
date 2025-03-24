/**
 * Activity 4.9.3
 */
// Hook.java
public class Hook extends LakeObject {
  private int strength = 45;

  // Accessor method for strength
  public int getStrength() {
      return strength; // This return will be updated in the next activity
  }

  // Method to print a message when the hook is obtained
  @Override
  public String say() {
      return "You now have a hook!";
  }

  // Method to catch the object (example interaction with the LakeObject)
  public boolean tryToCatch(LakeObject obj) {
      return obj.wasCaught(this);  // Calls the overridden wasCaught method of the specific object
  }
}
