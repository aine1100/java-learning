import java.util.Arrays;

public class array {
    public static void main(String[] args){
        //arrays
        int[] numbers= new int[3];
        numbers[0]=1;
        numbers[2]=33;
        numbers[1]=6;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        int[] numbers2 = {0,5,6,8,9}; //shortcut of the array formation
        System.out.println(Arrays.toString(numbers2));
        numbers2[2]=55;
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));

        String[] names={"jamilla","alex","ganza"};
        System.out.println(Arrays.toString(names));
    }
}
