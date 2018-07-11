package com.example.weiying.model.bean;

import java.util.List;

public class FindBean {

    /**
     * msg : 成功
     * ret : {"adv":{"imgURL":"","dataId":"","htmlURL":"","shareURL":"","title":""},"pnum":1,"totalRecords":30,"bannerList":[],"records":30,"list":[{"airTime":0,"duration":"01:26:06","loadtype":"video","score":0,"angleIcon":"","dataId":"3_e3622954bfd3404d957211028bfb2a71","description":"《动物世界》首映发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_e3622954bfd3404d957211028bfb2a71","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521662049090886.jpg","title":"《动物世界》首映发布会","roomId":""},{"airTime":0,"duration":"01:24:36","loadtype":"video","score":0,"angleIcon":"","dataId":"3_12ec6b94308a4213b74f8dca13facd91","description":"《幸福马上来》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_12ec6b94308a4213b74f8dca13facd91","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521535713073392.jpg","title":"《幸福马上来》发布会","roomId":""},{"airTime":0,"duration":"00:36:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7d19f30f6875451b896a158cf9f1092b","description":"《幸福马上来》首映礼红毯","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7d19f30f6875451b896a158cf9f1092b","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521497847016506.jpg","title":"《幸福马上来》首映礼红毯","roomId":""},{"airTime":0,"duration":"01:32:54","loadtype":"video","score":0,"angleIcon":"","dataId":"3_1c76a331e4dd46a2b40c76ff7cb0483c","description":"第十届两岸电影展开幕式","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_1c76a331e4dd46a2b40c76ff7cb0483c","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521210716057912.jpg","title":"第十届两岸电影展开幕式","roomId":""},{"airTime":0,"duration":"01:46:36","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f164502cdbd94889bb82715cd4679250","description":"《江湖儿女》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f164502cdbd94889bb82715cd4679250","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521132032061519.jpg","title":"《江湖儿女》发布会","roomId":""},{"airTime":0,"duration":"01:21:25","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8cfca4605d764ecc92bfda4cde703a91","description":"《超时空同居》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8cfca4605d764ecc92bfda4cde703a91","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526378518433029467.jpg","title":"《超时空同居》发布会","roomId":""},{"airTime":0,"duration":"00:28:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_83365dd74f7840fb9b691bb392bcae14","description":"电影《路过未来》首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_83365dd74f7840fb9b691bb392bcae14","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526378488136090900.jpg","title":"电影《路过未来》首映礼","roomId":""},{"airTime":0,"duration":"00:42:06","loadtype":"video","score":0,"angleIcon":"","dataId":"3_5bd93420e18c4442853d30d1126d017e","description":"《市长夫人的秘密》首映会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_5bd93420e18c4442853d30d1126d017e","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526354059484052494.jpg","title":"《市长夫人的秘密》首映会","roomId":""},{"airTime":0,"duration":"00:49:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_587358b201f4440db10d852ad518585b","description":"电影《泄密者》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_587358b201f4440db10d852ad518585b","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526353968783058028.jpg","title":"电影《泄密者》发布会","roomId":""},{"airTime":0,"duration":"00:46:00","loadtype":"video","score":0,"angleIcon":"","dataId":"3_4189480a799740cabc99be4c44af836e","description":"电影《阳台上》\u201c天真有邪\u201d发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_4189480a799740cabc99be4c44af836e","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/09/1525831335017054391.jpg","title":"电影《阳台上》\u201c天真有邪\u201d发布会","roomId":""},{"airTime":2018,"duration":"00:02:26","loadtype":"video","score":0,"angleIcon":"","dataId":"3_43e3d200c6884f5caed827f256838f67","description":"《复仇者联盟3：无限战争》是漫威电影宇宙10周年的历史性集结，将为影迷们带来史诗版的终极对决。面对灭霸突然发起的闪电袭击，复仇者联盟及其所有超级英雄盟友必须全力以赴，才能阻止他对全宇宙造成毁灭性的打击。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_43e3d200c6884f5caed827f256838f67","shareURL":"http://m.svipmovie.com/#/moviedetails/3_43e3d200c6884f5caed827f256838f67","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035676702060879.jpg","title":"《复仇者联盟3：无限战争》中文预告","roomId":""},{"airTime":2018,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"3_6617bcc19e8c40579263cf3b53e721e4","description":"影片讲述20年后的未来城市中，由于\u201c犬流感\u201d肆虐，政府颁布行政令流放全部狗狗，远离城市的这座垃圾岛就此成为狗狗维系生存的\u201c犬之岛\u201d。 \r\n　　当所有人抛弃这些狗狗的时候，一个12岁男孩为寻找自己的爱犬只身闯入\u201c犬之岛\u201d。小男孩与五只狗狗在\u201c犬之岛\u201d上经历了种种磨难和奇妙邂逅，最 终用他的赤子之心打动了君主（布莱恩·科兰斯顿 Bryan Cranston 配音），得到了狗狗们的忠诚和帮助，上演了一段温情有趣、治愈感人的童话故事。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_6617bcc19e8c40579263cf3b53e721e4","shareURL":"http://m.svipmovie.com/#/moviedetails/3_6617bcc19e8c40579263cf3b53e721e4","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035813157023504.jpg","title":"《犬之岛》终极版预告","roomId":""},{"airTime":2018,"duration":"00:01:32","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7808ab32da8d4c9196e74490ca8943e1","description":"少年铁木真(陈伟霆 饰）身为部落首领之子，年幼丧父，母亲独自将他抚养成人，铁木真成人之际返回翁吉剌部落迎娶自幼定有婚约的孛尔帖（林允 饰），谁知途中却逐步陷入叔父（赵立新 饰）设置的杀戮陷阱，而青梅竹马的恋人孛尔帖也在新婚之夜被另一部落首领忽出鲁（胡军 饰）掳走，铁木真在好兄弟札木合（李光洁 饰）的支持与萨满长老的辅佐下，踏上拯救恋人和守卫草原的征途\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7808ab32da8d4c9196e74490ca8943e1","shareURL":"http://m.svipmovie.com/#/moviedetails/3_7808ab32da8d4c9196e74490ca8943e1","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035881502002036.jpg","title":"《战神纪》最新预告","roomId":""},{"airTime":2018,"duration":"00:01:43","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8ea672e3332a4e3189216d36f1562a23","description":"坐拥数亿财产的钟小年(徐峥 饰)意外遭人绑架，不得不在一位神秘人的操控下完 成一道道令人两难的选择题。在选择的过程中，钟小年落入陷阱，不仅巨额财产被盗取、 濒临身败名裂的边缘，还将妻子魏思蒙(王丽坤 饰)牵扯进一个个险境。为了洗脱罪名， 救回爱人，钟小年在重重危机中与神秘人展开了一场关乎生死和救赎的金钱游戏\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8ea672e3332a4e3189216d36f1562a23","shareURL":"http://m.svipmovie.com/#/moviedetails/3_8ea672e3332a4e3189216d36f1562a23","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036015662066815.jpg","title":"《幕后玩家》终极版预告","roomId":""},{"airTime":2018,"duration":"00:02:01","loadtype":"video","score":0,"angleIcon":"","dataId":"3_a0e9f1b633d84d69a4c6e505ddabc219","description":"这是一个爱情故事，关于一对异乡漂泊的年轻人。 \r\n　　十年前，见清和小晓偶然地相识在归乡过年的火车上。两人怀揣着共同的梦想，一起在北京打拼，并开始了一段相聚相离的情感之路。 \r\n　　十年后，见清和小晓在飞机上再次偶然重逢\u2026\u2026 \r\n　　命运似乎是一个轮回。在一次次的偶然下，平行线交叉，再平行，故事始终有\u201c然后\u201d。可后来的他们，学会如何去爱了吗？","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_a0e9f1b633d84d69a4c6e505ddabc219","shareURL":"http://m.svipmovie.com/#/moviedetails/3_a0e9f1b633d84d69a4c6e505ddabc219","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036101203038940.jpg","title":"《后来的我们》好好吃饭版预告","roomId":""},{"airTime":2018,"duration":"00:01:35","loadtype":"video","score":0,"angleIcon":"","dataId":"3_b60ec7d936934dee9ada4712ab5cea98","description":"刘佳音（迪丽热巴 饰）因与富豪男友分手而破产 ，为了还债，变卖了自己所有的奢侈品。王继伟（郭京飞 饰）天生爱省，为了省钱无所不用其极。两人因为一场剧场意外相遇，在一系列机缘巧合合租一个屋檐之下，过起了荒诞爆笑的流浪生活，\u201c王抠抠\u201d和\u201c刘买买\u201d究竟如何在两种价值观之间化解 金钱与爱情的终极问题呢？","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_b60ec7d936934dee9ada4712ab5cea98","shareURL":"http://m.svipmovie.com/#/moviedetails/3_b60ec7d936934dee9ada4712ab5cea98","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036206299099896.jpg","title":"《21克拉》新预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"3_095ee7f3367040fc9e142a9ac30197ac","description":"《第三度嫌疑人》中国预告片","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_095ee7f3367040fc9e142a9ac30197ac","shareURL":"http://m.svipmovie.com/#/moviedetails/3_095ee7f3367040fc9e142a9ac30197ac","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522221970523007581.jpg","title":"《第三度嫌疑人》中国预告片","roomId":""},{"airTime":0,"duration":"00:02:22","loadtype":"video","score":0,"angleIcon":"","dataId":"3_1f3acbadfe6443e388bb41bb29604c7a","description":"《头号玩家》中国预告片","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_1f3acbadfe6443e388bb41bb29604c7a","shareURL":"http://m.svipmovie.com/#/moviedetails/3_1f3acbadfe6443e388bb41bb29604c7a","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522222148757001640.jpg","title":"《头号玩家》中国预告片","roomId":""},{"airTime":0,"duration":"00:01:53","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d8018769bbdb4f5089269fda9116b898","description":"《遇见你真好》终极预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d8018769bbdb4f5089269fda9116b898","shareURL":"http://m.svipmovie.com/#/moviedetails/3_d8018769bbdb4f5089269fda9116b898","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522222047839071493.jpg","title":"《遇见你真好》终极预告","roomId":""},{"airTime":0,"duration":"00:44:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d14fe8e210b44244ba19666fc4c9d3a9","description":"《闺蜜2之单挑越南黑帮》香港首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d14fe8e210b44244ba19666fc4c9d3a9","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/21/1521598176925097472.jpg","title":"《闺蜜2之单挑越南黑帮》香港首映礼","roomId":""},{"airTime":2018,"duration":"00:00:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_63f9f8b58a9c427ba4ff8230ffe4a768","description":"《水形物语》现行版预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_63f9f8b58a9c427ba4ff8230ffe4a768","shareURL":"http://m.svipmovie.com/#/moviedetails/3_63f9f8b58a9c427ba4ff8230ffe4a768","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240350580016648.jpg","title":"《水形物语》先行版预告","roomId":""},{"airTime":2018,"duration":"00:01:00","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8d3acbc2ce2d47e892fdac068357d587","description":"劳拉·克劳馥年少时，她的冒险家父亲突然神秘消失。她拒绝接受父亲已经去世的事实，并暗下决心要解开父亲神秘死亡的谜团。 \r\n　　放下眼前的一切，劳拉前往父亲最后出现的地方探寻\u2014\u2014一座传说中的古墓，位于日本附近某个神秘岛上。要踏上这场未知的旅程，她必须以敏锐的头脑、坚定的信仰和顽强的精神武装自己，并迫使自己超越极限。如果她能在这场危机四伏的冒险中存活下来，她才可能成长为名副其实的\u2014\u2014\u201c古墓丽影\u201d。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8d3acbc2ce2d47e892fdac068357d587","shareURL":"http://m.svipmovie.com/#/moviedetails/3_8d3acbc2ce2d47e892fdac068357d587","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240460814056494.jpg","title":"《古墓丽影：源气之战》终极预告","roomId":""},{"airTime":2018,"duration":"00:00:44","loadtype":"video","score":0,"angleIcon":"","dataId":"3_aac3f576a8fa4c8b9965e7a3a3f8ef57","description":"《妈妈咪鸭》暖心预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_aac3f576a8fa4c8b9965e7a3a3f8ef57","shareURL":"http://m.svipmovie.com/#/moviedetails/3_aac3f576a8fa4c8b9965e7a3a3f8ef57","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240538633097942.jpg","title":"《妈妈咪鸭》暖心预告","roomId":""},{"airTime":2018,"duration":"00:01:49","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f88d157e655f4648aa87e80afd003db8","description":"在漫威影业的影片《黑豹》中，特查拉在其父亲\u2014\u2014前瓦坎达国王去世之后，回到了这个科技先进但与世隔绝的非洲国家，继任成为新一任\u201c黑豹\u201d及国王。当旧敌重现时，作为\u201c黑豹\u201d及国王的特查拉身陷两难境地，眼看着瓦坎达及全世界陷于危难之中。面对背叛与危险，这位年轻的国王必须联合同盟，释放\u201c黑豹\u201d全部力量，奋力捍卫他的人民和国土。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f88d157e655f4648aa87e80afd003db8","shareURL":"http://m.svipmovie.com/#/moviedetails/3_f88d157e655f4648aa87e80afd003db8","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240659157026571.jpg","title":"《黑豹》定档版预告","roomId":""},{"airTime":0,"duration":"00:25:50","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7bced18b2a9d4e81a66d69a6a994a58d","description":"《红海行动》香港首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7bced18b2a9d4e81a66d69a6a994a58d","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520232985920071213.jpg","title":"《红海行动》香港首映礼","roomId":""},{"airTime":0,"duration":"00:29:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d746d42839244eee924adcc713cb9af1","description":"《红海行动》电影分享会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d746d42839244eee924adcc713cb9af1","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520232938762035765.jpg","title":"《红海行动》电影分享会","roomId":""},{"airTime":0,"duration":"00:59:54","loadtype":"video","score":0,"angleIcon":"","dataId":"3_a61c8bc909e64567b2e4b02166443168","description":"电影《欧洲攻略》\u201c攻略重启\u201d发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_a61c8bc909e64567b2e4b02166443168","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517998021782084369.jpg","title":"电影《欧洲攻略》\u201c攻略重启\u201d发布会","roomId":""},{"airTime":0,"duration":"00:54:42","loadtype":"video","score":0,"angleIcon":"","dataId":"3_759c8a46ae2b46248f51cb3eb02263b2","description":"《祖宗十九代》恭候大笑之\u201c春节没烦恼\u201d主题发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_759c8a46ae2b46248f51cb3eb02263b2","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997955385042223.jpg","title":"《祖宗十九代》恭候大笑之\u201c春节没烦恼\u201d主题发布会","roomId":""},{"airTime":0,"duration":"00:34:12","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f183e8069ee040efa9d5f46b4d8bb97f","description":"《唐人街探案2》上海主创见面会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f183e8069ee040efa9d5f46b4d8bb97f","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997881584084980.jpg","title":"《唐人街探案2》上海主创见面会","roomId":""},{"airTime":0,"duration":"00:46:24","loadtype":"video","score":0,"angleIcon":"","dataId":"3_15aff548669a40dab575ea696ee15f5d","description":"电影《泡芙小姐》首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_15aff548669a40dab575ea696ee15f5d","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997803814014462.jpg","title":"电影《泡芙小姐》首映礼","roomId":""}],"totalPnum":9}
     * code : 200
     */

    private String msg;
    private RetBean ret;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class RetBean {
        /**
         * adv : {"imgURL":"","dataId":"","htmlURL":"","shareURL":"","title":""}
         * pnum : 1
         * totalRecords : 30
         * bannerList : []
         * records : 30
         * list : [{"airTime":0,"duration":"01:26:06","loadtype":"video","score":0,"angleIcon":"","dataId":"3_e3622954bfd3404d957211028bfb2a71","description":"《动物世界》首映发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_e3622954bfd3404d957211028bfb2a71","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521662049090886.jpg","title":"《动物世界》首映发布会","roomId":""},{"airTime":0,"duration":"01:24:36","loadtype":"video","score":0,"angleIcon":"","dataId":"3_12ec6b94308a4213b74f8dca13facd91","description":"《幸福马上来》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_12ec6b94308a4213b74f8dca13facd91","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521535713073392.jpg","title":"《幸福马上来》发布会","roomId":""},{"airTime":0,"duration":"00:36:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7d19f30f6875451b896a158cf9f1092b","description":"《幸福马上来》首映礼红毯","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7d19f30f6875451b896a158cf9f1092b","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521497847016506.jpg","title":"《幸福马上来》首映礼红毯","roomId":""},{"airTime":0,"duration":"01:32:54","loadtype":"video","score":0,"angleIcon":"","dataId":"3_1c76a331e4dd46a2b40c76ff7cb0483c","description":"第十届两岸电影展开幕式","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_1c76a331e4dd46a2b40c76ff7cb0483c","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521210716057912.jpg","title":"第十届两岸电影展开幕式","roomId":""},{"airTime":0,"duration":"01:46:36","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f164502cdbd94889bb82715cd4679250","description":"《江湖儿女》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f164502cdbd94889bb82715cd4679250","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521132032061519.jpg","title":"《江湖儿女》发布会","roomId":""},{"airTime":0,"duration":"01:21:25","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8cfca4605d764ecc92bfda4cde703a91","description":"《超时空同居》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8cfca4605d764ecc92bfda4cde703a91","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526378518433029467.jpg","title":"《超时空同居》发布会","roomId":""},{"airTime":0,"duration":"00:28:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_83365dd74f7840fb9b691bb392bcae14","description":"电影《路过未来》首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_83365dd74f7840fb9b691bb392bcae14","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526378488136090900.jpg","title":"电影《路过未来》首映礼","roomId":""},{"airTime":0,"duration":"00:42:06","loadtype":"video","score":0,"angleIcon":"","dataId":"3_5bd93420e18c4442853d30d1126d017e","description":"《市长夫人的秘密》首映会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_5bd93420e18c4442853d30d1126d017e","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526354059484052494.jpg","title":"《市长夫人的秘密》首映会","roomId":""},{"airTime":0,"duration":"00:49:18","loadtype":"video","score":0,"angleIcon":"","dataId":"3_587358b201f4440db10d852ad518585b","description":"电影《泄密者》发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_587358b201f4440db10d852ad518585b","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/15/1526353968783058028.jpg","title":"电影《泄密者》发布会","roomId":""},{"airTime":0,"duration":"00:46:00","loadtype":"video","score":0,"angleIcon":"","dataId":"3_4189480a799740cabc99be4c44af836e","description":"电影《阳台上》\u201c天真有邪\u201d发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_4189480a799740cabc99be4c44af836e","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/05/09/1525831335017054391.jpg","title":"电影《阳台上》\u201c天真有邪\u201d发布会","roomId":""},{"airTime":2018,"duration":"00:02:26","loadtype":"video","score":0,"angleIcon":"","dataId":"3_43e3d200c6884f5caed827f256838f67","description":"《复仇者联盟3：无限战争》是漫威电影宇宙10周年的历史性集结，将为影迷们带来史诗版的终极对决。面对灭霸突然发起的闪电袭击，复仇者联盟及其所有超级英雄盟友必须全力以赴，才能阻止他对全宇宙造成毁灭性的打击。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_43e3d200c6884f5caed827f256838f67","shareURL":"http://m.svipmovie.com/#/moviedetails/3_43e3d200c6884f5caed827f256838f67","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035676702060879.jpg","title":"《复仇者联盟3：无限战争》中文预告","roomId":""},{"airTime":2018,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"3_6617bcc19e8c40579263cf3b53e721e4","description":"影片讲述20年后的未来城市中，由于\u201c犬流感\u201d肆虐，政府颁布行政令流放全部狗狗，远离城市的这座垃圾岛就此成为狗狗维系生存的\u201c犬之岛\u201d。 \r\n　　当所有人抛弃这些狗狗的时候，一个12岁男孩为寻找自己的爱犬只身闯入\u201c犬之岛\u201d。小男孩与五只狗狗在\u201c犬之岛\u201d上经历了种种磨难和奇妙邂逅，最 终用他的赤子之心打动了君主（布莱恩·科兰斯顿 Bryan Cranston 配音），得到了狗狗们的忠诚和帮助，上演了一段温情有趣、治愈感人的童话故事。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_6617bcc19e8c40579263cf3b53e721e4","shareURL":"http://m.svipmovie.com/#/moviedetails/3_6617bcc19e8c40579263cf3b53e721e4","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035813157023504.jpg","title":"《犬之岛》终极版预告","roomId":""},{"airTime":2018,"duration":"00:01:32","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7808ab32da8d4c9196e74490ca8943e1","description":"少年铁木真(陈伟霆 饰）身为部落首领之子，年幼丧父，母亲独自将他抚养成人，铁木真成人之际返回翁吉剌部落迎娶自幼定有婚约的孛尔帖（林允 饰），谁知途中却逐步陷入叔父（赵立新 饰）设置的杀戮陷阱，而青梅竹马的恋人孛尔帖也在新婚之夜被另一部落首领忽出鲁（胡军 饰）掳走，铁木真在好兄弟札木合（李光洁 饰）的支持与萨满长老的辅佐下，踏上拯救恋人和守卫草原的征途\u2026\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7808ab32da8d4c9196e74490ca8943e1","shareURL":"http://m.svipmovie.com/#/moviedetails/3_7808ab32da8d4c9196e74490ca8943e1","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524035881502002036.jpg","title":"《战神纪》最新预告","roomId":""},{"airTime":2018,"duration":"00:01:43","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8ea672e3332a4e3189216d36f1562a23","description":"坐拥数亿财产的钟小年(徐峥 饰)意外遭人绑架，不得不在一位神秘人的操控下完 成一道道令人两难的选择题。在选择的过程中，钟小年落入陷阱，不仅巨额财产被盗取、 濒临身败名裂的边缘，还将妻子魏思蒙(王丽坤 饰)牵扯进一个个险境。为了洗脱罪名， 救回爱人，钟小年在重重危机中与神秘人展开了一场关乎生死和救赎的金钱游戏\u2026","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8ea672e3332a4e3189216d36f1562a23","shareURL":"http://m.svipmovie.com/#/moviedetails/3_8ea672e3332a4e3189216d36f1562a23","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036015662066815.jpg","title":"《幕后玩家》终极版预告","roomId":""},{"airTime":2018,"duration":"00:02:01","loadtype":"video","score":0,"angleIcon":"","dataId":"3_a0e9f1b633d84d69a4c6e505ddabc219","description":"这是一个爱情故事，关于一对异乡漂泊的年轻人。 \r\n　　十年前，见清和小晓偶然地相识在归乡过年的火车上。两人怀揣着共同的梦想，一起在北京打拼，并开始了一段相聚相离的情感之路。 \r\n　　十年后，见清和小晓在飞机上再次偶然重逢\u2026\u2026 \r\n　　命运似乎是一个轮回。在一次次的偶然下，平行线交叉，再平行，故事始终有\u201c然后\u201d。可后来的他们，学会如何去爱了吗？","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_a0e9f1b633d84d69a4c6e505ddabc219","shareURL":"http://m.svipmovie.com/#/moviedetails/3_a0e9f1b633d84d69a4c6e505ddabc219","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036101203038940.jpg","title":"《后来的我们》好好吃饭版预告","roomId":""},{"airTime":2018,"duration":"00:01:35","loadtype":"video","score":0,"angleIcon":"","dataId":"3_b60ec7d936934dee9ada4712ab5cea98","description":"刘佳音（迪丽热巴 饰）因与富豪男友分手而破产 ，为了还债，变卖了自己所有的奢侈品。王继伟（郭京飞 饰）天生爱省，为了省钱无所不用其极。两人因为一场剧场意外相遇，在一系列机缘巧合合租一个屋檐之下，过起了荒诞爆笑的流浪生活，\u201c王抠抠\u201d和\u201c刘买买\u201d究竟如何在两种价值观之间化解 金钱与爱情的终极问题呢？","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_b60ec7d936934dee9ada4712ab5cea98","shareURL":"http://m.svipmovie.com/#/moviedetails/3_b60ec7d936934dee9ada4712ab5cea98","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/04/18/1524036206299099896.jpg","title":"《21克拉》新预告","roomId":""},{"airTime":0,"duration":"00:01:40","loadtype":"video","score":0,"angleIcon":"","dataId":"3_095ee7f3367040fc9e142a9ac30197ac","description":"《第三度嫌疑人》中国预告片","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_095ee7f3367040fc9e142a9ac30197ac","shareURL":"http://m.svipmovie.com/#/moviedetails/3_095ee7f3367040fc9e142a9ac30197ac","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522221970523007581.jpg","title":"《第三度嫌疑人》中国预告片","roomId":""},{"airTime":0,"duration":"00:02:22","loadtype":"video","score":0,"angleIcon":"","dataId":"3_1f3acbadfe6443e388bb41bb29604c7a","description":"《头号玩家》中国预告片","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_1f3acbadfe6443e388bb41bb29604c7a","shareURL":"http://m.svipmovie.com/#/moviedetails/3_1f3acbadfe6443e388bb41bb29604c7a","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522222148757001640.jpg","title":"《头号玩家》中国预告片","roomId":""},{"airTime":0,"duration":"00:01:53","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d8018769bbdb4f5089269fda9116b898","description":"《遇见你真好》终极预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d8018769bbdb4f5089269fda9116b898","shareURL":"http://m.svipmovie.com/#/moviedetails/3_d8018769bbdb4f5089269fda9116b898","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/28/1522222047839071493.jpg","title":"《遇见你真好》终极预告","roomId":""},{"airTime":0,"duration":"00:44:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d14fe8e210b44244ba19666fc4c9d3a9","description":"《闺蜜2之单挑越南黑帮》香港首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d14fe8e210b44244ba19666fc4c9d3a9","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/21/1521598176925097472.jpg","title":"《闺蜜2之单挑越南黑帮》香港首映礼","roomId":""},{"airTime":2018,"duration":"00:00:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_63f9f8b58a9c427ba4ff8230ffe4a768","description":"《水形物语》现行版预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_63f9f8b58a9c427ba4ff8230ffe4a768","shareURL":"http://m.svipmovie.com/#/moviedetails/3_63f9f8b58a9c427ba4ff8230ffe4a768","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240350580016648.jpg","title":"《水形物语》先行版预告","roomId":""},{"airTime":2018,"duration":"00:01:00","loadtype":"video","score":0,"angleIcon":"","dataId":"3_8d3acbc2ce2d47e892fdac068357d587","description":"劳拉·克劳馥年少时，她的冒险家父亲突然神秘消失。她拒绝接受父亲已经去世的事实，并暗下决心要解开父亲神秘死亡的谜团。 \r\n　　放下眼前的一切，劳拉前往父亲最后出现的地方探寻\u2014\u2014一座传说中的古墓，位于日本附近某个神秘岛上。要踏上这场未知的旅程，她必须以敏锐的头脑、坚定的信仰和顽强的精神武装自己，并迫使自己超越极限。如果她能在这场危机四伏的冒险中存活下来，她才可能成长为名副其实的\u2014\u2014\u201c古墓丽影\u201d。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_8d3acbc2ce2d47e892fdac068357d587","shareURL":"http://m.svipmovie.com/#/moviedetails/3_8d3acbc2ce2d47e892fdac068357d587","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240460814056494.jpg","title":"《古墓丽影：源气之战》终极预告","roomId":""},{"airTime":2018,"duration":"00:00:44","loadtype":"video","score":0,"angleIcon":"","dataId":"3_aac3f576a8fa4c8b9965e7a3a3f8ef57","description":"《妈妈咪鸭》暖心预告","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_aac3f576a8fa4c8b9965e7a3a3f8ef57","shareURL":"http://m.svipmovie.com/#/moviedetails/3_aac3f576a8fa4c8b9965e7a3a3f8ef57","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240538633097942.jpg","title":"《妈妈咪鸭》暖心预告","roomId":""},{"airTime":2018,"duration":"00:01:49","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f88d157e655f4648aa87e80afd003db8","description":"在漫威影业的影片《黑豹》中，特查拉在其父亲\u2014\u2014前瓦坎达国王去世之后，回到了这个科技先进但与世隔绝的非洲国家，继任成为新一任\u201c黑豹\u201d及国王。当旧敌重现时，作为\u201c黑豹\u201d及国王的特查拉身陷两难境地，眼看着瓦坎达及全世界陷于危难之中。面对背叛与危险，这位年轻的国王必须联合同盟，释放\u201c黑豹\u201d全部力量，奋力捍卫他的人民和国土。","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f88d157e655f4648aa87e80afd003db8","shareURL":"http://m.svipmovie.com/#/moviedetails/3_f88d157e655f4648aa87e80afd003db8","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520240659157026571.jpg","title":"《黑豹》定档版预告","roomId":""},{"airTime":0,"duration":"00:25:50","loadtype":"video","score":0,"angleIcon":"","dataId":"3_7bced18b2a9d4e81a66d69a6a994a58d","description":"《红海行动》香港首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_7bced18b2a9d4e81a66d69a6a994a58d","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520232985920071213.jpg","title":"《红海行动》香港首映礼","roomId":""},{"airTime":0,"duration":"00:29:30","loadtype":"video","score":0,"angleIcon":"","dataId":"3_d746d42839244eee924adcc713cb9af1","description":"《红海行动》电影分享会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_d746d42839244eee924adcc713cb9af1","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/03/05/1520232938762035765.jpg","title":"《红海行动》电影分享会","roomId":""},{"airTime":0,"duration":"00:59:54","loadtype":"video","score":0,"angleIcon":"","dataId":"3_a61c8bc909e64567b2e4b02166443168","description":"电影《欧洲攻略》\u201c攻略重启\u201d发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_a61c8bc909e64567b2e4b02166443168","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517998021782084369.jpg","title":"电影《欧洲攻略》\u201c攻略重启\u201d发布会","roomId":""},{"airTime":0,"duration":"00:54:42","loadtype":"video","score":0,"angleIcon":"","dataId":"3_759c8a46ae2b46248f51cb3eb02263b2","description":"《祖宗十九代》恭候大笑之\u201c春节没烦恼\u201d主题发布会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_759c8a46ae2b46248f51cb3eb02263b2","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997955385042223.jpg","title":"《祖宗十九代》恭候大笑之\u201c春节没烦恼\u201d主题发布会","roomId":""},{"airTime":0,"duration":"00:34:12","loadtype":"video","score":0,"angleIcon":"","dataId":"3_f183e8069ee040efa9d5f46b4d8bb97f","description":"《唐人街探案2》上海主创见面会","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_f183e8069ee040efa9d5f46b4d8bb97f","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997881584084980.jpg","title":"《唐人街探案2》上海主创见面会","roomId":""},{"airTime":0,"duration":"00:46:24","loadtype":"video","score":0,"angleIcon":"","dataId":"3_15aff548669a40dab575ea696ee15f5d","description":"电影《泡芙小姐》首映礼","loadURL":"http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_15aff548669a40dab575ea696ee15f5d","shareURL":"","pic":"http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/02/07/1517997803814014462.jpg","title":"电影《泡芙小姐》首映礼","roomId":""}]
         * totalPnum : 9
         */

        private AdvBean adv;
        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<?> bannerList;
        private List<ListBean> list;

        public AdvBean getAdv() {
            return adv;
        }

        public void setAdv(AdvBean adv) {
            this.adv = adv;
        }

        public int getPnum() {
            return pnum;
        }

        public void setPnum(int pnum) {
            this.pnum = pnum;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

        public int getTotalPnum() {
            return totalPnum;
        }

        public void setTotalPnum(int totalPnum) {
            this.totalPnum = totalPnum;
        }

        public List<?> getBannerList() {
            return bannerList;
        }

        public void setBannerList(List<?> bannerList) {
            this.bannerList = bannerList;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class AdvBean {
            /**
             * imgURL :
             * dataId :
             * htmlURL :
             * shareURL :
             * title :
             */

            private String imgURL;
            private String dataId;
            private String htmlURL;
            private String shareURL;
            private String title;

            public String getImgURL() {
                return imgURL;
            }

            public void setImgURL(String imgURL) {
                this.imgURL = imgURL;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getHtmlURL() {
                return htmlURL;
            }

            public void setHtmlURL(String htmlURL) {
                this.htmlURL = htmlURL;
            }

            public String getShareURL() {
                return shareURL;
            }

            public void setShareURL(String shareURL) {
                this.shareURL = shareURL;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class ListBean {
            /**
             * airTime : 0
             * duration : 01:26:06
             * loadtype : video
             * score : 0
             * angleIcon :
             * dataId : 3_e3622954bfd3404d957211028bfb2a71
             * description : 《动物世界》首映发布会
             * loadURL : http://api.svipmovie.com/front/videoDetailApi/videoDetail.do?mediaId=3_e3622954bfd3404d957211028bfb2a71
             * shareURL :
             * pic : http://phonemovie.ks3-cn-beijing.ksyun.com/image/2018/07/02/1530521662049090886.jpg
             * title : 《动物世界》首映发布会
             * roomId :
             */

            private int airTime;
            private String duration;
            private String loadtype;
            private int score;
            private String angleIcon;
            private String dataId;
            private String description;
            private String loadURL;
            private String shareURL;
            private String pic;
            private String title;
            private String roomId;

            public int getAirTime() {
                return airTime;
            }

            public void setAirTime(int airTime) {
                this.airTime = airTime;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getLoadtype() {
                return loadtype;
            }

            public void setLoadtype(String loadtype) {
                this.loadtype = loadtype;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLoadURL() {
                return loadURL;
            }

            public void setLoadURL(String loadURL) {
                this.loadURL = loadURL;
            }

            public String getShareURL() {
                return shareURL;
            }

            public void setShareURL(String shareURL) {
                this.shareURL = shareURL;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getRoomId() {
                return roomId;
            }

            public void setRoomId(String roomId) {
                this.roomId = roomId;
            }
        }
    }
}
