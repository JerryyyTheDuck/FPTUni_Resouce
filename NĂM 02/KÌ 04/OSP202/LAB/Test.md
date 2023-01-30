<h1>Digital Forensic</h1>

<h2>
    Khái niệm
</h2>

**Digital forensic** (còn được gọi là **Điều tra kỹ thuật số**) là quá trình thu thập, lưu trữ, phân tích, trình bày và mô phỏng dữ liệu điện tử từ các thiết bị kỹ thuật số như máy tính, điện thoại thông minh, máy chủ để phát hiện và xác định bằng chứng. liên quan đến tội phạm mạng. Quá trình pháp y kỹ thuật số liên quan đến việc sử dụng các công cụ và kỹ thuật chuyên dụng để đảm bảo khôi phục và bảo toàn dữ liệu về trạng thái ban đầu, đồng thời đảm bảo rằng bằng chứng được xử lý vẫn giữ được tính toàn vẹn và tính xác thực của nó.

<h2>
    Các mảng đặc trưng của Digital forensic
</h2>

*Nói về Digital Forensic trong CTF, có quá nhiều thứ để tìm hiểu và học hỏi. Digital Forensic có thể được chia thành nhiều mảng nhỏ khác nhau, mỗi mảng con cũng yêu cầu các kỹ năng và kiến ​​thức khác nhau. Một số mảng phổ biến hiện nay bao gồm:

* **Điều tra file** (File Forensic): Mảng này kiểm tra khả năng phân tích và hiểu được các loại tệp khác nhau của người chơi. Nó có thể bao gồm các tác vụ như khôi phục tệp đã xóa, phân tích ảnh và âm thanh cũng như giải mã tin nhắn được mã hóa.

* **Điều tra bộ nhớ** (Memory Forensic): Mảng này tập trung vào việc phân tích bộ nhớ của một hệ thống để khám phá thông tin ẩn. Người chơi nên làm quen với trình kết xuất bộ nhớ và cấu trúc của bộ nhớ, cũng như cách phân tích và giải thích dữ liệu mà chúng chứa.

* **Điều tra mạng** (Network Forensics): Mảng này tập trung vào phân tích lưu lượng mạng (gói và luồng) để khám phá thông tin ẩn. Những người chơi nên làm quen với các giao thức mạng khác nhau như TCP và UDP,v.v Đồng thời cũng có thể mô tả lại các gói tin (packet). Họ cũng phải có khả năng sử dụng các công cụ phân tích mạng để giải mã lưu lượng được mã hóa và xác định hoạt động độc hại.

* **Điều tra phần mềm**: Mảng phụ này tập trung vào việc phân tích phần mềm để khám phá chức năng và xác định hành vi cũng như các tác động tiềm ẩn của nó. Người chơi nên làm quen với các công cụ và kỹ thuật thiết kế ngược để hiểu cách chúng hoạt động, cũng như các tệp nhật ký và tệp cấu hình ứng dụng. Họ phải có khả năng phân tích mã độc.

Điều tra số là một lĩnh vực khá rộng, có thể mất rất nhiều thời gian để tìm hiểu và học hỏi. Tuy rộng về thử thách nhưng đổi lại 


<h2>
    Một số công cụ thường dùng
</h2>

Các cuộc thi CTF về điều tra số sử dụng rất nhiều công cự khác nhau và kĩ thuật đòi hỏi người dùng phải có kiến thức để có thể giải quyết vấn đề. Dưới đây là một số công cụ phổ biến dùng để cho Digital Forensic

* **File Forensic**: 
    * Công cụ kiểm tra tên file: Hex editors, file (linux command)
    * Công cụ phân tích âm thanh: Visualizer, audacity
    * Công cụ phân tích hình ảnh: stegsolve, exiftool, binwalk 
    * Công cụ phân tích file office: 7zip, winrar,...
* **Memory Forensic**: 
    * Volitality
    * FTKImager
    * Sleuth Kit + AutoPsy
* **Network Forensic**:
    * Wireshark + Tshark
    * Airodump-ng
* **Application Forensic**:
    * Gihdra
    * IDA
    * Jadx-Gui

<h2>
    Điều kiện cần có khi chơi Digital Forensic
</h2>

* Đã làm quen với những dạng mã hóa căn bản (base64,hexadecimal,binary,...) . Có khả năng giải mã những chuỗi kí tự bên trong file.
* Sử dụng thành thạo một ngôn ngữ bất kì như Java, Python,..
* Quen với những loại file cơ bản và phổ biến. Biết một số "Magic header" cơ bản của một file, cấu trúc file, các loại g iao thức,...
* Sử dụng linh hoạt những công cụ phổ biến 

<h2>
    Nguồn tự học và luyện tập
</h2>

* The art of memory forensic - Cuốn sách khá hay về cách sử dụng volatility và về điều tra bộ nhớ
* Handbook for CTFer - Cuốn sách dành cho những bạn mới bắt đầu tập chơi, tìm hiểu về CTF
* File System Forensic Analysis - Cuốn sách dành cho những bạn muốn tìm hiểu cách sử dụng Sleuth Kit
* Viblo CTF - Nơi mà các bạn có thể làm những bài CTF forensic ở mức độ trung bình đến khó
*PicoCTF  - Tại đây có tất cả những bài CTF từ mức độ dễ đến khó, rất thích hợp cho các bạn mới chơi
*HoneyNet - Nơi tổng hợp 14 thử thách sẽ giúp bạn làm quen với các công cụ và kỹ thuật điều tra số khác nhau
*SANS Information Security White Papers - Nơi tổng hợp, liên tục cập nhật về những thứ liên quan tới điều tra số.
