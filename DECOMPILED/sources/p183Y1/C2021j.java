package p183Y1;

/* JADX INFO: renamed from: Y1.j */
/* JADX INFO: loaded from: classes.dex */
public class C2021j {

    /* JADX INFO: renamed from: a */
    private Class f6707a;

    /* JADX INFO: renamed from: b */
    private Class f6708b;

    /* JADX INFO: renamed from: c */
    private Class f6709c;

    public C2021j() {
    }

    /* JADX INFO: renamed from: a */
    public void m8403a(Class cls, Class cls2, Class cls3) {
        this.f6707a = cls;
        this.f6708b = cls2;
        this.f6709c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2021j c2021j = (C2021j) obj;
        return this.f6707a.equals(c2021j.f6707a) && this.f6708b.equals(c2021j.f6708b) && AbstractC2023l.m8413d(this.f6709c, c2021j.f6709c);
    }

    public int hashCode() {
        int iHashCode = ((this.f6707a.hashCode() * 31) + this.f6708b.hashCode()) * 31;
        Class cls = this.f6709c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f6707a + ", second=" + this.f6708b + '}';
    }

    public C2021j(Class cls, Class cls2, Class cls3) {
        m8403a(cls, cls2, cls3);
    }
}
