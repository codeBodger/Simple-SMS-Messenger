package com.simplemobiletools.smsmessenger.activities

import android.os.Bundle
import com.simplemobiletools.commons.extensions.updateTextColors
import com.simplemobiletools.smsmessenger.R
import kotlinx.android.synthetic.main.activity_list_management.*

class ListManagementActivity : SimpleActivity() {
    private var conversationLists = ArrayList<Liste>()

    override fun onCreate(savedInstanceState: Bundle?) {
        isMaterialActivity = true // I have no idea what this is about, but I think I want it to be true...
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_management)
        title = getString(R.string.list_management_title)
        updateTextColors(list_nested_scrollview)

        //
    }

}

class Liste {
    private var variety = "To Do"
    private var artikel = ArrayList<ListArtikel>()
    private var listNumber = -1
}

class ListArtikel {
    private var checked = false
    private var artikelName = ""
}
