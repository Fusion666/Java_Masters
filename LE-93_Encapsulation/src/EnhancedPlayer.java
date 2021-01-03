public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {

        this.name = name;
        if(health > 100 && health <= 100) {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void losehitPoints(int damage) {
        this.hitPoints = hitPoints - damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player knocked out.");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
