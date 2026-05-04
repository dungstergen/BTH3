# Mo ta ap dung kiem thu hop den

## Nguyen tac chung

Moi bai toan duoc kiem thu theo huong hop den: chi xet dau vao, dau ra mong doi va hanh vi xu ly loi.

He thong hien tai duoc trien khai bang Java + JUnit 5 va chay qua Maven.

Ky thuat da ap dung:

- Phan lop tuong duong
- Phan tich gia tri bien
- Du lieu hop le/khong hop le
- Kiem tra ngoai le (`IllegalArgumentException`)

## Dinh nghia dau vao va dau ra mong doi

| Bai toan                | Dau vao                                     | Dau ra mong doi                                                     | Xu ly du lieu sai                                                                        |
| ----------------------- | ------------------------------------------- | ------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| Chu vi hinh chu nhat    | `length`, `width` (number, >= 0)            | So chu vi `2 * (length + width)`                                    | Am -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`                 |
| Dien tich hinh chu nhat | `length`, `width` (number, >= 0)            | So dien tich `length * width`                                       | Am -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`                 |
| Giai PT bac 2           | `a`, `b`, `c` (number)                      | Ket qua theo nhom nghiem: `distinct`, `double`, `complex`, `linear` | `a=0,b=0` -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`          |
| So ngay cua thang       | `month` (int 1..12), `year` (int, tuy chon) | So ngay cua thang                                                   | Thang ngoai [1,12] -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException` |
| Kiem tra so nguyen to   | `n` (int)                                   | `true/false`                                                        | Sai kieu (khong phai int) -> `IllegalArgumentException`                                  |
| Tong luan phien         | `n` (int, >= 0)                             | `1 - 2 + ... +/- n`                                                 | `n<0` -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`              |
| UCLN                    | `a`, `b` (int)                              | UCLN khong am                                                       | `a=0,b=0` -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`          |
| Tong giai thua          | `n` (int, >= 0)                             | `1! + 2! + ... + n!`                                                | `n<0` -> `IllegalArgumentException`, sai kieu -> `IllegalArgumentException`              |

## Tach issue theo yeu cau de bai

- Issue 1: Tap trung cac test case du lieu hop le.
- Issue 2: Tap trung cac test case du lieu khong hop le, bien va ngoai le.

Toan bo test case chi tiet nam trong file `docs/test-cases.md`, va ket qua chay test nam trong `docs/test-results.md`.

## Phan tich ma nguon theo yeu cau de bai

Phan nay doi chieu truc tiep voi yeu cau: cau lenh, nhanh dieu kien, vong lap, duong di logic.

| Ham                  | Cau lenh quan trong                                    | Nhanh dieu kien chinh                                            | Vong lap       | Duong di logic tieu bieu                 |
| -------------------- | ------------------------------------------------------ | ---------------------------------------------------------------- | -------------- | ---------------------------------------- |
| `rectanglePerimeter` | Kiem tra kieu, kiem tra khong am, tinh `2 * (l + w)`   | Input hop le, input am, input sai kieu/NaN/Infinity              | Khong co       | Hop le -> ket qua; sai -> throw          |
| `rectangleArea`      | Kiem tra kieu, kiem tra khong am, tinh `l * w`         | Input hop le, input am, input sai kieu/Infinity                  | Khong co       | Hop le -> ket qua; sai -> throw          |
| `solveQuadratic`     | Tinh delta, tra ve kieu nghiem                         | `a==0`, `b==0`, `delta<0`, `delta==0`, `delta>0`                 | Khong co       | Linear, double, distinct, complex, throw |
| `daysInMonth`        | Kiem tra range thang, nhuan/khong nhuan                | `month` ngoai [1..12], `month==2`, `year==null`, logic nam nhuan | Khong co       | Thang 30, 31, T2-28, T2-29, throw        |
| `isPrime`            | Kiem tra bien, loai bo so chan, chia thu den `sqrt(n)` | `n<2`, `n==2`, `n%2==0`, chia het/khong chia het                 | 1 vong `for`   | Prime true, composite false              |
| `alternatingSum`     | Cong/tru luan phien theo chi so                        | `n<0` va parity `index%2`                                        | 1 vong `for`   | Hop le -> tong, sai -> throw             |
| `gcd`                | Euclid algorithm voi tri tuyet doi                     | `(a==0 && b==0)`                                                 | 1 vong `while` | Tinh den khi so du bang 0                |
| `factorial`          | Nhan tich luy giai thua                                | `value<0`                                                        | 1 vong `for`   | `0!` va `n!`                             |
| `factorialSum`       | Cong dan `factorial(i)`                                | `n<0`                                                            | 1 vong `for`   | Tong tu `1!` den `n!`                    |

Tong hop tu bao cao JaCoCo hien tai:

- Statement/Instruction coverage: 100%
- Branch coverage: 100%
- Line coverage: 100%
