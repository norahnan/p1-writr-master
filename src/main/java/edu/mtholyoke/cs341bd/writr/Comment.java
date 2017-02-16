package edu.mtholyoke.cs341bd.writr;

import javax.annotation.Nonnull;

public class Comment implements Comparable<WritrMessage> {
	
	String content;
	long timeStamp;
	String user;
	
	public Comment(String user,String inputC)
	{
		this.user = user;
		content = inputC;
		timeStamp = System.currentTimeMillis();
	}
	
	
	/**
	   * Rather than give a PrintWriter here, we'll use a StringBuilder, so we can quickly build up a string from all of the messages at once. I mostly did this a different way just to show it.
	   * @param output a stringbuilder object, to which we'll add our HTML representation.
	   */
	  public void appendHTML(StringBuilder output) {
	    output
	        .append("<div class=\"comment\">")
	        .append("<span class=\"datetime\">").append(Util.dateToEST(timeStamp)).append("</span>")
	        .append(content)
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
	  
	  @Override
	  public String toString(){
		  String c = user + " :" + content ;
		return c;
		  
	  }
	
	

}
