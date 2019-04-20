import service.FizzBuzzSerivce;

/**
 * Created by etsheep on 2019-4-20.
 */

/** main function
 * To see service.FizzBuzzServiceTest unit test in the test package
 */
public class FizzBuzz {

    public static void main(String[] args){

        FizzBuzzSerivce fizzBuzzSerivce = new FizzBuzzSerivce();

        //FizzBuzz
        for (int i = 1; i < 101; i++){
            System.out.println(fizzBuzzSerivce.getFizzBuzz(i));
        }

        //FizzBuzz stage 2
        for (int i = 1; i < 101; i++){
            System.out.println(fizzBuzzSerivce.getFizzBuzzStage2(i));
        }
    }
}
