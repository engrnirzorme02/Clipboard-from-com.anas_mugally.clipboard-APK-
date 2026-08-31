package p089L;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p033E.AbstractC0264s;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: L.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776l {

    /* JADX INFO: renamed from: L.l$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private final Uri f3146a;

        /* JADX INFO: renamed from: b */
        private final int f3147b;

        /* JADX INFO: renamed from: c */
        private final int f3148c;

        /* JADX INFO: renamed from: d */
        private final boolean f3149d;

        /* JADX INFO: renamed from: e */
        private final String f3150e;

        /* JADX INFO: renamed from: f */
        private final int f3151f;

        public b(Uri uri, int i7, int i8, boolean z7, int i9) {
            this(uri, i7, i8, z7, null, i9);
        }

        /* JADX INFO: renamed from: a */
        static b m3645a(Uri uri, int i7, int i8, boolean z7, int i9) {
            return new b(uri, i7, i8, z7, i9);
        }

        /* JADX INFO: renamed from: b */
        public int m3646b() {
            return this.f3151f;
        }

        /* JADX INFO: renamed from: c */
        public String m3647c() {
            if (m3653i()) {
                return this.f3146a.getAuthority();
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public int m3648d() {
            return this.f3147b;
        }

        /* JADX INFO: renamed from: e */
        public Uri m3649e() {
            return this.f3146a;
        }

        /* JADX INFO: renamed from: f */
        public String m3650f() {
            return this.f3150e;
        }

        /* JADX INFO: renamed from: g */
        public int m3651g() {
            return this.f3148c;
        }

        /* JADX INFO: renamed from: h */
        public boolean m3652h() {
            return this.f3149d;
        }

        /* JADX INFO: renamed from: i */
        public boolean m3653i() {
            return Objects.equals(this.f3146a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i7, int i8, boolean z7, String str, int i9) {
            this.f3146a = (Uri) AbstractC0910g.m4139g(uri);
            this.f3147b = i7;
            this.f3148c = i8;
            this.f3149d = z7;
            this.f3150e = str;
            this.f3151f = i9;
        }

        public b(String str, String str2) {
            this.f3146a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f3147b = 0;
            this.f3148c = 400;
            this.f3149d = false;
            this.f3150e = str2;
            this.f3151f = 0;
        }
    }

    /* JADX INFO: renamed from: L.l$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public abstract void mo1234a(int i7);

        /* JADX INFO: renamed from: b */
        public abstract void mo1235b(Typeface typeface);
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m3636a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return AbstractC0264s.m1225b(context, cancellationSignal, bVarArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static a m3637b(Context context, CancellationSignal cancellationSignal, C0769e c0769e) {
        return AbstractC0768d.m3607e(context, AbstractC0772h.m3623a(new Object[]{c0769e}), cancellationSignal);
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m3638c(Context context, List list, int i7, boolean z7, int i8, Handler handler, c cVar) {
        C0765a c0765a = new C0765a(cVar, AbstractC0777m.m3655b(handler));
        if (!z7) {
            return AbstractC0774j.m3628d(context, list, i7, null, c0765a);
        }
        if (list.size() <= 1) {
            return AbstractC0774j.m3629e(context, (C0769e) list.get(0), c0765a, i7, i8);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: renamed from: L.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private final int f3144a;

        /* JADX INFO: renamed from: b */
        private final List f3145b;

        public a(int i7, b[] bVarArr) {
            this.f3144a = i7;
            this.f3145b = Collections.singletonList(bVarArr);
        }

        /* JADX INFO: renamed from: a */
        static a m3639a(int i7, List list) {
            return new a(i7, list);
        }

        /* JADX INFO: renamed from: b */
        static a m3640b(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        /* JADX INFO: renamed from: c */
        public b[] m3641c() {
            return (b[]) this.f3145b.get(0);
        }

        /* JADX INFO: renamed from: d */
        public List m3642d() {
            return this.f3145b;
        }

        /* JADX INFO: renamed from: e */
        public int m3643e() {
            return this.f3144a;
        }

        /* JADX INFO: renamed from: f */
        boolean m3644f() {
            return this.f3145b.size() > 1;
        }

        a(int i7, List list) {
            this.f3144a = i7;
            this.f3145b = list;
        }
    }
}
