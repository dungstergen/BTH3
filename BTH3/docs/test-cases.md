# Danh sách test case

## 1. Chu vi hình chữ nhật

| ID         | Loại         | Input                | Expected             |
| ---------- | ------------ | -------------------- | -------------------- |
| TC-RECT-01 | Hợp lệ       | `length=5, width=3`  | `16`                 |
| TC-RECT-02 | Giá trị biên | `length=0, width=0`  | `0`                  |
| TC-RECT-03 | Không hợp lệ | `length=-1, width=3` | Báo lỗi `ValueError` |

## 2. Diện tích hình chữ nhật

| ID         | Loại         | Input                | Expected             |
| ---------- | ------------ | -------------------- | -------------------- |
| TC-AREA-01 | Hợp lệ       | `length=5, width=3`  | `15`                 |
| TC-AREA-02 | Giá trị biên | `length=0, width=7`  | `0`                  |
| TC-AREA-03 | Không hợp lệ | `length=-2, width=4` | Báo lỗi `ValueError` |

## 3. Giải phương trình bậc 2

| ID         | Loại         | Input            | Expected                  |
| ---------- | ------------ | ---------------- | ------------------------- |
| TC-QUAD-01 | Hợp lệ       | `a=1, b=-3, c=2` | 2 nghiệm phân biệt `1, 2` |
| TC-QUAD-02 | Giá trị biên | `a=1, b=2, c=1`  | 1 nghiệm kép `-1`         |
| TC-QUAD-03 | Không hợp lệ | `a=0, b=0, c=1`  | Báo lỗi `ValueError`      |

## 4. Số ngày của một tháng

| ID        | Loại         | Input                | Expected             |
| --------- | ------------ | -------------------- | -------------------- |
| TC-DAY-01 | Hợp lệ       | `month=4`            | `30`                 |
| TC-DAY-02 | Giá trị biên | `month=2, year=2024` | `29`                 |
| TC-DAY-03 | Không hợp lệ | `month=13`           | Báo lỗi `ValueError` |

## 5. Kiểm tra số nguyên tố

| ID          | Loại                        | Input  | Expected |
| ----------- | --------------------------- | ------ | -------- |
| TC-PRIME-01 | Hợp lệ                      | `n=29` | `True`   |
| TC-PRIME-02 | Giá trị biên                | `n=1`  | `False`  |
| TC-PRIME-03 | Không hợp lệ theo nghiệp vụ | `n=-7` | `False`  |

## 6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n

| ID        | Loại         | Input  | Expected             |
| --------- | ------------ | ------ | -------------------- |
| TC-ALT-01 | Hợp lệ       | `n=5`  | `3`                  |
| TC-ALT-02 | Giá trị biên | `n=0`  | `0`                  |
| TC-ALT-03 | Không hợp lệ | `n=-1` | Báo lỗi `ValueError` |

## 7. UCLN của a và b

| ID        | Loại         | Input        | Expected             |
| --------- | ------------ | ------------ | -------------------- |
| TC-GCD-01 | Hợp lệ       | `a=24, b=18` | `6`                  |
| TC-GCD-02 | Giá trị biên | `a=0, b=15`  | `15`                 |
| TC-GCD-03 | Không hợp lệ | `a=0, b=0`   | Báo lỗi `ValueError` |

## 8. Tính S = 1! + 2! + 3! + ... + n!

| ID         | Loại         | Input  | Expected             |
| ---------- | ------------ | ------ | -------------------- |
| TC-FSUM-01 | Hợp lệ       | `n=4`  | `33`                 |
| TC-FSUM-02 | Giá trị biên | `n=0`  | `0`                  |
| TC-FSUM-03 | Không hợp lệ | `n=-2` | Báo lỗi `ValueError` |
