package com.example.demo.com.example.bean;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/25 上午10:09
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("233");
        user.setAccount("323");

        User user1 = new User();
        user1.setAccount("444");
        user1.setUserType((short) 1);
        BeanUtils.copyProperties(user1, user, getNullPropertyNames(user1));
        System.out.println(user);
    }

    public static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
