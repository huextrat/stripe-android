package com.stripe.android.paymentsheet.state

import com.stripe.android.link.LinkPaymentLauncher
import com.stripe.android.link.model.AccountStatus
import kotlinx.coroutines.flow.first
import javax.inject.Inject

internal fun interface LinkAccountStatusProvider {
    suspend operator fun invoke(configuration: LinkPaymentLauncher.Configuration): AccountStatus
}

internal class DefaultLinkAccountStatusProvider @Inject constructor(
    private val linkLauncher: LinkPaymentLauncher,
) : LinkAccountStatusProvider {

    override suspend fun invoke(configuration: LinkPaymentLauncher.Configuration): AccountStatus {
        return linkLauncher.getAccountStatusFlow(configuration).first()
    }
}
