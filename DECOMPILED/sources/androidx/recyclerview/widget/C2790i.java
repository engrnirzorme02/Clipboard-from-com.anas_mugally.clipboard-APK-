package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
class C2790i {

    /* JADX INFO: renamed from: b */
    int f11216b;

    /* JADX INFO: renamed from: c */
    int f11217c;

    /* JADX INFO: renamed from: d */
    int f11218d;

    /* JADX INFO: renamed from: e */
    int f11219e;

    /* JADX INFO: renamed from: h */
    boolean f11222h;

    /* JADX INFO: renamed from: i */
    boolean f11223i;

    /* JADX INFO: renamed from: a */
    boolean f11215a = true;

    /* JADX INFO: renamed from: f */
    int f11220f = 0;

    /* JADX INFO: renamed from: g */
    int f11221g = 0;

    C2790i() {
    }

    /* JADX INFO: renamed from: a */
    boolean m13822a(RecyclerView.C2746B c2746b) {
        int i7 = this.f11217c;
        return i7 >= 0 && i7 < c2746b.m13239b();
    }

    /* JADX INFO: renamed from: b */
    View m13823b(RecyclerView.C2772w c2772w) {
        View viewM13531o = c2772w.m13531o(this.f11217c);
        this.f11217c += this.f11218d;
        return viewM13531o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f11216b + ", mCurrentPosition=" + this.f11217c + ", mItemDirection=" + this.f11218d + ", mLayoutDirection=" + this.f11219e + ", mStartLine=" + this.f11220f + ", mEndLine=" + this.f11221g + '}';
    }
}
