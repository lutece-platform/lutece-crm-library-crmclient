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


/**
 *
 * CRMItemEnum
 *
 */
public enum CRMItemTypeEnum
{DEMAND_UPDATE( "crmclient.crmItemDemandUpdate" ),
    DEMAND_CREATE_BY_USER_GUID( "crmclient.crmItemDemandCreateByUserGuid" ),
    DEMAND_CREATE_BY_ID_CRM_USER( "crmclient.crmItemDemandCreateByIdCRMUser" ),
    DEMAND_DELETE( "crmclient.crmItemDemandDelete" ),
    DEMAND_USER_GUID( "crmclient.crmItemDemandUserGuid" ),
    DEMAND_DEMAND_JSON( "crmclient.crmItemDemandDemandJson" ),
    DEMAND_DEMAND_XML( "crmclient.crmItemDemandDemandXml" ),
    USER_GUID( "crmclient.crmItemUserGuidByIdCRMUser" ),
    USER_ATTRIBUTE( "crmclient.crmItemUserAttribute" ),
    USER_ATTRIBUTES_XML( "crmclient.crmItemUserAttributesXml" ),
    USER_ATTRIBUTES_JSON( "crmclient.crmItemUserAttributesJson" ),
    NOTIFICATION( "crmclient.crmItemNotification" );

    private String _strBeanName;

    /**
     * Constructor
     * @param strBeanName the bean name
     */
    private CRMItemTypeEnum( String strBeanName )
    {
        _strBeanName = strBeanName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString(  )
    {
        return _strBeanName;
    }
}
