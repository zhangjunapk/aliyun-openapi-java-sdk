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

/**
 * @author auto create
 * @version 
 */
public class StopVisualServiceRequest extends RpcAcsRequest<StopVisualServiceResponse> {
	
	public StopVisualServiceRequest() {
		super("EHPC", "2018-04-12", "StopVisualService", "ehs");
	}

	private Integer port;

	private String clusterId;

	private String cidrIp;

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCidrIp() {
		return this.cidrIp;
	}

	public void setCidrIp(String cidrIp) {
		this.cidrIp = cidrIp;
		if(cidrIp != null){
			putQueryParameter("CidrIp", cidrIp);
		}
	}

	@Override
	public Class<StopVisualServiceResponse> getResponseClass() {
		return StopVisualServiceResponse.class;
	}

}
