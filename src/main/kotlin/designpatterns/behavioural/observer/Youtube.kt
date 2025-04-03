// Observer interface
interface NotificationObserver {
    fun update(message: String)
}

// Subject/Publisher interface
interface NotificationSubject {
    fun subscribe(observer: NotificationObserver)
    fun unsubscribe(observer: NotificationObserver)
    fun notifyObservers(message: String)
}

// Concrete Subject/Publisher
class YoutubeChannel : NotificationSubject {
    private val observers = mutableListOf<NotificationObserver>()

    override fun subscribe(observer: NotificationObserver) {
        observers.add(observer)
    }

    override fun unsubscribe(observer: NotificationObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers(message: String) {
        observers.forEach { it.update(message) }
    }

    fun uploadVideo(videoTitle: String) {
        notifyObservers("New video uploaded: $videoTitle")
    }
}

// Concrete Observers
class Subscriber(private val name: String) : NotificationObserver {
    override fun update(message: String) {
        println("$name received notification: $message")
    }
}

// Usage
fun main() {
    // Create the subject
    val techChannel = YoutubeChannel()

    // Create observers
    val subscriber1 = Subscriber("Alex")
    val subscriber2 = Subscriber("Emma")
    val subscriber3 = Subscriber("John")

    // Subscribe to the channel
    techChannel.subscribe(subscriber1)
    techChannel.subscribe(subscriber2)
    techChannel.subscribe(subscriber3)

    // Upload a video - all subscribers get notified
    techChannel.uploadVideo("Observer Pattern Tutorial")

    // Unsubscribe one observer
    techChannel.unsubscribe(subscriber2)

    // Upload another video
    techChannel.uploadVideo("Design Patterns Explained")
}
