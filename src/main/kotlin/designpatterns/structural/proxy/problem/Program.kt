package system.design.designpatterns.structural.proxy.problem

fun main() {
    val videoService: VideoService = CachedVideoService(RealVideoService());
    videoService.getVideo(12)
}
