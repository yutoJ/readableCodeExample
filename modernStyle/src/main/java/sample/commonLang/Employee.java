package sample.commonLang;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.lang.reflect.InvocationTargetException;

public class Employee {
    private String name;
    private int age;

    public Employee(Employee employee) {
        try {
            BeanUtils.copyProperties(this, employee);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public boolean blank() {
        return StringUtils.isEmpty(this.name);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, "name");
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
