package Event;

import Main.GameManager;

public class Event02 {
	
	public GameManager gm;
	
	public Event02(GameManager gm) {
		
		this.gm = gm; 
	}
	
	public void lookCave() {
		gm.ui.messageText.setText("kweba ito malamang!");
		gm.playSE(gm.cave_01);
	}
	public void talkCave() {
		gm.ui.messageText.setText("narining mo boses mo nag echo ");
		gm.playSE(gm.cave_02);
	}
	
	public void enterCave() {
		if (gm.player.hasLantern==0) {
			gm.ui.messageText.setText("may nightvision ka? madalim lasi");
			gm.playSE(gm.cave_03);
		}
		else {
			gm.sChanger.showScene3(); 
		}
	}
	public void lookRoot() {
		
		gm.ui.messageText.setText("meron nandito ah ");
		gm.playSE(gm.root_01);
		
	}
	public void talkRoot() {
		gm.ui.messageText.setText("weed ka ba gorl? malamang d moko makakausap");
		gm.playSE(gm.root_02);
	}
	public void searchRoot() {
		if(gm.player.hasLantern==0) {
			gm.ui.messageText.setText("may nakita kang lantern ayarn!");
			gm.player.hasLantern = 1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.root_05);
			gm.playSE(gm.itemSound);
		}
		else {
			gm.ui.messageText.setText("wala ka ng nahanap diyan atleast may lantern kana");
			gm.playSE(gm.root_03);
		}
	}
}