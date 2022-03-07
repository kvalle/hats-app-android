package com.example.hats.data

import com.example.hats.R
import com.example.hats.model.HatType

class Datasource {

    fun loadHats(): List<HatType> {
        return listOf(
            HatType(
                R.string.fedora,
                R.string.fedora_description,
                R.string.fedora_image_attribution,
                R.drawable.fedora_thumb
            ),
            HatType(
                R.string.bowler,
                R.string.bowler_description,
                R.string.bowler_image_attribution,
                R.drawable.bowler_thumb
            ),
            HatType(
                R.string.bucket_hat,
                R.string.bucket_hat_description,
                R.string.bucket_hat_image_attribution,
                R.drawable.bucket_hat_thumb
            ),
            HatType(
                R.string.top_hat,
                R.string.top_hat_description,
                R.string.top_hat_image_attribution,
                R.drawable.top_hat_thumb
            ),
            HatType(
                R.string.fez,
                R.string.fez_description,
                R.string.fez_image_attribution,
                R.drawable.fez_thumb
            ),
            HatType(
                R.string.taqiyah,
                R.string.taqiyah_description,
                R.string.taqiyah_image_attribution,
                R.drawable.taqiyah_thumb
            ),
            HatType(
                R.string.toque,
                R.string.toque_description,
                R.string.toque_image_attribution,
                R.drawable.toque_thumb
            )
        )
    }

}