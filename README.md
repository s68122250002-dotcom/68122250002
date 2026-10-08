Stats Tool (Java)
Starter repository สำหรับ Core Git Lab ฉบับภาษา Java ใช้ในรายวิชาการออกแบบและวิเคราะห์ขั้นตอนวิธี

โปรเจกต์นี้เป็นไลบรารีสถิติเล็ก ๆ ที่นักศึกษาจะเพิ่มเมธอดไปทีละขั้นระหว่างทำ Lab คำสั่ง Git ทั้งหมดในคู่มือ Lab ใช้ได้เหมือนเดิม ต่างกันเฉพาะโค้ดและคำสั่งรัน test

สิ่งที่ต้องติดตั้ง
โปรแกรม	หมายเหตุ
JDK 17 หรือ 21	เช่น Eclipse Temurin จาก adoptium.net (ยังไม่รองรับ JDK 25)
VS Code + Extension Pack for Java	ค้นใน Extensions ของ VS Code
Git	ตามโมดูล 0 ของคู่มือ Lab
ไม่ต้องติดตั้ง Gradle หรือ Maven โปรเจกต์มี gradlew ซึ่งจะดาวน์โหลดเครื่องมือที่ต้องใช้ให้เองในครั้งแรก (ต้องต่ออินเทอร์เน็ต)

รัน test
ใน Git Bash หรือ Terminal ของ VS Code ที่โฟลเดอร์หลักของ repo

./gradlew test
ครั้งแรกจะใช้เวลาหนึ่งถึงสองนาที ถ้าขึ้น BUILD SUCCESSFUL แปลว่าพร้อมเริ่ม Lab (Windows Command Prompt หรือ PowerShell ใช้ gradlew test)

รันเฉพาะบาง test

./gradlew test --tests "lab.daa.MergeSortTest"
ใน VS Code ยังกดปุ่ม ▶ ข้างชื่อ test หรือเปิดแท็บ Testing (ไอคอนรูปขวดทดลอง) ได้ด้วย

โครงสร้าง
ไฟล์	ใช้ทำอะไร
src/main/java/lab/StatsTool.java	โค้ดที่นักศึกษาจะแก้ในโมดูล 1–3
src/test/java/lab/StatsToolTest.java	test ของ StatsTool
src/main/java/lab/daa/MergeSort.java	merge sort สำหรับ Extension C
src/test/java/lab/daa/MergeSortTest.java	test ของ merge sort
extensions/daa/README.md	โจทย์ Extension C (git bisect)
docs/git-cheatsheet.md	สรุปคำสั่ง Git
build.gradle, gradlew	ตั้งค่าการ build (ไม่ต้องแก้)
.github/workflows/test.yml	GitHub Actions รัน test ทุกครั้งที่ push หรือเปิด Pull Request
แบบฝึกหัดในคู่มือ Lab ฉบับ Java
คู่มือ Lab ยกตัวอย่างเป็น Python ให้ทำเป็นเมธอด public static ใน StatsTool.java ตามตารางนี้ และเขียน test ใน StatsToolTest.java

ในคู่มือ (Python)	ใน Java
median(values) (โมดูล 1.4)	public static Double median(double[] values)
mode(values) (แบบฝึกหัด 1)	public static Double mode(double[] values)
std_dev(values) (โมดูล 2.1)	public static Double stdDev(double[] values)
value_range(values) (แบบฝึกหัด 2)	public static Double valueRange(double[] values)
percentile(values, p) (โมดูล 3)	public static Double percentile(double[] values, double p)
z_scores(values) (โมดูล 3)	public static double[] zScores(double[] values)
ทุกเมธอดคืน null เมื่อ array ว่าง ตัวอย่าง median

public static Double median(double[] values) {
    if (values.length == 0) {
        return null;
    }
    double[] sorted = values.clone();
    java.util.Arrays.sort(sorted);
    int mid = sorted.length / 2;
    if (sorted.length % 2 == 1) {
        return sorted[mid];
    }
    return (sorted[mid - 1] + sorted[mid]) / 2;
}
ตัวอย่าง test

@Test
void median() {
    double odd = StatsTool.median(new double[] {3, 1, 2});
    double even = StatsTool.median(new double[] {4, 1, 3, 2});
    assertEquals(2.0, odd, EPS);
    assertEquals(2.5, even, EPS);
    assertNull(StatsTool.median(new double[0]));
}
Branch และ Tag ที่มีมาให้
ชื่อ	ใช้ใน
main	งานหลักของนักศึกษา
buggy-sort (branch)	Extension C: ค้นหา commit ที่ทำให้ merge sort ผิดด้วย git bisect
v0-correct (tag)	Extension C: version ของ merge sort ที่ทราบว่าถูกต้อง
ส่งงานด้วย tag submit-lab ตามคู่มือ Lab
