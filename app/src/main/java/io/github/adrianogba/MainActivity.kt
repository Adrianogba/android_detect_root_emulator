package io.github.adrianogba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewIsEmulator = findViewById<TextView>(R.id.tv_is_emulator)
        textViewIsEmulator.text =
            if (RestrictionUtils().verifyIfRunningInEmulator()) "This an emulator"
            else "This not an emulator"

        val textViewHasRoot = findViewById<TextView>(R.id.tv_has_root)
        textViewHasRoot.text =
            if (RestrictionUtils().verifyRootAccess()) "This device has root enabled"
            else "This device do not have root"
    }
}