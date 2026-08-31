package p069I3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614a implements InterfaceC0617d {

    /* JADX INFO: renamed from: a */
    private final float f2332a;

    public C0614a(float f7) {
        this.f2332a = f7;
    }

    @Override // p069I3.InterfaceC0617d
    /* JADX INFO: renamed from: a */
    public float mo2655a(RectF rectF) {
        return this.f2332a;
    }

    /* JADX INFO: renamed from: b */
    public float m2656b() {
        return this.f2332a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0614a) && this.f2332a == ((C0614a) obj).f2332a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2332a)});
    }

    public String toString() {
        return m2656b() + "px";
    }
}
