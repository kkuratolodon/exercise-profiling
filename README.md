# Module 5

## Refleksi
Hasil JMeter GUI sebelum profiling:<br>
![/all-studentendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217116179240456264/image.png?ex=6602dac6&is=65f065c6&hm=19333cf6321e28a13ed90e11aeec2b19514e8961460d9027aeb94a4e3cae0247&=&format=webp&quality=lossless&width=1662&height=882)
![/all-student-nameendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217116288913117274/image.png?ex=6602dae0&is=65f065e0&hm=43760ae5e6aef18ec4ac6b0f613590fc6e6cf557f2a66fea2d560d959463773e&=&format=webp&quality=lossless&width=1667&height=880)
![/highest-gpaendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217116388234231850/image.png?ex=6602daf7&is=65f065f7&hm=ddbe00ffa4de7322fb77c880434615b2176335ec8f4f395b85b588c59a0e9a36&=&format=webp&quality=lossless&width=1667&height=882)

Hasil JMeter CLI sebelum profiling:<br>
![/all-studentendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217121605667393586/image.png?ex=6602dfd3&is=65f06ad3&hm=e95f5658c2abfb7d2378359278a6ba9169ca99cac61bfdc5429c5e41009e5c9b&=&format=webp&quality=lossless&width=1671&height=882)
![/all-student-nameendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217121637170937989/image.png?ex=6602dfdb&is=65f06adb&hm=0d68fcdfc1b72dd699630b06625666c43ce7d3d97e0ee590dfd99d686cba8038&=&format=webp&quality=lossless&width=1671&height=882)
![/highest-gpaendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217121663922213035/image.png?ex=6602dfe1&is=65f06ae1&hm=b6a5965d31d0699aa8df325ca53652934731e97ae6cdbb4a13793073da562753&=&format=webp&quality=lossless&width=1667&height=882)

Hasil JMeter CLI setelah profiling:<br>
![/all-studentendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217447671384772658/image.png?ex=66040f7f&is=65f19a7f&hm=3cab5aefa512a898d2b159db53d23e72650c5c31db1a7a99138d00a6bec50a68&=&format=webp&quality=lossless&width=962&height=511)
![/all-student-nameendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217447709825564724/image.png?ex=66040f89&is=65f19a89&hm=4a3feac94179a27a650a9537286752e336f4587c32831be12ce469704ce6be5a&=&format=webp&quality=lossless&width=962&height=505)
![/highest-gpaendpoint](https://media.discordapp.net/attachments/1208439913247412335/1217447744185176115/image.png?ex=66040f91&is=65f19a91&hm=9935a41d4a39958fa6fb449fef5f6b98dca710bc5da29fd455ca0ed11389fabb&=&format=webp&quality=lossless&width=1659&height=880)

Berdasarkan gambar yang disajikan, dapat dilihat bahwa penggunaan *profiling* secara signifikan mempercepat waktu eksekusi beberapa metode dalam kode yang semula memakan waktu lama. Dari hal ini, kita dapat menyimpulkan bahwa melakukan optimasi pada jalannya program tentunya juga mempengaruhi hasil pengujian aplikasi secara *blackbox* menggunakan JMeter.

1. JMeter lebih menitikberatkan pada pengujian kinerja aplikasi dari sisi pengguna, mengukur aspek seperti responsivitas dan kemampuan untuk menangani beban, sedangkan IntelliJ Profiler menyelami lebih dalam ke dalam kode aplikasi untuk mengidentifikasi penyebab masalah kinerja secara spesifik. Ini memungkinkan pengembang untuk melihat secara langsung bagaimana kode mereka beroperasi, menemukan area yang memerlukan optimasi.

2. Profiling memungkinkan untuk mendeteksi secara spesifik bagian dari aplikasi yang menyebabkan penurunan kinerja. Dengan melihat ke dalam operasi kode secara rinci, pengembang dapat mengidentifikasi metode atau fungsi yang memakan waktu paling lama untuk dijalankan, membuka jalan bagi peningkatan efisiensi aplikasi.

3. IntelliJ Profiler terbukti sangat bermanfaat dalam analisis dan identifikasi masalah performa aplikasi. Dengan kemampuan untuk melacak penggunaan sumber daya seperti CPU dan memori secara real-time, pengembang dapat dengan cepat menemukan dan memperbaiki bottleneck.

4. Tantangan utama dalam pengujian performa dan profiling adalah memahami data yang dihasilkan dan menentukan area yang memerlukan perbaikan. Mendalaminya memerlukan pengetahuan yang cukup tentang alat dan aplikasi yang diuji, serta pengalaman untuk menginterpretasi hasilnya secara akurat. Mengatasi tantangan ini seringkali melibatkan pembelajaran dan eksperimen terus-menerus dengan alat-alat tersebut.

5. Keuntungan utama dari penggunaan IntelliJ Profiler adalah kemampuannya untuk memberikan pandangan yang mendalam tentang kinerja internal aplikasi, membantu mengidentifikasi secara tepat bagian kode yang perlu dioptimalkan. Ini memungkinkan pengembang untuk membuat perubahan yang tepat sasaran, meningkatkan kinerja tanpa merusak fungsi lain.

6. Dalam situasi di mana hasil profiling dengan IntelliJ Profiler tidak konsisten dengan temuan dari pengujian performa menggunakan JMeter, pendekatan terbaik adalah mengevaluasi ulang kedua set data tersebut dan mencari pemahaman yang lebih dalam tentang konteks di mana masing-masing alat digunakan. Memahami batasan dan kegunaan spesifik dari setiap alat dapat membantu dalam menyelaraskan hasil dan memperjelas gambaran kinerja aplikasi.

7. Setelah analisis dari pengujian performa dan profiling, strategi yang diterapkan meliputi refactoring kode untuk menghilangkan redundansi dan meningkatkan efisiensi, serta memastikan bahwa setiap perubahan tidak mengganggu fungsi aplikasi. Verifikasi perubahan melalui pengujian unit dan regresi merupakan langkah krusial untuk memastikan bahwa peningkatan performa tidak terjadi pada pengorbanan keakuratan atau stabilitas aplikasi.
