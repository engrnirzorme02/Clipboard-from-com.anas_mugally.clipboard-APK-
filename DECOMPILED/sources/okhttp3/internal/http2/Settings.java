package okhttp3.internal.http2;

import com.google.android.gms.common.api.C3553a;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class Settings {

    /* JADX INFO: renamed from: c */
    public static final Companion f25971c = new Companion(null);

    /* JADX INFO: renamed from: a */
    private int f25972a;

    /* JADX INFO: renamed from: b */
    private final int[] f25973b = new int[10];

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m29326a(int i7) {
        return this.f25973b[i7];
    }

    /* JADX INFO: renamed from: b */
    public final int m29327b() {
        if ((this.f25972a & 2) != 0) {
            return this.f25973b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m29328c() {
        if ((this.f25972a & 128) != 0) {
            return this.f25973b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: d */
    public final int m29329d() {
        return (this.f25972a & 16) != 0 ? this.f25973b[4] : C3553a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: e */
    public final int m29330e(int i7) {
        return (this.f25972a & 32) != 0 ? this.f25973b[5] : i7;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m29331f(int i7) {
        return ((1 << i7) & this.f25972a) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m29332g(Settings other) {
        AbstractC6118n.m27187e(other, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (other.m29331f(i7)) {
                m29333h(i7, other.m29326a(i7));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final Settings m29333h(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f25973b;
            if (i7 < iArr.length) {
                this.f25972a = (1 << i7) | this.f25972a;
                iArr[i7] = i8;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final int m29334i() {
        return Integer.bitCount(this.f25972a);
    }
}
