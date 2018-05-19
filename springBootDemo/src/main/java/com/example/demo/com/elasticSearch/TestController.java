package com.example.demo.com.elasticSearch;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/7 上午12:03
 */
@Service
public class TestController {
//    @Autowired
//    private ArticleSearchRepository articleSearchRepository;

//    public void testSaveArticleIndex() {
//        Article article = new Article();
//        article.setEid("aaa");
//        articleSearchRepository.save(article);
//    }
//
//    public void testSearch() {
//        String queryString = "springboot";//搜索关键字
//        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
//        Iterable<Article> searchResult = articleSearchRepository.search(builder);
//        Iterator<Article> iterator = searchResult.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }

    /**
     * withPageable 分页
     * NativeSearchQueryBuilder.withQuery(QueryBuilder1).withFilter(QueryBuilder2).withSort(SortBuilder1).withXXXX().build()
     */
//    public void fuzhaSearch() {
//        double lat = 39.929986;
//        double lon = 116.395645;
//
//        Long nowTime = System.currentTimeMillis();
//        //查询某经纬度100米范围内
//        GeoDistanceQueryBuilder builder = QueryBuilders.geoDistanceQuery("address").point(lat, lon)
//                .distance(100, DistanceUnit.METERS);
//
//        GeoDistanceSortBuilder sortBuilder = SortBuilders.geoDistanceSort("address","")
//                .point(lat, lon)
//                .unit(DistanceUnit.METERS)
//                .order(SortOrder.ASC);
//
//        Pageable pageable = new PageRequest(0, 50);
//
//        NativeSearchQueryBuilder builder1 = new NativeSearchQueryBuilder().withFilter(builder).withSort(sortBuilder).withPageable(pageable);
//        SearchQuery searchQuery = builder1.build();
//        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(QueryBuilders.queryStringQuery("spring boot OR 书籍")).build();
//    }
}