package com.example.gunungpedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MountainInProvinceActivity extends AppCompatActivity implements InProvinsiAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mountain_in_province);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String provinsi = getIntent().getStringExtra("provinsi");
        TextView textView = findViewById(R.id.home);
        textView.setText(provinsi);
        RecyclerView recycleView = findViewById(R.id.listG);
        recycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<Map<String, String>> dataGunung = new ArrayList<>();

        if (provinsi != null) {
            // Gunung Jawab Barat
            if (provinsi.equals("Jawa Barat")) {
                addMountain(
                        dataGunung,
                        "Gunung Ciremai",
                        "Tinggi 3,078 m",
                        "Gunung Ciremai, dengan ketinggian 3.078 meter di atas permukaan laut (mdpl), merupakan gunung tertinggi di Jawa Barat. Terletak di perbatasan Kabupaten Kuningan dan Kabupaten Majalengka, gunung berapi ini memiliki kawah ganda dengan radius masing-masing 400 meter dan 600 meter. Kawasan Gunung Ciremai termasuk dalam Taman Nasional Gunung Ciremai (TNGC) yang memiliki luas sekitar 15.000 hektar. Selain menjadi tujuan favorit para pendaki, Gunung Ciremai juga memiliki nilai sejarah dan budaya yang penting bagi masyarakat setempat.",
                        "GunungCiremai.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Gede",
                        "Tinggi 2,958 m",
                        "Gunung Gede, dengan ketinggian 2.958 mdpl, merupakan bagian dari Taman Nasional Gunung Gede Pangrango yang mencakup wilayah Kabupaten Cianjur dan Sukabumi. Gunung ini terkenal dengan keanekaragaman hayati yang tinggi, termasuk berbagai spesies flora dan fauna endemik. Jalur pendakian yang populer, seperti Cibodas dan Gunung Putri, menawarkan pemandangan alam yang menakjubkan, termasuk alun-alun Suryakencana yang dipenuhi bunga edelweiss. Aktivitas vulkanik Gunung Gede masih terpantau, sehingga pendakian harus memperhatikan status gunung yang dikeluarkan oleh otoritas terkait.",
                        "GunungGede.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Pangrango",
                        "Tinggi 3,019 m",
                        "Gunung Pangrango, dengan ketinggian 3.019 mdpl, merupakan gunung tertinggi kedua di Jawa Barat setelah Gunung Ciremai. Terletak bersebelahan dengan Gunung Gede, keduanya membentuk kawasan Taman Nasional Gunung Gede Pangrango. Puncak Gunung Pangrango dikenal dengan nama Mandalawangi, yang menawarkan pemandangan alam yang indah dan padang edelweiss yang luas. Meskipun tidak seaktif Gunung Gede, pendakian ke Gunung Pangrango memerlukan persiapan fisik yang baik dan izin dari pihak taman nasional.",
                        "GunungPangrango.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Papandayan",
                        "Tinggi 2,665 m",
                        "Gunung Papandayan, dengan ketinggian 2.665 mdpl, terletak di Kecamatan Cisurupan, Kabupaten Garut. Gunung berapi ini terkenal dengan kawah belerang yang masih aktif dan pemandangan alam yang menakjubkan. Terdapat beberapa kawah yang dapat dikunjungi, seperti Kawah Mas, Kawah Baru, dan Kawah Nangklak. Selain itu, terdapat area hutan mati yang menjadi daya tarik bagi wisatawan dan fotografer. Meskipun jalur pendakian relatif ramah bagi pendaki pemula, tetap diperlukan kewaspadaan terhadap aktivitas vulkanik dan kondisi cuaca.",
                        "GunungPapandayan.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Tangkuban Perahu",
                        "Tinggi 2,084 m",
                        "Gunung Tangkuban Perahu, dengan ketinggian 2.084 mdpl, terletak di wilayah Lembang, Kabupaten Bandung Barat. Gunung ini memiliki bentuk yang unik dan legenda Sangkuriang yang melekat kuat dalam budaya Sunda. Terdapat beberapa kawah yang menjadi objek wisata, seperti Kawah Ratu, Kawah Domas, dan Kawah Upas. Meskipun merupakan destinasi wisata populer, Gunung Tangkuban Perahu masih aktif, sehingga pengunjung harus mematuhi peraturan dan memperhatikan status aktivitas gunung yang dikeluarkan oleh otoritas setempat.",
                        "GunungTangkubanPerahu.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Burangrang",
                        "Tinggi 2,050 m",
                        "Gunung Burangrang, dengan ketinggian 2.050 mdpl, merupakan gunung api yang sudah tidak aktif dan terletak di Kabupaten Bandung Barat. Gunung ini menawarkan pemandangan alam yang hijau dan udara yang segar, menjadikannya destinasi favorit bagi pendaki dan pecinta alam. Jalur pendakian yang umum dilalui adalah melalui Desa Kertawangi atau Desa Cisarua. Meskipun tidak setinggi gunung-gunung lain di Jawa Barat, pendakian ke puncak Gunung Burangrang tetap menantang dan memerlukan persiapan yang matang.",
                        "GunungBurangrang.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Malabar",
                        "Tinggi 2,343 m",
                        "Gunung Malabar, dengan ketinggian 2.343 mdpl, terletak di Kabupaten Bandung. Gunung ini dikenal sebagai destinasi wisata alam dengan panorama pegunungan yang indah dan udara yang sejuk. Selain itu, di kawasan Gunung Malabar terdapat peninggalan sejarah berupa stasiun radio peninggalan Belanda yang dikenal dengan nama Radio Malabar. Jalur pendakian yang populer adalah melalui Pangalengan, yang menawarkan pemandangan perkebunan teh dan hutan pinus yang memanjakan mata.",
                        "GunungMalabar.jpg"
                );
                // Gunung Jawa Tengah
            } else if (provinsi.equals("Jawa Tengah")) {
                addMountain(
                        dataGunung,
                        "Gunung Merbabu",
                        "Tinggi 3,145 m",
                        "Gunung Merbabu, dengan ketinggian 3.145 mdpl, adalah salah satu gunung favorit di Jawa Tengah bagi para pendaki. Gunung ini terkenal dengan jalur pendakian yang cantik, seperti jalur Selo dan Wekas, yang menawarkan pemandangan padang savana dan bunga edelweiss. Dari puncak Gunung Merbabu, pendaki dapat menikmati pemandangan spektakuler gunung-gunung di sekitarnya, seperti Merapi, Sindoro, dan Sumbing. Gunung ini juga merupakan kawasan konservasi yang memiliki kekayaan flora dan fauna endemik.",
                        "GunungMerbabu.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Merapi",
                        "Tinggi 2,930 m",
                        "Gunung Merapi, dengan ketinggian 2.930 mdpl, adalah salah satu gunung berapi paling aktif di dunia. Terletak di perbatasan Jawa Tengah dan Yogyakarta, gunung ini memiliki sejarah erupsi yang signifikan dan menjadi pusat penelitian vulkanologi. Meski berstatus aktif, Gunung Merapi tetap menarik minat wisatawan dan pendaki karena panorama alamnya yang menawan, terutama saat matahari terbit dari puncaknya. Aktivitas pendakian harus dilakukan dengan memperhatikan kondisi gunung yang dipantau oleh Balai Penyelidikan dan Pengembangan Teknologi Kebencanaan Geologi (BPPTKG).",
                        "GunungMerapi.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Slamet",
                        "Tinggi 3,428 m",
                        "Gunung Slamet, dengan ketinggian 3.428 mdpl, adalah gunung tertinggi di Jawa Tengah dan gunung tertinggi kedua di Pulau Jawa setelah Semeru. Gunung ini menawarkan tantangan pendakian yang cukup berat namun sebanding dengan pemandangan indah yang ditawarkan. Jalur pendakian yang populer adalah melalui Bambangan di Purbalingga. Gunung Slamet juga merupakan sumber kehidupan bagi masyarakat sekitarnya, dengan aliran sungai yang mengairi lahan pertanian.",
                        "GunungSlamet.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Sindoro",
                        "Tinggi 3,136 m",
                        "Gunung Sindoro, dengan ketinggian 3.136 mdpl, adalah salah satu gunung kembar di Jawa Tengah bersama Gunung Sumbing. Gunung ini terkenal dengan pemandangan sunrise yang memukau dari puncaknya, yang sering dijuluki sebagai 'Negeri di Atas Awan.' Jalur pendakian seperti Kledung dan Sigedang menawarkan pengalaman mendaki yang menantang tetapi penuh keindahan. Gunung Sindoro juga memiliki keunikan berupa kawah aktif yang masih mengeluarkan asap belerang.",
                        "GunungSindoro.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Sumbing",
                        "Tinggi 3,371 m",
                        "Gunung Sumbing, dengan ketinggian 3.371 mdpl, adalah gunung berapi tertinggi ketiga di Pulau Jawa setelah Semeru dan Slamet. Gunung ini dikenal dengan jalur pendakiannya yang menantang, seperti jalur Garung dan Cepit Parakan. Dari puncaknya, pendaki dapat menikmati pemandangan Gunung Sindoro, Merapi, dan Merbabu. Gunung Sumbing juga memiliki keanekaragaman flora dan fauna, termasuk padang edelweiss yang menjadi daya tarik tersendiri.",
                        "GunungSumbing.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Ungaran",
                        "Tinggi 2,050 m",
                        "Gunung Ungaran, dengan ketinggian 2.050 mdpl, terletak di Kabupaten Semarang, Jawa Tengah. Gunung ini merupakan destinasi pendakian yang ramah bagi pemula dengan jalur yang relatif mudah seperti jalur Gedongsongo dan Promasan. Dari puncaknya, pendaki dapat menikmati pemandangan kota Semarang, Rawa Pening, dan Gunung Merbabu. Gunung Ungaran juga memiliki objek wisata sejarah dan budaya seperti candi Gedongsongo dan kebun teh Promasan.",
                        "GunungUngaran.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Prau",
                        "Tinggi 2,565 m",
                        "Gunung Prau, dengan ketinggian 2.565 mdpl, adalah salah satu destinasi pendakian paling populer di kawasan Dieng, Jawa Tengah. Gunung ini terkenal dengan pemandangan sunrise yang disebut sebagai salah satu yang terbaik di Indonesia. Dikenal dengan 'Bukit Teletubbies,' Gunung Prau menawarkan padang rumput luas yang dipenuhi bunga dan pemandangan gunung-gunung di sekitarnya seperti Sindoro, Sumbing, dan Merbabu. Jalur pendakian seperti Dieng, Patakbanteng, dan Kalilembu menjadi favorit para pendaki.",
                        "GunungPrau.jpg"
                );
                // Gunung Jawa Timur
            } else if (provinsi.equals("Jawa Timur")) {
                addMountain(
                        dataGunung,
                        "Gunung Semeru",
                        "Tinggi 3,676 m",
                        "Gunung Semeru, dengan ketinggian 3.676 mdpl, adalah gunung tertinggi di Pulau Jawa dan sering disebut sebagai 'atap Jawa.' Terletak di Jawa Timur, gunung ini merupakan bagian dari Taman Nasional Bromo Tengger Semeru. Jalur pendakian menuju puncaknya, Mahameru, menawarkan tantangan berat namun pemandangan luar biasa, termasuk danau Ranu Kumbolo yang indah. Gunung ini memiliki aktivitas vulkanik yang terus dipantau, dengan erupsi kecil yang sering terjadi di kawah Jonggring Saloka.",
                        "GunungSemeru.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Bromo",
                        "Tinggi 2,329 m",
                        "Gunung Bromo, dengan ketinggian 2.329 mdpl, adalah salah satu destinasi wisata paling ikonik di Indonesia. Terletak di kawasan Taman Nasional Bromo Tengger Semeru, gunung ini dikelilingi hamparan pasir luas yang dikenal sebagai Lautan Pasir. Selain pemandangan kawah aktif, Gunung Bromo menawarkan pengalaman sunrise spektakuler di Penanjakan, yang menjadi daya tarik utama bagi wisatawan lokal maupun mancanegara.",
                        "GunungBromo.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Arjuno",
                        "Tinggi 3,339 m",
                        "Gunung Arjuno, dengan ketinggian 3.339 mdpl, terletak di Jawa Timur dan terkenal dengan keindahan jalur pendakiannya yang asri. Gunung ini memiliki vegetasi yang beragam, termasuk hutan tropis, padang rumput, dan kebun teh. Jalur pendakian populer seperti Tretes dan Lawang menawarkan pengalaman mendaki yang menenangkan. Gunung Arjuno juga memiliki nilai sejarah, dengan situs peninggalan budaya berupa candi dan arca kuno di sekitarnya.",
                        "GunungArjuno.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Welirang",
                        "Tinggi 3,156 m",
                        "Gunung Welirang, dengan ketinggian 3.156 mdpl, adalah gunung berapi aktif yang terletak di Jawa Timur. Gunung ini terkenal dengan aktivitas vulkaniknya, terutama penambangan belerang tradisional yang masih berlangsung hingga kini. Pendakian ke puncaknya menawarkan pemandangan kawah aktif dan hamparan hutan pinus. Gunung ini sering didaki bersamaan dengan Gunung Arjuno karena lokasinya yang berdekatan.",
                        "GunungWelirang.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Raung",
                        "Tinggi 3,344 m",
                        "Gunung Raung, dengan ketinggian 3.344 mdpl, memiliki salah satu kaldera terbesar di Indonesia. Gunung ini terletak di Banyuwangi, Jawa Timur, dan dikenal sebagai salah satu gunung dengan jalur pendakian paling menantang di Pulau Jawa. Kawahnya yang luas dan dalam menciptakan suara gemuruh khas yang sering terdengar dari kejauhan. Pemandangan dari puncaknya meliputi jajaran pegunungan lain di sekitarnya, termasuk Gunung Ijen dan Gunung Merapi Jawa Timur.",
                        "GunungRaung.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Ijen",
                        "Tinggi 2,769 m",
                        "Gunung Ijen, dengan ketinggian 2.769 mdpl, adalah salah satu gunung berapi terkenal di Indonesia yang terletak di Banyuwangi, Jawa Timur. Gunung ini dikenal dengan fenomena alam 'blue fire' atau api biru, yang hanya bisa ditemukan di beberapa tempat di dunia. Selain itu, Gunung Ijen memiliki danau kawah asam terbesar di dunia yang memukau dengan warna hijau toska. Pendakian ke kawah Ijen juga memberikan kesempatan untuk menyaksikan para penambang belerang tradisional yang bekerja di lereng gunung.",
                        "GunungIjen.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Kawi",
                        "Tinggi 2,551 m",
                        "Gunung Kawi, dengan ketinggian 2.551 mdpl, terletak di Kabupaten Malang, Jawa Timur. Gunung ini tidak hanya menjadi destinasi pendakian, tetapi juga pusat wisata spiritual yang populer. Banyak pengunjung yang datang untuk melakukan ritual atau ziarah di tempat-tempat keramat di sekitar gunung. Selain itu, Gunung Kawi menawarkan udara segar dan pemandangan alam yang indah, menjadikannya tempat yang cocok untuk relaksasi dan meditasi.",
                        "GunungKawi.jpg"
                );
            // Gunung Kalimantan Barat
            } else if (provinsi.equals("Kalimantan Barat")) {
                addMountain(
                        dataGunung,
                        "Gunung Poteng",
                        "Tinggi 1,220 m",
                        "Gunung Poteng, dengan ketinggian 1.220 mdpl, terletak di kawasan Taman Nasional Gunung Palung, Kalimantan Barat. Meskipun relatif kecil dibandingkan gunung lain, Gunung Poteng menawarkan keanekaragaman hayati yang luar biasa, termasuk flora dan fauna endemik. Gunung ini cocok untuk pendakian santai dan eksplorasi hutan tropis, memberikan pengalaman alam yang menenangkan.",
                        "GunungPoteng.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Saran",
                        "Tinggi 1,000 m",
                        "Gunung Saran, dengan ketinggian 1.000 mdpl, adalah destinasi trekking yang terletak di Kalimantan Barat. Gunung ini menawarkan jalur pendakian yang menantang namun menyenangkan, dengan pemandangan hutan lebat dan udara segar. Gunung Saran juga menjadi rumah bagi beragam spesies burung, menjadikannya tempat menarik bagi pecinta alam dan fotografi satwa liar.",
                        "GunungSaran.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Niut",
                        "Tinggi 1,701 m",
                        "Gunung Niut, dengan ketinggian 1.701 mdpl, adalah gunung tertinggi di Kalimantan Barat. Terletak di perbatasan Indonesia-Malaysia, gunung ini memiliki vegetasi yang lebat dan menjadi bagian dari Kawasan Ekosistem Leuser. Pendakian ke Gunung Niut menawarkan pemandangan yang luar biasa dan pengalaman eksplorasi alam yang jarang ditemukan di tempat lain.",
                        "GunungNiut.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Kelam",
                        "Tinggi 1,002 m",
                        "Gunung Kelam, dengan ketinggian 1.002 mdpl, adalah gunung batuan granit terbesar di dunia. Terletak di Sintang, Kalimantan Barat, gunung ini memiliki dinding batu yang curam dan menjadi tantangan tersendiri bagi pendaki. Selain pendakian, pengunjung juga dapat menikmati pemandangan alam sekitar yang memukau serta flora unik, termasuk kantong semar yang tumbuh di lereng gunung.",
                        "GunungKelam.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Bawang",
                        "Tinggi 1,650 m",
                        "Gunung Bawang, dengan ketinggian 1.650 mdpl, terletak di Kabupaten Bengkayang, Kalimantan Barat. Gunung ini dikenal dengan pemandangan pegunungan yang asri dan udara yang segar. Jalur pendakian di Gunung Bawang cukup ramah untuk pendaki pemula, menawarkan pengalaman mendaki yang menyenangkan dengan hutan hijau yang lebat dan aliran sungai kecil di sepanjang perjalanan.",
                        "GunungBawang.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Lawit",
                        "Tinggi 1,767 m",
                        "Gunung Lawit, dengan ketinggian 1.767 mdpl, adalah salah satu gunung yang menyimpan keindahan alam khas Kalimantan Barat. Terletak di Kabupaten Kapuas Hulu, gunung ini menawarkan pemandangan hutan tropis yang masih alami dan satwa liar yang beragam. Gunung Lawit juga menjadi tujuan favorit bagi pecinta alam yang ingin merasakan pengalaman pendakian yang tenang dan jauh dari keramaian.",
                        "GunungLawit.jpg"
                );

                addMountain(
                        dataGunung,
                        "Gunung Sayan",
                        "Tinggi 1,100 m",
                        "Gunung Sayan, dengan ketinggian 1.100 mdpl, adalah destinasi hiking menarik di Kalimantan Barat. Gunung ini menawarkan jalur pendakian yang cocok untuk pendaki pemula maupun berpengalaman. Sepanjang jalur, pengunjung dapat menikmati pemandangan alam yang indah, termasuk hutan tropis yang rimbun dan aliran sungai yang jernih. Gunung Sayan menjadi pilihan ideal untuk mereka yang mencari pengalaman mendaki yang menyegarkan.",
                        "GunungSayan.jpg"
                );
            // Gunung Kalimantan Selatan
            } else if (provinsi.equals("Kalimantan Selatan")) {
                addMountain(dataGunung,
                        "Gunung Besar",
                        "Tinggi 1,901 m",
                        "Merupakan puncak tertinggi di Pegunungan Meratus dan Kalimantan Selatan, dengan ketinggian 1.901 meter di atas permukaan laut. Gunung ini menawarkan pemandangan hamparan awan yang menawan dari puncaknya.",
                        "GunungBesar.jpg");

                addMountain(dataGunung,
                        "Gunung Halau-Halau",
                        "Tinggi 1,901 m",
                        "Juga dikenal sebagai Gunung Besar, terletak di perbatasan tiga kabupaten di Kalimantan Selatan. Selain menjadi destinasi favorit pendaki, gunung ini memiliki pohon kariwaya yang dikeramatkan oleh masyarakat setempat.",
                        "GunungHalauHalau.jpg");

                addMountain(dataGunung,
                        "Gunung Meratus",
                        "Tinggi 1,100 m",
                        "Bagian dari rangkaian Pegunungan Meratus, gunung ini menawarkan pemandangan khas pegunungan dengan hutan tropis yang masih asri.",
                        "GunungMeratus.jpg");

                addMountain(dataGunung,
                        "Gunung Besar Kandangan",
                        "Tinggi 1,200 m",
                        "Terletak di daerah Kandangan, gunung ini dikenal dengan hutan tropis yang masih asri dan menjadi destinasi wisata pegunungan alami.",
                        "GunungBesarKandangan.jpg");

                addMountain(dataGunung,
                        "Gunung Batu Titi",
                        "Tinggi 800 m",
                        "Dikenal sebagai gunung batu unik di Kalimantan Selatan, menawarkan pemandangan yang menakjubkan bagi para pendaki.",
                        "GunungBatuTiti.jpg");

                addMountain(dataGunung,
                        "Gunung Liangbangkai",
                        "Tinggi 1,200 m",
                        "Merupakan destinasi wisata pegunungan alami yang menawarkan pemandangan indah dan udara segar.",
                        "GunungLiangbangkai.jpg");

                addMountain(dataGunung,
                        "Gunung Bawakan",
                        "Tinggi 1,050 m",
                        "Dikenal dengan hutan hujan tropisnya yang lebat, gunung ini menjadi tempat yang menarik bagi para pendaki dan pecinta alam.",
                        "GunungBawakan.jpg");
            }
        }
        InProvinsiAdapter adapter = new InProvinsiAdapter(dataGunung, this);
        recycleView.setAdapter(adapter);
    }

    private void addMountain(List<Map<String, String>> dataGunung, String nama, String tinggi, String deskripsi, String img) {
        Map<String, String> gunung = new HashMap<>();
        gunung.put("img", img);
        gunung.put("nama", nama);
        gunung.put("tinggi", tinggi);
        gunung.put("deskripsi", deskripsi);
        dataGunung.add(gunung);
    }

    @Override
    public void onItemClick(Map<String, String> d) {
        Intent intent = new Intent(MountainInProvinceActivity.this, DetailGunungActivity.class);
        intent.putExtra("img", d.get("img"));
        intent.putExtra("nama", d.get("nama"));
        intent.putExtra("tinggi", d.get("tinggi"));
        intent.putExtra("deskripsi", d.get("deskripsi"));
        startActivity(intent);
    }
    public void profile (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void aboutus (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, AboutUsActivity.class);
        startActivity(intent);
    }
    public void home (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, DashboardActivity.class);
        startActivity(intent);
    }
    public void help (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, Help.class);
        startActivity(intent);
    }
    public void favorite (View view) {
        Intent intent = new Intent(MountainInProvinceActivity.this, FavoriteActivity.class);
        startActivity(intent);
    }
}
