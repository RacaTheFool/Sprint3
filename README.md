# Overview

My purpose in creating this was to try out so Java programming.
The main goal was to create working code that used different features of the language. Therefore, I kept the program simple.

This program is a number guessing game. The game will randomly generate a number between 1 and 100. You're goal is to try and guess what that number is in as few turns as possible. If the generated number is lower than your guess than the game will tell you "Lower", meaning that you should guess lower, and if higher it will say "Higher" After completing a round you will be given four options: play again, display the number of guesses for each round, display the average number of guesses of all rounds, and quit.

I was able to experiment using this code to better understand of Java works. One of the biggest hurdles is how classes are totally different from what I'm used to. I had originally used a main() method in the number guessing game class (NumGuessGame), but found out that it needed me to create an instance of the class inside of it to use it. This meant that the data inside was separate from the NumGuessGame class that was created in the Main class to run. I needed it to share the data so that I could use the ArrayList to hold the number of guesses for later display and expressions. I learned other things as well, of course, but this was the aspect that I found the most interesting in the learning process.

[Software Demo Video](https://youtu.be/OwECexyjB2E)

# Development Environment

* Git/GitHub
* Visual Studio Code
* Java

# Useful Websites

* [w3schools - Java](https://www.w3schools.com/java/default.asp)
* [How to format string output](https://stackoverflow.com/questions/26576909/how-to-format-string-output-so-that-columns-are-evenly-centered)
* [How to generate random numbers in Java](https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java)

# Future Work

* Add exceptions for user input
* Read/write files (maybe a "High Score" file, or create a different program for this)
* Make a larger program that uses many classes and uses mechanisms like inheritance