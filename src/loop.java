public class loop {
    public static void main (String[] args ){
            for (int i=10; i>0;i--){
                System.out.println(i);
            }
            String[] names={
                    "james",
                    "aine",
                    "saly",
                    "sophia",
                    "keza"
            };
            for(int i= names.length-1;i >= 0;i--){
                System.out.println(names[i]);
            }
            if(false){
                System.out.println("this codes run");
            }else{
                System.out.println("this codes doesnt run");
            }
            int age=2;
            boolean isAdult = age >=16;
            if(isAdult){
                System.out.println("is an adult:");
            } else if (age == 1) {
                System.out.println("he is a  child");

            }
            else if (age == 2) {
                System.out.println("he is a  toddler");

            }else{
                System.out.println("is not an adult");
            }
    }
}
