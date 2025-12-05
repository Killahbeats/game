package Main;

import java.net.URL;

import Event.Event01;
import Event.Event02;

public class GameManager {
	
	ActionHandler aHandler = new ActionHandler(this);
	public UI ui = new UI (this);
	public Player player = new Player(this);
	public SceneChanger sChanger = new SceneChanger(this);
	Music music = new Music();
	SE se = new SE();
	
	public Event01 ev1 = new Event01(this);
	public Event02 ev2 = new Event02(this);
	
	// sound 
	public URL fieldMusic = getClass().getClassLoader().getResource("audio//gravityrush.wav");
	public URL fieldMusic2 = getClass().getClassLoader().getResource("audio//downtown.wav");
	public URL fieldMusic3 = getClass().getClassLoader().getResource("audio//hello.wav");
	public URL scene_1 = getClass().getClassLoader().getResource("audio//scene1.wav");
	public URL scene_2 = getClass().getClassLoader().getResource("audio//scene2.wav");
	public URL deathSound = getClass().getClassLoader().getResource("audio//death.wav");
	public URL hitSound = getClass().getClassLoader().getResource("audio//punch.wav");
	public URL healSound = getClass().getClassLoader().getResource("audio//heal.wav");
	public URL itemSound = getClass().getClassLoader().getResource("audio//item.wav");
	public URL enterSound = getClass().getClassLoader().getResource("audio//enter.wav");
	public URL house_01 = getClass().getClassLoader().getResource("audio//house1.wav");
	public URL house_02 = getClass().getClassLoader().getResource("audio//house2.wav");
	public URL house_03 = getClass().getClassLoader().getResource("audio//house3.wav");
	public URL house_04 = getClass().getClassLoader().getResource("audio//house4.wav");
	public URL chest_01 = getClass().getClassLoader().getResource("audio//chest1.wav");
	public URL chest_02 = getClass().getClassLoader().getResource("audio//chest2.wav");
	public URL chest_03 = getClass().getClassLoader().getResource("audio//chest3.wav");
	public URL chest_04 = getClass().getClassLoader().getResource("audio//chest4.wav");
	public URL guard_01 = getClass().getClassLoader().getResource("audio//guard1.wav");
	public URL guard_02 = getClass().getClassLoader().getResource("audio//guard2.wav");
	public URL guard_03 = getClass().getClassLoader().getResource("audio//guard3.wav");
	public URL guard_04 = getClass().getClassLoader().getResource("audio//guard4.wav");
	public URL guard_05 = getClass().getClassLoader().getResource("audio//guard5.wav");
	public URL guard_06 = getClass().getClassLoader().getResource("audio//guard6.wav");
	public URL cave_01 = getClass().getClassLoader().getResource("audio//cave1.wav");
	public URL cave_02 = getClass().getClassLoader().getResource("audio//cave2.wav");
	public URL cave_03 = getClass().getClassLoader().getResource("audio//cave3.wav");
	public URL root_01 = getClass().getClassLoader().getResource("audio//root1.wav");
	public URL root_02 = getClass().getClassLoader().getResource("audio//root2.wav");
	public URL root_03 = getClass().getClassLoader().getResource("audio//root3.wav");
	public URL root_04 = getClass().getClassLoader().getResource("audio//root4.wav");
	public URL root_05 = getClass().getClassLoader().getResource("audio//root5.wav");
	public URL currentMusic;
	
	
	
	
	public static void main(String[] args) {
		
		new GameManager(); 
		
 
	}
	public GameManager() {
		
		currentMusic = fieldMusic;
		playMusic(currentMusic);
		
		player.setPlayerDefaultStatus();
		sChanger.showScene1(); //kung nag start laro ito ang tatawagin
	}
	
	public void playSE(URL url) {
		
		se.setFile(url);
		se.play(url);
	}
	public void playMusic(URL url) {
		
		music.setFile(url);
		music.play(url);
		music.loop(url);
		
	}
	public void stopMusic(URL url) {
		
		music.stop(url);
	}
}