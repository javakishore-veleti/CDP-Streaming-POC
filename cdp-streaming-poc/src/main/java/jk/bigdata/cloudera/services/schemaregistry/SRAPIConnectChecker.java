package jk.bigdata.cloudera.services.schemaregistry;

import jk.bigdata.cloudera.api.POCExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class SRAPIConnectChecker implements POCExecutor {

    @Autowired
    private RestTemplate restTemplate;

    @Value("cdp.schemaregistry.url")
    private String schmemaRegistryUrl;

    @Value("cdp.schemaregistry.initial.schemaname")
    private String schemaName;

    @Override
    public void executePOC(Map<String, Object> config) throws Exception {

        Map<String, String> mapParams = new HashMap<String, String>();
        mapParams.put("schemaName", schemaName);

        String url = schmemaRegistryUrl + "/schemaregistry/schemas/{schemaName}";
        restTemplate.exchange(url, HttpMethod.DELETE, null, Map.class, mapParams);
    }
}
