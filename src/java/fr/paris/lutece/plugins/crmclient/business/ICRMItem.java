/*
 * Copyright (c) 2002-2013, Mairie de Paris
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
package fr.paris.lutece.plugins.crmclient.business;

import java.io.Serializable;

import java.util.Map;


/**
 *
 * ICRMItem
 *
 */
public interface ICRMItem extends Serializable
{
    // Keys
    String NOTIFICATION_OBJECT = "notification_object";
    String NOTIFICATION_MESSAGE = "notification_message";
    String NOTIFICATION_SENDER = "notification_sender";
    String ID_DEMAND = "id_demand";
    String STATUS_TEXT = "status_text";
    String ID_DEMAND_TYPE = "id_demand_type";
    String USER_GUID = "user_guid";
    String ID_STATUS_CRM = "id_status_crm";
    String ID_CRM_USER = "id_crm_user";
    String DEMAND_DATA = "demand_data";
    String USER_ATTRIBUTE = "attribute";
    String MEDIA_TYPE = "media_type";
    

    /**
     * Get the url for WS
     * @return the url for WS
     */
    String getUrlForWS(  );

    /**
     * Set the parameters of the crm item
     * @param mapParameters the parameters
     */
    void setParameters( Map<String, String> mapParameters );

    /**
     * Get the parameters
     * @return the parameters
     */
    Map<String, String> getParameters(  );

  
    /**
     * @return strCRMWebAppBaseURL the CRM webapp URL
     */
    String getCRMWebAppBaseURL(  );

    /**
     * Put a new parameter to the map parameters
     * @param strKey the key of the parameter
     * @param strValue the value of the parameter
     */
    void putParameter( String strKey, String strValue );
    
    
    /**
     * the CRM web app Code
     * @return the CRM web app Code
     */
	 String getCRMWebAppCode();
   
	 /**
	  * set  the CRM web app code
	  * @param _strmCRMWebAppCode  the CRM web app code
	  */
	 void setCRMWebAppCode(String _strmCRMWebAppCode);
}
