public class Game{

    public static void main(String args[])
    {
        
        //Character toad = new Character(name, lifePoints, attackPoints);
        Character toad = new Character("Toad", 100, 20);
        Character mario = new Character("Mario", 100, 20);

        

        //System.out.println(toad.getName() + "\n " + toad.getAttackPoints() + "\n " + toad.getLifePoints()); 

        //System.out.println(mario.getName() + "\n " + mario.getAttackPoints() + "\n " + mario.getLifePoints());

        //toad.display();
        //mario.display();
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        //toad.attackl
        //mario.attack(toad)
    }




}