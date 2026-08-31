package p111O;

import android.view.MotionEvent;

/* JADX INFO: renamed from: O.X */
/* JADX INFO: loaded from: classes.dex */
class C1026X {

    /* JADX INFO: renamed from: a */
    private final float[] f3799a = new float[20];

    /* JADX INFO: renamed from: b */
    private final long[] f3800b = new long[20];

    /* JADX INFO: renamed from: c */
    private float f3801c = 0.0f;

    /* JADX INFO: renamed from: d */
    private int f3802d = 0;

    /* JADX INFO: renamed from: e */
    private int f3803e = 0;

    C1026X() {
    }

    /* JADX INFO: renamed from: b */
    private void m4417b() {
        this.f3802d = 0;
        this.f3801c = 0.0f;
    }

    /* JADX INFO: renamed from: e */
    private float m4418e() {
        long[] jArr;
        long j7;
        int i7 = this.f3802d;
        if (i7 < 2) {
            return 0.0f;
        }
        int i8 = this.f3803e;
        int i9 = ((i8 + 20) - (i7 - 1)) % 20;
        long j8 = this.f3800b[i8];
        while (true) {
            jArr = this.f3800b;
            j7 = jArr[i9];
            if (j8 - j7 <= 100) {
                break;
            }
            this.f3802d--;
            i9 = (i9 + 1) % 20;
        }
        int i10 = this.f3802d;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            int i11 = (i9 + 1) % 20;
            long j9 = jArr[i11];
            if (j7 == j9) {
                return 0.0f;
            }
            return this.f3799a[i11] / (j9 - j7);
        }
        float fAbs = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3802d - 1; i13++) {
            int i14 = i13 + i9;
            long[] jArr2 = this.f3800b;
            long j10 = jArr2[i14 % 20];
            int i15 = (i14 + 1) % 20;
            if (jArr2[i15] != j10) {
                i12++;
                float fM4419f = m4419f(fAbs);
                float f7 = this.f3799a[i15] / (this.f3800b[i15] - j10);
                fAbs += (f7 - fM4419f) * Math.abs(f7);
                if (i12 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return m4419f(fAbs);
    }

    /* JADX INFO: renamed from: f */
    private static float m4419f(float f7) {
        return (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    void m4420a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f3802d != 0 && eventTime - this.f3800b[this.f3803e] > 40) {
            m4417b();
        }
        int i7 = (this.f3803e + 1) % 20;
        this.f3803e = i7;
        int i8 = this.f3802d;
        if (i8 != 20) {
            this.f3802d = i8 + 1;
        }
        this.f3799a[i7] = motionEvent.getAxisValue(26);
        this.f3800b[this.f3803e] = eventTime;
    }

    /* JADX INFO: renamed from: c */
    void m4421c(int i7, float f7) {
        float fM4418e = m4418e() * i7;
        this.f3801c = fM4418e;
        if (fM4418e < (-Math.abs(f7))) {
            this.f3801c = -Math.abs(f7);
        } else if (this.f3801c > Math.abs(f7)) {
            this.f3801c = Math.abs(f7);
        }
    }

    /* JADX INFO: renamed from: d */
    float m4422d(int i7) {
        if (i7 != 26) {
            return 0.0f;
        }
        return this.f3801c;
    }
}
