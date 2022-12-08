package com.demo.dashboard.utility.response;


import com.demo.dashboard.utility.types.ResponseStatusType;

import java.util.List;

public class StandardGetCommonBeansResponse {

    private ResponseStatusType responseAudit;
    private List<CommonBeanResponse> commonBeanResponseList;

    public ResponseStatusType getResponseAudit() {
        return responseAudit;
    }

    public void setResponseAudit(ResponseStatusType responseAudit) {
        this.responseAudit = responseAudit;
    }

    public List<CommonBeanResponse> getCommonBeanResponseList() {
        return commonBeanResponseList;
    }

    public void setCommonBeanResponseList(List<CommonBeanResponse> commonBeanResponseList) {
        this.commonBeanResponseList = commonBeanResponseList;
    }
}
