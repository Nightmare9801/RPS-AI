## Rock-Paper-Scissors AI

## 📌 Overview

This is an AI-powered Rock-Paper-Scissors (RPS) game that learns from player moves using Markov Chains. The AI predicts the player's next move based on previous choices and selects the best counter move.

## 🛠 Features

✅ Player vs AI gameplay
✅ AI learns and adapts using Markov Chains
✅ Tracks player move sequences
✅ Counters the most probable next move
✅ Random move selection when no history is available
✅ User-friendly console interface

## 🎮 How to Play

- Run the program.

- Enter Rock, Paper, or Scissors.

- The AI will make its move based on past player choices.

- The winner is determined based on standard RPS rules.

- Type quit to exit the game.

## 🚀 Installation & Setup

- Clone this repository:

```
git clone https://github.com/yourusername/rps-ai.git
cd rps-ai
```

- Compile and run the program:

```
javac -d . *.java
java ai.sps.RPSGame
```

## 📜 Project Structure

```
 ai/sps/
 ├── AI.java           # AI logic (predicts & counters moves)
 ├── Count.java        # Tracks player move history (Markov Chain)
 ├── Move.java         # Represents a single move
 ├── RPSGame.java      # Main game loop
 ├── Type.java         # Enum for Rock, Paper, Scissors
```

## 🧠 How It Works

The AI remembers the last move and tracks how often the player follows up with Rock, Paper, or Scissors.

The AI chooses the move that counters the most likely player choice.

If no history is available, the AI picks randomly.

## 🔍 Example Gameplay

```
Enter Rock, Paper, or Scissors (or 'quit' to stop): Rock
AI chose: Paper
AI wins!

Enter Rock, Paper, or Scissors (or 'quit' to stop): Paper
AI chose: Scissors
AI wins!

Enter Rock, Paper, or Scissors (or 'quit' to stop): Scissors
AI chose: Rock
AI wins!
```

📜 License

This project is licensed under the MIT License. Feel free to modify and use it as you like!

🚀 Enjoy the game and try to beat the AI!
