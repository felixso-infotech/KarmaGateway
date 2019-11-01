/*
 * Copyright 2002-2016 the original author or authors.
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

package com.felixsoinfotech.karma_gateway.web.rest;
/**
 * TODO Provide a detailed description here
 * 
 * @author Owner sarangibalu, sarangibalu.a@lxisoft.com
 */

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;

import com.felixsoinfotech.karma_gateway.client.karma.api.AggregateCommandResourceApi;
import com.felixsoinfotech.karma_gateway.client.karma.model.ActivityAggregate;
import com.felixsoinfotech.karma_gateway.client.karma.model.CommittedActivityDTO;
import com.felixsoinfotech.karma_gateway.client.karma.model.RegisteredUserDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.api.UserResponseAggregateCommandResourceApi;
import com.felixsoinfotech.karma_gateway.client.user_response.model.LoveDTO;
import com.felixsoinfotech.karma_gateway.web.rest.errors.BadRequestAlertException;
import com.felixsoinfotech.karma_gateway.web.rest.util.HeaderUtil;


/**
 * REST controller for managing Command resources.
 */  
@RestController
@RequestMapping("/api/command")
public class GatewayAggregateCommandResource {
	
	private final Logger log =  LoggerFactory.getLogger(GatewayAggregateCommandResource.class);
	
	private static final String ENTITY_NAME = "GatewayAggregateCommandResource";
	  
    private AggregateCommandResourceApi aggregateCommandResourceApi;
    
    private UserResponseAggregateCommandResourceApi userResponseAggregateCommandResourceApi;
  
    public GatewayAggregateCommandResource(AggregateCommandResourceApi aggregateCommandResourceApi,
    		                            UserResponseAggregateCommandResourceApi userResponseAggregateCommandResourceApi){
                      this.aggregateCommandResourceApi=aggregateCommandResourceApi; 
                      this.userResponseAggregateCommandResourceApi=userResponseAggregateCommandResourceApi;
     }
	
	
    /**
     * POST  /activities : Create a new activity.
     *
     * @param activityDTO the activityDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new activityDTO, or with status 400 (Bad Request) if the activity has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/create-activity")
    @Timed
    public ResponseEntity<ActivityAggregate> createActivity(@RequestBody ActivityAggregate activityAggregate) throws URISyntaxException {   	
        log.debug("REST request to save Activity : {}", activityAggregate);
        if (activityAggregate.getActivityDTO().getId() != null) {
            throw new BadRequestAlertException("A new activity cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        ActivityAggregate result = aggregateCommandResourceApi.createActivityUsingPOST1(activityAggregate).getBody();
        
        return ResponseEntity.created(new URI("/activities/" + activityAggregate.getActivityDTO().getId()))
                .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, activityAggregate.getActivityDTO().getId().toString()))
                .body(result);
    }
	
	
    /**
     * POST  /loves : save a new love.
     *
     * @param loveDTO the loveDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new loveDTO, or with status 400 (Bad Request) if the love has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/love-committedactivity")
    @Timed
    public ResponseEntity<LoveDTO> loveCommittedActivity(@RequestBody LoveDTO loveDTO) throws URISyntaxException {
        log.debug("REST request to save Love : {}", loveDTO);
        if (loveDTO.getId() != null) {
            throw new BadRequestAlertException("A new love cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        LoveDTO result = userResponseAggregateCommandResourceApi.loveCommittedActivityUsingPOST(loveDTO).getBody();
        
        return ResponseEntity.created(new URI("/api/colove-activity/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
	
    /**
     * PUT  /activities : Updates an existing activity.
     *
     * @param activityDTO the activityDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated activityDTO,
     * or with status 400 (Bad Request) if the activityDTO is not valid,
     * or with status 500 (Internal Server Error) if the activityDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/update-activity")
    @Timed
    public ResponseEntity<ActivityAggregate> updateActivity(@RequestBody ActivityAggregate activityAggregate) throws URISyntaxException {
        log.debug("REST request to update Activity : {}", activityAggregate);
        if (activityAggregate.getActivityDTO().getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        
        ActivityAggregate result = aggregateCommandResourceApi.updateActivityUsingPUT1(activityAggregate).getBody();
        
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, activityAggregate.getActivityDTO().getId().toString()))
            .body(result);
    }  


    /**
     * POST  /committed-activities : Create a new committedActivity.
     *
     * @param committedActivityDTO the committedActivityDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new committedActivityDTO, or with status 400 (Bad Request) if the committedActivity has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/create-committed-activity")
    @Timed
    public ResponseEntity<CommittedActivityDTO> createCommittedActivity(@RequestBody CommittedActivityDTO committedActivityDTO) throws URISyntaxException {
        log.debug("REST request to save CommittedActivity : {}", committedActivityDTO);
        if (committedActivityDTO.getId() != null) {
            throw new BadRequestAlertException("A new committedActivity cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        CommittedActivityDTO result = aggregateCommandResourceApi.createCommittedActivityUsingPOST(committedActivityDTO).getBody();
        
        return ResponseEntity.created(new URI("/api/committed-activities/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
    
    /**
     * PUT  /committed-activities : Updates an existing committedActivity.
     *
     * @param committedActivityDTO the committedActivityDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated committedActivityDTO,
     * or with status 400 (Bad Request) if the committedActivityDTO is not valid,
     * or with status 500 (Internal Server Error) if the committedActivityDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/update-committed-activity")
    @Timed
    public ResponseEntity<CommittedActivityDTO> updateCommittedActivity(@RequestBody CommittedActivityDTO committedActivityDTO) throws URISyntaxException {
        log.debug("REST request to update CommittedActivity : {}", committedActivityDTO);
        if (committedActivityDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        
        CommittedActivityDTO result = aggregateCommandResourceApi.updateCommittedActivityUsingPUT(committedActivityDTO).getBody();
        
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, committedActivityDTO.getId().toString()))
            .body(result);
    }
    
    /**
     * POST  /registered-users : Create a new registeredUser.
     *
     * @param registeredUserDTO the registeredUserDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new registeredUserDTO, or with status 400 (Bad Request) if the registeredUser has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/create-registered-user")
    @Timed
    public ResponseEntity<RegisteredUserDTO> createRegisteredUser(@RequestBody RegisteredUserDTO registeredUserDTO) throws URISyntaxException {
        log.debug("REST request to save RegisteredUser : {}", registeredUserDTO);
        if (registeredUserDTO.getId() != null) {
            throw new BadRequestAlertException("A new registeredUser cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        RegisteredUserDTO result = aggregateCommandResourceApi.createRegisteredUserUsingPOST(registeredUserDTO).getBody();
        
        return ResponseEntity.created(new URI("/api/registered-users/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }
    
    /**
     * PUT  /registered-users : Updates an existing registeredUser.
     *
     * @param registeredUserDTO the registeredUserDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated registeredUserDTO,
     * or with status 400 (Bad Request) if the registeredUserDTO is not valid,
     * or with status 500 (Internal Server Error) if the registeredUserDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/update-registered-user")
    @Timed
    public ResponseEntity<RegisteredUserDTO> updateRegisteredUser(@RequestBody RegisteredUserDTO registeredUserDTO) throws URISyntaxException {
        log.debug("REST request to update RegisteredUser : {}", registeredUserDTO);
        if (registeredUserDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        
        RegisteredUserDTO result = aggregateCommandResourceApi.updateRegisteredUserUsingPUT(registeredUserDTO).getBody();
        
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, registeredUserDTO.getId().toString()))
            .body(result);
    }
    
    /**
     * DELETE  /registered-users/:id : delete the "id" registeredUser.
     *
     * @param id the id of the registeredUserDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/delete-registered-user/{id}")
    @Timed
    public ResponseEntity<Void> deleteRegisteredUser(@PathVariable Long id) {
        log.debug("REST request to delete RegisteredUser : {}", id);
        
        aggregateCommandResourceApi.deleteRegisteredUserUsingDELETE(id).getBody();
        
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }


}
