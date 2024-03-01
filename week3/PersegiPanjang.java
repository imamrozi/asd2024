package week3;

public class PersegiPanjang {
    int width, height;
    PersegiPanjang(){}
    PersegiPanjang(int w, int h){
        width = w;
        height = h;
    }
    int calcArea(){
        return width*height;
    }
    int calcCircumstances(){
        return 2*(width+height);
    }
}
