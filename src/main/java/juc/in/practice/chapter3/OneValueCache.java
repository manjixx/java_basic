package juc.in.practice.chapter3;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Description ：对数值及其因数分解进行缓存不可变的容器类
 *
 * @author： manji
 * 2018/7/31 13:25
 */
public class OneValueCache {

    private  final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i, BigInteger[] factors){
        lastNumber = i;
        lastFactors = Arrays.copyOf(factors,factors.length);
    }

    public BigInteger[] getFactors(BigInteger i){
        if (lastNumber == null || !lastNumber.equals(i)){
            return null;
        }else {
            return Arrays.copyOf(lastFactors,lastFactors.length);
        }
    }

}
