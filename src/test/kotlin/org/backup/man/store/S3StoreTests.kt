package org.backup.man.store

import org.junit.Test


class S3StoreTests {

    val endpoint = "https://nyc3.digitaloceanspaces.com"
    val key = "TWZHHADA6TFK73QBXGQN"
    val secret = "SvORqElA7TBtWHCZP0wU7WX+O7tC6sfcDfcSEejeIaA"

    val s3 = S3Store(endpoint, "me-team-backups", key, secret)

    @Test
    fun s3ListBuckets() {
        s3.list()
    }
}
