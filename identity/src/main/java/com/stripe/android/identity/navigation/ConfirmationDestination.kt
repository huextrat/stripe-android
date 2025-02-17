package com.stripe.android.identity.navigation

internal object ConfirmationDestination : IdentityTopLevelDestination() {
    private const val CONFIRMATION = "Confirmation"
    val ROUTE = object : DestinationRoute() {
        override val routeBase = CONFIRMATION
    }

    override val destinationRoute = ROUTE
    override val routeWithArgs = destinationRoute.route
}
