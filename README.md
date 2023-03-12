
# Rock-Paper-Scissors

Simple Java project implementing Rock-Paper-Scissors with possibility of adding custom hands.

## The program should:

- Output a line: "Enter your name:" (Users enter their names on the same line (not the one following the output).
- Read the input with the username and output "Hello, \<name\>".
- Read rating.txt and check whether it contains an entry with the current username. If yes, use the score specified in the file as a starting point. If not, start the score from 0;
- Read the input with the list of options for the game (options are separated by comma). If the input is an empty line, play with the default options;
- Output a line "Okay, let's start".
- Play the game by the rules defined in the previous stages and read the user's input;
- If the input is "!exit", output "Bye!" and stop the game;
- If the input is the name of the option, then pick a random option and output a line with the result of the game in the following format (<option\> is the name of the option chosen by the program):
    Loss: Sorry, but the computer chose <option>
    Draw: There is a draw (<option\>)
    Win: Well done. The computer chose <option> and failed
- For each draw, add 50 points to the score. For each user's win, add 100 to their score. In case of a loss, don't change the score;
- If input corresponds to anything else, output Invalid input;
- Restart the game (with the same options defined before the start of the game).

## Examples:

Example 1:
```
Enter your name: 
> Tim
Hello, Tim
> rock,gun,lightning,devil,dragon,water,air,paper,sponge,wolf,tree,human,snake,scissors,fire
Okay, let's start
> rock
Sorry, but the computer chose air
> !rating
Your rating: 0
> rock
Well done. The computer chose sponge and failed
> !rating
Your rating: 100
> !exit
Bye!
```

Example 2:

```
Enter your name: > Tim
Hello, Tim
> 
Okay, let's start
> rock
Well done. The computer chose scissors and failed
> paper
Well done. The computer chose rock and failed
> paper
There is a draw (paper)
> scissors
Sorry, but the computer chose rock
> !exit
Bye!
```
