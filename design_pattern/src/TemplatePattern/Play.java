package TemplatePattern;

public abstract class Play {
	public abstract void init();
	public abstract void start();
	public abstract void end();
	
	public final void play() {
		init();
		start();
		end();
	}
}
