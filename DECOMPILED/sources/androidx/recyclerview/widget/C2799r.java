package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: loaded from: classes.dex */
class C2799r {

    /* JADX INFO: renamed from: a */
    final b f11249a;

    /* JADX INFO: renamed from: b */
    a f11250b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$a */
    static class a {

        /* JADX INFO: renamed from: a */
        int f11251a = 0;

        /* JADX INFO: renamed from: b */
        int f11252b;

        /* JADX INFO: renamed from: c */
        int f11253c;

        /* JADX INFO: renamed from: d */
        int f11254d;

        /* JADX INFO: renamed from: e */
        int f11255e;

        a() {
        }

        /* JADX INFO: renamed from: a */
        void m13901a(int i7) {
            this.f11251a = i7 | this.f11251a;
        }

        /* JADX INFO: renamed from: b */
        boolean m13902b() {
            int i7 = this.f11251a;
            if ((i7 & 7) != 0 && (i7 & m13903c(this.f11254d, this.f11252b)) == 0) {
                return false;
            }
            int i8 = this.f11251a;
            if ((i8 & 112) != 0 && (i8 & (m13903c(this.f11254d, this.f11253c) << 4)) == 0) {
                return false;
            }
            int i9 = this.f11251a;
            if ((i9 & 1792) != 0 && (i9 & (m13903c(this.f11255e, this.f11252b) << 8)) == 0) {
                return false;
            }
            int i10 = this.f11251a;
            return (i10 & 28672) == 0 || (i10 & (m13903c(this.f11255e, this.f11253c) << 12)) != 0;
        }

        /* JADX INFO: renamed from: c */
        int m13903c(int i7, int i8) {
            if (i7 > i8) {
                return 1;
            }
            return i7 == i8 ? 2 : 4;
        }

        /* JADX INFO: renamed from: d */
        void m13904d() {
            this.f11251a = 0;
        }

        /* JADX INFO: renamed from: e */
        void m13905e(int i7, int i8, int i9, int i10) {
            this.f11252b = i7;
            this.f11253c = i8;
            this.f11254d = i9;
            this.f11255e = i10;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$b */
    interface b {
        /* JADX INFO: renamed from: a */
        View mo13472a(int i7);

        /* JADX INFO: renamed from: b */
        int mo13473b(View view);

        /* JADX INFO: renamed from: c */
        int mo13474c();

        /* JADX INFO: renamed from: d */
        int mo13475d();

        /* JADX INFO: renamed from: e */
        int mo13476e(View view);
    }

    C2799r(b bVar) {
        this.f11249a = bVar;
    }

    /* JADX INFO: renamed from: a */
    View m13899a(int i7, int i8, int i9, int i10) {
        int iMo13474c = this.f11249a.mo13474c();
        int iMo13475d = this.f11249a.mo13475d();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View viewMo13472a = this.f11249a.mo13472a(i7);
            this.f11250b.m13905e(iMo13474c, iMo13475d, this.f11249a.mo13473b(viewMo13472a), this.f11249a.mo13476e(viewMo13472a));
            if (i9 != 0) {
                this.f11250b.m13904d();
                this.f11250b.m13901a(i9);
                if (this.f11250b.m13902b()) {
                    return viewMo13472a;
                }
            }
            if (i10 != 0) {
                this.f11250b.m13904d();
                this.f11250b.m13901a(i10);
                if (this.f11250b.m13902b()) {
                    view = viewMo13472a;
                }
            }
            i7 += i11;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    boolean m13900b(View view, int i7) {
        this.f11250b.m13905e(this.f11249a.mo13474c(), this.f11249a.mo13475d(), this.f11249a.mo13473b(view), this.f11249a.mo13476e(view));
        if (i7 == 0) {
            return false;
        }
        this.f11250b.m13904d();
        this.f11250b.m13901a(i7);
        return this.f11250b.m13902b();
    }
}
