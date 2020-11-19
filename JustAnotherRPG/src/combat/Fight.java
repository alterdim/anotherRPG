package combat;

import java.util.HashMap;

import character.Monster;
import character.Player;
import game.Main;
import system.Choice;
import system.TypeSlow;

public class Fight 
{
    private Player hero;
    private Monster enemies[];
    private boolean fightGoesOn = true;
    private String a[] = {"a"};
    private int aliveEnemies = 0;
    private HashMap<Monster, Boolean> deadMap = new HashMap<Monster, Boolean>();

    private boolean heroChoiceMade;
    private String choiceString;

    public Fight(Player hero, Monster enemies[]) 
    {
        this.hero = hero;
        this.enemies = enemies;
        aliveEnemies = enemies.length;

        for (Monster m : enemies)
        {
            aliveEnemies++;
            deadMap.put(m, false);
        }
        while (fightGoesOn) 
        {
            if (hero.isDead())
            {
                TypeSlow.typeSlow("Game Over.");
                Main.main(a);
            }
            
            if (aliveEnemies <= 0) 
            {
                fightGoesOn = false;
                break;
            }

            heroChoiceMade = false;

            while (!heroChoiceMade) 
            {
                Choice.getChoice(new String[]{"Attaquer", "Compétence", "Inventaire"});
            }


            
        }
    }

}
