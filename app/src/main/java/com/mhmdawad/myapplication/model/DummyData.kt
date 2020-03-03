package com.mhmdawad.myapplication.model

import com.mhmdawad.myapplication.R


class DummyData {

    companion object {
        var instructor = arrayOf(
            Instructor("Mohamed Hamdy", "Android Developer", R.drawable.img_hamdy),
            Instructor("Sherif El-deep", "IOS Developer", R.drawable.img_sherif),
            Instructor("Elsaeed", "Back-End Developer", R.drawable.img_elsaeed),
            Instructor("Abbas Abbas", "Developer", R.drawable.img_abbas)
        )

        var sessions = arrayOf(
            Sessions("Android Session", instructor[0], intArrayOf(R.drawable.img_android)),
            Sessions("IOS Session", instructor[1], intArrayOf(R.drawable.img_ios)),
            Sessions("Back-End Session", instructor[2], intArrayOf(R.drawable.img_backend)),
            Sessions("Session", instructor[3], intArrayOf(R.drawable.chaos))
        )


        var events = arrayOf(
            Event(sessions, "Techy CAT-Shops", "24-2-2020", R.drawable.img_header_cide),
            Event(sessions, "CAT SCOPE", "24-2-2020", R.drawable.img_cat_scope),
            Event(sessions, "Techy CAT-Shops", "24-2-2020", R.drawable.img_header_cide)
        )
    }

}

