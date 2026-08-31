package p223d;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5173c {

    /* JADX INFO: renamed from: f */
    public static final a f19773f = new a(null);

    /* JADX INFO: renamed from: a */
    private final float f19774a;

    /* JADX INFO: renamed from: b */
    private final float f19775b;

    /* JADX INFO: renamed from: c */
    private final float f19776c;

    /* JADX INFO: renamed from: d */
    private final int f19777d;

    /* JADX INFO: renamed from: e */
    private final long f19778e;

    /* JADX INFO: renamed from: d.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C5173c(float f7, float f8, float f9, int i7, long j7) {
        this.f19774a = f7;
        this.f19775b = f8;
        this.f19776c = f9;
        this.f19777d = i7;
        this.f19778e = j7;
    }

    /* JADX INFO: renamed from: a */
    public final float m23958a() {
        return this.f19776c;
    }

    /* JADX INFO: renamed from: b */
    public final int m23959b() {
        return this.f19777d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f19774a + ", touchY=" + this.f19775b + ", progress=" + this.f19776c + ", swipeEdge=" + this.f19777d + ", frameTimeMillis=" + this.f19778e + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5173c(BackEvent backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
        C5171a c5171a = C5171a.f19771a;
        this(c5171a.m23955c(backEvent), c5171a.m23956d(backEvent), c5171a.m23953a(backEvent), c5171a.m23954b(backEvent), Build.VERSION.SDK_INT >= 36 ? C5172b.f19772a.m23957a(backEvent) : 0L);
    }
}
