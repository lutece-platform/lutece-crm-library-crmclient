package fr.paris.lutece.plugins.crmclient.service.authenticator;

import fr.paris.lutece.util.signrequest.AbstractAuthenticator;
import fr.paris.lutece.util.signrequest.RequestAuthenticator;

/**
 * IAuthenticatorService
 * 
 *
 */
public interface IAuthenticatorService {

	/**
	 * Get the RequestAuthenticator for Ws depending the strWebbAppCode
	 * @param strCrmWebbAppCode the crm webb app code
	 * @return RequestAuthenticator the RequestAuthenticator associate to the crm webapp
	 */
	RequestAuthenticator getRequestAuthenticatorForWs(String strCrmWebbAppCode);
	
	
	/**
	 * Get the RequestAuthenticator for Url depending the strWebbAppCode
	 * @param strCrmWebbAppCode the crm webb app code
	 * @return AbstractAuthenticator the RequestAuthenticator associate to the crm webapp
	 */
	AbstractAuthenticator getRequestAuthenticatorForUrl(String strCrmWebbAppCode);

}