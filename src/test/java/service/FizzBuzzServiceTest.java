package service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by etsheep on 2019-4-20.
 */
public class FizzBuzzServiceTest {

    private final FizzBuzzSerivce fizzBuzzSerivce = new FizzBuzzSerivce();

    @Test
    public void getFizzBuzzTest(){
        int number = 33;
        String expected = "Fizz";
        Assert.assertEquals(expected, fizzBuzzSerivce.getFizzBuzz(number));
    }

    @Test
    public void getFizzBuzzStage2Test(){
        int number = 53;
        String expected = "FizzBuzz";
        Assert.assertEquals(expected, fizzBuzzSerivce.getFizzBuzzStage2(number));
    }
}
