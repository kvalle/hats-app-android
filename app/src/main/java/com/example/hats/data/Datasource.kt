package com.example.hats.data

import com.example.hats.R
import com.example.hats.model.HatType

class Datasource {

    fun loadHats(): List<HatType> {
        return listOf(
            HatType(R.string.fedora, R.string.fedora_description, R.string.fedora_image_attribution, R.drawable.fedora),
            HatType(R.string.porkpie, R.string.porkpie_description, R.string.porkpie_image_attribution, R.drawable.porkpie),
            HatType(R.string.bowler, R.string.bowler_description, R.string.bowler_image_attribution, R.drawable.bowler),
            HatType(R.string.bucket_hat, R.string.bucket_hat_description, R.string.bucket_hat_image_attribution, R.drawable.bucket_hat),
            HatType(R.string.top_hat, R.string.top_hat_description, R.string.top_hat_image_attribution, R.drawable.tophat),
            HatType(R.string.fez, R.string.fez_description, R.string.fez_image_attribution, R.drawable.fez)
        )
    }

}