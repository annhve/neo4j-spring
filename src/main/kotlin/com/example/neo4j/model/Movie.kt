package com.example.neo4j.model

import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Node
class Movie(
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
    val budget: Double?,
    val duration: Int?,
    val keywords: String?,
    val worldReleaseDate: LocalDate?,
    val localReleaseDate: LocalDate?,
    val dvdReleaseDate: LocalDate?,
    val bluReleaseDate: LocalDate?,
    val kinopoiskId: Long?,
    val avgRating: Double?,
    val titlesTime: Int?,
    val trianglesBc: String?,
    val afishaId: Long?,
    val afishaUrl: String?,
    val boxOfficeWorldwide: Int?,
    val boxOfficeUsa: Int?,
    val boxOfficeLocal: Int?,
    val alias: String,
    val copyright: String?,
    val avgRatingVotes: Double?,
    // val releaseYear: Int?, Совпадает с worldReleaseDate:
    val contentLanguage: String?,
    val avgRatingImdb: Double?,
    val imdbVotes: Int?,
    val announceDate: LocalDateTime?,
    val platformLimitDate: LocalDateTime?,
    val lvrDate: LocalDateTime?,
    val promoText: String?,
    val unf: Boolean?,
    val freePreviewPeriod: Int?,
    val titleZh: String?,
    val titleEn: String?,
    val itunesId: String?,
    val itunesCoverUrl: String?,
    val sticker: String?,
    val afishaRating: Double?,
    val afishaDescription: String?,
    val afishaDescriptionAuthor: String?,
    val afishaVerdict: String?,
    val sameAs: String?,
    val drmFreePreviewPeriod: Int?,
    val nameEn: String?,
    val imdbId: String?,
    val displayNameEnc: String?,
    val originalNameEnc: String?,
    val descriptionEnc: String?,
    val shortDescriptionEnc: String?,
    val copyrightEnc: String?,
    val fadeColor: String?,
    val seo_metaTitle:String?,
    val seo_metaKeywords: String?,
    val seo_metaDescription: String?,
    val seo_description: String?,
    //  val seo: Map<String, Any>,

    @Relationship(type = "CONNECTED_WITH", direction = Relationship.Direction.OUTGOING)
    val series: Set<Series>,

    @Relationship(type = "RECOMMENDED_BY", direction = Relationship.Direction.OUTGOING)
    val seriesRecommended: Set<Series>,


    @Relationship(type = "CONNECTED_WITH", direction = Relationship.Direction.OUTGOING)
    val movieConnected: Set<Movie>,

    @Relationship(type = "RECOMMENDED_BY", direction = Relationship.Direction.OUTGOING)
    val movieRecommended: Set<Movie>,

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