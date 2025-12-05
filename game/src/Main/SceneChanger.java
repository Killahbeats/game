package Main;

public class SceneChanger {
	
	GameManager gm; 
	
	public SceneChanger	 (GameManager gm) {
		
		this.gm = gm;
	}
	
	public void showScene1() {
		
		gm.ui.bgPanel[1].setVisible(true);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.messageText.setText("tara patayin natin ang diyos ng demonyo!");
		
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic;
		gm.playMusic(gm.currentMusic);
		gm.playSE(gm.scene_1);
		
		
	}
	public void showScene2() {
		
		gm.ui.bgPanel[1].setVisible(false);
		gm.ui.bgPanel[2].setVisible(true);
		gm.ui.messageText.setText("ano kaya gagawin natin dto");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic2;
		gm.playMusic(gm.currentMusic);
		gm.playSE(gm.scene_2);
	}
	public void showScene3() {
		
		gm.playSE(gm.enterSound);
		gm.ui.bgPanel[2].setVisible(false);
		gm.ui.bgPanel[3].setVisible(true);
		gm.ui.messageText.setText("halloooooo hehehhehehe");
		
		gm.stopMusic(gm.currentMusic);
		gm.currentMusic = gm.fieldMusic3;
		gm.playMusic(gm.currentMusic);
	}

	public void showGameOverScreen(int currentBgNum) { // this will not make the current bg invisible so we can display game over or quick to restart
		
		gm.ui.bgPanel[currentBgNum].setVisible(false);
		gm.ui.titleLabel.setVisible(true);
		gm.ui.titleLabel.setText("PATAY KA GAGI!");
		gm.ui.restartButton.setVisible(true);
		gm.ui.restartButton.setText("pindutin mo para ulitin mo ulitin mo ulitin mo buhay mo ");
		
		gm.stopMusic(gm.currentMusic);
		gm.playSE(gm.deathSound);
	}
	public void existGameOverScreen() {
		
		gm.ui.titleLabel.setVisible(false);
		gm.ui.restartButton.setVisible(false);
		gm.player.setPlayerDefaultStatus();
	}
}