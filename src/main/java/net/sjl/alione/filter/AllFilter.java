package net.sjl.alione.filter;

import net.sjl.alione.cnf.DefulConfig;
import net.sjl.alione.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: 所有请求过滤
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/11
 */
@Component
@WebFilter(filterName = "AllFilter",urlPatterns = "/*")
public class AllFilter implements Filter {

    private Logger logger = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger = LoggerFactory.getLogger(AllFilter.class);
        logger.info("AllFilter-初始化!");
        logger.debug("AllFilter-初始化!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        //过滤编码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        try {
            String requestUrl = request.getRequestURL().toString();//得到请求的URL地址
            String requestUri = request.getRequestURI();//得到请求的资源
            String queryString = request.getQueryString();//得到请求的URL地址中附带的参数
            String remoteAddr = request.getRemoteAddr();//得到来访者的IP地址
            String remoteHost = request.getRemoteHost();
            int remotePort = request.getRemotePort();
            String remoteUser = request.getRemoteUser();
            String method = request.getMethod();//得到请求URL地址时使用的方法
            String pathInfo = request.getPathInfo();
            String localAddr = request.getLocalAddr();//获取WEB服务器的IP地址
            String localName = request.getLocalName();//获取WEB服务器的主机名

            logger.debug("[客户机信息]-请求的URL地址:" + requestUrl);
            logger.debug("[客户机信息]-请求的资源:" + requestUri);
            logger.debug("[客户机信息]-请求的URL地址中附带的参数:" + queryString);
            logger.debug("[客户机信息]-来访者的IP地址:" + remoteAddr);
            logger.debug("[客户机信息]-来访者的主机名:" + remoteHost);
            logger.debug("[客户机信息]-使用的端口号:" + remotePort);
            logger.debug("[客户机信息]-remoteUser:" + remoteUser);
            logger.debug("[客户机信息]-请求使用的方法:" + method);
            logger.debug("[客户机信息]-pathInfo:" + pathInfo);
            logger.debug("[客户机信息]-localAddr:" + localAddr);
            logger.debug("[客户机信息]-localName:" + localName);

            if (Constant.connectionwhite.containsKey(remoteAddr) && Constant.connectionwhite.get(remoteAddr) <
                    Integer.parseInt(Constant.DefulConfig.getWhiteFrequency())){
                Constant.connectionwhite.put(remoteAddr,(Constant.connectionwhite.get(remoteAddr) + 1));
            }else {
                //客户端信息
                //PrintWriter out = response.getWriter();
                //out.print("llllll");
                //out.close();
            }

        } catch (Exception e) {
            logger.warn("获取客户机信息异常");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        logger.info("AllFilter-销毁!");
        logger.debug("AllFilter-销毁!");
    }
}
