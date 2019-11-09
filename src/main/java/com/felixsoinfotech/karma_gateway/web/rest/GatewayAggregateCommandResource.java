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
import com.felixsoinfotech.karma_gateway.client.user_response.model.CommentDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.model.DeleteLoveModel;
import com.felixsoinfotech.karma_gateway.client.user_response.model.LoveDTO;
import com.felixsoinfotech.karma_gateway.client.user_response.model.ReplyDTO;
import com.felixsoinfotech.karma_gateway.web.rest.errors.BadRequestAlertException;


/**
 * REST controller for managing Command resources.
 */
@RestController
@RequestMapping("/api/command")
public class GatewayAggregateCommandResource {

	private final Logger log = LoggerFactory.getLogger(GatewayAggregateCommandResource.class);

	private static final String ENTITY_NAME = "GatewayAggregateCommandResource";

	  
    private AggregateCommandResourceApi aggregateCommandResourceApi;
    
    private UserResponseAggregateCommandResourceApi userResponseAggregateCommandResourceApi;
  
    public GatewayAggregateCommandResource(AggregateCommandResourceApi aggregateCommandResourceApi,
    		                            UserResponseAggregateCommandResourceApi userResponseAggregateCommandResourceApi){
                      this.aggregateCommandResourceApi=aggregateCommandResourceApi; 
                      this.userResponseAggregateCommandResourceApi=userResponseAggregateCommandResourceApi;
     }
	
	
    /**
     * POST  /loves : save a new love.
     *
     * @param loveDTO the loveDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new loveDTO, or with status 400 (Bad Request) if the love has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/save-love")
    @Timed
    public ResponseEntity<LoveDTO> loveCommittedActivity(@RequestBody LoveDTO loveDTO) throws URISyntaxException {
        log.debug("REST request to save Love : {}", loveDTO);
        if (loveDTO.getId() != null) {
            throw new BadRequestAlertException("A new love cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
         return userResponseAggregateCommandResourceApi.doLoveUsingPOST(loveDTO);
        
        
    }
    
    /**
     * DELETE  /loves : delete the loved activity of the user.
     *
     * @param deleteLoveModel the deleteLoveModel of the loveDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/unlove-committedactivity")
    @Timed
    public ResponseEntity<Void> unloveCommittedActivity(@RequestBody DeleteLoveModel deleteLoveModel) {
        log.debug("REST request to delete Love activity of the user : {}", deleteLoveModel);
        
        return userResponseAggregateCommandResourceApi.unloveCommittedActivityUsingDELETE(deleteLoveModel);
        
    }
    
    
    /**
     * POST  /comments : save a new comment.
     *
     * @param commentDTO the commentDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new commentDTO, or with status 400 (Bad Request) if the comment has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/save-comment")
    @Timed
    public ResponseEntity<CommentDTO> saveComment(@RequestBody CommentDTO commentDTO) throws URISyntaxException {
        log.debug("REST request to save Comment : {}", commentDTO);        
        if (commentDTO.getId() != null) {
            throw new BadRequestAlertException("A new comment cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        return userResponseAggregateCommandResourceApi.doCommentUsingPOST(commentDTO);
        
        
    }
    
    /**
     * POST  /replies : Create a new reply.
     *
     * @param replyDTO the replyDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new replyDTO, or with status 400 (Bad Request) if the reply has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/save-reply")
    @Timed
    public ResponseEntity<ReplyDTO> saveReply(@RequestBody ReplyDTO replyDTO) throws URISyntaxException {
        log.debug("REST request to save Reply : {}", replyDTO);
        if (replyDTO.getId() != null) {
            throw new BadRequestAlertException("A new reply cannot already have an ID", ENTITY_NAME, "idexists");
        }
        
        return userResponseAggregateCommandResourceApi.doReplyUsingPOST(replyDTO);
        
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
        
        return aggregateCommandResourceApi.createActivityUsingPOST1(activityAggregate);
        
        
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
        
        return aggregateCommandResourceApi.updateActivityUsingPUT1(activityAggregate);
        
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
        
        return aggregateCommandResourceApi.createCommittedActivityUsingPOST(committedActivityDTO);
        
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
        
        return aggregateCommandResourceApi.updateCommittedActivityUsingPUT(committedActivityDTO);
 
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
        
        return aggregateCommandResourceApi.createRegisteredUserUsingPOST(registeredUserDTO);
       
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
        
        return aggregateCommandResourceApi.updateRegisteredUserUsingPUT(registeredUserDTO);
        
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
        
        return aggregateCommandResourceApi.deleteRegisteredUserUsingDELETE(id);
        
        
    }

	
}
