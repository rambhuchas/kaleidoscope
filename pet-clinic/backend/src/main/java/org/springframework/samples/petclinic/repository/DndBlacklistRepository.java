/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.DndBlacklist;

/**
 * Repository class for <code>DndBlacklist</code> domain objects All method names are compliant with Spring Data naming
 * conventions so this interface can easily be extended for Spring Data See here: http://static.springsource.org/spring-data/jpa/docs/current/reference/html/jpa.repositories.html#jpa.query-methods.query-creation
 *
 * @author Ken Krebs
 * @author Juergen Hoeller
 * @author Sam Brannen
 * @author Michael Isvy
 * @author Vitaliy Fedoriv
 */
public interface DndBlacklistRepository {

    /**
     * Save an <code>DndBlacklist</code> to the data store, either inserting or updating it.
     *
     * @param dndBlacklist the <code>DndBlacklist</code> to save
     */
//	<S extends User> S save(S entity);

//	<S extends DndBlacklist> DndBlacklist save(DndBlacklist dndBlacklists) throws DataAccessException;
    
    /**
     * Save an <code>DndBlacklist</code> to the data store, either inserting or updating it.
     *
     * @param dndBlacklist the <code>DndBlacklist</code> to save
     */
//	<S extends DndBlacklist> Collection<DndBlacklist> saveAll(Collection<DndBlacklist> dndBlacklistItems) throws DataAccessException;
    
    /**
     * Retrieve <code>DndBlacklist</code>s from the data store, returning all owners 
     *
     * @return a <code>Collection</code> of <code>DndBlacklist</code>s (or an empty <code>Collection</code> if none
     * found)
     */
	Collection<DndBlacklist> findAll() throws DataAccessException;
	
    /**
     * Retrieve an <code>Operator</code> from the data store by id.
     *
     * @param msisdn the id to search for
     * @return the <code>DndBlacklist</code> if found
     * @throws org.springframework.dao.DataRetrievalFailureException if not found
     */
	DndBlacklist findByMsisdn(long msisdn) throws DataAccessException;
    
    /**
     * Delete an <code>DndBlacklist</code> to the data store by <code>Owner</code>.
     *
     * @param dndBlacklist the <code>DndBlacklist</code> to delete
     * 
     */
	void delete(DndBlacklist dndBlacklist) throws DataAccessException;

}
