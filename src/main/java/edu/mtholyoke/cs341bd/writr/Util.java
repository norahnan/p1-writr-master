package edu.mtholyoke.cs341bd.writr;

import javax.annotation.Nullable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

/**
 * @author jfoley
 */
public class Util {
  @Nullable
  public static String join(@Nullable String[] array) {
    if(array == null) return null;

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      if(i > 0) sb.append(' ');
      sb.append(array[i]);
    }
    return sb.toString();
  }

  // just use EST rather than something fancier; TBD -- how might we configure this for different users.
  private static ZoneId EST = TimeZone.getTimeZone("EST").toZoneId();

  public static String dateToEST(long millis) {
    LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), EST);

    String yyyymmdd = localDateTime.getYear()+"-"+localDateTime.getMonth().getValue()+"-"+ localDateTime.getDayOfMonth();
    String hhmm = localDateTime.getHour()+":"+localDateTime.getMinute();

    return yyyymmdd+" "+hhmm;
  }
}
