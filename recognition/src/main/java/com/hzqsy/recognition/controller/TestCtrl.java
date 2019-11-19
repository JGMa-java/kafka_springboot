package com.hzqsy.recognition.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hzqsy.recognition.util.ExcelReaderUtil;
import org.apache.http.util.EntityUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created By admin on 2019.11.12
 */
//@RestController
//@RequestMapping("/es")
public class TestCtrl {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Qualifier("getClient")
    @Autowired
    private RestClient restClient;

    @RequestMapping("/es")
    public void test() {
        IndexQuery indexQuery = new IndexQuery();
        indexQuery.setIndexName("myindex");
        indexQuery.setType("doc");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "tom");
        jsonObject.put("age", 23);
        indexQuery.setSource(JSON.toJSONString(jsonObject, SerializerFeature.WriteMapNullValue));
        elasticsearchTemplate.index(indexQuery);
    }

    @RequestMapping("/get1")
    public String getSource(String month) {
        try {
            String start = "";
            String end = "";
            String ss = "";
            String ee = "";
            String sheet = "";
            String areacode;
            List list2 = new ArrayList();
            List list3 = new ArrayList();
            list2.add("441901");
            list2.add("441902");
            list2.add("441903");
            list2.add("441904");
            list3.add("莞城区");
            list3.add("南城区");
            list3.add("东城区");
            list3.add("万江区");

            for (int i = 0; i <= 3; i++) {
                areacode = list2.get(i).toString();
                sheet = list3.get(i).toString();
                Request request = new Request("POST", "/tracklog2019*/_search");

                if ("1".equals(month)) {
                    start = "2019-01-01";
                    end = "2019-01-31";
                    ss = "2019-01";
                    ee = "2019-02";
                } else if ("2".equals(month)) {
                    start = "2019-02-01";
                    end = "2019-02-28";
                    ss = "2019-02";
                    ee = "2019-03";
                } else if ("3".equals(month)) {
                    start = "2019-03-01";
                    end = "2019-03-31";
                    ss = "2019-03";
                    ee = "2019-04";
                } else if ("4".equals(month)) {
                    start = "2019-04-01";
                    end = "2019-04-30";
                    ss = "2019-04";
                    ee = "2019-05";
                } else if ("5".equals(month)) {
                    start = "2019-05-01";
                    end = "2019-05-31";
                    ss = "2019-05";
                    ee = "2019-06";
                } else if ("6".equals(month)) {
                    start = "2019-06-01";
                    end = "2019-06-30";
                    ss = "2019-06";
                    ee = "2019-07";
                } else if ("7".equals(month)) {
                    start = "2019-07-01";
                    end = "2019-07-31";
                    ss = "2019-07";
                    ee = "2019-08";
                } else if ("8".equals(month)) {
                    start = "2019-08-01";
                    end = "2019-08-31";
                    ss = "2019-08";
                    ee = "2019-09";
                } else if ("9".equals(month)) {
                    start = "2019-09-01";
                    end = "2019-09-30";
                    ss = "2019-09";
                    ee = "2019-10";
                } else if ("10".equals(month)) {
                    start = "2019-10-01";
                    end = "2019-10-31";
                    ss = "2019-10";
                    ee = "2019-11";
                } else if ("11".equals(month)) {
                    start = "2019-11-01";
                    end = "2019-11-16";
                    ss = "2019-11";
                    ee = "2019-12";
                }

                String[] s = new String[]{"日期", "本省车总量", "本省蓝牌总量", "本省车数量(蓝牌)", "本省黄牌总量", "本省车数量(黄牌)"};
                //最终查询结果
                List<List<String>> result = new ArrayList<>();

                request.setJsonEntity("{\n" +
                        "  \"query\": {\n" +
                        "    \"query_string\": {\n" +
                        "      \"query\": \"PLATEAREA:粤S AND PASSTIME:[\\\"" + start + " 00:00:00\\\" TO \\\"" + end + " 23:59:59\\\"] AND PLATETYPE:(01 OR 02) AND AREACODE:" + areacode + "\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"size\": 0,\n" +
                        "  \"aggs\": {\n" +
                        "    \"groupDate\": {\n" +
                        "      \"date_histogram\": {\n" +
                        "        \"field\": \"PASSTIME\",\n" +
                        "        \"interval\": \"month\",\n" +
                        "        \"format\": \"yyyy-MM\",\n" +
                        "        \"min_doc_count\": 0,\n" +
                        "        \"extended_bounds\": {\n" +
                        "          \"min\": \"" + ss + "\",\n" +
                        "          \"max\": \"" + ee + "\"\n" +
                        "        }\n" +
                        "      },\n" +
                        "      \"aggs\": {\n" +
                        "        \"groupDate2\": {\n" +
                        "          \"date_histogram\": {\n" +
                        "            \"field\": \"PASSTIME\",\n" +
                        "            \"interval\": \"day\",\n" +
                        "            \"format\": \"yyyy-MM-dd\",\n" +
                        "            \"min_doc_count\": 0,\n" +
                        "            \"extended_bounds\": {\n" +
                        "              \"min\": \"" + start + "\",\n" +
                        "              \"max\": \"" + end + "\"\n" +
                        "            }\n" +
                        "          },\n" +
                        "          \"aggs\": {\n" +
                        "            \"gp_pl\": {\n" +
                        "              \"terms\": {\n" +
                        "                \"field\": \"PLATETYPE\"\n" +
                        "              },\n" +
                        "              \"aggs\": {\n" +
                        "                \"dist\": {\n" +
                        "                  \"cardinality\": {\n" +
                        "                    \"field\": \"PLATENUMBER\"\n" +
                        "                  }\n" +
                        "                }\n" +
                        "              }\n" +
                        "            }\n" +
                        "          }\n" +
                        "        }\n" +
                        "      }\n" +
                        "    }\n" +
                        "  }\n" +
                        "}");

                Response response = restClient.performRequest(request);
                String json = EntityUtils.toString(response.getEntity(), "utf-8");
//            return s;

//            String json = "";

                JSONObject jsonObject = JSON.parseObject(json);

                JSONArray jsonArray = jsonObject.getJSONObject("aggregations").getJSONObject("groupDate").getJSONArray("buckets");

///////////////////////////////////////////////////////////
                Object o = jsonArray.get(0);
                JSONArray buckets = JSON.parseObject(o.toString()).getJSONObject("groupDate2").getJSONArray("buckets");
                for (Object bucket : buckets) {
                    ///////
                    List<String> src = new ArrayList<>();

                    JSONObject rs = JSON.parseObject(bucket.toString());
                    String name = rs.getString("key_as_string");
                    String doc_count = rs.getString("doc_count");


                    JSONArray jsonArray1 = rs.getJSONObject("gp_pl").getJSONArray("buckets");
                    if (jsonArray1.size() > 0) {
                        src.add(name);
                        src.add(doc_count);

                        for (Object o1 : jsonArray1) {
                            JSONObject rr = JSON.parseObject(o1.toString());
                            String key = rr.getString("key");
                            String doc_count2 = rr.getString("doc_count");
                            String count = rr.getJSONObject("dist").getString("value");
                            src.add(doc_count2);
                            src.add(count);
                            if (jsonArray1.size() <= 1) {
                                src.add("");
                                src.add("");
                            }
                        }
                    } else {
                        continue;
                    }
                    result.add(src);
                }

                //查询到所有车牌信息保存成xls格式
                Workbook excel = ExcelReaderUtil.creatExcel(result, s, sheet);

                FileOutputStream fileOutputStream = new FileOutputStream(new File("E://pic_poi/" + sheet + start + "本省.xlsx"));
                excel.write(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }

    //查询外地
    @RequestMapping("/get2")
    public String getSources(String month) {
        try {
            String start = "";
            String end = "";
            String ss = "";
            String ee = "";
            String sheet;
            String areacode;
            List list2 = new ArrayList();
            List list3 = new ArrayList();
            list2.add("441901");
            list2.add("441902");
            list2.add("441903");
            list2.add("441904");
            list3.add("莞城区");
            list3.add("南城区");
            list3.add("东城区");
            list3.add("万江区");

            for (int i = 0; i <= 3; i++) {
                areacode = list2.get(i).toString();
                sheet = list3.get(i).toString();
                Request request = new Request("POST", "/tracklog2019*/_search");

                if ("1".equals(month)) {
                    start = "2019-01-01";
                    end = "2019-01-31";
                    ss = "2019-01";
                    ee = "2019-02";
                } else if ("2".equals(month)) {
                    start = "2019-02-01";
                    end = "2019-02-28";
                    ss = "2019-02";
                    ee = "2019-03";
                } else if ("3".equals(month)) {
                    start = "2019-03-01";
                    end = "2019-03-31";
                    ss = "2019-03";
                    ee = "2019-04";
                } else if ("4".equals(month)) {
                    start = "2019-04-01";
                    end = "2019-04-30";
                    ss = "2019-04";
                    ee = "2019-05";
                } else if ("5".equals(month)) {
                    start = "2019-05-01";
                    end = "2019-05-31";
                    ss = "2019-05";
                    ee = "2019-06";
                } else if ("6".equals(month)) {
                    start = "2019-06-01";
                    end = "2019-06-30";
                    ss = "2019-06";
                    ee = "2019-07";
                } else if ("7".equals(month)) {
                    start = "2019-07-01";
                    end = "2019-07-31";
                    ss = "2019-07";
                    ee = "2019-08";
                } else if ("8".equals(month)) {
                    start = "2019-08-01";
                    end = "2019-08-31";
                    ss = "2019-08";
                    ee = "2019-09";
                } else if ("9".equals(month)) {
                    start = "2019-09-01";
                    end = "2019-09-30";
                    ss = "2019-09";
                    ee = "2019-10";
                } else if ("10".equals(month)) {
                    start = "2019-10-01";
                    end = "2019-10-31";
                    ss = "2019-10";
                    ee = "2019-11";
                } else if ("11".equals(month)) {
                    start = "2019-11-01";
                    end = "2019-11-16";
                    ss = "2019-11";
                    ee = "2019-12";
                }

                String[] s = new String[]{"日期", "外地蓝黄牌过车量", "外地蓝牌过车量", "外地车数量(蓝牌)", "外地黄牌总量", "外地车数量(黄牌)"};
                //最终查询结果
                List<List<String>> result = new ArrayList<>();

                request.setJsonEntity("{\n" +
                        "  \"query\": {\n" +
                        "    \"query_string\": {\n" +
                        "      \"query\": \"PLATEPREFIX:(粤 OR 浙 OR 京 OR 津 OR 渝 OR 冀 OR 晋 OR 蒙 OR " +
                        "辽 OR 吉 OR 黑 OR 苏 OR 皖 OR 闽 OR 赣 OR 豫 OR 云 OR 湘 OR 鲁 OR 新 OR 鄂 " +
                        "OR 桂 OR 甘 OR 陕 OR 贵 OR 藏 OR 川 OR 宁 OR 琼 OR 沪 OR 青) " +
                        "AND -PLATEAREA:粤S AND PASSTIME:[\\\"" + start + " 00:00:00\\\" TO \\\"" + end + " 23:59:59\\\"] " +
                        "AND PLATETYPE:(01 OR 02) AND AREACODE:" + areacode + "\"\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"size\": 0,\n" +
                        "  \"aggs\": {\n" +
                        "    \"groupDate\": {\n" +
                        "      \"date_histogram\": {\n" +
                        "        \"field\": \"PASSTIME\",\n" +
                        "        \"interval\": \"month\",\n" +
                        "        \"format\": \"yyyy-MM\",\n" +
                        "        \"min_doc_count\": 0,\n" +
                        "        \"extended_bounds\": {\n" +
                        "          \"min\": \"" + ss + "\",\n" +
                        "          \"max\": \"" + ee + "\"\n" +
                        "        }\n" +
                        "      },\n" +
                        "      \"aggs\": {\n" +
                        "        \"groupDate2\": {\n" +
                        "          \"date_histogram\": {\n" +
                        "            \"field\": \"PASSTIME\",\n" +
                        "            \"interval\": \"day\",\n" +
                        "            \"format\": \"yyyy-MM-dd\",\n" +
                        "            \"min_doc_count\": 0,\n" +
                        "            \"extended_bounds\": {\n" +
                        "              \"min\": \"" + start + "\",\n" +
                        "              \"max\": \"" + end + "\"\n" +
                        "            }\n" +
                        "          },\n" +
                        "          \"aggs\": {\n" +
                        "            \"gp_pl\": {\n" +
                        "              \"terms\": {\n" +
                        "                \"field\": \"PLATETYPE\"\n" +
                        "              },\n" +
                        "              \"aggs\": {\n" +
                        "                \"dist\": {\n" +
                        "                  \"cardinality\": {\n" +
                        "                    \"field\": \"PLATENUMBER\"\n" +
                        "                  }\n" +
                        "                }\n" +
                        "              }\n" +
                        "            }\n" +
                        "          }\n" +
                        "        }\n" +
                        "      }\n" +
                        "    }\n" +
                        "  }\n" +
                        "}");

                Response response = restClient.performRequest(request);
                String json = EntityUtils.toString(response.getEntity(), "utf-8");

                JSONObject jsonObject = JSON.parseObject(json);

                JSONArray jsonArray = jsonObject.getJSONObject("aggregations").getJSONObject("groupDate").getJSONArray("buckets");

///////////////////////////////////////////////////////////
                Object o = jsonArray.get(0);
                JSONArray buckets = JSON.parseObject(o.toString()).getJSONObject("groupDate2").getJSONArray("buckets");
                for (Object bucket : buckets) {
                    ///////
                    List<String> src = new ArrayList<>();

                    JSONObject rs = JSON.parseObject(bucket.toString());
                    String name = rs.getString("key_as_string");
                    String doc_count = rs.getString("doc_count");


                    JSONArray jsonArray1 = rs.getJSONObject("gp_pl").getJSONArray("buckets");
                    if (jsonArray1.size() > 0) {
                        src.add(name);
                        src.add(doc_count);

                        for (Object o1 : jsonArray1) {
                            JSONObject rr = JSON.parseObject(o1.toString());
                            String key = rr.getString("key");
                            String doc_count2 = rr.getString("doc_count");
                            String count = rr.getJSONObject("dist").getString("value");
                            src.add(doc_count2);
                            src.add(count);
                            if (jsonArray1.size() <= 1) {
                                src.add("");
                                src.add("");
                            }
                        }
                    } else {
                        continue;
                    }
                    result.add(src);
                }

                //查询到所有车牌信息保存成xls格式
                Workbook excel = ExcelReaderUtil.creatExcel(result, s, sheet);

                FileOutputStream fileOutputStream = new FileOutputStream(new File("E://pic_poi/" + sheet + start + "外省.xlsx"));
                excel.write(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            }

            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }

}
