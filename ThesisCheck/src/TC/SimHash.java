package TC;

import java.math.BigInteger;
import java.util.List;

public interface SimHash {

    BigInteger simHash();//SimHash模块

    BigInteger hash(String source);//计算哈希值

    int hammingDistance(SimHashImpl other);//汉明距离

    double getDistance(String str1, String str2);//计算汉明距离

    List subByDistance(SimHashImpl simHashImpl, int distance);//获取特征值

}