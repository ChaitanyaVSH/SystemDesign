package system.design.designpatterns.structural.proxy.problem

class CachedVideoService (private val realVideoService: VideoService): VideoService {
    override fun getVideo(id: Number) {
        if (id.toInt() >= 10) {
            println("Getting the video from cache service.")
        } else {
            realVideoService.getVideo(id)
        }
    }
}
