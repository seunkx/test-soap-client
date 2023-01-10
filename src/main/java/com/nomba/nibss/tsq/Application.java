package com.nomba.nibss.tsq;

import nibss.nip.core.NIPTSQInterface;
import nibss.nip.core.NIPTSQInterface_Service;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Application {
    public static void main(String[] args) throws MalformedURLException {
        final String endpoint = "http://10.68.32.42:60688/NIPWS/NIPTSQInterface.wso";
        final URL url = URI.create(endpoint).toURL();

        final NIPTSQInterface_Service service = new NIPTSQInterface_Service(url);

        final NIPTSQInterface port = service.getPort(NIPTSQInterface.class);

        String testReq = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><TSQuerySingleRequest><SourceInstitutionCode>000002</SourceInstitutionCode><ChannelCode>1</ChannelCode><SessionID>000001100913103301000000000001</SessionID></TSQuerySingleRequest>";
        var resp = port.txnstatusquerysingleitem(testReq);

        System.out.println(resp);
    }
}
