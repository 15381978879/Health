package cn.ltn.provider.Impl;

import cn.ltn.service.bean.DefaultBean;
import cn.ltn.service.service.DefaultApiService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class DefaultServiceImpl implements DefaultApiService {
        @Override
        public String defaultMethod(String str) {
            DefaultBean defaultBean = new DefaultBean();
            defaultBean.setStr(str);
            defaultBean.setMethodName("defaultMethod");
            defaultBean.setTimestamp(System.currentTimeMillis());
            return defaultBean.toString();
        }
}
