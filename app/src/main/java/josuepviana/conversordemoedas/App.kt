package josuepviana.conversordemoedas

import android.app.Application
import com.josuepviana.monetary.data.di.DataModules
import josuepviana.conversordemoedas.domain.di.DomainModule
import josuepviana.conversordemoedas.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}