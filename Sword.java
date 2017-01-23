public class Sword
{
  private String name;
  private int health;
  private String magic;
  private String material;
  private boolean isBroken;
  
  public Sword (String sName, int sHealth, String sMaterial) {
    name = sName;
    health = sHealth;
    material = sMaterial;
    isBroken = false;
  }
  
  public Sword (String sName, int sHealth, String sMaterial, String sMagic) {
    name = sName;
    health = sHealth;
    material = sMaterial;
    magic = sMagic;
    isBroken = false;
  }
  
  public String getName() {
    return name;
  }
  
  public int getHealth() {
    return health;
  }
  
  public String getMagic() {
    if (magic != null)
    return magic;
    else
    return "No magic.";
  }
  
  public String getMaterial() {
    return material;
  }
  
  public void setMagic(String newMagic) {
    magic = newMagic;
  }
  
  public void break() {
    if (health == 0)
    isBroken == true;
  }
  
  public void swing()
  {
    if (isBroken == true)
    System.out.println("The sword is broken");
  }
}
