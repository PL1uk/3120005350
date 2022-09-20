package Test;

import TC.FileInput;
import TC.SimHashImpl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AllTest {
    String origin="I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig.txt";
    String[] s={
            "I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig_0.8_add.txt",
            "I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig_0.8_del.txt",
            "I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig_0.8_dis_1.txt",
            "I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig_0.8_dis_10.txt",
            "I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig_0.8_dis_15.txt"};

    @org.junit.Test
    public void addTest() throws IOException {
        FileInput fileInput = new FileInput();
        FileOutputStream fos = new FileOutputStream("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\2\\answer_0.8_add.txt");
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[0]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
        String str = "该文章与原文相似度为：" + (100 - distance * 100 / 128) + "%";
        byte []bt = str.getBytes();
        fos.write(bt);
    }

    @org.junit.Test
    public void delTest() throws IOException {
        FileInput fileInput = new FileInput();
        FileOutputStream fos = new FileOutputStream("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\2\\answer_0.8_del.txt");
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[1]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
        String str = "该文章与原文相似度为：" + (100 - distance * 100 / 128) + "%";
        byte []bt = str.getBytes();
        fos.write(bt);
    }

    @org.junit.Test
    public void dis_1Test() throws IOException {
        FileInput fileInput = new FileInput();
        FileOutputStream fos = new FileOutputStream("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\2\\answer_0.8_dis_1.txt");
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[2]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
        String str = "该文章与原文相似度为：" + (100 - distance * 100 / 128) + "%";
        byte []bt = str.getBytes();
        fos.write(bt);
    }

    @org.junit.Test
    public void dis_10Test() throws IOException {
        FileInput fileInput = new FileInput();
        FileOutputStream fos = new FileOutputStream("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\2\\answer_0.8_dis_10.txt");
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[3]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
        String str = "该文章与原文相似度为：" + (100 - distance * 100 / 128) + "%";
        byte []bt = str.getBytes();
        fos.write(bt);
    }

    @org.junit.Test
    public void dis_15Test() throws IOException {
        FileInput fileInput = new FileInput();
        FileOutputStream fos = new FileOutputStream("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\2\\answer_0.8_dis_15.txt");
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[4]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
        String str = "该文章与原文相似度为：" + (100 - distance * 100 / 128) + "%";
        byte []bt = str.getBytes();
        fos.write(bt);
    }

//    @org.junit.Test
//    public void FileNotFoundException(){
//        FileInput fileInput = new FileInput();
//        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
//        hash1.subByDistance(hash1, 3);
//        SimHashImpl hash2 = new SimHashImpl(fileInput.readString("I:\\1.txt"), 64);
//        hash2.subByDistance(hash2, 3);
//        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
//        System.out.println("该文章与原文相似度为："+(100-distance*100/128)+"%");
//    }
}

