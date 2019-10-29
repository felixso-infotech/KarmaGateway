
/*  Copyright 2002-2016 the original author or authors.
 
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy of
  the License at
 
  http://www.apache.org/licenses/LICENSE-2.0
 
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations under
  the License.
  */
    
  package com.felixsoinfotech.karma_gateway.web.rest;
  
  import java.util.List;  
  import org.slf4j.Logger; 
  import org.slf4j.LoggerFactory;   
  import org.springframework.data.domain.Pageable;  
  import org.springframework.http.ResponseEntity; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import org.springframework.web.bind.annotation.PathVariable; 
  import org.springframework.web.bind.annotation.RequestMapping; 
  import org.springframework.web.bind.annotation.RestController;  
  import com.codahale.metrics.annotation.Timed;  
  import com.felixsoinfotech.karma_gateway.client.karma.api.AggregateQueryResourceApi; 
  import com.felixsoinfotech.karma_gateway.client.karma.model.CommittedActivityAggregate;
import com.felixsoinfotech.karma_gateway.client.user_response.api.UserResponseAggregateQueryResourceApi;
import com.felixsoinfotech.karma_gateway.client.user_response.model.CountAggregate; 
  
  /**
   * TODO Provide a detailed description here
   * 
   * @author Owner sarangibalu, sarangibalu.a@lxisoft.com
   */
 
  /**
   * REST controller for managing Query resources.
   */  
  
  @RestController
  @RequestMapping("/api/query") 
  public class GatewayAggregateQueryResource {
  
     private final Logger log =  LoggerFactory.getLogger(GatewayAggregateQueryResource.class);
  
     private AggregateQueryResourceApi aggregateQueryResourceApi;
     
     private UserResponseAggregateQueryResourceApi userResponseAggregateQueryResourceApi;
   
     public GatewayAggregateQueryResource(AggregateQueryResourceApi aggregateQueryResourceApi,
    		                              UserResponseAggregateQueryResourceApi userResponseAggregateQueryResourceApi){
                       this.aggregateQueryResourceApi=aggregateQueryResourceApi; 
                       this.userResponseAggregateQueryResourceApi=userResponseAggregateQueryResourceApi;
      }
  
   /**
	 * GET /committed-activities/:status : get the "status" committedActivity.
	 *
	 * @param status the status of the committedActivityDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the
	 *         committedActivityDTO, or with status 404 (Not Found)
	 */
    
     @GetMapping("/committed-activities/{status}")
     @Timed 
	 public ResponseEntity<List<CommittedActivityAggregate>> getAllCommittedActivitiesByStatus(Pageable pageable,@PathVariable String status) { 
			  
    	  log.debug("REST request to get CommittedActivity : {}", status);
		  
		  List<CommittedActivityAggregate> committedActivityAggregateList = aggregateQueryResourceApi.getAllCommittedActivitiesByStatusUsingGET(status,
		                                                                    null, null, null, null, null, null, null, null, null, null).getBody();
		  
		  for(CommittedActivityAggregate committedActivityAggregate:committedActivityAggregateList) {
		      
			  if(committedActivityAggregate != null) {
		           if(committedActivityAggregate.getCommittedActivityId() != null) {
		        	        
		        	   CountAggregate countAggregate = userResponseAggregateQueryResourceApi.getCountOfCommentsAndLikesByCommitedActivityIdUsingGET(committedActivityAggregate.getCommittedActivityId()).getBody();
		               committedActivityAggregate.setNoOfLoves(countAggregate.getNoOfLoves());
		               committedActivityAggregate.setNoOfComments(countAggregate.getNoOfComments());
		  
		  } } }
		  
		  return ResponseEntity.ok().body(committedActivityAggregateList); }
		  
     }
		 