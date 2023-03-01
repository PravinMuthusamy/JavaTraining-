package Ex4;
import java.util.Scanner;
public class CommandPattern {
	public static void main(String[] args) {
		UniversalRemote universalRemote=new UniversalRemote();
		
		Tv tv=new Tv();
		SetTopBox sbox=new SetTopBox();
		SoundSystem ss=new SoundSystem();
		VGame vgame=new VGame();
		
		Command newscommand=new NewsChannelCommand(tv, sbox, ss, vgame);
		Command serialcommand=new SerialChannelCommand(tv, sbox, ss, vgame);
		Command ttgamecommand=new TTGameCommand(tv, sbox, ss, vgame);
		
		universalRemote.assignCommand(1, newscommand);
		universalRemote.assignCommand(2, serialcommand);
        universalRemote.assignCommand(3, ttgamecommand);
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Command that need to be executed..");
        int input=scan.nextInt();
		universalRemote.executeCommand(input);
	}
}
class UniversalRemote{
	Command comm[]=new Command[5];
	public UniversalRemote() {
		for(int i=0;i<5;i++) {
			comm[i]=new DummyCommand();
		}
	}
	
	public void executeCommand(int slot) {
		comm[slot].execute();
	}
	
	public void assignCommand(int slot,Command command) {
		comm[slot]=command;
	}
}
abstract class Command{
	Tv tv;SetTopBox sbox;SoundSystem ss;VGame vgame;
	public Command() {
		
	}
	
	public Command(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		this.tv = tv;
		this.sbox = sbox;
		this.ss = ss;
		this.vgame = vgame;
	}
	public abstract void execute();
}
class DummyCommand extends Command{
	
	public void execute() {
		System.out.println("It's a Dummy slot...Process yet to be assigned...");
	}
}
class NewsChannelCommand extends Command{
	public NewsChannelCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	
	public void execute() {
		System.out.println("The Breaking news is...!");
		tv.av1();
		sbox.newChannel();
		ss.increaseVolume();		
		System.out.println("Enjoy the news channel....");
	}
}
class SerialChannelCommand extends Command{
	public SerialChannelCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	
	public void execute() {
		System.out.println("The serial channel process started...");
		tv.av1();
		sbox.serialChannel();
		ss.increaseVolume();		
		System.out.println("Enjoy the  serial ...");
	}
}
class TTGameCommand extends Command{
	public TTGameCommand(Tv tv, SetTopBox sbox, SoundSystem ss, VGame vgame) {
		super(tv,sbox,ss,vgame);
	}
	
	public void execute() {
		System.out.println("The ttgame process started...");
		tv.av2();
		vgame.ttgame();
		ss.decreaseVolume();		
		System.out.println("Enjoy the tt game....");
	}
}
class Tv{
	public void av1() {
		System.out.println("av1 mode...");
	}
	public void av2() {
		System.out.println("av2 mode...");
	}
}
class SetTopBox{
	public void newChannel() {
		System.out.println("News channel...");
	}
	public void serialChannel() {
		System.out.println("Thendral vanthu Ennai thodum...");
	}
}
class SoundSystem{
	public void increaseVolume() {
		System.out.println("volume increased...");
	}
	public void decreaseVolume() {
		System.out.println("volume decreased...");
	}
}
class VGame{
	public void ttgame() {
		System.out.println("tt game started...");
	}
	public void snooker() {
		System.out.println("snooker game...");
	}
}