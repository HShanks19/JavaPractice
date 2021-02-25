package enums;

public class RPSrunner {

	public static void main(String[] args) {
		
		RockPaperScissors paper = RockPaperScissors.PAPER;
		RockPaperScissors scissors = RockPaperScissors.SCISSORS;
		RockPaperScissors rock = RockPaperScissors.ROCK;
		RockPaperScissors computer = computerAnswer();
		
		printWinner(paper,computer);
		printWinner(scissors,computer);
		printWinner(rock,computer);
		
	} 
		
	private static RockPaperScissors computerAnswer() {
		double random = Math.random();
		if (random < 0.35) {
			return RockPaperScissors.ROCK;
		} else if (random < 0.7) {
			return RockPaperScissors.PAPER;
		} else {
			return RockPaperScissors.SCISSORS;
		}
	}

	
	private static RockPaperScissors playGame(RockPaperScissors input, RockPaperScissors decision) {
		if (input == decision) {
			return input;
		} else if (input == RockPaperScissors.PAPER && decision == RockPaperScissors.SCISSORS || decision == RockPaperScissors.PAPER && input == RockPaperScissors.SCISSORS) {
			return RockPaperScissors.SCISSORS;
		} else if (input == RockPaperScissors.PAPER && decision == RockPaperScissors.ROCK || decision == RockPaperScissors.PAPER && input == RockPaperScissors.ROCK) {
			return RockPaperScissors.PAPER;
		}else if (input == RockPaperScissors.SCISSORS && decision == RockPaperScissors.ROCK || decision == RockPaperScissors.SCISSORS && input == RockPaperScissors.ROCK) {
			return RockPaperScissors.ROCK;
		}
		return decision;
	}
	
	private static void printWinner(RockPaperScissors input, RockPaperScissors decision) {
		if (input == decision) {
			System.out.println("Computer Choice: " + decision + ". Player Choice: " + input + ". Tie.");
		} else if (playGame(input, decision) == input) {
			System.out.println("Computer Choice: " + decision + ". Player Choice: " + input +". Player Wins");
		} else if (playGame(input, decision) == decision) {
			System.out.println("Computer Choice: " + decision + ". Player Choice: " + input + ". Computer Wins");
		} 

	}
	
}
