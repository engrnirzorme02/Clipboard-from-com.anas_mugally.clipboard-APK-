package p140S0;

/* JADX INFO: renamed from: S0.b */
/* JADX INFO: loaded from: classes.dex */
public class C1383b {

    /* JADX INFO: renamed from: a */
    private boolean f4884a;

    /* JADX INFO: renamed from: b */
    private boolean f4885b;

    /* JADX INFO: renamed from: c */
    private boolean f4886c;

    /* JADX INFO: renamed from: d */
    private boolean f4887d;

    public C1383b(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f4884a = z7;
        this.f4885b = z8;
        this.f4886c = z9;
        this.f4887d = z10;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5950a() {
        return this.f4884a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5951b() {
        return this.f4886c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m5952c() {
        return this.f4887d;
    }

    /* JADX INFO: renamed from: d */
    public boolean m5953d() {
        return this.f4885b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1383b)) {
            return false;
        }
        C1383b c1383b = (C1383b) obj;
        return this.f4884a == c1383b.f4884a && this.f4885b == c1383b.f4885b && this.f4886c == c1383b.f4886c && this.f4887d == c1383b.f4887d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r7 = this.f4884a;
        int i7 = r7;
        if (this.f4885b) {
            i7 = r7 + 16;
        }
        int i8 = i7;
        if (this.f4886c) {
            i8 = i7 + 256;
        }
        return this.f4887d ? i8 + 4096 : i8;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f4884a), Boolean.valueOf(this.f4885b), Boolean.valueOf(this.f4886c), Boolean.valueOf(this.f4887d));
    }
}
