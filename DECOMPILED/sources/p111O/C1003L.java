package p111O;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: renamed from: O.L */
/* JADX INFO: loaded from: classes.dex */
public class C1003L {

    /* JADX INFO: renamed from: a */
    private final d f3790a;

    /* JADX INFO: renamed from: O.L$b */
    private static class b implements d {

        /* JADX INFO: renamed from: a */
        private final ScrollFeedbackProvider f3791a;

        b(View view) {
            this.f3791a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // p111O.C1003L.d
        /* JADX INFO: renamed from: a */
        public void mo4385a(int i7, int i8, int i9, boolean z7) {
            this.f3791a.onScrollLimit(i7, i8, i9, z7);
        }

        @Override // p111O.C1003L.d
        /* JADX INFO: renamed from: b */
        public void mo4386b(int i7, int i8, int i9, int i10) {
            this.f3791a.onScrollProgress(i7, i8, i9, i10);
        }
    }

    /* JADX INFO: renamed from: O.L$c */
    private static class c implements d {
        private c() {
        }

        @Override // p111O.C1003L.d
        /* JADX INFO: renamed from: a */
        public void mo4385a(int i7, int i8, int i9, boolean z7) {
        }

        @Override // p111O.C1003L.d
        /* JADX INFO: renamed from: b */
        public void mo4386b(int i7, int i8, int i9, int i10) {
        }
    }

    /* JADX INFO: renamed from: O.L$d */
    private interface d {
        /* JADX INFO: renamed from: a */
        void mo4385a(int i7, int i8, int i9, boolean z7);

        /* JADX INFO: renamed from: b */
        void mo4386b(int i7, int i8, int i9, int i10);
    }

    private C1003L(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3790a = new b(view);
        } else {
            this.f3790a = new c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1003L m4382a(View view) {
        return new C1003L(view);
    }

    /* JADX INFO: renamed from: b */
    public void m4383b(int i7, int i8, int i9, boolean z7) {
        this.f3790a.mo4385a(i7, i8, i9, z7);
    }

    /* JADX INFO: renamed from: c */
    public void m4384c(int i7, int i8, int i9, int i10) {
        this.f3790a.mo4386b(i7, i8, i9, i10);
    }
}
