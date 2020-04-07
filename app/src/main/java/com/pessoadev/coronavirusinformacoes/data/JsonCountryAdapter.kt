package com.pessoadev.coronavirusinformacoes.data

import com.google.gson.*
import com.pessoadev.coronavirusinformacoes.model.Country
import com.pessoadev.coronavirusinformacoes.model.Status
import java.lang.reflect.Type


class JsonCountryAdapter : JsonDeserializer<List<Country>> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): MutableList<Country> {
        val countriesList = mutableListOf<Country>()
        val entries: Set<Map.Entry<String, JsonElement>> = json.asJsonObject.entrySet()

        for (data in entries) {
            val country = data.key
            val status = data.value
            val statusList = mutableListOf<Status>()

            status.asJsonArray.forEach {
                statusList.add(
                    Status(
                        it.asJsonObject.get("date").asString,
                        it.asJsonObject.get("confirmed").asInt,
                        it.asJsonObject.get("deaths").asInt,
                        it.asJsonObject.get("recovered").asInt
                    )
                )
            }
            countriesList.add(Country(country, statusList))
        }
        return countriesList
    }
}