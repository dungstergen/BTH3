# Danh sach test case

Phan loai issue:

- Issue 1: Du lieu hop le
- Issue 2: Du lieu khong hop le, bien va ngoai le

## 1. Chu vi hinh chu nhat

| ID         | Issue | Ky thuat                            | Input                 | Mong doi           |
| ---------- | ----- | ----------------------------------- | --------------------- | ------------------ |
| TC-RECT-01 | 1     | Phan lop tuong duong hop le         | `length=5, width=3`   | `16`               |
| TC-RECT-02 | 2     | Gia tri bien                        | `length=0, width=0`   | `0`                |
| TC-RECT-03 | 2     | Du lieu khong hop le                | `length=-1, width=3`  | Throw `RangeError` |
| TC-RECT-04 | 2     | Du lieu khong hop le (kieu du lieu) | `length='5', width=3` | Throw `TypeError`  |

## 2. Dien tich hinh chu nhat

| ID         | Issue | Ky thuat                            | Input                 | Mong doi           |
| ---------- | ----- | ----------------------------------- | --------------------- | ------------------ |
| TC-AREA-01 | 1     | Phan lop tuong duong hop le         | `length=5, width=3`   | `15`               |
| TC-AREA-02 | 2     | Gia tri bien                        | `length=0, width=7`   | `0`                |
| TC-AREA-03 | 2     | Du lieu khong hop le                | `length=-1, width=3`  | Throw `RangeError` |
| TC-AREA-04 | 2     | Du lieu khong hop le (kieu du lieu) | `length=5, width='3'` | Throw `TypeError`  |

## 3. Giai phuong trinh bac 2

| ID         | Issue | Ky thuat                            | Input             | Mong doi                       |
| ---------- | ----- | ----------------------------------- | ----------------- | ------------------------------ |
| TC-QUAD-01 | 1     | Phan lop tuong duong hop le         | `a=1, b=-3, c=2`  | `type='distinct', roots=[1,2]` |
| TC-QUAD-02 | 1     | Gia tri bien                        | `a=1, b=2, c=1`   | `type='double', roots=[-1]`    |
| TC-QUAD-03 | 2     | Ngoai le nghiep vu                  | `a=1, b=0, c=1`   | `type='complex', roots=[]`     |
| TC-QUAD-04 | 1     | Phan lop tuong duong hop le         | `a=0, b=2, c=-4`  | `type='linear', roots=[2]`     |
| TC-QUAD-05 | 2     | Du lieu khong hop le                | `a=0, b=0, c=1`   | Throw `RangeError`             |
| TC-QUAD-06 | 2     | Du lieu khong hop le (kieu du lieu) | `a='1', b=2, c=3` | Throw `TypeError`              |

## 4. So ngay cua mot thang

| ID        | Issue | Ky thuat                            | Input                  | Mong doi           |
| --------- | ----- | ----------------------------------- | ---------------------- | ------------------ |
| TC-DAY-01 | 1     | Phan lop tuong duong hop le         | `month=4`              | `30`               |
| TC-DAY-02 | 1     | Gia tri bien                        | `month=2, year=2024`   | `29`               |
| TC-DAY-03 | 1     | Phan lop tuong duong hop le         | `month=2, year=2023`   | `28`               |
| TC-DAY-04 | 2     | Du lieu khong hop le                | `month=13`             | Throw `RangeError` |
| TC-DAY-05 | 2     | Du lieu khong hop le (kieu du lieu) | `month=2.5`            | Throw `TypeError`  |
| TC-DAY-06 | 2     | Du lieu khong hop le (kieu du lieu) | `month=2, year=2024.5` | Throw `TypeError`  |

## 5. Kiem tra so nguyen to

| ID          | Issue | Ky thuat                            | Input   | Mong doi          |
| ----------- | ----- | ----------------------------------- | ------- | ----------------- |
| TC-PRIME-01 | 1     | Phan lop tuong duong hop le         | `n=29`  | `true`            |
| TC-PRIME-02 | 1     | Phan lop tuong duong hop le         | `n=21`  | `false`           |
| TC-PRIME-03 | 2     | Gia tri bien                        | `n=1`   | `false`           |
| TC-PRIME-04 | 2     | Du lieu khong hop le theo nghiep vu | `n=-7`  | `false`           |
| TC-PRIME-05 | 2     | Du lieu khong hop le (kieu du lieu) | `n=2.5` | Throw `TypeError` |

## 6. Tinh tong S = 1 - 2 + 3 - 4 + ... + n

| ID        | Issue | Ky thuat                            | Input   | Mong doi           |
| --------- | ----- | ----------------------------------- | ------- | ------------------ |
| TC-ALT-01 | 1     | Phan lop tuong duong hop le         | `n=5`   | `3`                |
| TC-ALT-02 | 2     | Gia tri bien                        | `n=0`   | `0`                |
| TC-ALT-03 | 2     | Gia tri bien                        | `n=6`   | `-3`               |
| TC-ALT-04 | 2     | Du lieu khong hop le                | `n=-1`  | Throw `RangeError` |
| TC-ALT-05 | 2     | Du lieu khong hop le (kieu du lieu) | `n=2.2` | Throw `TypeError`  |

## 7. UCLN cua a va b

| ID        | Issue | Ky thuat                            | Input         | Mong doi           |
| --------- | ----- | ----------------------------------- | ------------- | ------------------ |
| TC-GCD-01 | 1     | Phan lop tuong duong hop le         | `a=24, b=18`  | `6`                |
| TC-GCD-02 | 2     | Gia tri bien                        | `a=0, b=15`   | `15`               |
| TC-GCD-03 | 2     | Ngoai le nghiep vu                  | `a=-24, b=18` | `6`                |
| TC-GCD-04 | 2     | Du lieu khong hop le                | `a=0, b=0`    | Throw `RangeError` |
| TC-GCD-05 | 2     | Du lieu khong hop le (kieu du lieu) | `a=4.5, b=2`  | Throw `TypeError`  |

## 8. Tinh S = 1! + 2! + 3! + ... + n!

| ID         | Issue | Ky thuat                            | Input   | Mong doi           |
| ---------- | ----- | ----------------------------------- | ------- | ------------------ |
| TC-FSUM-01 | 1     | Phan lop tuong duong hop le         | `n=4`   | `33`               |
| TC-FSUM-02 | 2     | Gia tri bien                        | `n=0`   | `0`                |
| TC-FSUM-03 | 2     | Du lieu khong hop le                | `n=-2`  | Throw `RangeError` |
| TC-FSUM-04 | 2     | Du lieu khong hop le (kieu du lieu) | `n=4.2` | Throw `TypeError`  |
