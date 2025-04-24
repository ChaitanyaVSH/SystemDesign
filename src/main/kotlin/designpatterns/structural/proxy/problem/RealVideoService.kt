package system.design.designpatterns.structural.proxy.problem

class RealVideoService : VideoService {
    override fun getVideo(id: Number) {
        println("Getting the video from real service.")
    }
}
