package us.codecraft.tinyioc.cglib.bean;

/**
 * Created by 堂zz on 2017/12/13.
 */
public class SampleBean {
    private String value;

    public SampleBean() {
    }

    public SampleBean(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
