import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


import hsa_new.Console;
public class SpaceAdventure {

	
	/*
	 * Space Adventure Program
	 * SpaceAdventure.java
	 * This is a "Choose Your Own Adventure Game", it involves choosing one of four planets, exploring it and trying to survive
	 * Nicholas Dietrich created the Blue and Green Planets
	 * Stuart Dietrich created the Yellow and Orange Planets
	 * Written By: Nicholas Dietrich, Stuart Dietrich
	 * April, 19, 2016
	 * 
	 */

	public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {

		try {



			//Import Images

			Image picOrange = Toolkit.getDefaultToolkit().getImage("Stuart's Media/orangeplanet (1).jpg");
			Image picHouse = Toolkit.getDefaultToolkit().getImage("Stuart's Media/house.jpg");
			Image picWizard = Toolkit.getDefaultToolkit().getImage("Stuart's Media/wizard.jpg");
			Image picHomeBuilding = Toolkit.getDefaultToolkit().getImage("Stuart's Media/homebuilding.jpg");
			Image picExplosion = Toolkit.getDefaultToolkit().getImage("Stuart's Media/explosion.jpg");
			Image picBattle = Toolkit.getDefaultToolkit().getImage("Stuart's Media/battle.jpg");
			Image picDead = Toolkit.getDefaultToolkit().getImage("Stuart's Media/dead.png");
			Image picFight = Toolkit.getDefaultToolkit().getImage("Stuart's Media/fight.jpg");


			Image picYellow = Toolkit.getDefaultToolkit().getImage("Stuart's Media/yellowplanet.jpg");
			Image picAlien = Toolkit.getDefaultToolkit().getImage("Stuart's Media/alien.jpg");
			Image picArm = Toolkit.getDefaultToolkit().getImage("Stuart's Media/arm.jpg");
			Image picBuilding = Toolkit.getDefaultToolkit().getImage("Stuart's Media/building.jpg");
			Image picDust = Toolkit.getDefaultToolkit().getImage("Stuart's Media/dust.jpg");
			Image picFood = Toolkit.getDefaultToolkit().getImage("Stuart's Media/food.jpg");
			Image picNothing = Toolkit.getDefaultToolkit().getImage("Stuart's Media/nothing.jpg");
			Image picShip = Toolkit.getDefaultToolkit().getImage("Stuart's Media/ship.jpg");
			Image picSheltor = Toolkit.getDefaultToolkit().getImage("Stuart's Media/sheltor.jpg");





			Image azqakSign;
			azqakSign = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/Azqak Sign.jpg");

			Image planetChoice;
			planetChoice = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/vanguard_spaceship_by_gustvoc-d4xy3sg.jpg");

			Image deepPit;
			deepPit = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/a-deep-pit.jpg");

			Image alienLooking;
			alienLooking = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/AlienLooking.jpeg");

			Image animalsCircle;
			animalsCircle = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/AnimalsCircle.jpeg");

			Image bloodSnakeBite;
			bloodSnakeBite = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/BloodonForestSnakeBite.jpg");

			Image bloodOnGround;
			bloodOnGround = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/BloodonGround.jpg");

			Image bloodOnTree;
			bloodOnTree = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/BloodonTree.jpg");

			Image blueCreatures;
			blueCreatures = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/BlueCreatures.jpg");

			Image blurry;
			blurry = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/blurry-1.jpg");

			Image creaturesChase;
			creaturesChase = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/CreatureChaseBlue.jpg");

			Image deadSnake;
			deadSnake = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/DeadSnake.jpg");

			Image diceRoll;
			diceRoll = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/DiceRoll.png");

			Image dogCreatures;
			dogCreatures =Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/DogCreatures.jpeg");

			Image exploreBlue;
			exploreBlue = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/ExploreBlue.jpg");

			Image exploreForest;
			exploreForest = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/ExploreForest.jpg");

			Image firePit;
			firePit = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/firepit.jpg");

			Image forest;
			forest = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/Forest.jpg");

			Image ground;
			ground = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/Ground.jpg");

			Image groundFromFall;
			groundFromFall = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/GroundFromFall.jpeg");

			Image leaveShackDoor;
			leaveShackDoor = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/LeaveShackDoor.jpg");

			Image shack;
			shack = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/Shack.jpg");

			Image shipOnPlanet;
			shipOnPlanet = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/ShiponPlanet.jpg");

			Image snake;
			snake = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/snake.jpg");

			Image snakeBite;
			snakeBite = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/SnakeBite.jpg");

			Image spaceshipCrash;
			spaceshipCrash = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/SpaceshipCrash.jpg");

			Image spaceshipLive;
			spaceshipLive = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/SpaceshipLive.jpg");

			Image spaceshipTakeoffBlue;
			spaceshipTakeoffBlue = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/SpaceShiptakeoff.jpg");

			Image spaceshipTakeoffGreen;
			spaceshipTakeoffGreen = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/SpaceshipTakeoffGreen.jpg");

			Image tiedUpHand;
			tiedUpHand = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/TiedupHand.jpg");

			Image topOfForest;
			topOfForest = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/TopofForrest.jpeg");

			Image treeFalls;
			treeFalls = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/TreeFalls.jpeg");

			Image guessNumberImage;
			guessNumberImage = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/Question-mark.png");

			Image laserBeam;
			laserBeam = Toolkit.getDefaultToolkit().getImage("SpaceAdventure Media/LaserBeam.jpg");
			
			Image earthImage = Toolkit.getDefaultToolkit().getImage("c233499157252cbb06de5ef9d5914147f7a1bcba.jpg");


			//Import Sounds


			Clip choosePlanet =  AudioSystem.getClip();
			choosePlanet.open(AudioSystem.getAudioInputStream(new File("Alien.wav")));

			Clip blueBang = AudioSystem.getClip();
			blueBang.open(AudioSystem.getAudioInputStream(new File("Loud_Bang-Osama_Bin_Laden-925764326.wav")));

			Clip blueCreatureTalk =  AudioSystem.getClip();
			blueCreatureTalk.open(AudioSystem.getAudioInputStream(new File("Alien Brain Scanner-SoundBible.com-2034590144.wav")));

			Clip laser =  AudioSystem.getClip();
			laser.open(AudioSystem.getAudioInputStream(new File("Laser_Cannon-Mike_Koenig-797224747.wav")));

			Clip success =  AudioSystem.getClip();
			success.open(AudioSystem.getAudioInputStream(new File("Music_Box-Big_Daddy-1389738694.wav")));

			Clip greenBackground =  AudioSystem.getClip();
			greenBackground.open(AudioSystem.getAudioInputStream(new File("mysterious_forest.wav")));

			Clip blueBackground =  AudioSystem.getClip();
			blueBackground.open(AudioSystem.getAudioInputStream(new File("evil_and_horror.wav")));

			Clip buzzer =  AudioSystem.getClip();
			buzzer.open(AudioSystem.getAudioInputStream(new File("Air Horn-SoundBible.com-964603082.wav")));

			Clip deadNoise =  AudioSystem.getClip();
			deadNoise.open(AudioSystem.getAudioInputStream(new File("Hl2_Rebel-Ragdoll485-573931361.wav")));

			Clip crashShip =  AudioSystem.getClip();
			crashShip.open(AudioSystem.getAudioInputStream(new File("747_jet_crash-keyWasFull-1290116770.wav")));

			Clip treeCrack =  AudioSystem.getClip();
			treeCrack.open(AudioSystem.getAudioInputStream(new File("neck_snap-Vladimir-719669812.wav")));

			Clip snakeNoise =  AudioSystem.getClip();
			snakeNoise.open(AudioSystem.getAudioInputStream(new File("Baby_Rattle-Mike_Koenig-1544926286.wav")));

			Clip diceNoise =  AudioSystem.getClip();
			diceNoise.open(AudioSystem.getAudioInputStream(new File("Sword Swing-SoundBible.com-639083727.wav")));

			Console c = new Console();

			boolean live = true;

			c.setTextBackgroundColor(Color.BLACK);
			c.clear();
			c.setTextColor(Color.WHITE);
			c.drawImage(earthImage, 50, 75, 350, 350, null);
			c.println("SPACE ADVENTURE GAME");
			Thread.sleep(2000);
			c.clear();
			c.drawImage(earthImage, 50, 75, 350, 350, null);
			c.println("You are a space explorer leaving on a mission...");
			Thread.sleep(3000);
			
			
			
			
			c.println("Your mission is to defeat 4 planets");
			Thread.sleep(2000);
			c.clear();
			c.drawImage(earthImage, 50, 75, 350, 350, null);
			c.println("Liftoff in...");
			Thread.sleep(1000);
			
			
			c.println("3...");
			Thread.sleep(1000);
			
			
			c.println("2...");
			Thread.sleep(1000);
			
			
			c.println("1...");
			Thread.sleep(1000);
			c.clear();

			

			//Planet Select, with while loop


			boolean planetWrong = false;

			while (!planetWrong) {
				
				c.setTextBackgroundColor(Color.BLACK);
				c.clear();
				c.setTextColor(Color.WHITE);
				c.println("Please select a planet (blue/green/orange/yellow)");
				choosePlanet.loop(Clip.LOOP_CONTINUOUSLY);



				c.drawImage(planetChoice, 50, 75, 350, 350, null);

				String planetSelect = c.readLine();

				//Blue Planet

				if (planetSelect.equalsIgnoreCase("blue")) {
					
					c.setTextBackgroundColor(Color.BLUE);
					c.clear();
					c.setTextColor(Color.WHITE);

					choosePlanet.stop();

					blueBackground.loop(Clip.LOOP_CONTINUOUSLY);

					planetWrong = true;

					c.clear();
					c.drawImage(azqakSign, 50, 75, 350, 350, null);
					c.println("You land on the blue planet and see a sign 'Land of the Azqak'");
					Thread.sleep(3000);
					c.clear();
					c.drawImage(shack, 50, 75, 350, 350, null);

					c.println("You hear noises and see a small shack");
					c.println("Go in or run? (go/run)");
					boolean correct = false;

					while (!correct) {

						//While correct is false, loop

						String input = c.readLine();

						if (input.equalsIgnoreCase("run")) {

							correct = true;
							Thread.sleep(3000);
							c.clear();
							c.drawImage(blueCreatures, 50, 75, 350, 350, null);

							c.println("While running away small creatures appear...");
							Thread.sleep(3000);
							c.clear();
							c.drawImage(creaturesChase, 50, 75, 350, 350, null);

							c.println("They come and chase you as you try to run away...");
							Thread.sleep(3000);
							c.clear();
							c.drawImage(ground, 50, 75, 350, 350, null);

							c.println("All of a sudden, you hear a loud bang and fall on the ground...");
							blueBang.loop(Clip.LOOP_CONTINUOUSLY);
							Thread.sleep(3000);
							blueBang.stop();

							c.clear();
							deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
							c.drawImage(bloodOnGround, 50, 75, 350, 350, null);

							c.println("Blood surrounds your body and you bleed out to death");

							correct = true;
							live = false;
						}
						else if (input.equalsIgnoreCase("go")) {

							correct = true;


							//Small Shack Part

							c.drawImage(animalsCircle, 50, 75, 350, 350, null);

							c.println("You walk into the shack and see small creatures sitting in a circle...");
							Thread.sleep(3000);
							c.clear();

							c.drawImage(alienLooking, 50, 75, 350, 350, null);

							c.println("They all turn and look at you with bilious yet dark expressions...");
							Thread.sleep(3000);

							c.println("One of the creatures starts talking to you...");
							blueCreatureTalk.loop(Clip.LOOP_CONTINUOUSLY);
							Thread.sleep(3000);
							c.clear();

							c.drawImage(guessNumberImage, 50, 75, 350, 350, null);


							//Guess Number Game
							c.println("They ask you to guess a number from 1-7 and they say");
							c.println("that you have three tries to guess correctly...");
							Thread.sleep(5000);
							c.clear();
							c.drawImage(guessNumberImage, 50, 75, 350, 350, null);
							c.println("Or else pay the consequences...");
							Thread.sleep(3000);
							c.clear();
							blueCreatureTalk.stop();
							c.drawImage(guessNumberImage, 50, 75, 350, 350, null);


							int guessNumber = 1;
							int azqakNumber = (int)(Math.random() * 7) + 1;

							boolean aliveNumber = false;

							c.println(azqakNumber);

							//Guess Number Loop, 3 tries
							while (guessNumber <=3) {
								c.drawImage(guessNumberImage, 50, 75, 350, 350, null);
								c.print("Enter your " + guessNumber);

								if (guessNumber == 1) {
									c.println("st guess from 1-7");
								}
								else if (guessNumber == 2) {
									c.println("nd guess from 1-7");
								}
								else {
									c.println("rd guess from 1-7");
								}

								int userGuessNumber = Integer.parseInt(c.readLine());

								if (userGuessNumber == azqakNumber) {
									aliveNumber = true;
									guessNumber = 4;
								}
								else {
									guessNumber = guessNumber + 1;
									Thread.sleep(500);
									c.clear();
								}
							}

							//Guess Number Game Consequences, live or die
							if (aliveNumber == false) {

								c.drawImage(guessNumberImage, 50, 75, 350, 350, null);

								buzzer.loop(Clip.LOOP_CONTINUOUSLY);
								c.println("You didn't guess the integer they were thinking of...");
								Thread.sleep(3000);
								c.clear();

								c.drawImage(tiedUpHand, 50, 75, 350, 350, null);

								buzzer.stop();
								c.println("So the small creatures suddenly tie you up...");
								Thread.sleep(3000);
								c.clear();

								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								c.drawImage(firePit, 50, 75, 350, 350, null);

								c.println("And put you in a burning fire pit, the flames kill you instantly");

								live = false;

							}
							else {
								c.clear();
								c.drawImage(leaveShackDoor, 50, 75, 350, 350, null);

								c.println("You guessed the same number that the creatures were thinking of...");
								Thread.sleep(3000);

								c.println("So they let you leave the shack safefully");
								Thread.sleep(3000);
								c.clear();

								c.drawImage(shipOnPlanet, 50, 75, 350, 350, null);

								c.println("Go back to ship or explore Azqak Land? (back/explore)");



								boolean correctTwo = false;
								while (correctTwo == false) {
									String choiceLast = c.readLine();

									//Explore or Back Choice

									if (choiceLast.equalsIgnoreCase("explore")) {

										correctTwo = true;

										c.drawImage(exploreBlue, 50, 75, 350, 350, null);

										c.println("You walk away from the shack and start exploring the planet...");
										Thread.sleep(3000);
										c.clear();

										laser.loop(Clip.LOOP_CONTINUOUSLY);
										c.drawImage(laserBeam, 50, 75, 350, 350, null);


										c.println("You see a laser beam on the ground in front of you...");
										Thread.sleep(3000);

										laser.stop();
										c.println("You feel a massive pain on your back and instantly fall on the ground...");
										Thread.sleep(3000);

										deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
										c.drawImage(bloodOnGround, 50, 75, 350, 350, null);

										c.println("You die");

										live = false;

									}
									else if (choiceLast.equalsIgnoreCase("back")) {

										correctTwo = true;

										int randomTakeoffNumber = (int)(Math.random() * 10) + 1;



										c.drawImage(shipOnPlanet, 50, 75, 350, 350, null);


										if (randomTakeoffNumber <= 5 ){

											c.drawImage(spaceshipTakeoffBlue, 50, 75, 350, 350, null);


											//Ship Takeoff Crash
											c.println("You get into your ship and takeoff...");
											Thread.sleep(3000);


											c.println("But all of a sudden...");
											Thread.sleep(3000);

											crashShip.loop(Clip.LOOP_CONTINUOUSLY);
											c.println("You hear a cracking sound and a white gas starts filling your ship");
											Thread.sleep(3000);
											c.clear();

											c.drawImage(spaceshipCrash, 50, 75, 350, 350, null);

											c.println("You fall on the floor, never to wake up again...");
											c.println("while your ship crashes back into the ground");
											crashShip.stop();

											live = false;

										}
										else {

											//Survive Blue Planet
											c.drawImage(spaceshipLive, 50, 75, 350, 350, null);

											success.loop(Clip.LOOP_CONTINUOUSLY);
											c.println("You jump back into your ship and takeoff...");
											Thread.sleep(3000);

											c.println("You survived the land of the Azqak");
											live = false;
											
										}
									}


									else {
										//Wrong Answer Loop
										c.println("Please either enter either 'explore' or 'back'");
									}
								}
							}
						}
						else {
							//Wrong Answer Loop
							c.println("Please either enter 'run' or 'go'");
						}

					}
				}

				else if (planetSelect.equalsIgnoreCase("green")) {

					c.setTextBackgroundColor(Color.GREEN);
					c.clear();
					c.setTextColor(Color.BLACK);
					
					
					//Green Planet
					choosePlanet.stop();
					greenBackground.loop(Clip.LOOP_CONTINUOUSLY);

					planetWrong = true;



					c.clear();
					c.drawImage(forest, 50, 75, 350, 350, null);

					c.println("You land on the green planet and north of you is a forest");
					Thread.sleep(3000);


					c.println("Explore the forest or run south? (explore/run)");




					boolean correctThree = false;

					//Explore/Run Loop
					while (correctThree == false) {
						String choiceForest = c.readLine();

						if (choiceForest.equalsIgnoreCase("run")) {


							correctThree = true;
							c.clear();
							c.drawImage(treeFalls, 50, 75, 350, 350, null);

							treeCrack.loop(Clip.LOOP_CONTINUOUSLY);
							//Tree Falls Part
							c.println("You start running away when a tree falls and pins you under it");
							Thread.sleep(3000);
							treeCrack.stop();

							c.println("Try to slide out, or try to lift the tree off of you? (slide/lift)");


							String choiceSlideLift = c.readLine();

							if (choiceSlideLift.equalsIgnoreCase("slide")) {
								c.clear();

								correctThree = true;
								c.drawImage(bloodOnTree, 50, 75, 350, 350, null);

								treeCrack.loop(Clip.LOOP_CONTINUOUSLY);
								c.println("You try to slide out from under the tree when it snaps, stabbing you...");
								Thread.sleep(3000);
								treeCrack.loop(Clip.LOOP_CONTINUOUSLY);

								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								c.println("You scream for help, but slowly die");
								Thread.sleep(3000);
								treeCrack.stop();


								live = false;

							}
							else {
								correctThree = true;
								treeCrack.loop(Clip.LOOP_CONTINUOUSLY);
								c.println("You try to lift the huge tree, but it doesn't budge...");
								Thread.sleep(3000);
								treeCrack.stop();

								c.drawImage(bloodOnTree, 50, 75, 350, 350, null);

								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								c.print("You can't get out from the tree, so you slowly die under it");

								live = false;


							}

						}
						else if (choiceForest.equalsIgnoreCase("explore")) {


							correctThree = true;

							c.clear();
							c.drawImage(exploreForest, 50, 75, 350, 350, null);

							c.println("You start going north into the forest...");
							Thread.sleep(3000);
							c.clear();

							int forestNumber = (int)(Math.random() * 100) + 1;

							if (forestNumber > 85) {

								c.drawImage(blurry, 50, 75, 350, 350, null);

								//Orange Plant Dead Part
								c.println("You accidentally step on an orange plant...");
								Thread.sleep(3000);


								c.println("You start feeling light-headed and all of your extremities get inflamed...");
								Thread.sleep(3000);

								c.clear();
								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								c.drawImage(bloodSnakeBite, 50, 75, 350, 350, null);
								c.println("Your eyes shut, you stop breathing, and you die quickly");

								live = false;

							}
							else {

								//Snake Appears Part

								snakeNoise.loop(Clip.LOOP_CONTINUOUSLY);

								c.drawImage(snake, 50, 75, 350, 350, null);

								c.println("A snake appears in front of you...");
								Thread.sleep(3000);

								c.println("Kill it or run? (kill/run)");

								boolean choiceFour = false;

								while (!choiceFour) {
									choiceFour = true;

									String choiceKillRun = c.readLine();

									if (choiceKillRun.equalsIgnoreCase("run")) {
										c.drawImage(snakeBite, 50, 75, 350, 350, null);


										c.println("You sprint away from the snake, but it chases after you...");
										Thread.sleep(3000);

										c.println("You feel a warm sensation around your ankle");
										Thread.sleep(3000);
										c.println("and then a small bite hits the back of your leg...");
										Thread.sleep(3000);

										c.println("You turn around and stomp on the snake, which kills it instantly...");
										snakeNoise.stop();
										Thread.sleep(3000);
										c.clear();

										c.drawImage(blurry, 50, 75, 350, 350, null);


										//Die from snake bite
										deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
										c.println("But it's too late, you pass out and never wake up again");

										live = false;

									}
									else  if (choiceKillRun.equalsIgnoreCase("kill")) {
										c.clear();
										c.drawImage(deadSnake, 50, 75, 350, 350, null);


										//Kill Snake Part
										c.println("You jump on the snake, killing it...");
										Thread.sleep(3000);
										snakeNoise.stop();
										c.clear();

										c.drawImage(dogCreatures, 50, 75, 350, 350, null);

										c.println("A dog-like creature comes out of the bases of a tree...");
										c.println("Run or stay? (run/stay)");

										//Run or Stay Choice

										String choiceDogCreatures = c.readLine();

										if (choiceDogCreatures.equalsIgnoreCase("run")) {
											c.clear();

											c.drawImage(deepPit, 50, 75, 350, 350, null);

											c.println("You try to run away, but get stuck in a trap...");
											Thread.sleep(3000);

											c.println("The dog-like creature buries you in the pit");
											Thread.sleep(3000);
											c.clear();

											c.drawImage(blurry, 50, 75, 350, 350, null);

											deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
											c.println("You suffocate to death");

											live = false;

										}
										else {

											//Dog Creatures Appear
											c.drawImage(dogCreatures, 50, 75, 350, 350, null);

											c.println("100 more dog-like creatures come out of the trees...");
											Thread.sleep(3000);
											c.clear();

											c.drawImage(diceRoll, 50, 75, 350, 350, null);

											c.println("The creatures challenge you to a dice roll-off, best two out of three");

											c.println("Challenge them? (yes/no)");
											String challengeDogs = c.readLine();

											if (challengeDogs.equalsIgnoreCase("no")) {
												c.clear();
												c.drawImage(bloodOnGround, 50, 75, 350, 350, null);

												deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
												c.println("The dog-like creatures all jump on you and eat you to death");

												live = false;

											}
											else {

												//Dice Roll Game
												int roundRoll = 1;
												boolean aliveRoll = false;
												int userWin = 0;
												int computerWin = 0;


												//Best two out of three

												while (roundRoll <= 3) {

													c.clear();
													c.drawImage(diceRoll, 50, 75, 350, 350, null);
													c.println("Press enter twice to roll your die");

													String inputKeyDice = c.readLine();

													int computerDiceNumber = (int)(Math.random() * 6) + 1;
													int userDiceNumber = (int)(Math.random() * 6) + 1;


													diceNoise.loop(Clip.LOOP_CONTINUOUSLY);
													c.println("Your die is " + userDiceNumber);
													c.println("The computers die is " + computerDiceNumber);
													Thread.sleep(3000);
													c.clear();
													c.drawImage(diceRoll, 50, 75, 350, 350, null);

													diceNoise.stop();


													if (userDiceNumber > computerDiceNumber) {
														userWin = userWin + 1;
														roundRoll = roundRoll + 1;

													}

													else if (userDiceNumber < computerDiceNumber) { 
														computerWin = computerWin + 1;
														roundRoll = roundRoll + 1;

													}

													if (userWin == 2) {
														aliveRoll = true;
														roundRoll = 4;

													}
													else if (computerWin == 2) {
														roundRoll = 4;
													}





												}

												//Dice Roll Lost Part
												if (aliveRoll == false) {

													c.clear();
													c.println("You lost the dice roll-off...");
													Thread.sleep(3000);


													c.drawImage(topOfForest, 50, 75, 350, 350, null);

													c.println("The dog-like creatures pick you up...");
													Thread.sleep(3000);

													c.println("They tie you up, and raise you to a top of a tree.");
													Thread.sleep(3000);


													c.drawImage(groundFromFall, 50, 75, 350, 350, null);

													c.println("Then they push you off the tree...");
													Thread.sleep(3000);;
													c.clear();

													deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
													c.println("You fly through the air, and suddenly hit the ground, dying instantly");
													c.drawImage(bloodOnGround, 50, 75, 350, 350, null);

													live = false;


												}
												else {

													//Dice Roll Win Part
													c.println("You won the dice roll-off...");
													Thread.sleep(3000);
													c.clear();

													c.drawImage(shipOnPlanet, 50, 75, 350, 350, null);

													c.println("The dog-like creatures let you leave and go back to your ship...");
													Thread.sleep(3000);
													c.clear();

													c.drawImage(spaceshipTakeoffGreen, 50, 75, 350, 350, null);


													//Green Planet Survive
													success.loop(Clip.LOOP_CONTINUOUSLY);
													c.println("You get back in your ship, you takeoff happily!");
													
													live = false;



												}

											}

										}

									}


									else {
										//Incorrect Answer Part
										buzzer.loop(Clip.LOOP_CONTINUOUSLY);
										c.println("Please enter either 'run' or 'kill'");
										Thread.sleep(5000);
										buzzer.stop();
									}
								}

							}



						}

						else {
							//Incorrect Answer Part
							buzzer.loop(Clip.LOOP_CONTINUOUSLY);
							c.println("Please enter either 'explore' or 'run'");
							Thread.sleep(5000);
							buzzer.stop();
						}

					}




					//Start of yellow planet
				}
				else if (planetSelect.equalsIgnoreCase("yellow")) {
					
					c.setTextBackgroundColor(Color.YELLOW);
					c.clear();
					c.setTextColor(Color.BLACK);
					c.clear();
					c.drawImage(picYellow, 20, 60,226,223, null);
					Thread.sleep(3000);
					c.clear();

					{
						//Leave or stay
						c.drawImage(picNothing, 20, 60,275,183, null);
						c.println("There is nothing in sight, leave or stay? (leave/stay)");
						String leave = c.readLine();
						//Leave or stay not entered loop
						while (!leave.equalsIgnoreCase("stay") && !leave.equalsIgnoreCase("leave") )
						{
							c.clear();
							c.drawImage(picNothing, 20, 60,275,183, null);
							c.println("Please try again. There is nothing in sight, leave or stay? (leave/stay)");

							leave = c.readLine();
						}
						c.clear();
						//Stay
						if (leave.equalsIgnoreCase("stay"))
						{
							c.drawImage(picBuilding, 20, 60,208,155, null);
							c.println("You find a building, enter it? (yes/no)");
							//Building enter or not
							String enter = c.readLine();
							//Wrong input loop
							while (!enter.equalsIgnoreCase("yes") && !enter.equalsIgnoreCase("no") )
							{
								c.clear();

								c.println("Please try again. You find a building, enter it? (yes/no)");
								c.drawImage(picBuilding, 20, 60,208,155, null);
								enter = c.readLine();
							}
							//Enter building
							if (enter.equalsIgnoreCase("yes"))
							{
								c.clear();
								c.drawImage(picAlien, 20, 60,194,259, null);
								c.println("A large alien kills you.");
								live = false;
								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								Thread.sleep(2000);

							}
							//Don't enter building
							else if(enter.equalsIgnoreCase("no"))
							{
								c.clear();
								c.drawImage(picNothing, 20, 60,275,183, null);
								c.println("Return to ship or continue? (return/continue)");
								String returnShip = c.readLine();
								//Return or continue not entered
								while (!returnShip.equalsIgnoreCase("return") && !returnShip.equalsIgnoreCase("continue") )
								{
									c.clear();
									c.drawImage(picNothing, 20, 60,275,183, null);
									c.println("Please try again. Return to ship or continue? (return/continue)");
									returnShip = c.readLine();
								}	
								//Return
								if (returnShip.equalsIgnoreCase("return"))
								{
									c.clear();
									c.drawImage(picShip, 20, 60,298,169, null);
									c.println("You escape and make it back to space.");
									Thread.sleep(1000);
									c.clear();
									live = true;

								}
								//Continue
								else if(returnShip.equalsIgnoreCase("continue"))
								{
									c.clear();
									c.drawImage(picAlien, 20, 60,194,259, null);
									c.println("A large alien can be seen on the horizon, fight or run? (fight/run)");
									String runAway = c.readLine();
									//Fight or run not entered loop
									while (!runAway.equalsIgnoreCase("run") && !runAway.equalsIgnoreCase("fight") )
									{
										c.clear();
										c.drawImage(picAlien, 20, 60,194,259, null);
										c.println("Please try again. A large alien can be seen on the horizon, fight or run? (fight/run)");
										runAway = c.readLine();
									}
									//Run
									if(runAway.equalsIgnoreCase("run"))
									{
										c.clear();
										c.drawImage(picArm, 20, 60,275,183, null);
										c.println("You escape but your arm is injured, cut off? (yes/no)");
										String saveArm = c.readLine();
										//Arm response, yes or no not entered loop
										while (!saveArm.equalsIgnoreCase("yes") && !saveArm.equalsIgnoreCase("no") )
										{
											c.clear();
											c.drawImage(picArm, 20, 60,275,183, null);
											c.println("Please try again. You escape but your arm is injured, cut off? (yes/no)");
											saveArm = c.readLine();
										}
										//Arm cut off
										if(saveArm.equalsIgnoreCase("yes"))
										{
											c.clear();
											c.drawImage(picShip, 20, 60,298,169, null);
											c.println("You make it back to space.");
											Thread.sleep(1000);
											c.clear();
											live = true;

										}
										//Arm not cut off
										else if(saveArm.equalsIgnoreCase("no"))
										{
											c.clear();
											c.println("You die of an infection.");
											c.drawImage(picDead, 20, 60,214,215, null);
											live = false;
											deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
											Thread.sleep(2000);

										}
									}
									//Fight
									else if(runAway.equalsIgnoreCase("fight"))
									{
										c.clear();
										c.drawImage(picAlien, 20, 60,194,259, null);
										Thread.sleep(3000);
										c.clear();
										c.println("You are defeated and die.");
										c.drawImage(picDead, 20, 60,214,215, null);
										live = false;
										deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
										Thread.sleep(2000);

									}
								}
							}
						}
						//Leave planet
						else if (leave.equalsIgnoreCase("leave"))
						{
							c.clear();
							c.drawImage(picDust, 20, 60,329,153, null);
							c.println("A dust storm is approaching, leave, stay or find shelter? (leave/stay/shelter)");
							//Wrong response loop
							String stormAction = c.readLine();
							while (!stormAction.equalsIgnoreCase("leave") && !stormAction.equalsIgnoreCase("shelter")&& !stormAction.equalsIgnoreCase("stay") )
							{
								c.clear();
								c.drawImage(picDust, 20, 60,329,153, null);
								c.println("Please try again. A dust storm is approaching, leave, stay or find shelter? (leave/stay/shelter)");
								stormAction = c.readLine();
							}
							//Stay
							if (stormAction.equalsIgnoreCase("stay"))
							{
								c.clear();
								c.drawImage(picShip, 20, 60,298,169, null);
								c.println("You survive and make it back to space.");
								Thread.sleep(1000);
								c.clear();
								live = true;

							}
							//Shelter
							else if (stormAction.equalsIgnoreCase("shelter"))
							{
								c.clear();
								c.drawImage(picSheltor, 20, 60,276,183, null);
								c.println("The dust storm ends, however you need food. Eat your pet? (yes/no)");
								String eat = c.readLine();
								//Eat pet not answered right
								while (!eat.equalsIgnoreCase("yes") && !eat.equalsIgnoreCase("no"))
								{
									c.clear();
									c.drawImage(picSheltor, 20, 60, 276,183, null);
									c.println("Please try again. The dust storm ends, however you need food. Eat your pet? (yes/no)");
									eat = c.readLine();
								}
								//Eat pet
								if (eat.equalsIgnoreCase("yes"))
								{
									c.clear();
									c.drawImage(picFood, 20, 60,275,183, null);
									c.println("You almost starved but you made it back to your space ship and have reentered space.");
									Thread.sleep(2000);
									c.clear();
									live = true;
								}
								//Don't eat pet
								else if (eat.equalsIgnoreCase("no"))
								{
									c.clear();
									c.println("You and your pet both die of starvation.");
									c.drawImage(picDead, 20, 60,214,215, null);
									live = false;
									deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(2000);

								}
							}
							//Leave
							else if (stormAction.equalsIgnoreCase("leave"))
							{
								c.clear();
								c.drawImage(picDust, 20, 60,329,153, null);
								c.println("You are caught in the storm enter 1 or 2 to escape.");
								int stormEscape = c.readInt();
								//Correct button
								if (stormEscape == 1 || stormEscape == 2)
								{
									c.clear();
									//Random
									int random1 = (int)(Math.random()*10) + 1;
									//Die
									if (random1 > 5)
									{
										c.clear();
										c.println("Your space ship explodes, and you die.");
										c.drawImage(picDead, 20, 60,214,215, null);
										Thread.sleep(3000);
										c.clear();
										c.drawImage(picExplosion, 20, 60,276,183, null);
										live = false;
										deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
										Thread.sleep(2000);

									}
									//Live
									else if (random1 <= 5)
									{
										c.clear();
										c.drawImage(picShip, 0, 0,298,169, null);
										c.println("You escape and are back in space.");
										Thread.sleep(1000);
										c.clear();
										live = true;

									}
								}
								//Wrong button to escape
								else if (stormEscape != 1 && stormEscape != 2)
								{
									c.clear();
									c.println("You entered the wrong button and die.");
									c.drawImage(picDead, 20, 60,214,215, null);
									live = false;
									deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(2000);

								}
							}
						}
					}

				}
				//Start of orange planet
				else if (planetSelect.equalsIgnoreCase("orange")) {
					c.setTextBackgroundColor(Color.ORANGE);
					c.clear();
					c.setTextColor(Color.BLACK);
					c.clear();
					c.drawImage(picOrange, 20, 60,305,165, null);
					Thread.sleep(3000);

					c.clear();
					c.drawImage(picShip, 20, 60,298,169, null);
					c.println("Please enter 1 or 2 to land.");
					int land = c.readInt();
					//Land not entered correctly
					while (land != 1 && land !=2 )
					{
						c.clear();
						c.drawImage(picShip, 20, 60,298, 169, null);
						c.println("Please try again. Enter 1 or 2 to land.");
						land = c.readInt();
					}
					if (land == 1 || land == 2){
						//Random landing chance
						int random = (int)(Math.random()*10) + 1;
						//Die
						if (random == 1){
							c.clear();
							c.drawImage(picExplosion, 20, 60,276,183, null);
							c.println("Your space ship explodes, and you die.");
							live = false;
							deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
							Thread.sleep(2000);
						}
						//Right button
						else if (random > 1){
							c.clear();
							c.println("You land on your own planet.");
							Thread.sleep(3000);
							c.drawImage(picWizard, 20, 60,233,216, null);
							c.println("A wizard appears and tells you to guess a number between 1 and 5...");
							Thread.sleep(1000);
							c.println("and if you don't guess the correct number...");
							Thread.sleep(1000);
							c.println("he will tell aliens what the coordinates of your planet are.");
							int randomWizard = (int)(Math.random() * 5) + 1;
							Thread.sleep(7000);
							c.clear();
							int guess = 0;
							int tries = 1;
							//Wizard guess loop
							while (guess != randomWizard && tries <=3)
							{

								guess = c.readInt();
								if (guess!=randomWizard){
									c.println("Guess again:");	
									tries++;
								}

							}
							//Right guess
							if (guess == randomWizard && tries <=3)
							{
								c.println("You guessed the right number in " + tries + " attempt(s).");
								Thread.sleep(1500);
								live=true;
							}
							//Wrong guess
							else if (guess != randomWizard)
							{
								c.clear();
								c.drawImage(picDead, 20, 60,214,215, null);
								c.println("The wizard kills you.");
								Thread.sleep(3000);
								live = false;
								deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
								Thread.sleep(2000);
							}
						}
						//Correct guess continued
						if (live != false){
							c.clear();
							c.drawImage(picHouse, 20, 60,275,183, null);
							c.println("You restock supplies and get a good rest.");

							Thread.sleep(5000);
							c.clear();
							c.drawImage(picBattle, 20, 60,210,240, null);
							c.println("However the wizard lied and aliens have arrived and have started to attack your planet.");

							Thread.sleep(5000);
							c.clear();
							c.drawImage(picBattle, 20, 60,210,240, null);
							c.println("Would you like to leave or fight? (leave/fight)");
							String fightAlien = c.readLine();
							//Leave/fight not entered correctly
							while (!fightAlien.equalsIgnoreCase("fight") && !fightAlien.equalsIgnoreCase("leave") )
							{
								c.clear();
								c.drawImage(picBattle, 20, 60,210,240, null);
								c.println("Please try again. Would you like to leave of fight? (leave/fight)");
								fightAlien = c.readLine();
							}
							//Leave
							if (fightAlien.equalsIgnoreCase("leave")){
								c.clear();
								c.drawImage(picShip, 20, 60,298,169, null);
								c.println("Would you like to enter the space battle or escape? (battle/escape)");
								String spaceBattle = c.readLine();
								//Battle/escape not entered correctly
								while (!spaceBattle.equalsIgnoreCase("battle") && !spaceBattle.equalsIgnoreCase("escape") )
								{
									c.clear();
									c.drawImage(picShip, 20, 60,298,169, null);
									c.println("Please try again. Would you like to enter space battle or escape? (battle/escape)");
									spaceBattle = c.readLine();
								}
								//Battle
								if (spaceBattle.equalsIgnoreCase("battle")){
									c.clear();
									c.drawImage(picFight, 20, 60,300,168, null);
									Thread.sleep(3000);
									c.clear();
									c.drawImage(picAlien, 20, 60,194,259, null);
									c.println("Do you shoot first at the aliens? (yes/no)");
									String shoot = c.readLine();
									//Shoot not entered right
									while (!shoot.equalsIgnoreCase("yes") && !shoot.equalsIgnoreCase("no") )
									{
										c.clear();
										c.drawImage(picAlien, 20, 60,194,259, null);
										c.println("Please try again. Do you shoot first at the aliens? (yes/no)");
										shoot = c.readLine();
									}
									//Shoot
									if (shoot.equalsIgnoreCase("yes")){
										c.clear();
										c.drawImage(picFight, 20, 60,300,168, null);
										c.println("You survive, defeat all the aliens, and make it back to space.");
										Thread.sleep(1000);
										c.clear();
										live = true;
									}
									//Don't shoot
									else if (shoot.equalsIgnoreCase("no")){
										c.clear();
										c.drawImage(picDead, 20, 60,214,215, null);
										c.println("You are killed in the space battle.");
										Thread.sleep(1000);
										c.clear();
										live = false;
										deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
										Thread.sleep(2000);
									}
								}
								//Escape
								else if (spaceBattle.equalsIgnoreCase("escape")){
									c.clear();
									c.drawImage(picShip, 20, 60,298,169, null);
									c.println("You escape back to space.");
									Thread.sleep(1000);
									c.clear();
									live = true;
								}
							}
							//Fight
							else if (fightAlien.equalsIgnoreCase("fight")){
								c.clear();
								c.drawImage(picAlien, 20, 60,194,259, null);
								c.println("The aliens are much stronger than anticipated, you must select whether to hide in your home or in a building. (home/building)");
								String hide = c.readLine();
								//Hide location not entered correctly
								while (!hide.equalsIgnoreCase("home") && !hide.equalsIgnoreCase("building") )
								{
									c.clear();
									c.drawImage(picAlien, 20, 60,194,259, null);
									c.println("Please try again. Hide at home or in a building? (home/building)");
									hide = c.readLine();
								}
								//Hide home
								if (hide.equalsIgnoreCase("home")){
									c.clear();
									c.drawImage(picHouse, 20, 60,275,183, null);
									c.println("You survive and make it back to space.");
									Thread.sleep(1000);
									c.clear();
									live = true;
								}
								//Hide building
								if (hide.equalsIgnoreCase("building")){
									c.clear();
									c.drawImage(picHomeBuilding, 20, 60,275,183, null);
									c.println("You are captured and killed.");
									deadNoise.loop(Clip.LOOP_CONTINUOUSLY);
									Thread.sleep(2000);
									live = false;


								}
							}
						}
					}

				}



				else {
					buzzer.loop(Clip.LOOP_CONTINUOUSLY);
					c.println("Please enter a planet (blue/green/orange/yellow)");
					Thread.sleep(5000);
					buzzer.stop();
				}
				if (live == false) {
					Thread.sleep(5000);
					c.clear();
					deadNoise.stop();
					c.println("Game Over...");
					Thread.sleep(2000);
					c.println("Play Again? (Yes/No)");
					String playAgain = c.readLine();

					if (playAgain.equalsIgnoreCase("No")) {
						c.println("Okay, thanks for playing...");
						Thread.sleep(2000);
						deadNoise.stop();
						blueBackground.stop();
						greenBackground.stop();
						c.println("Closing in...");
						Thread.sleep(1000);
						c.println("3");
						Thread.sleep(1000);
						c.println("2");
						Thread.sleep(1000);
						c.println("1");
						Thread.sleep(1000);

						c.close();
					}
					else if (playAgain.equalsIgnoreCase("yes")) {
						c.setTextBackgroundColor(Color.BLACK);
						c.clear();
						c.setTextColor(Color.WHITE);
						c.println("Sweet...");
						Thread.sleep(2000);
						planetWrong = false;
						deadNoise.stop();
						blueBackground.stop();
						greenBackground.stop();
						success.stop();
						c.clear();


					}
				}
				
				

			}
		}

		catch (InterruptedException ie) {

			System.out.println(ie.getMessage());
			System.out.println("There was an error, please restart the program in a few seconds...");
		}

	}
}

