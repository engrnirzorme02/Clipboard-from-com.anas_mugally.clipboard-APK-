package p069I3;

import android.graphics.RectF;
import java.util.Arrays;
import p065I.AbstractC0577a;

/* JADX INFO: renamed from: I3.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0616c implements InterfaceC0617d {

    /* JADX INFO: renamed from: a */
    private final float f2335a;

    public C0616c(float f7) {
        this.f2335a = f7;
    }

    /* JADX INFO: renamed from: b */
    private static float m2657b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // p069I3.InterfaceC0617d
    /* JADX INFO: renamed from: a */
    public float mo2655a(RectF rectF) {
        return AbstractC0577a.m2540a(this.f2335a, 0.0f, m2657b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0616c) && this.f2335a == ((C0616c) obj).f2335a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2335a)});
    }
}
