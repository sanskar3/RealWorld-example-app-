package io.resalworld.api

import com.sanskar.api.ConduitClient
import junit.framework.TestCase.assertNotNull
import kotlinx.coroutines.runBlocking
import org.junit.Test

class ConduitClientTest {

    private val conduitClient = ConduitClient()

    @Test
    fun getArticles(){
        runBlocking {
            val articles = conduitClient.api.getArticles()
            assertNotNull(articles.body()?.articles)
        }
    }

}