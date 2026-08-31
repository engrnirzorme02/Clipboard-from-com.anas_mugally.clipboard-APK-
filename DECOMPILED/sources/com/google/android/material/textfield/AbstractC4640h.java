package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p069I3.C0622i;
import p069I3.C0627n;

/* JADX INFO: renamed from: com.google.android.material.textfield.h */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4640h extends C0622i {

    /* JADX INFO: renamed from: U */
    b f18019U;

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$c */
    private static class c extends AbstractC4640h {
        c(b bVar) {
            super(bVar);
        }

        @Override // p069I3.C0622i
        /* JADX INFO: renamed from: w */
        protected void mo2734w(Canvas canvas) {
            if (this.f18019U.f18020x.isEmpty()) {
                super.mo2734w(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f18019U.f18020x);
            super.mo2734w(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: A0 */
    static AbstractC4640h m21523A0(C0627n c0627n) {
        if (c0627n == null) {
            c0627n = new C0627n();
        }
        return m21524B0(new b(c0627n, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static AbstractC4640h m21524B0(b bVar) {
        return new c(bVar);
    }

    /* JADX INFO: renamed from: C0 */
    boolean m21526C0() {
        return !this.f18019U.f18020x.isEmpty();
    }

    /* JADX INFO: renamed from: D0 */
    void m21527D0() {
        m21528E0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: E0 */
    void m21528E0(float f7, float f8, float f9, float f10) {
        if (f7 == this.f18019U.f18020x.left && f8 == this.f18019U.f18020x.top && f9 == this.f18019U.f18020x.right && f10 == this.f18019U.f18020x.bottom) {
            return;
        }
        this.f18019U.f18020x.set(f7, f8, f9, f10);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: F0 */
    void m21529F0(RectF rectF) {
        m21528E0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p069I3.C0622i, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f18019U = new b(this.f18019U);
        return this;
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.h$b */
    private static final class b extends C0622i.c {

        /* JADX INFO: renamed from: x */
        private final RectF f18020x;

        @Override // p069I3.C0622i.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC4640h abstractC4640hM21524B0 = AbstractC4640h.m21524B0(this);
            abstractC4640hM21524B0.invalidateSelf();
            return abstractC4640hM21524B0;
        }

        private b(C0627n c0627n, RectF rectF) {
            super(c0627n, null);
            this.f18020x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f18020x = bVar.f18020x;
        }
    }

    private AbstractC4640h(b bVar) {
        super(bVar);
        this.f18019U = bVar;
    }
}
