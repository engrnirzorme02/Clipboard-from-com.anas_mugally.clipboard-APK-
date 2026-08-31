package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.AbstractC2457h;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.r */
/* JADX INFO: loaded from: classes.dex */
class C2369r extends PopupWindow {

    /* JADX INFO: renamed from: b */
    private static final boolean f8309b = false;

    /* JADX INFO: renamed from: a */
    private boolean f8310a;

    public C2369r(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        m10140a(context, attributeSet, i7, i8);
    }

    /* JADX INFO: renamed from: a */
    private void m10140a(Context context, AttributeSet attributeSet, int i7, int i8) {
        C2348d0 c2348d0M10025v = C2348d0.m10025v(context, attributeSet, AbstractC5529j.f21219Y1, i7, i8);
        int i9 = AbstractC5529j.f21228a2;
        if (c2348d0M10025v.m10044s(i9)) {
            m10141b(c2348d0M10025v.m10026a(i9, false));
        }
        setBackgroundDrawable(c2348d0M10025v.m10032g(AbstractC5529j.f21223Z1));
        c2348d0M10025v.m10046x();
    }

    /* JADX INFO: renamed from: b */
    private void m10141b(boolean z7) {
        if (f8309b) {
            this.f8310a = z7;
        } else {
            AbstractC2457h.m10745a(this, z7);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f8309b && this.f8310a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f8309b && this.f8310a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f8309b && this.f8310a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
