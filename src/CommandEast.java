public class CommandEast extends Command {

    public CommandEast(int tick, Player player){
        super(tick, player);
    }

    @Override
    public void execute() {
        getPlayer().turnEast();
    }
}
