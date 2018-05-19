//package com.example.demo.com.elasticSearch;
//
//import lombok.Data;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//
//import java.io.Serializable;
//import java.util.Date;
//
///**
// * @Description:
// * @Author: yun qi
// * @Date: 2018/4/6 下午11:57
// */
//@Data
//@Document(indexName="issue-index",indexStoreType="fs",shards=5,replicas=1,refreshInterval="-1")
//public class Article implements Serializable {
//    @Id
//    private String eid;
//
//    private Integer eviType;
//    private Integer subEviType;
//    private String businessType;
//    private String projectId;
//    private String evidenceName;
//    private String evidenceTime;
//    private Integer objUnitId;
//}
//
//
