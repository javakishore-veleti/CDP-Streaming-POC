package jk.bigdata.cloudera.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public interface POCExecutor {
    void executePOC(Map<String, Object> config) throws Exception;
}
