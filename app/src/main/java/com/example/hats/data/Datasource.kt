package com.example.hats.data

import com.example.hats.model.HatType

class Datasource {

    fun loadHats(): List<HatType> {
        return listOf(
            HatType(
                "Fedora",
                "A soft felt hat with a medium brim and lengthwise crease in the crown."
            ),
            HatType("Porkpie", "Felt hat with low flat crown and narrow brim."),
            HatType(
                "Bowler",
                "A hard felt hat with a rounded crown created in 1850 by Lock's of St James's, the hatters to Thomas Coke, 2nd Earl of Leicester, for his servants. More commonly known as a Derby in the United States. "
            ),
            HatType("Bucket hat", "A soft cotton hat with a wide, downwards-sloping brim."),
            HatType(
                "Top hat",
                "Also known as a beaver hat, a magician's hat, or, in the case of the tallest examples, a stovepipe (or pipestove) hat. A tall, flat-crowned, cylindrical hat worn by men in the 19th and early 20th centuries, now worn only with morning dress or evening dress. Cartoon characters Uncle Sam and Mr. Monopoly are often depicted wearing such hats. Once made from felted beaver fur. "
            ),
            HatType(
                "Fez",
                "Red felt hat in the shape of a truncated cone, common to Arab-speaking countries."
            )
        )
    }

}