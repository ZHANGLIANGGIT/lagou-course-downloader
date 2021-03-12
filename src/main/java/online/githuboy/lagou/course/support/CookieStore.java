package online.githuboy.lagou.course.support;

/**
 * CookieStore
 *
 * @author suchu
 * @since 2019年8月2日
 */
public class CookieStore {

    // https://kaiwu.lagou.com/course/courseInfo.htm?courseId=20&sid=20-h5Url-0&buyFrom=2&pageId=1pz4#/content //    数据结构精讲：从原理到实战

    /**
     * 这里填写登入成功后，拉勾网的cookie
     */
    private final static String cookie = "p_h5_u=70CFE589-BAC3-4A77-B039-204F90FA08AA; LG_HAS_LOGIN=1; user_trace_token=20201007104704-dc531e28-f79c-4422-b7b4-3bcdb5cd8a1c; LGUID=20201007104704-85e0e790-b25d-484d-bda8-93b5408fdb59; _ga=GA1.2.1381186630.1602038825; smidV2=20201024212213070309e0a033bd713c4cd62a80481371000ccffda4eb93c00; _bl_uid=ytkjpiR7c6hdvkkhjfLwcLsat4UC; Hm_lvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1615565265; sensorsdata2015session=%7B%7D; _gid=GA1.2.1102051495.1615565265; index_location_city=%E5%85%A8%E5%9B%BD; LG_LOGIN_USER_ID=4da39b9386f53651451f249e6edb67918ba6bca32b5fd3673412dff25343a2b4; _putrc=BDBCD7A10C7B13BC123F89F2B170EADC; login=true; unick=%E7%94%A8%E6%88%B79660; privacyPolicyPopup=false; Hm_lpvt_4233e74dff0ae5bd0a3d81c6ccf756e6=1615565301; LGRID=20210313000841-84bc9a3a-cb84-4bb0-9cba-8506ce4cdc74; EDUJSESSIONID=ABAAABAAAECABEHF442AACC013FF162CDC2DACDFCE7FE9B; gate_login_token=2061ea1c59e4b35ba79702d35e44ba85062f130a49efbfd2bad3c1602c017835; WEBTJ-ID=20210313%E4%B8%8A%E5%8D%8812:08:41000841-1782732762ee3-0e7216ba651593-6518207d-8294400-1782732762f73f; thirdDeviceIdInfo=%5B%7B%22channel%22%3A1%2C%22thirdDeviceId%22%3A%22WHJMrwNw1k/FsYDZ/e1Znohsp97fSufw67BZUi5XbHE6BSyb3WImZbXUjPowj99vs3s2va52rtHiv37UZIl9rbTJWzwq+8fHfdCW1tldyDzmQI99+chXEiklfgfIqBtCw9lCUKKcsmkSqmJzoPeggwzYmmmXo8LlTkQE5YcNLqNriNYPfoOP/bkHt+iuM33fO5TVXyso8XA16cv0xerXfAe8Vg+5pExYXQ+T5SEl0vIGVx6sZ1mtdn90xmcZLzrBQ1487582755342%22%7D%2C%7B%22channel%22%3A2%2C%22thirdDeviceId%22%3A%22140%23di2omwG0zzWbgzo23xrz4pN8s7abRI457gQIs9LnBz03pw3JgRCKMHR4yXCTVQSfcVTL56hqzznTAah2YkOzzWPGiahqlQzx2DD3VthqzFrdm28+lpYazDrbV2QIotKFONdOHaU+PQbZ/WZSQ4SiDEY1wu8i1YUcS1jqhhyLO33hmb5//lgQT0hiUxTx1A0h1bLvQTbeQdr/hS/XWoTQUIXTUnXgWQXNxsnyy9fgXUsVWpqdF/qYB7zs2Zr0Tt9t+U+JVnwlAUPSx8LfFxTfygFy7OdDiD2AsX0xkAD9xS0IeOXpSudHDa8KIRmuy/7TUTIEECD9TwmV4HKdWmfUhODTqB7ABqrJuxE+Hy0Xl6ADq6g6Q50ntpN7nt4NbHEmp/SvobWwdqurvLLiCxxPKtfpjUdA/ahJLmr0KJL0aAcJ/7rRX5i9sljkfDdbbsZNpt3Eo4rbhhEul+PAPWJlMjujkdRjj5M0Et1iO7aANZGjMdJbF1WCPIBRFAs1nK0VKFONM/6DYby8NaWRl+sOszJ2Op0EVaZEre2EQoumJ11xjKhne9OcwBTkRzxW1BM3NuqkqF7F/roShhzwhq3/2zfyITJXDLT/VyVN0YH/p4f8E+tmrCLJDVg/I9ylpy+troWLMDu8IwdjauAlx3QAHjVK/b4p3xJRwKUs+HL4kx7Ympx2+IGAzgypfcliYrDKY/VNzVIomkSVK3XUakSg5R72upXxvNlvRX1JldT2ErRwThWo95N9zLxAk2NtkbBSFdEovxO%3D%2Cundefined%22%7D%5D; user-finger=6ee1ec55598528f1056248e850b552e6; X_HTTP_TOKEN=437ec08ac2b858590206655161610211d31c697ddd; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%2217441927%22%2C%22first_id%22%3A%22177fad83cb2241-0c8e35763feef5-101a4759-2304000-177fad83cb3ab2%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%2C%22%24latest_utm_source%22%3A%22lagouedu%22%2C%22%24latest_utm_medium%22%3A%22edupcpopup%22%2C%22%24latest_utm_campaign%22%3A%22%E5%A4%A7%E5%89%8D%E7%AB%AF%E5%B0%B1%E4%B8%9A%E6%80%A5%E8%AE%AD%E8%90%A5%22%2C%22%24latest_utm_content%22%3A%220902%22%2C%22%24os%22%3A%22MacOS%22%2C%22%24browser%22%3A%22Chrome%22%2C%22%24browser_version%22%3A%2289.0.4389.82%22%7D%2C%22%24device_id%22%3A%22174141cd1a5b81-0121143de7de88-31647305-8294400-174141cd1a6a87%22%7D";

    public static String getCookie() {
        return cookie;
    }
}
