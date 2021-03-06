package chencheng.bwie.com.fjd_activity.homepage.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class SousBean {
    @Id(autoincrement = true)

    private Long id;
    private String name;
    @Generated(hash = 829949261)
    public SousBean(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 2002585522)
    public SousBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
