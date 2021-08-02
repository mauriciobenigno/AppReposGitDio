package br.com.mauriciobenigno.reposdio.domain

import br.com.mauriciobenigno.reposdio.core.UseCase
import br.com.mauriciobenigno.reposdio.data.model.Repo
import br.com.mauriciobenigno.reposdio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}