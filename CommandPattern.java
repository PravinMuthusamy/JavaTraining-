package Ex4;

import java.util.Scanner;

public class CommandPattern {
	public static void main(String[] args) {
		UniversalRemote universalRemote = new UniversalRemote();

		TeleVision television = new TeleVision();
		SetTopBox settopbox = new SetTopBox();
		SoundSystem soundsystem = new SoundSystem();
		VideoGame videogame = new VideoGame();

		Command newscommand = new NewsChannelCommand(television, settopbox, soundsystem, videogame);
		Command serialcommand = new SerialChannelCommand(television, settopbox, soundsystem, videogame);
		Command ttgamecommand = new TTGameCommand(television, settopbox, soundsystem, videogame);

		universalRemote.assignCommand(1, newscommand);
		universalRemote.assignCommand(2, serialcommand);
		universalRemote.assignCommand(3, ttgamecommand);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Command that need to be executed..");
		int input = scan.nextInt();
		universalRemote.executeCommand(input);
	}
}

class UniversalRemote {
	Command comm[] = new Command[5];

	public UniversalRemote() {
		for (int i = 0; i < 5; i++) {
			comm[i] = new DummyCommand();
		}
	}

	public void executeCommand(int slot) {
		comm[slot].execute();
	}

	public void assignCommand(int slot, Command command) {
		comm[slot] = command;
	}
}

abstract class Command {
	TeleVision television;
	SetTopBox settopbox;
	SoundSystem soundsystem;
	VideoGame videogame;

	public Command() {

	}

	public Command(TeleVision television, SetTopBox settopbox, SoundSystem soundsystem, VideoGame videogame) {
		this.television = television;
		this.settopbox = settopbox;
		this.soundsystem = soundsystem;
		this.videogame = videogame;
	}

	public abstract void execute();
}

class DummyCommand extends Command {

	public void execute() {
		System.out.println("It's a Dummy slot...Process yet to be assigned...");
	}
}

class NewsChannelCommand extends Command {
	public NewsChannelCommand(TeleVision television, SetTopBox settopbox, SoundSystem soundsystem, VideoGame videogame) {
		super(television, settopbox, soundsystem, videogame);
	}

	public void execute() {
		System.out.println("The Breaking news is...!");
		television.av1();
		settopbox.newChannel();
		soundsystem.increaseVolume();
		System.out.println("Enjoy the news channel....");
	}
}

class SerialChannelCommand extends Command {
	public SerialChannelCommand(TeleVision television, SetTopBox settopbox, SoundSystem soundsystem, VideoGame videogame) {
		super(television, settopbox, soundsystem, videogame);
	}

	public void execute() {
		System.out.println("The serial channel process started...");
		television.av1();
		settopbox.serialChannel();
		soundsystem.increaseVolume();
		System.out.println("Enjoy the  serial ...");
	}
}

class TTGameCommand extends Command {
	public TTGameCommand(TeleVision television, SetTopBox settopbox, SoundSystem soundsystem, VideoGame videogame) {
		super(television, settopbox, soundsystem, videogame);
	}

	public void execute() {
		System.out.println("The ttgame process started...");
		television.av2();
		videogame.ttgame();
		soundsystem.decreaseVolume();
		System.out.println("Enjoy the tt game....");
	}
}

class TeleVision {
	public void av1() {
		System.out.println("av1 mode...");
	}

	public void av2() {
		System.out.println("av2 mode...");
	}
}

class SetTopBox {
	public void newChannel() {
		System.out.println("News channel...");
	}

	public void serialChannel() {
		System.out.println("Thendral vanthu Ennai thodum...");
	}
}

class SoundSystem {
	public void increaseVolume() {
		System.out.println("volume increased...");
	}

	public void decreaseVolume() {
		System.out.println("volume decreased...");
	}
}

class VideoGame {
	public void ttgame() {
		System.out.println("tt game started...");
	}

	public void snooker() {
		System.out.println("snooker game...");
	}
}