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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceRequest extends RpcAcsRequest<DescribePriceResponse> {
	   

	private List<Commodities> commoditiess;

	private String priceUnit;

	private String chargeType;

	private String orderType;
	public DescribePriceRequest() {
		super("EHPC", "2018-04-12", "DescribePrice");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Commodities> getCommoditiess() {
		return this.commoditiess;
	}

	public void setCommoditiess(List<Commodities> commoditiess) {
		this.commoditiess = commoditiess;	
		if (commoditiess != null) {
			for (int depth1 = 0; depth1 < commoditiess.size(); depth1++) {
				putQueryParameter("Commodities." + (depth1 + 1) + ".Amount" , commoditiess.get(depth1).getAmount());
				putQueryParameter("Commodities." + (depth1 + 1) + ".Period" , commoditiess.get(depth1).getPeriod());
				putQueryParameter("Commodities." + (depth1 + 1) + ".NodeType" , commoditiess.get(depth1).getNodeType());
				if (commoditiess.get(depth1).getDataDiskss() != null) {
					for (int depth2 = 0; depth2 < commoditiess.get(depth1).getDataDiskss().size(); depth2++) {
						putQueryParameter("Commodities." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".size" , commoditiess.get(depth1).getDataDiskss().get(depth2).getSize());
						putQueryParameter("Commodities." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".encrypted" , commoditiess.get(depth1).getDataDiskss().get(depth2).getEncrypted());
						putQueryParameter("Commodities." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".performanceLevel" , commoditiess.get(depth1).getDataDiskss().get(depth2).getPerformanceLevel());
						putQueryParameter("Commodities." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".category" , commoditiess.get(depth1).getDataDiskss().get(depth2).getCategory());
						putQueryParameter("Commodities." + (depth1 + 1) + ".DataDisks." + (depth2 + 1) + ".deleteWithInstance" , commoditiess.get(depth1).getDataDiskss().get(depth2).getDeleteWithInstance());
					}
				}
				putQueryParameter("Commodities." + (depth1 + 1) + ".SystemDiskCategory" , commoditiess.get(depth1).getSystemDiskCategory());
				putQueryParameter("Commodities." + (depth1 + 1) + ".InternetChargeType" , commoditiess.get(depth1).getInternetChargeType());
				putQueryParameter("Commodities." + (depth1 + 1) + ".SystemDiskPerformanceLevel" , commoditiess.get(depth1).getSystemDiskPerformanceLevel());
				putQueryParameter("Commodities." + (depth1 + 1) + ".SystemDiskSize" , commoditiess.get(depth1).getSystemDiskSize());
				putQueryParameter("Commodities." + (depth1 + 1) + ".InternetMaxBandWidthOut" , commoditiess.get(depth1).getInternetMaxBandWidthOut());
				putQueryParameter("Commodities." + (depth1 + 1) + ".InstanceType" , commoditiess.get(depth1).getInstanceType());
				putQueryParameter("Commodities." + (depth1 + 1) + ".NetworkType" , commoditiess.get(depth1).getNetworkType());
			}
		}	
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
		if(priceUnit != null){
			putQueryParameter("PriceUnit", priceUnit);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public static class Commodities {

		private Integer amount;

		private Integer period;

		private String nodeType;

		private List<DataDisks> dataDiskss;

		private String systemDiskCategory;

		private String internetChargeType;

		private String systemDiskPerformanceLevel;

		private Integer systemDiskSize;

		private Integer internetMaxBandWidthOut;

		private String instanceType;

		private String networkType;

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public List<DataDisks> getDataDiskss() {
			return this.dataDiskss;
		}

		public void setDataDiskss(List<DataDisks> dataDiskss) {
			this.dataDiskss = dataDiskss;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getSystemDiskPerformanceLevel() {
			return this.systemDiskPerformanceLevel;
		}

		public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
			this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Integer getInternetMaxBandWidthOut() {
			return this.internetMaxBandWidthOut;
		}

		public void setInternetMaxBandWidthOut(Integer internetMaxBandWidthOut) {
			this.internetMaxBandWidthOut = internetMaxBandWidthOut;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public static class DataDisks {

			private Integer size;

			private Boolean encrypted;

			private String performanceLevel;

			private String category;

			private Boolean deleteWithInstance;

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public Boolean getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(Boolean encrypted) {
				this.encrypted = encrypted;
			}

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Boolean getDeleteWithInstance() {
				return this.deleteWithInstance;
			}

			public void setDeleteWithInstance(Boolean deleteWithInstance) {
				this.deleteWithInstance = deleteWithInstance;
			}
		}
	}

	@Override
	public Class<DescribePriceResponse> getResponseClass() {
		return DescribePriceResponse.class;
	}

}
