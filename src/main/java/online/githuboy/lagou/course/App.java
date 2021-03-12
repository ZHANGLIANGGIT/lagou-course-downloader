package online.githuboy.lagou.course;

import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import online.githuboy.lagou.course.support.Downloader;
import online.githuboy.lagou.course.support.ExecutorService;

/**
 * 启动类
 *
 * @author suchu
 * @date 2020/12/11
 */
@Slf4j
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        //        try {
        //            log.info("检查ffmpeg是否存在");
        //            int status = CmdExecutor.executeCmd(new File("."), "ffmpeg", "-version");
        //        } catch (Exception e) {
        //            log.error("{}", e.getMessage());
        //            // return;
        //        }
        //拉钩课程ID
        String courseId = "17";
        //视频保存的目录
        String savePath = "/Users/zhangliang/Workspaces/Code/lessons/lagou_course/video";
        Downloader downloader = new Downloader(courseId, savePath);
//        Thread logThread = new Thread(() -> {
//            while (true) {
//                log.info("Thread pool:{}", ExecutorService.getExecutor());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }, "log-thread");
//        logThread.setDaemon(true);
//        logThread.start();
        downloader.start();
    }
}
