package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import java.util.List;
import p037E3.C0379a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4564g extends AbstractC4561d {

    /* JADX INFO: renamed from: C */
    private AbstractC4562e f17519C;

    /* JADX INFO: renamed from: D */
    private AbstractC4563f f17520D;

    /* JADX INFO: renamed from: E */
    private Drawable f17521E;

    C4564g(Context context, AbstractC4559b abstractC4559b, AbstractC4562e abstractC4562e, AbstractC4563f abstractC4563f) {
        super(context, abstractC4559b);
        m20965A(abstractC4562e);
        m20968z(abstractC4563f);
    }

    /* JADX INFO: renamed from: v */
    static C4564g m20963v(Context context, C4568k c4568k, C4565h c4565h) {
        return new C4564g(context, c4568k, c4565h, c4568k.f17553o == 0 ? new C4566i(c4568k) : new C4567j(context, c4568k));
    }

    /* JADX INFO: renamed from: y */
    private boolean m20964y() {
        C0379a c0379a = this.f17485c;
        return c0379a != null && c0379a.m1613a(this.f17483a.getContentResolver()) == 0.0f;
    }

    /* JADX INFO: renamed from: A */
    void m20965A(AbstractC4562e abstractC4562e) {
        this.f17519C = abstractC4562e;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f8  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f17482A)) {
            int i8 = 0;
            if (m20964y() && (drawable = this.f17521E) != null) {
                drawable.setBounds(getBounds());
                this.f17521E.setTint(this.f17484b.f17459e[0]);
                this.f17521E.draw(canvas);
                return;
            }
            canvas.save();
            this.f17519C.m20950h(canvas, getBounds(), m20938h(), mo20920m(), mo20919l());
            int i9 = this.f17484b.f17463i;
            int alpha = getAlpha();
            AbstractC4559b abstractC4559b = this.f17484b;
            boolean z7 = abstractC4559b instanceof C4568k;
            boolean z8 = z7 && i9 == 0 && !abstractC4559b.m20897b(false);
            if (!z8) {
                if (z7) {
                    AbstractC4562e.a aVar = (AbstractC4562e.a) this.f17520D.f17518b.get(0);
                    List list = this.f17520D.f17518b;
                    AbstractC4562e.a aVar2 = (AbstractC4562e.a) list.get(list.size() - 1);
                    AbstractC4562e abstractC4562e = this.f17519C;
                    if (abstractC4562e instanceof C4565h) {
                        i7 = i9;
                        abstractC4562e.mo20946d(canvas, this.f17496y, 0.0f, aVar.f17505a, this.f17484b.f17460f, alpha, i7);
                        canvas2 = canvas;
                        this.f17519C.mo20946d(canvas2, this.f17496y, aVar2.f17506b, 1.0f, this.f17484b.f17460f, alpha, i7);
                    } else {
                        canvas2 = canvas;
                        i7 = i9;
                        canvas.save();
                        canvas.rotate(aVar2.f17511g);
                        this.f17519C.mo20946d(canvas2, this.f17496y, aVar2.f17506b, aVar.f17505a + 1.0f, this.f17484b.f17460f, alpha, i7);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i8 < this.f17520D.f17518b.size()) {
                    AbstractC4562e.a aVar3 = (AbstractC4562e.a) this.f17520D.f17518b.get(i8);
                    aVar3.f17510f = m20939i();
                    this.f17519C.mo20945c(canvas, this.f17496y, aVar3, getAlpha());
                    if (i8 <= 0 && !z8 && z7) {
                        this.f17519C.mo20946d(canvas2, this.f17496y, ((AbstractC4562e.a) this.f17520D.f17518b.get(i8 - 1)).f17506b, aVar3.f17505a, this.f17484b.f17460f, alpha, i7);
                    }
                    i8++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.f17519C.mo20946d(canvas2, this.f17496y, 0.0f, 1.0f, this.f17484b.f17460f, alpha, 0);
            i7 = i9;
            while (i8 < this.f17520D.f17518b.size()) {
                AbstractC4562e.a aVar4 = (AbstractC4562e.a) this.f17520D.f17518b.get(i8);
                aVar4.f17510f = m20939i();
                this.f17519C.mo20945c(canvas, this.f17496y, aVar4, getAlpha());
                if (i8 <= 0) {
                }
                i8++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17519C.mo20947e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17519C.mo20948f();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo20918j() {
        return super.mo20918j();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: l */
    public /* bridge */ /* synthetic */ boolean mo20919l() {
        return super.mo20919l();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ boolean mo20920m() {
        return super.mo20920m();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void mo20921o(AbstractC2860b abstractC2860b) {
        super.mo20921o(abstractC2860b);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ boolean mo20922s(boolean z7, boolean z8, boolean z9) {
        return super.mo20922s(z7, z8, z9);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8);
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: t */
    boolean mo20923t(boolean z7, boolean z8, boolean z9) {
        Drawable drawable;
        boolean zMo20923t = super.mo20923t(z7, z8, z9);
        if (m20964y() && (drawable = this.f17521E) != null) {
            return drawable.setVisible(z7, z8);
        }
        if (!isRunning()) {
            this.f17520D.mo20955a();
        }
        if (!z7 || !z9) {
            return zMo20923t;
        }
        this.f17520D.mo20961g();
        return zMo20923t;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4561d
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ boolean mo20924u(AbstractC2860b abstractC2860b) {
        return super.mo20924u(abstractC2860b);
    }

    /* JADX INFO: renamed from: w */
    AbstractC4563f m20966w() {
        return this.f17520D;
    }

    /* JADX INFO: renamed from: x */
    AbstractC4562e m20967x() {
        return this.f17519C;
    }

    /* JADX INFO: renamed from: z */
    void m20968z(AbstractC4563f abstractC4563f) {
        this.f17520D = abstractC4563f;
        abstractC4563f.m20959e(this);
    }
}
