package juc.in.practice.chapter2;

import javax.servlet.*;
import java.math.BigInteger;
import java.sql.JDBCType;
import java.util.List;
import java.util.Vector;

/**
 * Description ：
 *
 * @author： manji
 * 2018/7/30 11:08
 */
public class CachedFactorizer implements Servlet {

    private BigInteger lastNumber;
    private BigInteger[] lastFactors;
    private  long hits;
    private  long cacheHits;
    public synchronized long getHits(){
        return this.hits;
    }

    public synchronized double getCacheHitRatio(){
        return (double) cacheHits /(double) hits;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp){
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = null;
        synchronized (this) {
            ++hits;
            if (i.equals(lastNumber)){
                ++cacheHits;
                factors = lastFactors.clone();
            }
        }
        if (factors == null){
            factors = factor(i);
            synchronized (this){
                lastNumber = i;
                lastFactors = factors.clone();
            }
        }
        encodeIntoResponse(resp,factors);
    }


    /**
     * NoImplMethod  >>>>>>>>>>  Begin
     */
    private BigInteger[] factor(BigInteger i) {
        return null;
    }
    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }
    private BigInteger extractFromRequest(ServletRequest req) {
        return null;
    }
    /**
     * NoImplMethod  >>>>>>>>>>  End
     */


    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public void destroy() {
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


}
