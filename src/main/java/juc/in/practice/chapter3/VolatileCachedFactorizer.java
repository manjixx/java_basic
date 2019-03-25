//package juc.in.practice.chapter3;
//
//import javax.servlet.Servlet;
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import java.math.BigInteger;
//
///**
// * Description ：使用执行不可变容器对象的Volatile类型引用,缓存最新结果.
// *
// * @author： manji
// * 2018/7/31 13:34
// */
//public class VolatileCachedFactorizer implements Servlet {
//
//    private volatile OneValueCache cache = new OneValueCache(null,null);
//    @Override
//    public void service(ServletRequest req, ServletResponse resp){
//        BigInteger i = extractFromRequest(req);
//        BigInteger[] factors = cache.getFactors(i);
//        if (factors == null){
//            factors = factor(i);
//            cache = new OneValueCache(i,factors);
//        }
//        encodeIntoResponse(resp,factors);
//    }
//
//
//    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
//    }
//    private BigInteger extractFromRequest(ServletRequest req) {
//        return null;
//    }
//    private BigInteger[] factor(BigInteger i) {
//        return null;
//    }
//
//
//
//    @Override
//    public String getServletInfo() {
//        return null;
//    }
//    @Override
//    public void destroy() {
//    }
//    @Override
//    public void init(ServletConfig servletConfig){
//    }
//    @Override
//    public ServletConfig getServletConfig() {
//        return null;
//    }
//
//
//}
