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
package fr.paris.lutece.plugins.crmclient.service;

import fr.paris.lutece.plugins.crmclient.service.queue.ICRMClientQueue;
import fr.paris.lutece.plugins.crmclient.util.CRMException;



/**
 *
 * ICRMClientService
 *
 */
public interface ICRMClientService
{
    String BEAN_SERVICE = "crmclient.crmClientService";

    /**
    * Get the queue
    * @return the queue
    */
    ICRMClientQueue getQueue(  );

    /**
     * Notify a demand
     * @param strIdDemand the id demand
     * @param strObject the object
     * @param strMessage the message
     * @param strSender the sender
     */
    void notify( String strIdDemand, String strObject, String strMessage, String strSender );

   
   
    /**
     * Notify a demand
     * @param strIdDemand the id demand
     * @param strObject the object
     * @param strMessage the message
     * @param strSender the sender
     * @param strCRMWebAppCode the CRM webapp code
     */
    void notify( String strIdDemand, String strObject, String strMessage, String strSender, String strCRMWebAppCode  );

    /**
     * Update a demand
     * @param strIdDemand the id demand
     * @param strStatusText the status text
     * @throws CRMException CRMException
     */
    void sendUpdateDemand( String strIdDemand, String strStatusText )throws CRMException;


    /**
     * Update a demand
     * @param strIdDemand the id demand
     * @param strStatusText the status text
     * @param strCRMWebAppCode the CRM webapp code
     * @throws CRMException CRMException
     */
    void sendUpdateDemand( String strIdDemand, String strStatusText, String strCRMWebAppCode )throws CRMException;
    
    
    /**
     * Update a demand
     * @param strIdDemand the id demand
     * @param strStatusText the status text
     * @param strCRMWebAppCode the CRM webapp code
     * @param strIdStatusCRM id of CRM status
     * @throws CRMException CRMException
     * 
     */
    void sendUpdateDemand( String strIdDemand, String strStatusText,String strCRMWebAppCode ,String strIdStatusCRM)throws CRMException;
   
    /**
     * Update a demand
     * @param strIdDemand the id demand
     * @param strStatusText the status text
     * @param strCRMWebAppCode the CRM webapp code
     * @param strIdStatusCRM id of CRM status
     * @param strData the value of the parameter demand_data insert in the demand link  
     * @throws CRMException the exception if there is a problem
     */
    void sendUpdateDemand( String strIdDemand, String strStatusText,String strCRMWebAppCode ,String strIdStatusCRM,String strData)throws CRMException;
    
    
    /**
     * This method calls create a new demand and gets the id demand
     * @param strIdDemandType id of demand type
     * @param strUserGuid login of user auth
     * @param strIdStatusCRM id of CRM status
     * @param strStatusText status text
     * @param strData the value of the parameter demand_data insert in the demand link  
     * @return id demand
     * @throws CRMException the exception if there is a problem
     */
    String sendCreateDemandByUserGuid( String strIdDemandType, String strUserGuid, String strIdStatusCRM,
        String strStatusText, String strData ) throws CRMException;
    
    /**
     * This method calls create a new demand and gets the id demand
     * @param strIdDemandType id of demand type
     * @param strUserGuid login of user auth
     * @param strIdStatusCRM id of CRM status
     * @param strStatusText status text
     * @param strData the value of the parameter demand_data insert in the demand link  
     * @param strCRMWebAppCode the CRM webapp code
     * @return id demand
     * @throws CRMException the exception if there is a problem
     */
    String sendCreateDemandByUserGuid( String strIdDemandType, String strUserGuid, String strIdStatusCRM,
        String strStatusText, String strData ,String strCRMWebAppCode ) throws CRMException;
    
    /**
     * This method calls create a new demand and get id demand
     * @param strIdDemandType id of demand type
     * @param strIdCRMUser the id crm user
     * @param strIdStatusCRM id of CRM status
     * @param strStatusText status text
     * @param strData the value of the parameter demand_data insert in the demand link  
     * @return id demand
     * @throws CRMException the exception if there is a problem
     */
    @Deprecated
    String sendCreateDemandByIdCRMUser( String strIdDemandType, String strIdCRMUser,
        String strIdStatusCRM, String strStatusText, String strData )
        throws CRMException;
    
    /**
     * This method calls create a new demand and get id demand
     * @param strIdDemandType id of demand type
     * @param strIdCRMUser the id crm user
     * @param strIdStatusCRM id of CRM status
     * @param strStatusText status text
     * @param strData the value of the parameter demand_data insert in the demand link  
     * @param strCRMWebAppCode the CRM webapp code
     * @return id demand
     * @throws CRMException the exception if there is a problem
     */
    @Deprecated
    String sendCreateDemandByIdCRMUser( String strIdDemandType, String strIdCRMUser,
        String strIdStatusCRM, String strStatusText, String strData,String strCRMWebAppCode )
        throws CRMException;
    
    
    /**
     * This method delete a demand
     * @param strIdDemand the id of the demand
     * @throws HttpAccessException the exception if there is a problem
     */
    void sendDeleteDemand( String strIdDemand )throws CRMException;
    
    
    /**
     * This method delete a demand
     * @param strIdDemand the id of the demand
     * @param strCRMWebAppCode the CRM webapp code
     * @throws CRMException the exception if there is a problem
     */
    void sendDeleteDemand( String strIdDemand ,String strCRMWebAppCode)throws CRMException;
    
    
    /**
     * This method calls Rest WS to get the user guid from a given id demand
     * @param strIdDemand the id demand
     * @return the user guid
     * @throws CRMException the exception if there is a problem
     */
    String getUserGuidFromIdDemand( String strIdDemand )
        throws CRMException;
    
    
    /**
     * This method calls Rest WS to get the user guid from a given id demand
     * @param strIdDemand the id demand
     * @param strCRMWebAppCode the CRM webapp code
     * @return the user guid
     * @throws CRMException the exception if there is a problem
     */
    String getUserGuidFromIdDemand( String strIdDemand,String strCRMWebAppCode )
        throws CRMException;
    
    /**
     * This method calls Rest WS to get the user guid from a given id crm user
     * @param strIdCRMUser the id user
     * @return the user guid
     * @throws CRMException the exception if there is a problem
     */
    @Deprecated
    String getUserGuidFromIdCRMUser( String strIdCRMUser )
        throws CRMException;
    
    /**
     * This method calls Rest WS to get the user guid from a given id crm user
     * @param strIdCRMUser the id user
     * @param strCRMWebAppCode the CRM webapp code
     * @return the user guid
     * @throws CRMException the exception if there is a problem
     */
    @Deprecated
    String getUserGuidFromIdCRMUser( String strIdCRMUser ,String strCRMWebAppCode)
        throws CRMException;
    
    
    /**
     * Get the XML of the demand
     * @param strIdDemand the id demand
     * @return the XML of the demand
     * @throws CRMException the exception if there is a problem
     */
   
    String getDemandXml( String strIdDemand )throws CRMException;
    
    /**
     * Get the XML of the demand
     * @param strIdDemand the id demand
     * @param strCRMWebAppCode the CRM webapp code
     * 
     * @return the XML of the demand
     */
   
    String getDemandXml( String strIdDemand ,String strCRMWebAppCode)throws CRMException;
    
    /**
     * Get the Json of the demand
     * @param strIdDemand the id of the demand
     * @return the Json of the demand
     * @throws CRMException the exception if there is a problem
     */
  
    String getDemandJson( String strIdDemand )throws CRMException;
    
    
    /**
     * Get the Json of the demand
     * @param strIdDemand the id of the demand
     * @param strCRMWebAppCode the CRM webapp code
     * @return the Json of the demand
     * @throws CRMException the exception if there is a problem
     */
  
    String getDemandJson( String strIdDemand,String strCRMWebAppCode )throws CRMException;
    
    /**
     * Get the CRMUser attribute value
     * @param strUserGuid the user guid
     * @param strAttribute the attribute
     * @return the attribute value
     * @throws CRMException the exception if there is a problem
     */
   
    String getCRMUserAttribute( String strUserGuid, String strAttribute )throws CRMException;
    
    /**
     * Get the CRMUser attribute value
     * @param strUserGuid the user guid
     * @param strAttribute the attribute
     * @param strCRMWebAppCode the CRM webapp code
     * @return the attribute value
     * @throws CRMException the exception if there is a problem
     */
   
    String getCRMUserAttribute( String strUserGuid, String strAttribute,String strCRMWebAppCode )throws CRMException;

    /**
     * Get the CRMUser attributes in XML
     * @param strUserGuid the user guid
     * @return the CRMUser attributes
     * @throws CRMException the exception if there is a problem
     */
     String getCRMUserAttributesXml( String strUserGuid )throws CRMException;
     
     /**
      * Get the CRMUser attributes in XML
      * @param strUserGuid the user guid
      * @param strCRMWebAppCode the CRM webapp code
      * @return the CRMUser attributes
      * @throws CRMException the exception if there is a problem
      */
     String getCRMUserAttributesXml( String strUserGuid,String strCRMWebAppCode  )throws CRMException;
     
     /**
      * Get the CRMUser attributes in JSON
      * @param strUserGuid the user guid
      * @return the attributes
      * @throws CRMException the exception if there is a problem
      */
 
      String getCRMUserAttributesJson( String strUserGuid )throws CRMException;
     /**
      * Get the CRMUser attributes in JSON
      * @param strUserGuid the user guid
      * @param strCRMWebAppCode the CRM webapp code
      * @return the attributes
      * @throws CRMException the exception if there is a problem
      */
 
      String getCRMUserAttributesJson( String strUserGuid,String strCRMWebAppCode )throws CRMException;
    
}
