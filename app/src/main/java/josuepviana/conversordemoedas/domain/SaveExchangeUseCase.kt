package josuepviana.conversordemoedas.domain

import josuepviana.conversordemoedas.core.UseCase
import josuepviana.conversordemoedas.data.model.ExchangeResponseValue
import josuepviana.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}