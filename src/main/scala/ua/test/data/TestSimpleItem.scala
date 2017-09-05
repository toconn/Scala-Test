package ua.test.data

import java.util.Date;

/**
 * Created with CodeCrank.io
 */
class TestSimpleItem {

    var id: Long = 0l
    var name: String = ""
    var description: String = ""
    var count: Int = 0
    var enabled: Boolean = false
    var timestamp: Date = null

    override def toString() = {
        "TestSimpleItem [" +
        "id=" + (if (id != null) id.toString() else "null") +
        ", name=" + (if (name != null) name.toString() else "null") +
        ", description=" + (if (description != null) description.toString() else "null") +
        ", count=" + (if (count != null) count.toString() else "null") +
        ", enabled=" + (if (enabled != null) enabled.toString() else "null") +
        ", timestamp=" + (if (timestamp != null) timestamp.toString() else "null") +
        "]";
    }
}
