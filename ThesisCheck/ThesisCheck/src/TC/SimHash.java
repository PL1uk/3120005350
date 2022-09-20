package TC;

import java.math.BigInteger;
import java.util.List;

public interface SimHash {
    //SimHash模块
    BigInteger simHash();
    //计算哈希值
    BigInteger hash(String source);
    //汉明距离
    int hammingDistance(SimHashImpl other);
    //计算汉明距离
    double getDistance(String str1, String str2);
    //获取特征值
    List subByDistance(SimHashImpl simHashImpl, int distance);
}