package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    //if 10 give buzz
    //if multople of 3 and 5 give FizzBuzz
    if (i % 3,5 == 0)
    {
      return "FizzBuzz";
    }
    if (i == 10) { return "Buzz"; }
    if (i == 5) { return "Buzz"; }
    //if the number is multiple of  3, give Fizz 
    if (i % 3 == 0)
    {
      return "Fizz";
    }
    else
      // otherwise do the normal thing
      return "" + i;
  }
}
