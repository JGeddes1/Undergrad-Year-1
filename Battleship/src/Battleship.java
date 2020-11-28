

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Battleship implements Serializable {
	//Set Win counter using buttons
	static int WinPlayer = 0;
	static int WinComputer = 0;
	
	//Set the Click Count for the ships to be placed
	static int firstClick = -1;
	//Set Buttons
	static JButton[] playerButtons = new JButton[100];
	static JButton[] computerButtons = new JButton[100];
	
	//Set the Ships Player
	static int patrolBoatLocationPlayer = 999;//size of 2
	static int SubmarinePlayer = 999;//size of 3
	static int DestroyerPlayer = 999;//size of 3
	static int Battleshipplayer = 999;//size of 4
	static int AircraftCarrierPlayer = 999;//size of 5
	
	//Set the Ships Computer
	static int patrolBoatLocationComputer = 999; //size of 2
	static int SubmarineComputer = 999; // size of 3
	static int DestroyerComputer = 999; //size 3
	static int Battleshipcomputer = 999; // size 4
	static int AircraftCarrierComputer = 999; //size 5
	
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		/*FileInputStream fi = new FileInputStream("save");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Battleship2 c = (Battleship2) oi.readObject();
		oi.close();
		fi.close();
		System.out.println(c);
		*/
		
		
		//menu bar
		//gui
		JMenuBar menuBar;
		
		
		//create menu bar
		menuBar = new JMenuBar();
		
		
		
		//grid size
		Object[] GridSize = {10, 9, 8};
		int s = (int)JOptionPane.showInputDialog(
		                    menuBar,
		                    "Size of Grid?",
		                    "Size",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    GridSize,
		                    GridSize[0]);

		//difficulty
		 Object[] Difficulty = {"Hard", "Easy"};
		String s1 = (String)JOptionPane.showInputDialog(
		                    menuBar,
		                    "Difficulty?",
		                    "Level",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    Difficulty,
		                    Difficulty[0]);
		
		//Set Orientation
	/*	Object[] possibilities = {"Horizontal", "Vertical"};
		final String s2 = (String)JOptionPane.showInputDialog(
		                    menuBar,
		                    "Do You want all ships to be horizontal or vertical ship?",
		                    "Ship orinetation",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    possibilities,
		                    possibilities[0]);
		
		*/
		//Places Ships Randomly For AI
		Random r = new Random();
		patrolBoatLocationComputer = r.nextInt(s*s); 
		//size2
		
		Random r2 = new Random();
		SubmarineComputer = r2.nextInt(s*s);
		//size3
		
		Random r3 = new Random();
		DestroyerComputer = r3.nextInt(s*s);
		//size3
		
			
		Random r5 = new Random();
		Battleshipcomputer = r5.nextInt(s*s);
		//size4
		Random r6 = new Random();
		AircraftCarrierComputer = r6.nextInt(s*s);
		//size5
		
		
		
		//Setup the frame of game
		
		 JFrame f = new JFrame("BattleShip"); //Name

		f.setSize(900, 900); //Frame size
		f.setVisible(true); // Show Frame
		GridLayout g = new GridLayout(1, 2); //Grid Dimensions
		g.setHgap(32); // Grid height Gap
		f.setLayout(g); //Set frame to Grid Dimensions

		//Info Message to place ships
		String infoMessage = "Please click on the squares where you would like to place your Battleship on the left grid, This version of battleships will have an automatic lose after a certain amount of clicks to make the game more interesting, have fun";
		String titleBar = " ";
		JOptionPane.showMessageDialog(f, infoMessage, "BATTLESHIPS" + titleBar,
				JOptionPane.INFORMATION_MESSAGE);

		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(s, s)); // Sets grid to desired size

		//End of game frame setup



// initial playerButtons
		for (int i = 0; i < s*s; i++) {

			final int j = i;
			
			playerButtons[i] = new JButton();
			playerButtons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ev) {
					// set for Patrol boat, size of 2
					if (firstClick == -1) {
						firstClick = j;
						patrolBoatLocationPlayer = j;
					

					// size of 2
					playerButtons[firstClick].setBackground(Color.GREEN);
					playerButtons[firstClick + 1].setBackground(Color.GREEN);
					

					// reset the value of player button
					firstClick = 0;
					return;
				}
				
				
				if (firstClick == 0) {
					firstClick = j;
					SubmarinePlayer = j;
				
				// size of 3
				playerButtons[firstClick].setBackground(Color.GREEN);
				playerButtons[firstClick + 1].setBackground(Color.GREEN);
				 playerButtons[firstClick + 2].setBackground(Color.GREEN);
				firstClick = 1;
				return;
			}
				
				
				
				
				if (firstClick == 1) {
					firstClick = j;
					DestroyerPlayer = j;
				
				// size of 3
				playerButtons[firstClick].setBackground(Color.GREEN);
				playerButtons[firstClick + 1].setBackground(Color.GREEN);
				 playerButtons[firstClick + 2].setBackground(Color.GREEN);
				 firstClick = 2;	
				return;
			}
				if (firstClick == 2) {
					firstClick = j;
					Battleshipplayer = j;
				
				// size of 4
				playerButtons[firstClick].setBackground(Color.GREEN);
				playerButtons[firstClick + 1].setBackground(Color.GREEN);
				 playerButtons[firstClick + 2].setBackground(Color.GREEN);
				 playerButtons[firstClick + 3].setBackground(Color.GREEN);
				firstClick = 3;
				return;
			}
				if (firstClick == 3) {
				firstClick = j;
				AircraftCarrierPlayer = j;
			
			// size of 5
			playerButtons[firstClick].setBackground(Color.GREEN);
			playerButtons[firstClick + 1].setBackground(Color.GREEN);
			 playerButtons[firstClick + 2].setBackground(Color.GREEN);
			 playerButtons[firstClick + 3].setBackground(Color.GREEN);
			 playerButtons[firstClick + 4].setBackground(Color.GREEN);
			
			return;
		}
		}
			});
			pan.add(playerButtons[i]);
			playerButtons[i].setBackground(Color.GRAY);
			playerButtons[i].setForeground(Color.GRAY);

		}
		// end of and initial player buttons

	

		// end random set the computer ships

		// initial computer grid
		JPanel computerPan = new JPanel();
		computerPan.setLayout(new GridLayout(s, s)); // sets computer grid size

		for (int i = 0; i < s*s; i++) {

			final int j = i;

			computerButtons[i] = new JButton();
			computerButtons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

					System.out.println("target on computerShip:" + j);
					//Patrol Boat size 2
					if (j == patrolBoatLocationComputer) {

						computerButtons[patrolBoatLocationComputer]
								.setBackground(Color.RED);
						System.out.println("Hit by Computer"+j);
						WinPlayer++; // Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
						System.out.println("Hit by Computer"+j);
					} else if (j == patrolBoatLocationComputer + 1) {

						computerButtons[patrolBoatLocationComputer + 1]
								.setBackground(Color.RED);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
						//Submarine size 3
					}else if (j == SubmarineComputer) {

							computerButtons[SubmarineComputer]
									.setBackground(Color.GREEN);
							System.out.println("Hit by Computer"+j);
							WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
							if(WinPlayer == 17){
								String infoMessage = "You Win";
								String titleBar = " ";
								JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
										JOptionPane.INFORMATION_MESSAGE);
							}
						} else if (j == SubmarineComputer + 1) {

							computerButtons[SubmarineComputer + 1]
									.setBackground(Color.GREEN);
							System.out.println("Hit by Player at "+j);
							WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
							if(WinPlayer == 17){
								String infoMessage = "You Win";
								String titleBar = " ";
								JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
										JOptionPane.INFORMATION_MESSAGE);
							}
					}else if (j == SubmarineComputer + 2) {

						computerButtons[SubmarineComputer + 2]
								.setBackground(Color.GREEN);
						System.out.println("Hit by Player at "+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
						//Destroyer Size 3
					}else if (j == DestroyerComputer) {

						computerButtons[DestroyerComputer].setBackground(Color.ORANGE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog(null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == DestroyerComputer + 1) {

						computerButtons[DestroyerComputer + 1]
								.setBackground(Color.ORANGE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == DestroyerComputer + 2) {

						computerButtons[DestroyerComputer + 2]
								.setBackground(Color.ORANGE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
						//Battleship size 4
					}else if (j == Battleshipcomputer) {

						computerButtons[Battleshipcomputer].setBackground(Color.BLACK);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						if(WinPlayer == 17){
							//IF WIN THEN MESSAGE APPEAR
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == Battleshipcomputer + 1) {

						computerButtons[Battleshipcomputer + 1]
								.setBackground(Color.BLACK);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == Battleshipcomputer + 2) {

						computerButtons[Battleshipcomputer + 2]
								.setBackground(Color.BLACK);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					}else if (j == Battleshipcomputer + 3) {

						computerButtons[Battleshipcomputer + 3]
								.setBackground(Color.BLACK);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
						//Aircraft carrier size 5
					}else if (j == AircraftCarrierComputer) {

						computerButtons[AircraftCarrierComputer].setBackground(Color.WHITE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == AircraftCarrierComputer + 1) {

						computerButtons[AircraftCarrierComputer + 1]
								.setBackground(Color.WHITE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					} else if (j == AircraftCarrierComputer + 2) {

						computerButtons[AircraftCarrierComputer + 2]
								.setBackground(Color.WHITE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					}else if (j == AircraftCarrierComputer + 3) {

						computerButtons[AircraftCarrierComputer + 3]
								.setBackground(Color.WHITE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog(null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
						}
					}else if (j == AircraftCarrierComputer + 4) {
						
						computerButtons[AircraftCarrierComputer + 4]
								.setBackground(Color.WHITE);
						System.out.println("Hit by Computer"+j);
						WinPlayer++;// Button Pressed to show boat Adds up to win when all pressed
						//IF WIN THEN MESSAGE APPEAR
						if(WinPlayer == 17){
							String infoMessage = "You Win";
							String titleBar = " ";
							JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
									JOptionPane.INFORMATION_MESSAGE);
							
						}		
							
						
					}
					//When miss make tile go blue
					else {
						System.out.println("miss target by player");
						computerButtons[j]
								.setBackground(Color.blue);
					}

					// computer fights back
					strategyByComputer();

				}

			});
//Set board colour
			pan.add(computerButtons[i]);
			computerButtons[i].setBackground(Color.GRAY);
			computerButtons[i].setForeground(Color.GRAY);
			computerPan.add(computerButtons[i]);

		}
// Add frame Computer Panel
		f.add(pan);
		f.add(computerPan);
		f.revalidate();

	}

	
	

	public static void strategyByComputer() {
		//AI hitting Tiles
		int j = 0;
		Random r = new Random();

	j = r.nextInt(100);



 //AI hits player patrol boat 
		System.out.println("target on player Ship:" + j);

		if (j == patrolBoatLocationPlayer) {

			playerButtons[patrolBoatLocationPlayer].setBackground(Color.RED);
			WinComputer++;
		
		} else if (j == patrolBoatLocationPlayer + 1) {

			playerButtons[patrolBoatLocationPlayer + 1]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++; // When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} 
		else if (j == SubmarinePlayer) {

			playerButtons[SubmarinePlayer].setBackground(Color.RED);
			WinComputer++;
			
		} else if (j == SubmarinePlayer + 1) {

			playerButtons[SubmarinePlayer + 1]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		
		}else if (j == SubmarinePlayer + 2) {

			playerButtons[SubmarinePlayer + 2]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		}
		else if (j == DestroyerPlayer) {

			playerButtons[DestroyerPlayer].setBackground(Color.RED);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == DestroyerPlayer + 1) {

			playerButtons[DestroyerPlayer + 1]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == DestroyerPlayer + 2) {

			playerButtons[DestroyerPlayer + 2]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		}else if (j == Battleshipplayer) {

			playerButtons[Battleshipplayer].setBackground(Color.RED);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j ==Battleshipplayer + 1) {

			playerButtons[Battleshipplayer + 1]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == Battleshipplayer + 2) {

			playerButtons[Battleshipplayer + 2]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == Battleshipplayer + 3) {

			playerButtons[Battleshipplayer + 3]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		}else if (j == AircraftCarrierPlayer) {

			playerButtons[AircraftCarrierPlayer].setBackground(Color.RED);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j ==AircraftCarrierPlayer + 1) {

			playerButtons[AircraftCarrierPlayer + 1]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == AircraftCarrierPlayer + 2) {

			playerButtons[AircraftCarrierPlayer + 2]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == AircraftCarrierPlayer + 3) {

			playerButtons[AircraftCarrierPlayer + 3]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		} else if (j == AircraftCarrierPlayer + 4) {

			playerButtons[AircraftCarrierPlayer + 4]
					.setBackground(Color.RED);
			System.out.println("Hit by Computer"+j);
			WinComputer++;// When Ai hits a player boat win goes up till reaches max number and the player loses.
			
		}else {
			System.out.println("miss target by computer");
			playerButtons[j]
					.setBackground(Color.blue);
		}
		//Allows for their to be a limit to moves in which player wins
		if(WinComputer == 35){
			String infoMessage = "You Lose";
			String titleBar = " ";
			JOptionPane.showMessageDialog( null, infoMessage, "BATTLESHIPS" + titleBar,
					JOptionPane.INFORMATION_MESSAGE);
		
		}
	}
}
