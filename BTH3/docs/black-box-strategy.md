# Mô tả áp dụng kiểm thử hộp đen

## Nguyên tắc chung

Mỗi bài toán được xem như một hộp đen: chỉ quan tâm đến đầu vào, đầu ra mong đợi và cách chương trình phản hồi với dữ liệu không hợp lệ.

Các kỹ thuật được dùng:

- Phân lớp tương đương: chia dữ liệu thành nhóm hợp lệ và không hợp lệ
- Phân tích giá trị biên: kiểm tra giá trị nhỏ nhất, lớn nhất, và sát biên
- Dữ liệu hợp lệ và không hợp lệ: bảo đảm chương trình xử lý đúng cả hai phía

## Từng bài

1. Chu vi hình chữ nhật: kiểm tra số dương, số 0, và số âm để xác nhận quy tắc diện tích/chu vi không chấp nhận cạnh âm.
2. Diện tích hình chữ nhật: tương tự bài chu vi, nhưng đặc biệt kiểm tra kết quả bằng 0 khi một cạnh bằng 0.
3. Phương trình bậc 2: bao phủ 3 lớp chính gồm 2 nghiệm phân biệt, nghiệm kép, phương trình bậc nhất khi a=0, và trường hợp vô nghĩa khi a=b=0.
4. Số ngày của tháng: kiểm tra tháng hợp lệ, tháng 2 năm nhuận, tháng 2 không nhuận, và tháng ngoài khoảng 1-12.
5. Số nguyên tố: kiểm tra số nguyên tố, số không nguyên tố, và biên n<2.
6. Tổng luân phiên: kiểm tra n chẵn/lẻ, n=0, và n âm.
7. UCLN: kiểm tra cặp số dương, cặp có số 0, và trường hợp 0 với 0.
8. Tổng giai thừa: kiểm tra n nhỏ, n=0, và n âm.
