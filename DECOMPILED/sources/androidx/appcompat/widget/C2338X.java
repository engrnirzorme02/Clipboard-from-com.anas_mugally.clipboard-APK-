package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.X */
/* JADX INFO: loaded from: classes.dex */
class C2338X {

    /* JADX INFO: renamed from: a */
    private int f8145a = 0;

    /* JADX INFO: renamed from: b */
    private int f8146b = 0;

    /* JADX INFO: renamed from: c */
    private int f8147c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    private int f8148d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    private int f8149e = 0;

    /* JADX INFO: renamed from: f */
    private int f8150f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f8151g = false;

    /* JADX INFO: renamed from: h */
    private boolean f8152h = false;

    C2338X() {
    }

    /* JADX INFO: renamed from: a */
    public int m9977a() {
        return this.f8151g ? this.f8145a : this.f8146b;
    }

    /* JADX INFO: renamed from: b */
    public int m9978b() {
        return this.f8145a;
    }

    /* JADX INFO: renamed from: c */
    public int m9979c() {
        return this.f8146b;
    }

    /* JADX INFO: renamed from: d */
    public int m9980d() {
        return this.f8151g ? this.f8146b : this.f8145a;
    }

    /* JADX INFO: renamed from: e */
    public void m9981e(int i7, int i8) {
        this.f8152h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f8149e = i7;
            this.f8145a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f8150f = i8;
            this.f8146b = i8;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9982f(boolean z7) {
        if (z7 == this.f8151g) {
            return;
        }
        this.f8151g = z7;
        if (!this.f8152h) {
            this.f8145a = this.f8149e;
            this.f8146b = this.f8150f;
            return;
        }
        if (z7) {
            int i7 = this.f8148d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f8149e;
            }
            this.f8145a = i7;
            int i8 = this.f8147c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f8150f;
            }
            this.f8146b = i8;
            return;
        }
        int i9 = this.f8147c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.f8149e;
        }
        this.f8145a = i9;
        int i10 = this.f8148d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f8150f;
        }
        this.f8146b = i10;
    }

    /* JADX INFO: renamed from: g */
    public void m9983g(int i7, int i8) {
        this.f8147c = i7;
        this.f8148d = i8;
        this.f8152h = true;
        if (this.f8151g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f8145a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f8146b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f8145a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f8146b = i8;
        }
    }
}
