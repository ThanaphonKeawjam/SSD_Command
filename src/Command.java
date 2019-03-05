public abstract class Command {

    private int tick;
    private Player player;

    public Command(int tick, Player player){
        this.tick = tick;
        this.player = player;
    }

    public abstract void execute();

    public int getTick(){ return this.tick; }

    public Player getPlayer() { return this.player; }

}
