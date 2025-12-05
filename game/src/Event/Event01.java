package Event;

import Main.GameManager;

public class Event01 {
	
	GameManager	gm; 
	
	public Event01(GameManager gm ) {
		
		this.gm = gm;
		
	}
	
	public void lookHouse() {
		gm.ui.messageText.setText("Bahay mo ito.");
		gm.playSE(gm.house_01);
	}
	public void talkHouse() {
		gm.ui.messageText.setText("Baliw ka?, cno kausap mo?.");
		gm.playSE(gm.house_02);
	}
	public void restHouse() {
		
		if(gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("(Nagpahinga ka.)\n binabangungot ka pre gising kana.\n oh ayan health bar.");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.house_03);
			gm.playSE(gm.healSound);
		}
		else {
			gm.ui.messageText.setText("puno na buhay mo wag ka nag magpuyat");
			gm.playSE(gm.house_04);
		}
		
	}
	public void lookGuard() {
		gm.ui.messageText.setText("anong tinitingin mo diyan?! ");
		gm.playSE(gm.guard_01);
	}
	public void talkGuard() {
		gm.ui.messageText.setText("Di nako nagiisip \n basta alam ko lang goal ko \n POKUS!");
		gm.playSE(gm.guard_02);
	}
	public void attackGuard() {
		if (gm.player.hasShield==0) {
			if(gm.player.hasSword==0) {
				if(gm.player.playerLife!=1) {
					gm.ui.messageText.setText("Rendon: Sa tingin mo mababagsak mo ako?\n (sinuntok ka nya ng motivation at nabawasan buhay mo ng isa)");
					gm.player.playerLife--;
					
					gm.playSE(gm.guard_03);
					gm.playSE(gm.hitSound);
				}
				else if(gm.player.playerLife==1) {
					gm.ui.messageText.setText("Rendon: MAG ENSAYO KA MUNA BOI!");
					gm.player.playerLife--;
					gm.sChanger.showGameOverScreen(1);
					
					gm.playSE(gm.guard_05);
					
				}
			}
			else if(gm.player.hasSword==1) {
				gm.ui.messageText.setText("galing mo pre pwede ka na sumali sa fitness army\n(natalo mo si rendon at nakuha mo muscle shield nya)");
				gm.player.hasShield=1;
				
				gm.playSE(gm.guard_04);
				gm.playSE(gm.itemSound);
			}
			gm.player.updatePlayerStatus();
		}
		else {
			gm.ui.messageText.setText("pagpahinga mo muna ako wala ako motivation");
			gm.playSE(gm.guard_06);
		}
	}
	public void lookChest() {
		gm.ui.messageText.setText("hangang tingin ka lang ba diyan?");
		gm.playSE(gm.chest_01);
	}
	public void talkChest() {
		gm.ui.messageText.setText("lasing ka ba?!");
		gm.playSE(gm.chest_02);
		
	}
	public void openChest() {
		if(gm.player.hasSword==0) {
			gm.ui.messageText.setText("binuksan mo ang kahon \n walang pera pero may espada");
			gm.player.hasSword=1;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.chest_03);
			gm.playSE(gm.itemSound);
		}
		else {
			gm.ui.messageText.setText("There's nothing inside...");
			gm.playSE(gm.chest_04);
		}
	}

}