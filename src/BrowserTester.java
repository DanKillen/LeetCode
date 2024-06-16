/**
 * Created by Daniel Killen on 15/06/2024
 * UPDATE COMMENTS ABOUT PROGRAM HERE
 **/
public class BrowserTester
{
   public static void main(String[] args){
      BrowserHistory obj = new BrowserHistory("leetcode.com");
      obj.visit("google.com");
      obj.visit("facebook.com");
      obj.visit("youtube.com");
      System.out.println("B" + obj.back(1));
      System.out.println("B" + obj.back(1));
      System.out.println("F" + obj.forward(1));
      obj.visit("linkedin.com");
      System.out.println("F" + obj.forward(2));
      System.out.println("B" + obj.back(2));
      System.out.println("B" + obj.back(7));

   }
}
