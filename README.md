# HelloWorld RPG

A turn-based console RPG written in Java. Roll a die, chain hits into combos, and fight your way through four stages to defeat the final boss.

> **Work in progress.** The hero, dice and damage systems are in place. Bosses, stages and battles are being built.

## How combat works

Each turn you roll a six-sided die. The number you roll is the number of hits you land, and every hit in a combo is slightly stronger than the one before. Then the boss strikes back. Rolling high can win a fight in one turn, but luck alone is not enough: your health carries between stages, so survival matters.

## Features

- Create a hero and track level, health and gold
- Dice-based combat with combo hits
- Health that always stays between 0 and the maximum
- Clean separation between game logic and console output

**Coming next**
- Four stages, each with its own terrain and boss
- Bosses with unique attack behavior
- A small heal between stages
- A 2D top-down graphical version using libGDX

## Run it

Requirements: JDK 17 or newer.

```
javac -d out src/helloworldrpg/Main.java src/helloworldrpg/model/Hero.java
java -cp out helloworldrpg.Main
```

Or open the project in IntelliJ IDEA and run `Main`.

## Project structure

```
src/
└── helloworldrpg/
    ├── Main.java        # entry point and console interaction
    └── model/
        └── Hero.java    # hero data and behavior
```

The `model` package contains the game rules and never prints or reads input. This keeps the logic reusable, so the console interface can later be replaced by a graphical one without rewriting the game.

## Built with

- Java 17
- Plain Java, no external libraries (libGDX planned for the graphical version)