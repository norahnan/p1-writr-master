package edu.mtholyoke.cs341bd.writr;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * @author jfoley
 */
public class WritrMessage implements Comparable<WritrMessage> {
  /**
   * This is the timestamp of when this message was added -- when the constructor gets called.
   * We assume this is close enough to when the user presses the submit button for our uses.
   *
   * It's a long because it's the number of milliseconds since 1960... how computers tell time.
   */
  long timeStamp;
  /** The text the user typed in. */
  String messageText;
  
  //comments
  List<Comment> comments;
  
  public void addComment(Comment newC)
	{
		comments.add(newC);
	}


  /**
   * Create a message and init its time stamp.
   * @param text the text of the message.
   */
  public WritrMessage(String text) {
    messageText = text;
    timeStamp = System.currentTimeMillis();
  }

  /**
   * Rather than give a PrintWriter here, we'll use a StringBuilder, so we can quickly build up a string from all of the messages at once. I mostly did this a different way just to show it.
   * @param output a stringbuilder object, to which we'll add our HTML representation.
   */
  public void appendHTML(StringBuilder output) {
    output
        .append("<div class=\"message\">")
        .append("<span class=\"datetime\">").append(Util.dateToEST(timeStamp)).append("</span>")
        .append(messageText)
        .append("</div>");
  }

  /**
   * Sort newer messages to top by default. Maybe someday we'll sort in other ways.
   *
   * @param o the other message to compare to.
   * @return comparator of (this, o).
   */
  @Override
  public int compareTo(@Nonnull WritrMessage o) {
    return -Long.compare(timeStamp, o.timeStamp);
  }
}
