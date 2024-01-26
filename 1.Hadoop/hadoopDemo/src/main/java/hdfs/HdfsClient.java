package hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * 客户端常用代码
 * 1。获取一个客户端对象
 * 2。执行相关的操作命令
 * 3。关闭资源
 */
public class HdfsClient {

    private FileSystem fileSystem;

    @Before
    public void init() throws URISyntaxException, IOException, InterruptedException {
        URI uri = new URI("hdfs://hadoop101:8020");
        Configuration configuration = new Configuration();
        configuration.set("dfs.client.use.datanode.hostname","true");
        String user="atguigu";
        fileSystem = FileSystem.get(uri,configuration,user);
    }

    @After
    public void close() throws IOException {
        fileSystem.close();
    }

    @Test
    public void testmkdir() throws URISyntaxException, IOException, InterruptedException {
        fileSystem.mkdirs(new Path("/xiyou/huaguoshan"));
    }

    //上传
    @Test
    public void testPut() throws IOException {
        //参数解读：
        // 参数一：表示是否删除原文件
        // 参数二：是否允许覆盖
        // 参数三：原数据路径
        // 参数四：目的地路径
        //参数优先级：hdfs-default.xml => hdfs.site.xml=> 在项目资源目录下的配置文件优先级 =>在代码里面的配置优先级最高
        fileSystem.copyFromLocalFile(false,true,
                new Path("/Users/tengling/Downloads/sunwukong"),
                new Path("/xiyou/huaguoshan"));
    }
    // 下载
    @Test
    public void testGet() throws IOException {
        //参数解读：
        // 参数一：表示是否删除原文件
        // 参数二：原文件路径HDFS
        // 参数三：目标地址路径
        // 参数四：是否开启本地校验
        fileSystem.copyToLocalFile(false,new Path("/xiyou/huaguoshan"),
                new Path("/Users/tengling/Downloads/"),false);
    }
    //文件删除
    @Test
    public void testRm() throws IOException {
        //参数解读：
        // 参数一：要删除的路径
        // 参数二：是否递归删除
//        fileSystem.delete(new Path("/xiyou/huaguoshan/sunwukong"),false);
        //删除空目录
        fileSystem.delete(new Path("/xiyou/huaguoshan"),false);
        //删除非空目录
        fileSystem.delete(new Path("/xiyou/huaguoshan"),true);
    }

    //  文件更名和移动
    @Test
    public void testmv () throws IOException {
        //参数解读：
        // 参数一：原文件路径
        // 参数二：目标文件路径
        //对文件名称的修改
         fileSystem.rename(new Path("/xiyou/huaguoshan"),new Path("/xiyou/huaguoshan1"));
        //文件的移动和更名
        fileSystem.rename(new Path("/xiyou/huaguoshan1"),new Path("/huaguoshan2"));
        //目录的更名
        fileSystem.rename(new Path("/xiyou"),new Path("/xiyou1"));

    }

    //获取文件详细信息
    @Test
    public void fileDetail() throws IOException {
        //获取所有文件信息
        RemoteIterator<LocatedFileStatus> listFiles = fileSystem.listFiles(new Path("/"), false);
        //遍历文件
        while (listFiles.hasNext()) {
            LocatedFileStatus fileStatus = listFiles.next();
            System.out.println("=========="+fileStatus.getPath());
            System.out.println(fileStatus.getPermission());
             System.out.println(fileStatus.getOwner());
            System.out.println(fileStatus.getGroup());
            System.out.println(fileStatus.getLen());
            System.out.println(fileStatus.getModificationTime());
            System.out.println(fileStatus.getReplication());
            System.out.println(fileStatus.getBlockSize());
            System.out.println(fileStatus.getPath().getName());
            //获取块信息
            BlockLocation[] blockLocations = fileStatus.getBlockLocations();
            System.out.println(Arrays.toString(blockLocations));
        }
    }
    // 判断是文件还是文件夹
    @Test
    public void testFile() throws IOException {
        FileStatus[] listStatus = fileSystem.listStatus(new Path("/"));
        for (FileStatus status : listStatus) {
            if (status.isFile()) {
                System.out.println("文件："+status.getPath().getName());
            }else{
                System.out.println("目录："+status.getPath().getName());
            }
        }

    }
}
