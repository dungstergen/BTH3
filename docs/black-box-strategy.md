# Mo ta ap dung kiem thu hop den

## Nguyen tac chung

Moi bai toan duoc kiem thu theo huong hop den: chi xet dau vao, dau ra mong doi va hanh vi xu ly loi.

Ky thuat da ap dung:

- Phan lop tuong duong
- Phan tich gia tri bien
- Du lieu hop le/khong hop le
- Kiem tra ngoai le (TypeError, RangeError)

## Dinh nghia dau vao va dau ra mong doi

| Bai toan                | Dau vao                                     | Dau ra mong doi                                                     | Xu ly du lieu sai                                           |
| ----------------------- | ------------------------------------------- | ------------------------------------------------------------------- | ----------------------------------------------------------- |
| Chu vi hinh chu nhat    | `length`, `width` (number, >= 0)            | So chu vi `2 * (length + width)`                                    | Am -> `RangeError`, sai kieu -> `TypeError`                 |
| Dien tich hinh chu nhat | `length`, `width` (number, >= 0)            | So dien tich `length * width`                                       | Am -> `RangeError`, sai kieu -> `TypeError`                 |
| Giai PT bac 2           | `a`, `b`, `c` (number)                      | Ket qua theo nhom nghiem: `distinct`, `double`, `complex`, `linear` | `a=0,b=0` -> `RangeError`, sai kieu -> `TypeError`          |
| So ngay cua thang       | `month` (int 1..12), `year` (int, tuy chon) | So ngay cua thang                                                   | Thang ngoai [1,12] -> `RangeError`, sai kieu -> `TypeError` |
| Kiem tra so nguyen to   | `n` (int)                                   | `true/false`                                                        | Sai kieu (khong phai int) -> `TypeError`                    |
| Tong luan phien         | `n` (int, >= 0)                             | `1 - 2 + ... +/- n`                                                 | `n<0` -> `RangeError`, sai kieu -> `TypeError`              |
| UCLN                    | `a`, `b` (int)                              | UCLN khong am                                                       | `a=0,b=0` -> `RangeError`, sai kieu -> `TypeError`          |
| Tong giai thua          | `n` (int, >= 0)                             | `1! + 2! + ... + n!`                                                | `n<0` -> `RangeError`, sai kieu -> `TypeError`              |

## Tach issue theo yeu cau de bai

- Issue 1: Tap trung cac test case du lieu hop le.
- Issue 2: Tap trung cac test case du lieu khong hop le, bien va ngoai le.

Toan bo test case chi tiet nam trong file `docs/test-cases.md`, va ket qua chay test nam trong `docs/test-results.md`.
