package josuepviana.conversordemoedas.domain.di

import josuepviana.conversordemoedas.domain.GetExchangeValueUseCase
import josuepviana.conversordemoedas.domain.ListExchangeUseCase
import josuepviana.conversordemoedas.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}