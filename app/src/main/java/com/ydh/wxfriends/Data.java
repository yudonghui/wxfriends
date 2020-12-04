package com.ydh.wxfriends;

import android.net.Uri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {

    private String avatar;
    private String nickname;
    private String createTime;
    private String content;
    private List<Uri> pictureList;
    private List<Uri> pictureThumbList;

    public static List<Data> get() {
        List<Data> dataList = new ArrayList<>();

        Data data1 = new Data();
        data1.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data1.nickname = "萌新-lpe";
        data1.createTime = "昨天 11:21";
        data1.content = "开司还是那么帅";
        data1.pictureList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331315&di=859d1eca7edcb9e7f41350aca8ba99ae&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F27%2F67%2F01300000921826141299672233506.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331315&di=4b32e1cfc1c6046b9c7a0f9d9fef1b95&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F30%2F29%2F01300000201438121627296084016.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331314&di=183fa228e4af9bf753850db3b04d7d32&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F24%2F78%2F20300000291746133783784887147.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331314&di=eb34a5a182715ec377986b38f331a09e&imgtype=0&src=http%3A%2F%2Fa1.att.hudong.com%2F05%2F00%2F01300000194285122188000535877.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331313&di=2ddddbb962bbfeadd216937ad0c48b6b&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F45%2F36%2F14300000491308128107360639165.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331312&di=5eebee428f55e5631f4308b02d33b232&imgtype=0&src=http%3A%2F%2Fimg.aiimg.com%2Fuploads%2Fuserup%2F0909%2F2Z64022L38.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331312&di=b7213192202c321d000926413b136360&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F02%2F38%2F01300000237560123245382609951.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483664777_5730.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483664741_1378.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671689_9534.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671689_2126.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671703_7890.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201707/27/1501118577_9169.jpg") // 超出屏幕宽度大尺寸图测试
        );
        data1.pictureThumbList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331312&di=0a3b14e925278ce025b70c9f121fedfc&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F52%2F62%2F31300542679117141195629117826.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331310&di=c11e28a0d5fddc8307c7a9adfd067edc&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F20%2F39%2F01300542519189139990390839214.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647897_1367.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484650736_2101.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647701_9893.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484650700_2514.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647930_5139.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647929_8108.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647897_1978.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647898_4474.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647930_7735.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647929_9591.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201707/27/1501118720_9504.jpg") // 超出屏幕宽度大尺寸图测试
        );


        Data data2 = new Data();
        data2.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data2.nickname = "苦涩";
        data2.createTime = "昨天 09:59";
        data2.content = "唐僧还是厉害啊。为什么？有宝马";
        data2.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483664741_7475.png")
        );
        data2.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647799_1689.png")
        );

        Data data3 = new Data();
        data3.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data3.nickname = "empty";
        data3.createTime = "昨天 08:12";
        data3.content = "各种眼神";
        data3.pictureList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331309&di=eb7473a6c89a0ef0fb9b59f71282e122&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F92%2F04%2F01000000000000119090475560392.jpg"),
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331309&di=e818892c2e7eecfa12eb9db08e5653c5&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F61%2F98%2F01300000248068123885985729957.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671702_6499.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/06/1483671702_2352.jpg")
        );
        data3.pictureThumbList = Arrays.asList(
                Uri.parse("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=697401579,323262224&fm=11&gp=0.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484650719_9275.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647702_8420.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647930_4474.jpg")
        );

        Data data4 = new Data();
        data4.avatar = "http://b167.photo.store.qq.com/psb?/V14EhGon2OmAUI/hQN450lNoDPF.dO82PVKEdFw0Qj5qyGeyN9fByKgWd0!/m/dJWKmWNZEwAAnull";
        data4.nickname = "empty";
        data4.createTime = "昨天 06:00";
        data4.content = "人与人间的信任，就像是纸片，一旦破损，就不会再回到原来的样子。";
        data4.pictureList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331326&di=3554f7d8c0e078de839e622e1d5768ec&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F25%2F08%2F01300000248343122451081855461.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296122_9613.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296303_6984.png")
        );
        data4.pictureThumbList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331326&di=8b02395f2e16d0ad63b9f3614eaa64d1&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F11%2F48%2F01300000195282124296481807051.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647818_9583.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647817_7305.png")
        );

        Data data5 = new Data();
        data5.avatar = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331326&di=b35210823ec09e40392c77539c6b72ab&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F63%2F70%2F06300000046969120433706514748.jpg";
        data5.nickname = "越线龙马";
        data5.createTime = "前天 14:61";
        data5.content = "雪.触之即化..愿永久飘零";
        data5.pictureList = Arrays.asList(
                Uri.parse("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1607058331325&di=c0ac15f6abcd32561ee4425f44d6ae6f&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201201%2F21%2F20120121221819_xVua5.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296303_5044.jpg")
        );
        data5.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647278_8869.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647702_1117.jpg")
        );

        Data data6 = new Data();
        data6.avatar = "http://b162.photo.store.qq.com/psb?/V14EhGon4cZvmh/z2WukT5EhNE76WtOcbqPIgwM2Wxz4Tb7Nub.rDpsDgo!/b/dOaanmAaKQAA";
        data6.nickname = "顺子要不起";
        data6.createTime = "圣诞节";
        data6.content = "颜宇扬的期末总结\n1、有本事冲我来，别再家长会上吓唬我爸\n2、期末考试成绩出来了，我觉得我妈生二胎是非常明智的选择\n3、这场考试对于我的意义就是知道了班上到底有多少人\n4、期末考试不给老师们露一手，他们还真以为自己教的好";
        data6.pictureList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296287_2190.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_7908.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_7013.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296286_6401.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/13/1484296106_5671.png")
        );
        data6.pictureThumbList = Arrays.asList(
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647898_9300.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647278_2143.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647816_4929.png"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647817_5319.jpg"),
                Uri.parse("http://img.my.csdn.net/uploads/201701/17/1484647818_3369.png")
        );


        if (System.currentTimeMillis() % 3 == 0) {
            dataList.add(data1);
            dataList.add(data2);
            dataList.add(data3);
            dataList.add(data4);
            dataList.add(data6);
        } else if (System.currentTimeMillis() % 3 == 1) {
            dataList.add(data5);
            dataList.add(data6);
            dataList.add(data2);
            dataList.add(data4);
            dataList.add(data3);
        } else {
            dataList.add(data1);
            dataList.add(data3);
            dataList.add(data4);
            dataList.add(data5);
            dataList.add(data6);
        }

        return dataList;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Uri> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<Uri> pictureList) {
        this.pictureList = pictureList;
    }

    public List<Uri> getPictureThumbList() {
        return pictureThumbList;
    }

    public void setPictureThumbList(List<Uri> pictureThumbList) {
        this.pictureThumbList = pictureThumbList;
    }
}
