package Lesson_7.Units;
public class Crossbowman extends BaseHero {
    private int ammo;
    private int maxAmmo;

    public Crossbowman(int ammo, int maxAmmo) {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
            Crossbowman.r.nextInt(100, 200));
        this.maxAmmo = Crossbowman.r.nextInt(50, 200);;
        this.ammo = maxAmmo;
    }

    public String getInfo() {
        return String.format("%s  Ammo: %d",super.getInfo(), this.ammo);
    }
}