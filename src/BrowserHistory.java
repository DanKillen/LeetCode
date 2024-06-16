/**
 * Created by Daniel Killen on 15/06/2024
 * You have a browser of one tab where you start on the homepage, and you can visit another url,
 * get back in the history number of steps or move forward in the history number of steps.
 **/
public class BrowserHistory
{
   String url;
   BrowserHistory next;
   BrowserHistory previous;
   static BrowserHistory current;

   public BrowserHistory(String homepage) {
      this.url = homepage;
      current = this;
   }

   public void visit(String url) {
      BrowserHistory previous = current;
      BrowserHistory visit = new BrowserHistory(url);
      visit.previous = previous;
      visit.previous.next = current;
   }

   public String back(int steps) {
      for (int i = 0; i < steps; i++)
      {
         if (current.previous == null)
         {
            return current.url;
         }
         current = current.previous;
      }
      return current.url;
   }

   public String forward(int steps) {
      for (int i = 0; i < steps; i++)
      {
         if (current.next == null)
         {
            return current.url;
         }
         current = current.next;
      }
      return current.url;
   }
}

/*
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
