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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteSyntheticTaskRequest extends RpcAcsRequest<DeleteSyntheticTaskResponse> {
	   

	private List<String> taskIdss;
	public DeleteSyntheticTaskRequest() {
		super("ARMS", "2019-08-08", "DeleteSyntheticTask", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTaskIdss() {
		return this.taskIdss;
	}

	public void setTaskIdss(List<String> taskIdss) {
		this.taskIdss = taskIdss;	
		if (taskIdss != null) {
			for (int i = 0; i < taskIdss.size(); i++) {
				putQueryParameter("TaskIds." + (i + 1) , taskIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteSyntheticTaskResponse> getResponseClass() {
		return DeleteSyntheticTaskResponse.class;
	}

}
