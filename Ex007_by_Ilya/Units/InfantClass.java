package Ex007_by_Ilya.Units;

import java.util.ArrayList;

public abstract class InfantClass extends BaseHero {

    int stamina;

    public InfantClass(int hp, int speed, int damage, int maxDamage, int armor, int stamina, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.stamina = stamina;
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends){
        if (this.stamina > 0 && this.hp > 0) {
    
            BaseHero target = null;
            double minDistance = Double.MAX_VALUE;

            for (BaseHero unit : team) {
                if(this.position.getDistance(unit)<minDistance && unit.hp>0){
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }

            }
            // System.out.printf("%s выбрал %s\n", this.getClass().getSimpleName(), target.getClass().getSimpleName());
            if(this.position.getDistance(target)>=2){
                this.position.direction(target.position, friends);
            }
            else if(target.hp > 0){
                this.attack(target, this.damage, this.maxDamage);
                this.stamina--;
            }
        }
    }
}
