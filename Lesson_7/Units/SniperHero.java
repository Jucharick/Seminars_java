package Lesson_7.Units;

public class SniperHero extends BaseHero {
    private int ammo;
    private int maxAmmo;

    public SniperHero(int ammo, int maxAmmo) {
        super(String.format("Hero_Sniper #%d", ++SniperHero.number),
            SniperHero.r.nextInt(100, 200));
        this.maxAmmo = SniperHero.r.nextInt(50, 200);;
        this.ammo = maxAmmo;
    }

    public String getInfo() {
        return String.format("%s  Ammo: %d",super.getInfo(), this.ammo);
    }
}