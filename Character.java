public class Character{
    private String name;
    private int energy;
    private int lifes;
    private int attackPoints;

    //constructor to SET information. Parenthesis shows we intend to use a method.
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lifes=3;



    }
    //getters to acess infomation
    
    public String getName(){
        return this.name;
    }

        public int getenergy(){
            return this.energy;

        }

        public int getAttackPoints(){
            return this.attackPoints;

        }
            

        


    
    
        


    


    //methods
        public void display(){
            System.out.println("______________________________");
            System.out.println(" =D " + this.lifes);
            System.out.println("Name: " + this.name);
            System.out.println("Life Points: " + this.energy);
            System.out.println("Attack Points: " + this.attackPoints);

    }
        public void attack(Character opponent){
            System.out.println(this.name + " is attacking ..." + opponent.name);

           // int opponentLP=opponent.getLifePoints();
            //int attackp=getAttackPoints();
            //int opponentLP=opponent.lifePoints;
            //int attackp=this.attackPoints;
            //We need newlifepoints
            //where small int Attackp=getattackPoint

            //int newLP = opponentLp-attackp;
            //opponent.lifePoints=newLP;
            int newLP = opponent.energy-this.attackPoints;
            //Assignation
            opponent.energy=newLP;
            opponent.display();
            //OPPONENT.DISPLAY = MARIO.DISPLAY
            if(opponent.energy <= 0){
                opponent.lifes=opponent.lifes-1;
                opponent.energy=100;
                opponent.display();

                if(opponent.lifes == 0){
                    System.out.println("Game over");
                    System.exit(1);
                }
            }

    }

}