package Entities;
public class Players {
    private String username;
    private int score;
    private int lives;
    private int currentLevel;
    private long timeRemaining;
    
    public Player() {
        this.username = "Player";
        this.score = 0;
        this.lives = 3;
        this.currentLevel = 1;
        this.timeRemaining = 60000;
    }
    
    public Player(String username, int initialLives, long initialTime) {
        this.username = username;
        this.score = 0;
        this.lives = initialLives;
        this.currentLevel = 1;
        this.timeRemaining = initialTime;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getLives() {
        return lives;
    }
    
    public void setLives(int lives) {
        this.lives = lives;
    }
    
    public int getCurrentLevel() {
        return currentLevel;
    }
    
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }
    
    public long getTimeRemaining() {
        return timeRemaining;
    }
    
    public void setTimeRemaining(long timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
    
    public void loseLife() {
        if (lives > 0) {
            lives--;
        }
    }
    
    public void addScore(int amount) {
        if (amount > 0) {
            score += amount;
        }
    }
    
    public void nextLevel() {
        currentLevel++;
    }
    
    public boolean isAlive() {
        return lives > 0;
    }
    
    public void updateTime(long deltaTime) {
        timeRemaining -= deltaTime;
        if (timeRemaining < 0) {
            timeRemaining = 0;
        }
    }
    
    public void reset() {
        score = 0;
        lives = 3;
        currentLevel = 1;
        timeRemaining = 60000;
    }
    
    @Override
    public String toString() {
        return String.format("Player: %s | Level: %d | Score: %d | Lives: %d | Time: %.1fs", 
            username, currentLevel, score, lives, timeRemaining / 1000.0);
    }
}
