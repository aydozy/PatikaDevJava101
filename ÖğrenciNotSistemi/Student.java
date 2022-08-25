package ÖðrenciNotSistemi;

public class Student {
	String name, stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avarage;
	boolean isPass;
	double verbalGradeAvarage;
	double lessonAvarage;

	Course verbalGradeMatematik;
	Course verbalGradeFizik;
	Course verbalGradeKimya;

	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.verbalGradeMatematik = verbalGradeMatematik;
		this.verbalGradeFizik = verbalGradeFizik;
		this.verbalGradeKimya = verbalGradeKimya;
		this.avarage = 0.0;
		this.verbalGradeAvarage = 0.0;
		this.lessonAvarage = 0.0;
		this.isPass = false;
		isCheckPass();

	}

	public void addBulkExamNote(int mat, int fizik, int kimya) {

		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}

		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}

		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		}

	}

	void addBulkVerbalGradeNote(int verbalGradeMatematik, int verbalGradeFizik, int verbalGradeKimya){
        if (verbalGradeMatematik >0 && verbalGradeMatematik<=100) {
            this.verbalGradeMatematik.verbalGradeNote = verbalGradeMatematik;
        }
        if (verbalGradeFizik >0 && verbalGradeFizik<=100) {
            this.verbalGradeFizik.verbalGradeNote = verbalGradeFizik;
        }
        if (verbalGradeKimya>0&&verbalGradeKimya<=100){
            this.verbalGradeKimya.verbalGradeNote = verbalGradeKimya;
        }
	}

	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiþ");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.avarage);
			if (this.isPass) {
				System.out.println("Sýnýfý Geçti. ");
			} else {
				System.out.println("Sýnýfta Kaldý.");
			}
		}
	}

	void calcAvarage() {
		this.avarage = (this.mat.note) * (0.8);
		this.avarage = (this.fizik.note) * (0.8);
		this.avarage = (this.kimya.note) * (0.8);

		this.verbalGradeAvarage = (this.verbalGradeMatematik.verbalGradeNote) * (0.20);
		this.verbalGradeAvarage = (this.verbalGradeFizik.verbalGradeNote) * (0.20);
		this.verbalGradeAvarage = (this.verbalGradeFizik.verbalGradeNote) * (0.20);

		this.lessonAvarage = (this.mat.note * 0.8) + (this.verbalGradeMatematik.verbalGradeNote * 0.2);
		this.lessonAvarage = (this.fizik.note * 0.8) + (this.verbalGradeFizik.verbalGradeNote * 0.2);
		this.lessonAvarage = (this.kimya.note * 0.8) + (this.verbalGradeKimya.verbalGradeNote * 0.2);

	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println("=========================");
		System.out.println("Öðrenci : " + this.name);
		System.out.println("Matematik Notu : " + this.mat.note);
		System.out.println("Fizik Notu : " + this.fizik.note);
		System.out.println("Kimya Notu : " + this.kimya.note);
		System.out.println("Matematik Sozlu Notu: " + this.verbalGradeMatematik.verbalGradeNote);
		System.out.println("Fizik Sozlu Notu: " + this.verbalGradeFizik.verbalGradeNote);
		System.out.println("Kimya Sozlu Notu: " + this.verbalGradeKimya.verbalGradeNote);
	}
}
