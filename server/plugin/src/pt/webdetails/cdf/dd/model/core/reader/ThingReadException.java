package pt.webdetails.cdf.dd.model.core.reader;

/**
 * @author dcleao
 */
public final class ThingReadException extends Exception
{
  public ThingReadException(String message, Exception cause)
  {
    super(message, cause);
  }

  public ThingReadException(Exception cause)
  {
    super(cause);
  }

  public ThingReadException(String message)
  {
    super(message);
  }
}