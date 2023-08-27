
public class ControlStructures {
	public static void main(String[] args) {
		ConsoleIO.printLine("Your age please?");

		int age;
		age = ConsoleIO.readInt(); //Function call / subroutine call / static method call

		while (age < 0) {
			ConsoleIO.printLine("No really, what's your age???");
			age = ConsoleIO.readInt();
		}

		int olderAge;
		olderAge = age + 10;

		ConsoleIO.printLine("In ten years, you will be " + olderAge);

		if (age < 5) {
			ConsoleIO.printLine("You have your whole life ahead of you...");
		}
	}
}