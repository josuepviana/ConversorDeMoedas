package josuepviana.conversordemoedas.domain

import josuepviana.conversordemoedas.core.UseCase
import josuepviana.conversordemoedas.data.model.ExchangeResponseValue
import josuepviana.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}