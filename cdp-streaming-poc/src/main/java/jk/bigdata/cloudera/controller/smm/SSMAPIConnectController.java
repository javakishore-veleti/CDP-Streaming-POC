package jk.bigdata.cloudera.controller.smm;

import jk.bigdata.cloudera.services.smm.SSMAPIConnectChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path="/api/services/smm/api", produces = "application/json")
public class SSMAPIConnectController {

    @Autowired
    private SSMAPIConnectChecker apiConnectChecker;

    @RequestMapping(path="verifyAPIConnect", produces = "application/json")
    public ResponseEntity<Map<String, Object>> verifyAPIConnect() throws Exception {

        Map<String, Object> params = new HashMap<>();
        apiConnectChecker.executePOC(params);

        Map<String, Object> result = new HashMap<>();
        result.put("result", "SUCCESS");

        return ResponseEntity.ok(result);
    }
}
