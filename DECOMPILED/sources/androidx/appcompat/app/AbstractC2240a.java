package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.AbstractC2266b;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2240a {
    /* JADX INFO: renamed from: f */
    public boolean m9080f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo9081g();

    /* JADX INFO: renamed from: h */
    public abstract void mo9082h(boolean z7);

    /* JADX INFO: renamed from: i */
    public abstract int mo9083i();

    /* JADX INFO: renamed from: j */
    public abstract Context mo9084j();

    /* JADX INFO: renamed from: k */
    public boolean m9085k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo9086l(Configuration configuration);

    /* JADX INFO: renamed from: m */
    void m9087m() {
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo9088n(int i7, KeyEvent keyEvent);

    /* JADX INFO: renamed from: o */
    public boolean m9089o(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m9090p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo9091q(boolean z7);

    /* JADX INFO: renamed from: r */
    public abstract void mo9092r(boolean z7);

    /* JADX INFO: renamed from: s */
    public abstract void mo9093s(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    public abstract AbstractC2266b mo9094t(AbstractC2266b.a aVar);

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f7313a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7313a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5529j.f21320t);
            this.f7313a = typedArrayObtainStyledAttributes.getInt(AbstractC5529j.f21325u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i7, int i8) {
            super(i7, i8);
            this.f7313a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f7313a = 0;
            this.f7313a = aVar.f7313a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7313a = 0;
        }
    }
}
