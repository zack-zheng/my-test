package com.zzz.test.my_test.exam;

import java.util.List;
import java.util.Objects;

public class RandomTestResponse {

    /**
     * code : 200
     * msg :
     * data : [{"content":"2005版人民币100元的（）具有荧光机读特征。","id":"1654676481386770896","type":1,"analysis":null,"opts":[{"content":"手感线；","value":3},{"content":"隐形图案。","value":4},{"content":"纸张；","value":1},{"content":"光变油墨面额数字；","value":2}],"answer":[1]},{"content":"专业防伪特征也称（）防伪特征。","id":"1661629486199758863","type":1,"analysis":null,"opts":[{"content":"四线。","value":4},{"content":"二线；\n","value":2},{"content":"一线；\n","value":1},{"content":"三线；\n","value":3}],"answer":[2]},{"content":"1999年版人民币纸张中的红蓝彩色纤维是有序分布的。（）","id":"1654676481453879304","type":3,"analysis":null,"opts":[{"content":"错误","value":2},{"content":"正确","value":1}],"answer":[2]},{"content":"在特定波长紫外光下观察，可见2015年版人民币100元在（）分布的无色荧光纤维。","id":"1654676481420325157","type":1,"analysis":null,"opts":[{"content":"票面中部纵向；","value":2},{"content":"水印区域随机；","value":1},{"content":"整个票面随机；","value":3},{"content":"票面右侧纵向。","value":4}],"answer":[3]},{"content":"透光观察2015年版人民币100元的胶印对印图案，可见正背面图案组成一个完整的古钱币图案。（）","id":"1654676481470656642","type":3,"analysis":null,"opts":[{"content":"错误","value":2},{"content":"正确","value":1}],"answer":[2]},{"content":"第五套人民币10元的背面图案中采用了（）防伪技术。","id":"1654676481420325616","type":2,"analysis":null,"opts":[{"content":"光变油墨。","value":4},{"content":"红外特征；","value":1},{"content":"缩微印刷；","value":3},{"content":"荧光油墨；","value":2}],"answer":[1,2,3]},{"content":"目前常见的假人民币硬币模具伪造工艺为（）。","id":"1661629486216536091","type":2,"analysis":null,"opts":[{"content":"浮雕软件设计加数控雕刻；\n","value":3},{"content":"手工雕刻；\n","value":1},{"content":"电火花复制；\n","value":2},{"content":"翻砂铸造。","value":4}],"answer":[2,3]},{"content":"2015年版人民币100元的有色荧光竖号码、无色荧光纤维、凹印缩微文字均为专业防伪特征。（）","id":"1654676481453879430","type":3,"analysis":null,"opts":[{"content":"正确","value":1},{"content":"错误","value":2}],"answer":[1]},{"content":"以下不属于纸币公众防伪特征的是（）。","id":"1654676481445490725","type":2,"analysis":null,"opts":[{"content":"荧光特征；","value":2},{"content":"红外特征；","value":3},{"content":"磁性特征。","value":4},{"content":"水印；","value":1}],"answer":[2,3,4]},{"content":"第五套人民币的无色荧光纤维需要在（）光下观察。","id":"1654676481407742006","type":1,"analysis":null,"opts":[{"content":"偏振。","value":4},{"content":"紫外；","value":1},{"content":"红外；","value":2},{"content":"透射；","value":3}],"answer":[1]}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DataBean person = (DataBean) obj;
            return id.equals(person.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
        /**
         * content : 2005版人民币100元的（）具有荧光机读特征。
         * id : 1654676481386770896
         * type : 1
         * analysis : null
         * opts : [{"content":"手感线；","value":3},{"content":"隐形图案。","value":4},{"content":"纸张；","value":1},{"content":"光变油墨面额数字；","value":2}]
         * answer : [1]
         */

        private String content;
        private String id;
        private int type;
        private Object analysis;
        private List<OptsBean> opts;
        private List<Integer> answer;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getAnalysis() {
            return analysis;
        }

        public void setAnalysis(Object analysis) {
            this.analysis = analysis;
        }

        public List<OptsBean> getOpts() {
            return opts;
        }

        public void setOpts(List<OptsBean> opts) {
            this.opts = opts;
        }

        public List<Integer> getAnswer() {
            return answer;
        }

        public void setAnswer(List<Integer> answer) {
            this.answer = answer;
        }

        public static class OptsBean {
            /**
             * content : 手感线；
             * value : 3
             */

            private String content;
            private int value;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }
    }
}
