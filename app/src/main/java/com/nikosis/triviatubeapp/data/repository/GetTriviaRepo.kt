package com.nikosis.triviatubeapp.data.repository

import com.nikosis.triviatubeapp.common.Resource
import com.nikosis.triviatubeapp.data.dto.toTriviaDrm
import com.nikosis.triviatubeapp.data.model.TriviaDrm
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.util.concurrent.Flow
import javax.inject.Inject

class GetTriviaRepo @Inject constructor(
    private val repository: TriviaRepo
) {
    operator fun invoke(): Flow<Resource<TriviaDrm>> = flow {
        try {

            emit(Resource.Loading<TriviaDrm>())
            val triviaGo = repository.getTriviaRepo().toTriviaDrm()
            emit(Resource.Success<TriviaDrm>(triviaGo))

        } catch (e: HttpException) {

            emit(
                Resource.Error<TriviaDrm>(
                    e.localizedMessage ?: "Could Not Reach Server. Check Internet Connection"
                )
            )

        } catch (e: IOException) {

            emit(Resource.Error<TriviaDrm>("Something went wrong! Unexpected error occurred"))
        }
    }
}