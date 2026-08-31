package p069I3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I3.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0625l implements InterfaceC0617d {

    /* JADX INFO: renamed from: a */
    private final float f2401a;

    public C0625l(float f7) {
        this.f2401a = f7;
    }

    /* JADX INFO: renamed from: b */
    private static float m2752b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // p069I3.InterfaceC0617d
    /* JADX INFO: renamed from: a */
    public float mo2655a(RectF rectF) {
        return this.f2401a * m2752b(rectF);
    }

    /* JADX INFO: renamed from: c */
    public float m2753c() {
        return this.f2401a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0625l) && this.f2401a == ((C0625l) obj).f2401a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2401a)});
    }

    public String toString() {
        return ((int) (m2753c() * 100.0f)) + "%";
    }
}
