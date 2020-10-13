/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RoamClientUserRequest extends RpcAcsRequest<RoamClientUserResponse> {
	   

	private Long resourceOwnerId;

	private String originSmartAGId;

	private String resourceOwnerAccount;

	private String targetSmartAGId;

	private String ownerAccount;

	private Long ownerId;

	private String originRegionId;

	private String userName;
	public RoamClientUserRequest() {
		super("Smartag", "2018-03-13", "RoamClientUser", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOriginSmartAGId() {
		return this.originSmartAGId;
	}

	public void setOriginSmartAGId(String originSmartAGId) {
		this.originSmartAGId = originSmartAGId;
		if(originSmartAGId != null){
			putQueryParameter("OriginSmartAGId", originSmartAGId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getTargetSmartAGId() {
		return this.targetSmartAGId;
	}

	public void setTargetSmartAGId(String targetSmartAGId) {
		this.targetSmartAGId = targetSmartAGId;
		if(targetSmartAGId != null){
			putQueryParameter("TargetSmartAGId", targetSmartAGId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOriginRegionId() {
		return this.originRegionId;
	}

	public void setOriginRegionId(String originRegionId) {
		this.originRegionId = originRegionId;
		if(originRegionId != null){
			putQueryParameter("OriginRegionId", originRegionId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<RoamClientUserResponse> getResponseClass() {
		return RoamClientUserResponse.class;
	}

}