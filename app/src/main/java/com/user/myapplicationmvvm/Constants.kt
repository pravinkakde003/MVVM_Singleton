package com.user.myapplicationmvvm

object Constants {
    //    https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=10
    //    https://cat-fact.herokuapp.com/facts?animal_type=cat,horse
    const val BASE_URL = "https://cat-fact.herokuapp.com/"
    const val ANIMAL_TYPE = "animal_type"
    const val ANIMAL_TYPE_CAT = "cat"
    const val ANIMAL_TYPE_HORSE = "horse"
    const val FACTS = "facts"
    const val COMMA_SEPARATOR = ","
    const val QUESTION_MARK_SEPARATOR = "?"
    const val EQUAL_SEPARATOR = "="

    const val API_POINT = FACTS + QUESTION_MARK_SEPARATOR
}
