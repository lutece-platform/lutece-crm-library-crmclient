/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.crmclient.service.authenticator;

import fr.paris.lutece.util.signrequest.AbstractAuthenticator;
import fr.paris.lutece.util.signrequest.RequestAuthenticator;

/**
 * IAuthenticatorService
 *
 *
 */
public interface IAuthenticatorService
{
    /**
     * Get the RequestAuthenticator for Ws depending the strWebbAppCode
     * 
     * @param strCrmWebbAppCode
     *            the crm webb app code
     * @return RequestAuthenticator the RequestAuthenticator associate to the crm webapp
     */
    RequestAuthenticator getRequestAuthenticatorForWs( String strCrmWebbAppCode );

    /**
     * Get the RequestAuthenticator for Url depending the strWebbAppCode
     * 
     * @param strCrmWebbAppCode
     *            the crm webb app code
     * @return AbstractAuthenticator the RequestAuthenticator associate to the crm webapp
     */
    AbstractAuthenticator getRequestAuthenticatorForUrl( String strCrmWebbAppCode );
}
