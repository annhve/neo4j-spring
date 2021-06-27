package com.example.neo4j.model
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship


import java.time.LocalDateTime
import java.util.*

@Node
class Series(
    id: Long,
    uid: UUID,
    name: String,
    originalName: String?,
    draft: Boolean,
    readyToCheckAnnouncement: Boolean,
    announcementChecked: Boolean,
    readyToCheckRelease: Boolean,
    releaseChecked: Boolean,
    readyToPublish: Boolean,
    deleted: Boolean,
    labels: Set<String>,
    val shortDescription: String?,
    val description: String?,
    val keywords: String?,
    val releaseWorld: LocalDateTime?,
    val releaseDvd: LocalDateTime?,
    val release: LocalDateTime?,
    val kinopoiskId: String?,
    val avgRating: Double?,
    val trianglesBc: String?,
    val alias: String,
    val copyright: String?,
    val facebook: String?,
    val avgRatingVotes: Double?,
    val releaseYear: Int?,
    val lastYear: Int?,
    val contentLanguage: String?,
    val avgRatingImdb: Double?,
    val announceDate: LocalDateTime?,
    val lvrDate: LocalDateTime?,
    val promoText: String?,
    val sticker: String?,
    val afishaRating: Double?,
    val afishaDescription: String?,
    val afishaDescriptionAuthor: String?,
    val afishaVerdict: String?,
    val sameAs: String?,
    val spoilers: String?,
    val nameEn: String?,
    val imdbId: String?,
    val sequenceNumber: Int?,
    val href: String?,
    val displayNameEnc: String?,
    val originalNameEnc: String?,
    val descriptionEnc: String?,
    val shortDescriptionEnc: String?,
    val releaseBlu: LocalDateTime?,
    val fadeColor: String?,
    // val label: String?, 9 записей
    // val labelType: String?, 9 записей
    val seo_description :String?,
    val seo_metaTitle:String?,
    val seo_metaDescription:String?,

    //val seo: Map<String, Any>,

    @Relationship(type = "CONNECTED_WITH", direction = Relationship.Direction.OUTGOING)
    val movieConnected: Set<Movie>,

    @Relationship(type = "RECOMMENDED_BY", direction = Relationship.Direction.OUTGOING)
    val movieRecommended: Set<Movie>,

    @Relationship(type = "CONNECTED_WITH", direction = Relationship.Direction.OUTGOING)
    val seriesConnected: Set<Series>,

    @Relationship(type = "RECOMMENDED_BY", direction = Relationship.Direction.OUTGOING)
    val seriesRecommended: Set<Series>,

) : Entity(
    id, uid,
    name,
    originalName,
    draft,
    readyToCheckAnnouncement,
    announcementChecked,
    readyToCheckRelease,
    releaseChecked,
    readyToPublish,
    deleted,
    labels
)