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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ModifyDtsJobNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDtsJobNameResponseUnmarshaller {

	public static ModifyDtsJobNameResponse unmarshall(ModifyDtsJobNameResponse modifyDtsJobNameResponse, UnmarshallerContext _ctx) {
		
		modifyDtsJobNameResponse.setRequestId(_ctx.stringValue("ModifyDtsJobNameResponse.RequestId"));
		modifyDtsJobNameResponse.setHttpStatusCode(_ctx.integerValue("ModifyDtsJobNameResponse.HttpStatusCode"));
		modifyDtsJobNameResponse.setErrCode(_ctx.stringValue("ModifyDtsJobNameResponse.ErrCode"));
		modifyDtsJobNameResponse.setSuccess(_ctx.booleanValue("ModifyDtsJobNameResponse.Success"));
		modifyDtsJobNameResponse.setErrMessage(_ctx.stringValue("ModifyDtsJobNameResponse.ErrMessage"));
		modifyDtsJobNameResponse.setCode(_ctx.stringValue("ModifyDtsJobNameResponse.Code"));
		modifyDtsJobNameResponse.setDynamicMessage(_ctx.stringValue("ModifyDtsJobNameResponse.DynamicMessage"));
	 
	 	return modifyDtsJobNameResponse;
	}
}