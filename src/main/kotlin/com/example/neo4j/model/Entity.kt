package com.example.neo4j.model

import org.springframework.data.neo4j.core.schema.DynamicLabels
import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import java.util.*

@Node
open class Entity(
    @GeneratedValue
    @Id
    val id: Long,
    val uid: UUID,
    val name: String,
    val originalName: String?,
    val draft: Boolean,
    val readyToCheckAnnouncement: Boolean,
    val announcementChecked: Boolean,
    val readyToCheckRelease: Boolean,
    val releaseChecked: Boolean,
    val readyToPublish: Boolean,
    val deleted: Boolean,

    @DynamicLabels
    val labels: Set<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entity) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int = id.hashCode()
}
