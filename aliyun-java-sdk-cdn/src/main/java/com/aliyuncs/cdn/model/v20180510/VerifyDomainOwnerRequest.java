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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyDomainOwnerRequest extends RpcAcsRequest<VerifyDomainOwnerResponse> {
	   

	private String domainName;

	private String verifyType;
	public VerifyDomainOwnerRequest() {
		super("Cdn", "2018-05-10", "VerifyDomainOwner");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getVerifyType() {
		return this.verifyType;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
		if(verifyType != null){
			putQueryParameter("VerifyType", verifyType);
		}
	}

	@Override
	public Class<VerifyDomainOwnerResponse> getResponseClass() {
		return VerifyDomainOwnerResponse.class;
	}

}
