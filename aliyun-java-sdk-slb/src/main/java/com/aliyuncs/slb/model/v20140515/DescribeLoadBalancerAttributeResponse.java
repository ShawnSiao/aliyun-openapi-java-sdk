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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerAttributeResponse extends AcsResponse {

	private String requestId;

	private String loadBalancerId;

	private String resourceGroupId;

	private String loadBalancerName;

	private String loadBalancerStatus;

	private String regionId;

	private String regionIdAlias;

	private String address;

	private String addressType;

	private String vpcId;

	private String vSwitchId;

	private String networkType;

	private String internetChargeType;

	private Long autoReleaseTime;

	private Integer bandwidth;

	private String loadBalancerSpec;

	private String createTime;

	private Long createTimeStamp;

	private String endTime;

	private Long endTimeStamp;

	private String payType;

	private String masterZoneId;

	private String slaveZoneId;

	private String addressIPVersion;

	private String cloudType;

	private List<ListenerPortAndProtocal> listenerPortsAndProtocal;

	private List<ListenerPortAndProtocol> listenerPortsAndProtocol;

	private List<BackendServer> backendServers;

	private List<String> listenerPorts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionIdAlias() {
		return this.regionIdAlias;
	}

	public void setRegionIdAlias(String regionIdAlias) {
		this.regionIdAlias = regionIdAlias;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public Long getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(Long autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getLoadBalancerSpec() {
		return this.loadBalancerSpec;
	}

	public void setLoadBalancerSpec(String loadBalancerSpec) {
		this.loadBalancerSpec = loadBalancerSpec;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getCreateTimeStamp() {
		return this.createTimeStamp;
	}

	public void setCreateTimeStamp(Long createTimeStamp) {
		this.createTimeStamp = createTimeStamp;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getEndTimeStamp() {
		return this.endTimeStamp;
	}

	public void setEndTimeStamp(Long endTimeStamp) {
		this.endTimeStamp = endTimeStamp;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getMasterZoneId() {
		return this.masterZoneId;
	}

	public void setMasterZoneId(String masterZoneId) {
		this.masterZoneId = masterZoneId;
	}

	public String getSlaveZoneId() {
		return this.slaveZoneId;
	}

	public void setSlaveZoneId(String slaveZoneId) {
		this.slaveZoneId = slaveZoneId;
	}

	public String getAddressIPVersion() {
		return this.addressIPVersion;
	}

	public void setAddressIPVersion(String addressIPVersion) {
		this.addressIPVersion = addressIPVersion;
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}

	public List<ListenerPortAndProtocal> getListenerPortsAndProtocal() {
		return this.listenerPortsAndProtocal;
	}

	public void setListenerPortsAndProtocal(List<ListenerPortAndProtocal> listenerPortsAndProtocal) {
		this.listenerPortsAndProtocal = listenerPortsAndProtocal;
	}

	public List<ListenerPortAndProtocol> getListenerPortsAndProtocol() {
		return this.listenerPortsAndProtocol;
	}

	public void setListenerPortsAndProtocol(List<ListenerPortAndProtocol> listenerPortsAndProtocol) {
		this.listenerPortsAndProtocol = listenerPortsAndProtocol;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public List<String> getListenerPorts() {
		return this.listenerPorts;
	}

	public void setListenerPorts(List<String> listenerPorts) {
		this.listenerPorts = listenerPorts;
	}

	public static class ListenerPortAndProtocal {

		private Integer listenerPort;

		private String listenerProtocal;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocal() {
			return this.listenerProtocal;
		}

		public void setListenerProtocal(String listenerProtocal) {
			this.listenerProtocal = listenerProtocal;
		}
	}

	public static class ListenerPortAndProtocol {

		private Integer listenerPort;

		private String listenerProtocol;

		private String listenerForward;

		private Integer forwardPort;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}

		public String getListenerForward() {
			return this.listenerForward;
		}

		public void setListenerForward(String listenerForward) {
			this.listenerForward = listenerForward;
		}

		public Integer getForwardPort() {
			return this.forwardPort;
		}

		public void setForwardPort(Integer forwardPort) {
			this.forwardPort = forwardPort;
		}
	}

	public static class BackendServer {

		private String serverId;

		private Integer weight;

		private String type;

		private String serverIp;

		private String eniHost;

		private String vpcId;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getEniHost() {
			return this.eniHost;
		}

		public void setEniHost(String eniHost) {
			this.eniHost = eniHost;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}
	}

	@Override
	public DescribeLoadBalancerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
