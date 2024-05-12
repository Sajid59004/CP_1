import android.os.Bundle
import android.widget.TextClock
import androidx.appcompat.app.AppCompatActivity
import com.example.cp_1.R
import java.util.TimeZone

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

        // Find the TextClock by its ID
        val textClockDate = findViewById<TextClock>(R.id.textClockDate)

        // Update the TextClock to display the current date
        textClockDate.format12Hour = "MM/dd/yyyy"
        textClockDate.format24Hour = "MM/dd/yyyy"
        textClockDate.timeZone = TimeZone.getDefault().id
    }
}
