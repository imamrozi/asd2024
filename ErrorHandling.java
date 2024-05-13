package asd2024;

public class ErrorHandling {
    public static void main(String[] args)  {
        try {
            tes(5,10);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            //cari nasi goreng)();
            System.out.println(e.getMessage());
        }
    }

    static void tes(int a, int b) throws Exception{
        if(a<b)
            throw new Exception("A harus lebih besar dari B");
        else    
            System.out.println("OKE...");
        }
}
