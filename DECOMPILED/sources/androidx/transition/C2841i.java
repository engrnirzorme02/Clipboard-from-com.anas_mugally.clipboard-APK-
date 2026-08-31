package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: androidx.transition.i */
/* JADX INFO: loaded from: classes.dex */
class C2841i implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    private Rect f11499a;

    C2841i() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f7, Rect rect, Rect rect2) {
        int i7 = rect.left;
        int i8 = i7 + ((int) ((rect2.left - i7) * f7));
        int i9 = rect.top;
        int i10 = i9 + ((int) ((rect2.top - i9) * f7));
        int i11 = rect.right;
        int i12 = i11 + ((int) ((rect2.right - i11) * f7));
        int i13 = rect.bottom;
        int i14 = i13 + ((int) ((rect2.bottom - i13) * f7));
        Rect rect3 = this.f11499a;
        if (rect3 == null) {
            return new Rect(i8, i10, i12, i14);
        }
        rect3.set(i8, i10, i12, i14);
        return this.f11499a;
    }
}
