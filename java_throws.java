class NegativeException extends Exception{

public NegativeException(String msg){
    super(msg);
}

    @Override
    public String getMessage(){
        return super.getMessage()+" please don't give negative numbers";
    }

    @Override
        public String toString(){
        return super.toString()+" please don't give negative numbers";
    }
}

public class java_throws {

   static public int area_of_rect(int l,int w)throws NegativeException{
    if(l < 0 || w < 0){
        throw new NegativeException("negative number exception");
    }
        int result=l*w;
        return result;
    }
    public static void main(String[] args) {
        try {
         int area=area_of_rect(5,-7);   
          System.out.println(area);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
       
    }
}
