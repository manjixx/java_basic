//package juc.in.practice.chapter2;
//
//import javax.servlet.*;
//import java.io.IOException;
//import java.math.BigInteger;
//import java.util.concurrent.atomic.AtomicReference;
//
///**
// * Description ：
// * @author： manji
// * 2018/7/26 15:25
// */
//public class SynchronizedFactorizer implements Servlet {
//    /**
//     * 最新数值
//     */
//    private final AtomicReference<BigInteger> lastNumber = new AtomicReference<>();
//    /**
//     * 因数分解结果
//     */
//    private final AtomicReference<BigInteger []> lastFactors = new AtomicReference<>();
//    @Override
//    public void service(ServletRequest req, ServletResponse resp){
//        // 拿到请求的 计数值
//       BigInteger i = extractFromRequest(req);
//        if (i.equals(lastNumber.get())){
//            //读缓存
//            encodeIntoResponse(resp,lastFactors.get());
//        }else {
//         BigInteger[] factors = factor(i);
//         lastNumber.set(i);
//         lastFactors.set(factors);
//         encodeIntoResponse(resp,factors);
//        }
//    }
//
//    /**
//     * NoImplMethod  >>>>>>>>>>  Begin
//     */
//    private BigInteger[] factor(BigInteger i) {
//        return null;
//    }
//    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
//    }
//    private BigInteger extractFromRequest(ServletRequest req) {
//        return null;
//    }
//    /**
//     * NoImplMethod  >>>>>>>>>>  End
//     */
//
//
//
//
//    @Override
//    public void init(ServletConfig servletConfig) throws ServletException {
//    }
//    @Override
//    public ServletConfig getServletConfig() {
//        return null;
//    }
//    @Override
//    public String getServletInfo() {
//        return null;
//    }
//    @Override
//    public void destroy() {
//    }
//
//}
