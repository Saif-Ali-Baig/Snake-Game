# Snake Game Development Log

---

## Day 1: Getting Started with the Game Window  
**Date:** July 11, 2025

### 🛠️ Progress:
- Made a window using **Java Swing** with a `JPanel`.
- Drew a grid with lines every 20 pixels to create a **400x400** area.
- Added a **green square** for the snake at position **(5,5)**.
- Added a **red square** for food at position **(10,10)**.
- Successfully displayed the game window with the snake and food.

### 🐛 Issues Found:
- Grid lines don’t fully cover the window edges.
- Used unclear variable names like `x`, `y`, `z`, making the code hard to read.
- No comments in the code — forgot why `z = 400` was used.

### 🔧 Resolutions:
- Haven’t fixed the issues yet; focused on getting visuals working.
- Reviewed **Swing tutorials** to understand how `JPanel` and `paintComponent` work.

### 💡 Why I Started:
I love playing Snake on old phones and wanted to make my own version.  
I chose **Java** because it’s known for desktop apps, and **Swing** looked simple for drawing.

### ⏭️ Next Steps:
- Make the snake move with arrow keys.
- Add a timer to move the snake automatically.

---

## Day 2: Adding Movement and Controls  
**Date:** July 12, 2025

### 🛠️ Progress:
- Added a **Timer** to move the snake every **50ms**.
- Used a `KeyListener` to change direction using **arrow keys**.
- Implemented movement logic for directions: **Up, Down, Left, Right**.
- Snake now moves continuously in the game window.

### 🐛 Issues Found:
- Snake moves too fast, making it hard to control.
- Arrow keys don’t work unless the window is clicked first.
- Snake can reverse direction instantly (e.g., right to left), which shouldn't happen.
- Using short variable names like `s`, `f`, `d` is making the code hard to follow.
- Got a `NullPointerException` when trying to move the snake before the timer started.

### 🔧 Resolutions:
- Realized the panel needs to be **focusable** for `KeyListener` to work.
  - Tried using `setFocusable(true)` — unsure if it's enough.
- Lowered timer delay to 50ms, but it's still too fast — will adjust again.
- Haven’t fixed the reversal or exception issues yet — need more debugging.

### ⏭️ Next Steps:
- Fix keyboard input and slow down the snake movement.
- Make the snake grow when it eats food.
- Randomize the food's position.
