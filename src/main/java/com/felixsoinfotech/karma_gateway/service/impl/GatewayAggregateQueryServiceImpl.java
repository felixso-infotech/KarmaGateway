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

package com.felixsoinfotech.karma_gateway.service.impl;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felixsoinfotech.karma_gateway.service.GatewayAggregateQueryService;

/**
 * Service Implementation for managing queries in gateway service.
 */
@Service
@Transactional
public class GatewayAggregateQueryServiceImpl implements GatewayAggregateQueryService {
	
	/**
 	 * Find time difference between current date and posted date.
 	 *
 	 * @param postedDateTime
 	 *            to find the time
 	 * 
 	 * @return the time
 	 */

 	@Override
 	public String calculateTimeDifferenceBetweenCurrentAndPostedTime(ZonedDateTime postedDateTime) {
 		
 		long offsetMillis = ZoneOffset.from(postedDateTime).getTotalSeconds() * 1000;
 		long isoMillis = postedDateTime.toInstant().toEpochMilli();
 		Date date = new Date(isoMillis + offsetMillis);
 				
 		Instant instant = Instant.now();
 		long hours = 5;
 		long minutes = 30;
 		Instant instant1 = instant.plus(hours, ChronoUnit.HOURS).plus(minutes, ChronoUnit.MINUTES);

 		Date current = Date.from(instant1);
 		long diffInSecond = 0l;
 		String diffInString = null;
 		if (date != null) {
 			diffInSecond = (current.getTime() - date.getTime()) / 1000l;
 		}
 		long postedBefore = 0l;
 		if (diffInSecond < 60l) {
 			diffInString = "just now";
 		} else if (diffInSecond < 3600l) {
 			postedBefore = diffInSecond / 60l;
 			diffInString = postedBefore + " minutes ago";
 		} else if (diffInSecond < 86400l) {
 			postedBefore = diffInSecond / 3600l;
 			diffInString = postedBefore + " hours ago";
 		} else if (diffInSecond < 2592000l) {
 			postedBefore = diffInSecond / 86400l;
 			diffInString = postedBefore + " days ago";
 		} else if (diffInSecond < 31104000l) {
 			postedBefore = diffInSecond / 2592000l;
 			diffInString = postedBefore + " months ago";
 		} else {
 			postedBefore = diffInSecond / 31104000l;
 			diffInString = postedBefore + " years ago";
 		}

 		return diffInString;
 	}
    


}
