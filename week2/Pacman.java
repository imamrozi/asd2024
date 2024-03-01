package week2;

public class Pacman {
    int width, height, x, y;
    public Pacman(int w, int h){
        width = w;
        height = h;
        x = w/2;
        y = h/2;
    }
    void printPosition(){
        System.out.printf("(%d, %d)",x, y);
        System.out.println();
    }
    void moveLeft(){
        if(x>0)    
            x = x-1;
        printPosition();
        detectCollision();
    }
    void moveRight(){
        if(x<width) 
            x = x+1;
        printPosition();
        detectCollision();
    }
    void moveUp(){
        if(y>0)
            y = y-1;
        printPosition();
        detectCollision();
    }
    void moveDown(){
        if(y<height)
            y = y+1;
        printPosition();
        detectCollision();
    }
    void detectCollision(){
        if(x<=0 || y<=0 || x>=width || y>=height)
            System.out.println("Game over!");
    }
    public static void main(String[] args) {
        Pacman p = new Pacman(50, 100);
        p.printPosition();
        p.moveLeft();
        p.moveDown();
        p.moveDown();
        p.moveRight();
        for(int i=0;i<50;i++){
            p.moveDown();
        }
        
    }
}
