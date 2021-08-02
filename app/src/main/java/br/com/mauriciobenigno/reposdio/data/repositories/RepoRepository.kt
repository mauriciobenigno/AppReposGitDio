package br.com.mauriciobenigno.reposdio.data.repositories

import br.com.mauriciobenigno.reposdio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}