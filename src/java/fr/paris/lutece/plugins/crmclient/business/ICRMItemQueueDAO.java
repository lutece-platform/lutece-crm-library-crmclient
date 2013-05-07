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
 * This class provides Data Access methods for CRMItemQueue objects
 *
 */
public interface ICRMItemQueueDAO
{
    /**
     * Insert a new crm item in the table.
     * @param crmItemQueue the crm item queue
     */
    void insert( CRMItemQueue crmItemQueue );

    /**
     * return the first crm item  in the table
     * @param nIdCRMItemQueue the id of the crm item
     * @return the first crm item in the table
     */
    CRMItemQueue load( int nIdCRMItemQueue );

    /**
     * Delete the crm item queue in the table
     * @param nIdCRMItemQueue The indentifier of the crm item to remove
     */
    void delete( int nIdCRMItemQueue );

    /**
     * Get the number of crm items
     * @return the number of crm item present in the database
     */
    int getCountCRMItem(  );

    /**
     * Return the next crm item queue id
     * @return the next mail item queue id
     */
    int nextCRMItemQueueId(  );

    /**
     * Lock the mail item
     * @param nIdCRMItemQueue the id of the crm item to lock
     */
    void lockCRMItemQueue( int nIdCRMItemQueue );
}
