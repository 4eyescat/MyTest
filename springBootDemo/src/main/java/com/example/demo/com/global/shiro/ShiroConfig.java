package com.example.demo.com.global.shiro;

import com.example.demo.com.global.Exception.CertifiedExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/5 下午8:46
 */
@Configuration
@Slf4j
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        if (log.isInfoEnabled()) {
            log.info("shifi filter()");
        }
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器.
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
        // 配置不会被拦截的链接 顺序判断
      /*  filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/login", "anon");
//        filterChainDefinitionMap.put("/**", "authc");
        filterChainDefinitionMap.put("/**", "anon");
//        filterChainDefinitionMap.put("/hello", "roles[role3]");
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 登录成功后要跳转的链接
//        shiroFilterFactoryBean.setSuccessUrl("/index");
        //未授权界面;
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");*/

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public CertifiedShiroRelam myShiroRealm(){
        CertifiedShiroRelam myShiroRealm = new CertifiedShiroRelam();
        return myShiroRealm;
    }


    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm());
//        // 自定义session管理 使用redis
//        securityManager.setSessionManager(sessionManager());
//        // 自定义缓存实现 使用redis
//        securityManager.setCacheManager(cacheManager());
        return securityManager;
    }

    /**
     * 注册全局异常处理
     * @return
     */
    @Bean(name = "exceptionHandler")
    public CertifiedExceptionHandler handlerExceptionResolver() {
        return new CertifiedExceptionHandler();
    }
}
