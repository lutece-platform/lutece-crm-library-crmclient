package fr.paris.lutece.plugins.crmclient.util;


/**
 * 
 * CRMException 
 *
 */
public class CRMException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID =1781761996546052287L;
	/**
     * Creates a new instance of CrmException
     * @param strMessage The error message
     * @param e The exception
     */
    public CRMException( String strMessage, Exception e )
    {
        super( strMessage, e );
    }
}