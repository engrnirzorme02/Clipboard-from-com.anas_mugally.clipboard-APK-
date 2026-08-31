package p106N1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p035E1.InterfaceC0297r;
import p035E1.InterfaceC0301v;
import p120P1.C1186c;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: N1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0944j implements InterfaceC0301v, InterfaceC0297r {

    /* JADX INFO: renamed from: a */
    protected final Drawable f3657a;

    public AbstractC0944j(Drawable drawable) {
        this.f3657a = (Drawable) AbstractC2022k.m8408e(drawable);
    }

    @Override // p035E1.InterfaceC0297r
    /* JADX INFO: renamed from: a */
    public void mo1454a() {
        Drawable drawable = this.f3657a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C1186c) {
            ((C1186c) drawable).m5216e().prepareToDraw();
        }
    }

    @Override // p035E1.InterfaceC0301v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f3657a.getConstantState();
        return constantState == null ? this.f3657a : constantState.newDrawable();
    }
}
