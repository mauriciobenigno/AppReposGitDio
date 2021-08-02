package br.com.mauriciobenigno.reposdio

import android.app.Application
import br.com.mauriciobenigno.reposdio.data.di.DataModule
import br.com.mauriciobenigno.reposdio.domain.di.DomainModule
import br.com.mauriciobenigno.reposdio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}