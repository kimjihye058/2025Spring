package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data1;
    private DataBean2 data2;

    public DataBean2 getData1() {
        return data1;
    }

    public void setData1(DataBean2 data1) {     // DataBean2 객체의 주솟값이 매개변수로 들어감
        this.data1 = data1;
    }

    public DataBean2 getData2() {
        return data2;
    }

    public void setData2(DataBean2 data2) {
        this.data2 = data2;
    }
}
