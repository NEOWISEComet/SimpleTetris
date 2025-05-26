package main;

import java.awt.event.*;

public class KeyHandler implements KeyListener{

	public static boolean upPressed, downPressed, leftPressed, rightPressed, pausePressed;
	public static boolean player2UpPressed, player2DownPressed, player2LeftPressed, player2RightPressed;
	
	//public HashMap<String, KeyEvent> keyMap;
	
	//public KeyHandler()
	//{
	//	keyMap = new HashMap<>();
	//}
	
	/*
	 * p1Handler = new KeyHandler();
	 * p1Handler.keyMap.put("up", KeyEvent.VK_W);
	 * 
	 * 
	 * if (code == keyMap.get("up"))
	 */
	
	@Override
	public void keyTyped(KeyEvent e) {	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			upPressed = true;
		}
		if(code == KeyEvent.VK_S) {
			downPressed = true;
		}
		if(code == KeyEvent.VK_A) {
			leftPressed = true;
		}
		if(code == KeyEvent.VK_D) {
			rightPressed = true;
		}
		if(code == KeyEvent.VK_ESCAPE) {
			if(pausePressed) {
				pausePressed = false;
			}
			else {
				pausePressed = true;
			}
		}
		
		//Player2
		if (code == KeyEvent.VK_UP) {
	           player2UpPressed = true;
	        }
		if (code == KeyEvent.VK_DOWN) {
	           player2DownPressed = true;
	        }
		if (code == KeyEvent.VK_LEFT) {
	           player2LeftPressed = true;
	        }
		if (code == KeyEvent.VK_RIGHT) {
	           player2RightPressed = true;	      
	        }

	}

	@Override
	public void keyReleased(KeyEvent e) {	
	}

}
