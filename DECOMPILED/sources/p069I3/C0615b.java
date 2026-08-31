package p069I3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: I3.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0615b implements InterfaceC0617d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0617d f2333a;

    /* JADX INFO: renamed from: b */
    private final float f2334b;

    public C0615b(float f7, InterfaceC0617d interfaceC0617d) {
        while (interfaceC0617d instanceof C0615b) {
            interfaceC0617d = ((C0615b) interfaceC0617d).f2333a;
            f7 += ((C0615b) interfaceC0617d).f2334b;
        }
        this.f2333a = interfaceC0617d;
        this.f2334b = f7;
    }

    @Override // p069I3.InterfaceC0617d
    /* JADX INFO: renamed from: a */
    public float mo2655a(RectF rectF) {
        return Math.max(0.0f, this.f2333a.mo2655a(rectF) + this.f2334b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0615b)) {
            return false;
        }
        C0615b c0615b = (C0615b) obj;
        return this.f2333a.equals(c0615b.f2333a) && this.f2334b == c0615b.f2334b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2333a, Float.valueOf(this.f2334b)});
    }
}
