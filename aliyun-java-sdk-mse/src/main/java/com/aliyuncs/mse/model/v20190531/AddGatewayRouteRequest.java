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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGatewayRouteRequest extends RpcAcsRequest<AddGatewayRouteResponse> {
	   

	private String mseSessionId;

	private String gatewayUniqueId;

	private String destinationType;

	private String domainIdListJSON;

	private Long domainId;

	private Long gatewayId;

	private Integer routeOrder;

	private Boolean enableWaf;

	@SerializedName("services")
	private List<Services> services;

	@SerializedName("predicates")
	private Predicates predicates;

	@SerializedName("redirectJSON")
	private RedirectJSON redirectJSON;

	@SerializedName("directResponseJSON")
	private DirectResponseJSON directResponseJSON;

	private String name;

	private String acceptLanguage;

	@SerializedName("fallbackServices")
	private List<FallbackServices> fallbackServices;

	private Boolean fallback;
	public AddGatewayRouteRequest() {
		super("mse", "2019-05-31", "AddGatewayRoute", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMseSessionId() {
		return this.mseSessionId;
	}

	public void setMseSessionId(String mseSessionId) {
		this.mseSessionId = mseSessionId;
		if(mseSessionId != null){
			putQueryParameter("MseSessionId", mseSessionId);
		}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
		}
	}

	public String getDomainIdListJSON() {
		return this.domainIdListJSON;
	}

	public void setDomainIdListJSON(String domainIdListJSON) {
		this.domainIdListJSON = domainIdListJSON;
		if(domainIdListJSON != null){
			putQueryParameter("DomainIdListJSON", domainIdListJSON);
		}
	}

	public Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
		if(domainId != null){
			putQueryParameter("DomainId", domainId.toString());
		}
	}

	public Long getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId.toString());
		}
	}

	public Integer getRouteOrder() {
		return this.routeOrder;
	}

	public void setRouteOrder(Integer routeOrder) {
		this.routeOrder = routeOrder;
		if(routeOrder != null){
			putQueryParameter("RouteOrder", routeOrder.toString());
		}
	}

	public Boolean getEnableWaf() {
		return this.enableWaf;
	}

	public void setEnableWaf(Boolean enableWaf) {
		this.enableWaf = enableWaf;
		if(enableWaf != null){
			putQueryParameter("EnableWaf", enableWaf.toString());
		}
	}

	public List<Services> getServices() {
		return this.services;
	}

	public void setServices(List<Services> services) {
		this.services = services;	
		if (services != null) {
			putQueryParameter("Services" , new Gson().toJson(services));
		}	
	}

	public Predicates getPredicates() {
		return this.predicates;
	}

	public void setPredicates(Predicates predicates) {
		this.predicates = predicates;	
		if (predicates != null) {
			putQueryParameter("Predicates" , new Gson().toJson(predicates));
		}	
	}

	public RedirectJSON getRedirectJSON() {
		return this.redirectJSON;
	}

	public void setRedirectJSON(RedirectJSON redirectJSON) {
		this.redirectJSON = redirectJSON;	
		if (redirectJSON != null) {
			putQueryParameter("RedirectJSON" , new Gson().toJson(redirectJSON));
		}	
	}

	public DirectResponseJSON getDirectResponseJSON() {
		return this.directResponseJSON;
	}

	public void setDirectResponseJSON(DirectResponseJSON directResponseJSON) {
		this.directResponseJSON = directResponseJSON;	
		if (directResponseJSON != null) {
			putQueryParameter("DirectResponseJSON" , new Gson().toJson(directResponseJSON));
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public List<FallbackServices> getFallbackServices() {
		return this.fallbackServices;
	}

	public void setFallbackServices(List<FallbackServices> fallbackServices) {
		this.fallbackServices = fallbackServices;	
		if (fallbackServices != null) {
			putQueryParameter("FallbackServices" , new Gson().toJson(fallbackServices));
		}	
	}

	public Boolean getFallback() {
		return this.fallback;
	}

	public void setFallback(Boolean fallback) {
		this.fallback = fallback;
		if(fallback != null){
			putQueryParameter("Fallback", fallback.toString());
		}
	}

	public static class Services {

		@SerializedName("HttpDubboTranscoder")
		private HttpDubboTranscoder httpDubboTranscoder;

		@SerializedName("AgreementType")
		private String agreementType;

		@SerializedName("Name")
		private String name;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("SourceType")
		private String sourceType;

		@SerializedName("ServiceId")
		private Long serviceId;

		@SerializedName("Percent")
		private Integer percent;

		@SerializedName("Version")
		private String version;

		@SerializedName("GroupName")
		private String groupName;

		@SerializedName("ServicePort")
		private Integer servicePort;

		public HttpDubboTranscoder getHttpDubboTranscoder() {
			return this.httpDubboTranscoder;
		}

		public void setHttpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
			this.httpDubboTranscoder = httpDubboTranscoder;
		}

		public String getAgreementType() {
			return this.agreementType;
		}

		public void setAgreementType(String agreementType) {
			this.agreementType = agreementType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(Integer servicePort) {
			this.servicePort = servicePort;
		}

		public static class HttpDubboTranscoder {

			@SerializedName("DubboServiceName")
			private String dubboServiceName;

			@SerializedName("MothedMapList")
			private List<MothedMapListItem> mothedMapList;

			@SerializedName("DubboServiceVersion")
			private String dubboServiceVersion;

			@SerializedName("DubboServiceGroup")
			private String dubboServiceGroup;

			public String getDubboServiceName() {
				return this.dubboServiceName;
			}

			public void setDubboServiceName(String dubboServiceName) {
				this.dubboServiceName = dubboServiceName;
			}

			public List<MothedMapListItem> getMothedMapList() {
				return this.mothedMapList;
			}

			public void setMothedMapList(List<MothedMapListItem> mothedMapList) {
				this.mothedMapList = mothedMapList;
			}

			public String getDubboServiceVersion() {
				return this.dubboServiceVersion;
			}

			public void setDubboServiceVersion(String dubboServiceVersion) {
				this.dubboServiceVersion = dubboServiceVersion;
			}

			public String getDubboServiceGroup() {
				return this.dubboServiceGroup;
			}

			public void setDubboServiceGroup(String dubboServiceGroup) {
				this.dubboServiceGroup = dubboServiceGroup;
			}

			public static class MothedMapListItem {

				@SerializedName("HttpMothed")
				private String httpMothed;

				@SerializedName("ParamMapsList")
				private List<ParamMapsListItem> paramMapsList;

				@SerializedName("Mothedpath")
				private String mothedpath;

				@SerializedName("DubboMothedName")
				private String dubboMothedName;

				@SerializedName("PassThroughAllHeaders")
				private String passThroughAllHeaders;

				@SerializedName("PassThroughList")
				private List<String> passThroughList;

				public String getHttpMothed() {
					return this.httpMothed;
				}

				public void setHttpMothed(String httpMothed) {
					this.httpMothed = httpMothed;
				}

				public List<ParamMapsListItem> getParamMapsList() {
					return this.paramMapsList;
				}

				public void setParamMapsList(List<ParamMapsListItem> paramMapsList) {
					this.paramMapsList = paramMapsList;
				}

				public String getMothedpath() {
					return this.mothedpath;
				}

				public void setMothedpath(String mothedpath) {
					this.mothedpath = mothedpath;
				}

				public String getDubboMothedName() {
					return this.dubboMothedName;
				}

				public void setDubboMothedName(String dubboMothedName) {
					this.dubboMothedName = dubboMothedName;
				}

				public String getPassThroughAllHeaders() {
					return this.passThroughAllHeaders;
				}

				public void setPassThroughAllHeaders(String passThroughAllHeaders) {
					this.passThroughAllHeaders = passThroughAllHeaders;
				}

				public List<String> getPassThroughList() {
					return this.passThroughList;
				}

				public void setPassThroughList(List<String> passThroughList) {
					this.passThroughList = passThroughList;
				}

				public static class ParamMapsListItem {

					@SerializedName("ExtractKeySpec")
					private String extractKeySpec;

					@SerializedName("ExtractKey")
					private String extractKey;

					@SerializedName("MappingType")
					private String mappingType;

					public String getExtractKeySpec() {
						return this.extractKeySpec;
					}

					public void setExtractKeySpec(String extractKeySpec) {
						this.extractKeySpec = extractKeySpec;
					}

					public String getExtractKey() {
						return this.extractKey;
					}

					public void setExtractKey(String extractKey) {
						this.extractKey = extractKey;
					}

					public String getMappingType() {
						return this.mappingType;
					}

					public void setMappingType(String mappingType) {
						this.mappingType = mappingType;
					}
				}
			}
		}
	}

	public static class Predicates {

		@SerializedName("PathPredicates")
		private PathPredicates pathPredicates;

		@SerializedName("MethodPredicates")
		private List<String> methodPredicates;

		@SerializedName("HeaderPredicates")
		private List<HeaderPredicatesItem> headerPredicates;

		@SerializedName("QueryPredicates")
		private List<QueryPredicatesItem> queryPredicates;

		public PathPredicates getPathPredicates() {
			return this.pathPredicates;
		}

		public void setPathPredicates(PathPredicates pathPredicates) {
			this.pathPredicates = pathPredicates;
		}

		public List<String> getMethodPredicates() {
			return this.methodPredicates;
		}

		public void setMethodPredicates(List<String> methodPredicates) {
			this.methodPredicates = methodPredicates;
		}

		public List<HeaderPredicatesItem> getHeaderPredicates() {
			return this.headerPredicates;
		}

		public void setHeaderPredicates(List<HeaderPredicatesItem> headerPredicates) {
			this.headerPredicates = headerPredicates;
		}

		public List<QueryPredicatesItem> getQueryPredicates() {
			return this.queryPredicates;
		}

		public void setQueryPredicates(List<QueryPredicatesItem> queryPredicates) {
			this.queryPredicates = queryPredicates;
		}

		public static class PathPredicates {

			@SerializedName("Path")
			private String path;

			@SerializedName("IgnoreCase")
			private Boolean ignoreCase;

			@SerializedName("Type")
			private String type;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public Boolean getIgnoreCase() {
				return this.ignoreCase;
			}

			public void setIgnoreCase(Boolean ignoreCase) {
				this.ignoreCase = ignoreCase;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}

		public static class HeaderPredicatesItem {

			@SerializedName("Type")
			private String type;

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class QueryPredicatesItem {

			@SerializedName("Type")
			private String type;

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	public static class RedirectJSON {

		@SerializedName("Path")
		private String path;

		@SerializedName("Code")
		private Integer code;

		@SerializedName("Host")
		private String host;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}
	}

	public static class DirectResponseJSON {

		@SerializedName("Code")
		private Long code;

		@SerializedName("Body")
		private String body;

		public Long getCode() {
			return this.code;
		}

		public void setCode(Long code) {
			this.code = code;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}
	}

	public static class FallbackServices {

		@SerializedName("AgreementType")
		private String agreementType;

		@SerializedName("Name")
		private String name;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("SourceType")
		private String sourceType;

		@SerializedName("ServiceId")
		private Long serviceId;

		@SerializedName("Percent")
		private Integer percent;

		@SerializedName("Version")
		private String version;

		@SerializedName("GroupName")
		private String groupName;

		@SerializedName("ServicePort")
		private Integer servicePort;

		public String getAgreementType() {
			return this.agreementType;
		}

		public void setAgreementType(String agreementType) {
			this.agreementType = agreementType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Long getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(Long serviceId) {
			this.serviceId = serviceId;
		}

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getServicePort() {
			return this.servicePort;
		}

		public void setServicePort(Integer servicePort) {
			this.servicePort = servicePort;
		}
	}

	@Override
	public Class<AddGatewayRouteResponse> getResponseClass() {
		return AddGatewayRouteResponse.class;
	}

}
