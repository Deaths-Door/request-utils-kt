package com.deathsdoor.request_utils

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.*

expect val httpClientEngine : HttpClientEngine
