package entities;

public class Level1 implements Level {
	
	private Plugin plugin;

	@Override
	public void addPlugin(Plugin p) {
		// TODO Auto-generated method stub
		this.plugin = p;
	}

	@Override
	public String toString() {
		return "Level 1: plugin " + plugin.toString() + "\n";
	}

}
