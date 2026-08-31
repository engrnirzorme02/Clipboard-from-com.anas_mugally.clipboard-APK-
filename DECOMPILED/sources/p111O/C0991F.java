package p111O;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: O.F */
/* JADX INFO: loaded from: classes.dex */
public class C0991F {

    /* JADX INFO: renamed from: a */
    private int f3784a;

    /* JADX INFO: renamed from: b */
    private int f3785b;

    public C0991F(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: a */
    public int m4363a() {
        return this.f3784a | this.f3785b;
    }

    /* JADX INFO: renamed from: b */
    public void m4364b(View view, View view2, int i7) {
        m4365c(view, view2, i7, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m4365c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f3785b = i7;
        } else {
            this.f3784a = i7;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4366d(View view) {
        m4367e(view, 0);
    }

    /* JADX INFO: renamed from: e */
    public void m4367e(View view, int i7) {
        if (i7 == 1) {
            this.f3785b = 0;
        } else {
            this.f3784a = 0;
        }
    }
}
