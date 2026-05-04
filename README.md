# BTH4 - Kiểm thử hộp đen bằng Java

Repository này đã được chuyển sang Java + JUnit 5 để bám theo đề trong ảnh: 8 bài toán, bộ kiểm thử hộp đen, danh sách test case, và cách tách thành 2 issue GitHub.

## Cấu trúc

- `src/main/java/bth3/Bth3Calculator.java`: các hàm xử lý cho 8 bài toán
- `src/test/java/bth3/Bth3CalculatorTest.java`: bộ test JUnit 5
- `docs/test-cases.md`: danh sách test case theo phân lớp tương đương, giá trị biên, dữ liệu hợp lệ/không hợp lệ
- `docs/test-results.md`: kết quả chạy kiểm thử
- `docs/black-box-strategy.md`: mô tả cách áp dụng kiểm thử hộp đen cho từng bài
- `docs/issues/issue-1-valid.md`: nội dung issue 1
- `docs/issues/issue-2-invalid.md`: nội dung issue 2

## Đối chiếu yêu cầu

- 8 bài toán trong đề: đã có đầy đủ trong `src/main/java/bth3/Bth3Calculator.java`
- Test hợp lệ: nhóm trong `src/test/java/bth3/Bth3CalculatorTest.java` và `docs/issues/issue-1-valid.md`
- Test dữ liệu không hợp lệ, giá trị biên, ngoại lệ: nhóm trong `src/test/java/bth3/Bth3CalculatorTest.java` và `docs/issues/issue-2-invalid.md`
- Danh sách test case: `docs/test-cases.md`
- Kết quả chạy test: `docs/test-results.md`
- Mô tả chiến lược hộp đen: `docs/black-box-strategy.md`

## Chạy kiểm thử

```bash
mvn test
```

JaCoCo sẽ sinh báo cáo coverage trong `target/site/jacoco/index.html` sau khi chạy test.

## Doi chieu yeu cau de bai

- Ma nguon 8 bai toan: `src/main/java/bth3/Bth3Calculator.java`
- Danh sach test case (phan lop tuong duong, gia tri bien, du lieu hop le/khong hop le): `docs/test-cases.md`
- Ket qua chay kiem thu: `docs/test-results.md`
  ![alt text](<Screenshot 2026-05-04 082120.png>)
  ![alt text](<Screenshot 2026-05-04 082128.png>)
- Mo ta cach ap dung kiem thu hop den cho tung bai: `docs/black-box-strategy.md`
- Noi dung issue theo yeu cau:
    - Issue 1 (du lieu hop le): `docs/issues/issue-1-valid.md`
    - Issue 2 (du lieu khong hop le, bien, ngoai le): `docs/issues/issue-2-invalid.md`
