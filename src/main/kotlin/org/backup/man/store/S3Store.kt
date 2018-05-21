package org.backup.man.store

import io.minio.MinioClient

class S3Store(val endpoint: String, val bucket: String, val key: String, val secret: String) : Store {

    val client = MinioClient(endpoint, key, secret)

    fun list() {
        val listBuckets = client.listBuckets()
        val i = 1
    }
}
