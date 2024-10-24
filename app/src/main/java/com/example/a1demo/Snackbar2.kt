package com.example.a1demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.a1demo.College
import com.example.a1demo.R
import com.google.android.material.snackbar.Snackbar

class Snackbar2 : AppCompatActivity() {


    private val images = arrayOf(
        R.drawable.img_9,
        R.drawable.img_10,
        R.drawable.img_11,
        R.drawable.img_12,
        R.drawable.img_13,
        R.drawable.img_14,
        R.drawable.img_15,
        R.drawable.img_16,
        R.drawable.img_17
    )

    private val texts = arrayOf(
        "CSE Department",
        "ECE Department",
        "Mechanical Engineering Department",
        "Architecture Department",
        "Agriculture Department",
        "Law Department",
        "Business Department",
        "Pharmacy Department",
        "Education Department"
    )

    private val details = arrayOf(
        "The School of Computer Science and Engineering offers a comprehensive curriculum designed to equip students with essential skills in software development, systems analysis, and data management. Students engage in hands-on projects that focus on real-world applications, preparing them for careers in technology and innovation. Research opportunities in artificial intelligence, machine learning, and cybersecurity further enhance the educational experience.",
        "The School of Electronics and Communication Engineering focuses on the study of modern communication systems, signal processing, and electronics. The curriculum includes hands-on lab work and projects that allow students to design and develop electronic circuits, communication systems, and embedded systems. Industry partnerships provide students with internship opportunities that enrich their understanding of real-world applications.",
        "The School of Mechanical Engineering provides a thorough education in mechanics, thermodynamics, and manufacturing processes. Students engage in design and analysis projects, utilizing advanced software tools for simulation and modeling. The program emphasizes sustainable practices in engineering design, preparing graduates to tackle global challenges in energy and materials.",
        "The School of Architecture emphasizes innovative design, sustainable practices, and the integration of technology into the built environment. Students are trained in architectural theory, design principles, and urban planning. Projects often involve collaboration with local communities, allowing students to create functional and aesthetically pleasing spaces that respond to human needs and environmental considerations.",
        "The School of Agriculture focuses on sustainable farming practices, agricultural technology, and food production. The curriculum covers crop science, soil management, and agricultural economics. Students engage in fieldwork and research projects, learning how to address challenges related to food security and environmental sustainability in agriculture.",
        "The School of Law prepares students for legal practice through a rigorous curriculum that includes courses in constitutional law, contract law, and ethics. Students participate in moot court competitions, legal clinics, and internships that provide practical experience. The program emphasizes critical thinking, advocacy, and a commitment to social justice.",
        "The School of Business offers programs in finance, marketing, management, and entrepreneurship. Students develop analytical and leadership skills through case studies, group projects, and internships. The school emphasizes innovation and ethical decision-making, preparing graduates to excel in diverse business environments.",
        "The School of Pharmacy trains students in pharmaceutical sciences, preparing them for careers in healthcare, research, and regulatory affairs. The curriculum covers drug development, clinical pharmacy, and patient care. Students gain practical experience through internships and community outreach programs, emphasizing the importance of patient-centered care.",
        "The School of Education focuses on pedagogical techniques, curriculum development, and educational psychology. The program prepares future educators to address diverse learning needs and foster inclusive classroom environments. Students engage in practical teaching experiences and are encouraged to contribute to educational research and policy development."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar2)

        findViewById<ImageButton>(R.id.CSE).setOnClickListener { view ->
            showSnackbar(view, 0)
        }

        findViewById<ImageButton>(R.id.ECE).setOnClickListener { view ->
            showSnackbar(view, 1)
        }

        findViewById<ImageButton>(R.id.ME).setOnClickListener { view ->
            showSnackbar(view, 2)
        }

        findViewById<ImageButton>(R.id.ARCH).setOnClickListener { view ->
            showSnackbar(view, 3)
        }

        findViewById<ImageButton>(R.id.AGRI).setOnClickListener { view ->
            showSnackbar(view, 4)
        }

        findViewById<ImageButton>(R.id.LAW).setOnClickListener { view ->
            showSnackbar(view, 5)
        }

        findViewById<ImageButton>(R.id.BUS).setOnClickListener { view ->
            showSnackbar(view, 6)
        }

        findViewById<ImageButton>(R.id.PHARMA).setOnClickListener { view ->
            showSnackbar(view, 7)
        }

        findViewById<ImageButton>(R.id.EDU).setOnClickListener { view ->
            showSnackbar(view, 8)
        }
    }

    private fun showSnackbar(view: View, index: Int) {
        val departmentName = texts[index]
        Snackbar.make(view, "Welcome to $departmentName!", Snackbar.LENGTH_LONG)
            .setAction("Learn More") {
                navigateToDetailActivity(index) // Navigate to the detail activity
            }.show()
    }

    private fun navigateToDetailActivity(index: Int) {
        val intent = Intent(this, College::class.java).apply {
            putExtra("imageResId", images[index])
            putExtra("text", texts[index])
            putExtra("detail", details[index])
        }
        startActivity(intent)
    }

}