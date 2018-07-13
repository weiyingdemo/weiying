package com.example.weiying.model.bean;

import java.util.List;

public class CommentBean {

    /**
     * msg : 成功
     * ret : {"pnum":1,"totalRecords":11,"records":20,"list":[{"msg":"与美国片","phoneNumber":"155****0996","dataId":"ff8080815e836e43015e8ac1fb0c48cd","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:55:22","userName":"","userId":"","likeNum":0},{"msg":"四道杠中队长","phoneNumber":"155****0996","dataId":"ff8080815e836f78015e8ac15453496e","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:54:39","userName":"","userId":"","likeNum":0},{"msg":"四道杠中队长","phoneNumber":"155****0996","dataId":"ff8080815e836f78015e8ac0c05e4962","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:54:01","userName":"","userId":"","likeNum":0},{"msg":"好垃圾，领导讲话一点霸气都没有，娘炮狼","phoneNumber":"精密轴承厂家","dataId":"ff8080815e37cc09015e4d00f1f70a16","userPic":"http://tvax4.sinaimg.cn/crop.0.0.996.996.1024/006ddLRwly8fe0lyvip6ej30ro0roabp.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-04 21:07:41","userName":"","userId":"","likeNum":0},{"msg":"不会吧？","phoneNumber":"江湖百晓生","dataId":"ff8080815dfe2816015dff55c6491171","userPic":"http://wx.qlogo.cn/mmopen/VLM4oiaQJ5eIBHEee95bM20ic6EIQKcqY1A6R5cBvjlUEKiblXQB8xTspH7ztqozaxb77UYImibPxZZv3IB3fxPN3w/0","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-20 19:09:57","userName":"","userId":"","likeNum":0},{"msg":"高科技垃圾电影啊，看多无益！","phoneNumber":"长征火箭","dataId":"ff8080815df59e4a015df76750ba0f7a","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/19/1503093766933939928.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-19 06:12:09","userName":"","userId":"","likeNum":0},{"msg":"现在真是什么人都能拍电影","phoneNumber":"139****8947","dataId":"ff8080815dcb455e015dcf39b86e4392","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/10/1502364306767349204.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-11 10:57:32","userName":"","userId":"","likeNum":1},{"msg":"导演给力，演员给力，这样的电影真的不多了，支持！","phoneNumber":"悲伤的恋曲","dataId":"ff8080815dc02158015dc113cf8b3811","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:59:11","userName":"","userId":"","likeNum":4},{"msg":"一部好的片子，一定是一个好的导演导出来的，这部电影充分说明了这一点。","phoneNumber":"虚情假意","dataId":"ff8080815dc02158015dc113cf893810","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:58:16","userName":"","userId":"","likeNum":4},{"msg":"呵呵，这种电影，不想评价更多！","phoneNumber":"终于放弃你","dataId":"ff8080815dc02158015dc113cf8d3812","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:51:02","userName":"","userId":"","likeNum":1},{"msg":"打算把这个电影推荐给某人看看，哈哈~","phoneNumber":"我的心寄错了地方","dataId":"ff8080815dc02158015dc113cf8f3813","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:41:55","userName":"","userId":"","likeNum":2}],"totalPnum":1}
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
         * pnum : 1
         * totalRecords : 11
         * records : 20
         * list : [{"msg":"与美国片","phoneNumber":"155****0996","dataId":"ff8080815e836e43015e8ac1fb0c48cd","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:55:22","userName":"","userId":"","likeNum":0},{"msg":"四道杠中队长","phoneNumber":"155****0996","dataId":"ff8080815e836f78015e8ac15453496e","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:54:39","userName":"","userId":"","likeNum":0},{"msg":"四道杠中队长","phoneNumber":"155****0996","dataId":"ff8080815e836f78015e8ac0c05e4962","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-16 20:54:01","userName":"","userId":"","likeNum":0},{"msg":"好垃圾，领导讲话一点霸气都没有，娘炮狼","phoneNumber":"精密轴承厂家","dataId":"ff8080815e37cc09015e4d00f1f70a16","userPic":"http://tvax4.sinaimg.cn/crop.0.0.996.996.1024/006ddLRwly8fe0lyvip6ej30ro0roabp.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-09-04 21:07:41","userName":"","userId":"","likeNum":0},{"msg":"不会吧？","phoneNumber":"江湖百晓生","dataId":"ff8080815dfe2816015dff55c6491171","userPic":"http://wx.qlogo.cn/mmopen/VLM4oiaQJ5eIBHEee95bM20ic6EIQKcqY1A6R5cBvjlUEKiblXQB8xTspH7ztqozaxb77UYImibPxZZv3IB3fxPN3w/0","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-20 19:09:57","userName":"","userId":"","likeNum":0},{"msg":"高科技垃圾电影啊，看多无益！","phoneNumber":"长征火箭","dataId":"ff8080815df59e4a015df76750ba0f7a","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/19/1503093766933939928.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-19 06:12:09","userName":"","userId":"","likeNum":0},{"msg":"现在真是什么人都能拍电影","phoneNumber":"139****8947","dataId":"ff8080815dcb455e015dcf39b86e4392","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/08/10/1502364306767349204.jpg","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-11 10:57:32","userName":"","userId":"","likeNum":1},{"msg":"导演给力，演员给力，这样的电影真的不多了，支持！","phoneNumber":"悲伤的恋曲","dataId":"ff8080815dc02158015dc113cf8b3811","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:59:11","userName":"","userId":"","likeNum":4},{"msg":"一部好的片子，一定是一个好的导演导出来的，这部电影充分说明了这一点。","phoneNumber":"虚情假意","dataId":"ff8080815dc02158015dc113cf893810","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:58:16","userName":"","userId":"","likeNum":4},{"msg":"呵呵，这种电影，不想评价更多！","phoneNumber":"终于放弃你","dataId":"ff8080815dc02158015dc113cf8d3812","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:51:02","userName":"","userId":"","likeNum":1},{"msg":"打算把这个电影推荐给某人看看，哈哈~","phoneNumber":"我的心寄错了地方","dataId":"ff8080815dc02158015dc113cf8f3813","userPic":"","followType":false,"zan":false,"cmtNum":0,"time":"2017-08-08 16:41:55","userName":"","userId":"","likeNum":2}]
         * totalPnum : 1
         */

        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<ListBean> list;

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

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * msg : 与美国片
             * phoneNumber : 155****0996
             * dataId : ff8080815e836e43015e8ac1fb0c48cd
             * userPic :
             * followType : false
             * zan : false
             * cmtNum : 0
             * time : 2017-09-16 20:55:22
             * userName :
             * userId :
             * likeNum : 0
             */

            private String msg;
            private String phoneNumber;
            private String dataId;
            private String userPic;
            private boolean followType;
            private boolean zan;
            private int cmtNum;
            private String time;
            private String userName;
            private String userId;
            private int likeNum;

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public boolean isFollowType() {
                return followType;
            }

            public void setFollowType(boolean followType) {
                this.followType = followType;
            }

            public boolean isZan() {
                return zan;
            }

            public void setZan(boolean zan) {
                this.zan = zan;
            }

            public int getCmtNum() {
                return cmtNum;
            }

            public void setCmtNum(int cmtNum) {
                this.cmtNum = cmtNum;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public int getLikeNum() {
                return likeNum;
            }

            public void setLikeNum(int likeNum) {
                this.likeNum = likeNum;
            }
        }
    }
}
