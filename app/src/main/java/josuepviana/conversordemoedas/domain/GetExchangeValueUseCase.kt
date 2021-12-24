package josuepviana.conversordemoedas.domain

import josuepviana.conversordemoedas.core.UseCase
import josuepviana.conversordemoedas.data.model.ExchangeResponseValue
import josuepviana.conversordemoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}